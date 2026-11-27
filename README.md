### Q4 - Déclenchement automatique

Nous avons configuré Poll SCM avec la fréquence H/2 * * * *.
Jenkins vérifie le dépôt GitHub toutes les deux minutes.
Nous avons choisi Poll SCM au lieu d'un Webhook car Jenkins fonctionne dans une VM interne et GitHub ne peut pas nécessairement accéder directement à Jenkins.
