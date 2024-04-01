# TP1--Injection-des-dépendances
1. Créer l'interface IDao avec une méthode getDate
![IDao avec méthode getData](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/8f15243b-0f96-4806-9169-1fe0c22c4293)


2. Créer une implémentation de cette interface 
![Implementationde IDao](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/c183cbfb-10f4-490b-9b53-bf82853a9388)


3. Créer l'interface IMetier avec une méthode calcul
![Interface IMetier avec méthode calcul](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/d73760fa-1077-40da-b5c9-ca62e355fa65)


4. Créer une implémentation de cette interface en utilisant le couplage faible
![Implementation avec couplage faible](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/6f87b671-5043-4e93-825c-59cbeade3bc8)


5. Faire l'injection des dépendances :
![Ajout des dependences dans pom XML](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/faec00db-bc74-4ac8-b4b3-ddfa0d1fe94d)


a. Par instanciation statique
  ![Instanciation statique (IOD)](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/8dc95012-f0c4-4595-8631-426faebfb153)  
Résultat : 
![Résultat 1 ](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/0b29e5aa-2166-4022-a96a-95dcf1eb96c3)

  
b. Par instanciation dynamique
d'abord la création du fichier .txt :
![Config txt pour dynamic](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/2ccaa96f-1374-44cf-8731-ab181d011130)
puis :
![Presentation 2__Dynamic résultat](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/c7304664-7aa4-4b71-8b8b-0aa3ba08fb5d)

  
c. En utilisant le Framework Spring
       
       
   1. Version XML
![ApplicationContext code for Spring](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/f90821a9-ad3c-454a-a36d-341a6e141605)
![PresSpringXML result](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/7b925e17-d3ef-435e-a509-3328f1cca490)

       
   2. Version annotations
![Version annotations](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/1a169dc4-0323-4045-8328-907b3846e7dc)
