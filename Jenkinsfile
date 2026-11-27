node {
    stage('Outils') {
        def jdkHome = tool name: 'JDK-21', type: 'hudson.model.JDK'
        def mavenHome = tool name: 'Maven-3.9.9', type: 'hudson.tasks.Maven$MavenInstallation'

        env.JAVA_HOME = jdkHome
        env.PATH = "${jdkHome}/bin:${mavenHome}/bin:${env.PATH}"

        sh 'java -version'
        sh 'mvn -v'
    }

    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        sh 'mvn -B -DskipTests clean package'
    }

    stage('Test') {
        sh 'mvn -B test'
    }

    stage('Exécution') {
        sh 'java -jar target/my-app-1.0-SNAPSHOT.jar'
    }

    stage('Image') {
        sh 'docker build -t beddakhliaaymen01/bibliotheque:${BUILD_NUMBER} .'
    }

    stage('Push') {
        withCredentials([string(credentialsId: 'docker_hub_pwd_1', variable: 'DOCKERHUB_TOKEN')]) {
            sh '''
                echo "$DOCKERHUB_TOKEN" | docker login -u beddakhliaaymen01 --password-stdin
                docker push beddakhliaaymen01/bibliotheque:${BUILD_NUMBER}
                docker logout
            '''
        }
    }
}
