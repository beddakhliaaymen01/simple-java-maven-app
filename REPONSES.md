# Q2 - Configuration des outils

## Versions requises
- Java : JDK 21 minimum.
- Maven : 3.9.9.

## Configuration Jenkins
- JDK Installation : JDK-21.
- Maven Installation : Maven-3.9.9.

## Utilisation dans le Jenkinsfile
Les outils sont récupérés avec la fonction tool().
Le JAVA_HOME et le PATH sont configurés pour utiliser les versions installées dans Jenkins.

## Choix : Jenkins Tools ou installation avec apt
J'ai choisi Jenkins Tools pour gérer les versions de Maven et du JDK.
Cela permet de centraliser leur configuration dans Jenkins et de faciliter la reproduction du pipeline, sans dépendre des versions installées sur le système Ubuntu.
