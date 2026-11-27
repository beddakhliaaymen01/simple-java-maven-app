node {
    stage('Outils') {
        def jdkHome = tool name: 'JDK-21', type: 'hudson.model.JDK'
        def mavenHome = tool name: 'Maven-3.9.9', type: 'hudson.tasks.Maven$MavenInstallation'

        env.JAVA_HOME = jdkHome
        env.PATH = "${jdkHome}/bin:${mavenHome}/bin:${env.PATH}"

        sh 'java -version'
        sh 'mvn -v'
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
}
