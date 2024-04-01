# TP1--Injection-des-dépendances
1. Créer l'interface IDao avec une méthode getDate
![IDao avec méthode getData](https://github.com/OTHMAN-BENMALEK/Othman_Benmalek_Systemes-Distribuees_TP1/assets/159661363/1e2230b0-0bc0-4244-bdb9-e6c0a8da308d)


2. Créer une implémentation de cette interface 
![Implementationde IDao](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/0565e26d-b99c-41f9-871e-99ec4598bc7d)


3. Créer l'interface IMetier avec une méthode calcul
![Interface IMetier avec méthode calcul](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/857bd33f-403f-4296-8a23-65d19348ab32)


4. Créer une implémentation de cette interface en utilisant le couplage faible
![Implementation avec couplage faible](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/82ee61d0-e2d6-4148-b4f1-ecef9124e629)


5. Faire l'injection des dépendances :
![Ajout des dependences dans pom XML](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/5a5e65c4-63b1-4f06-9203-4a1046beeda3)


a. Par instanciation statique
  ![Instanciation statique (IOD)](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/53d7b278-5bf8-4858-bc58-2860b4e0a78f)
  Résultat : 
![Résultat 1 ](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/ff5b1576-0f27-4c29-b942-fe84511909a3)

  
b. Par instanciation dynamique
d'abord la création du fichier .txt :
![Config txt pour dynamic](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/acb27cfd-6acc-447e-a88e-bd0db17c1e5e)
puis :
  ![Presentation 2__Dynamic résultat](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/30eff70a-ac94-4da2-abbc-502c8fea00d9)

  
c. En utilisant le Framework Spring
       
       
   1. Version XML
       ![ApplicationContext code for Spring](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/b483cddf-11a1-42f0-9a86-7f1c4e00d47b)
![PresSpringXML result](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/2470cd94-d78e-4405-9274-9df1d703efce)

       
   2. Version annotations
![Version annotations](https://github.com/OTHMAN-BENMALEK/TP1--Injection-des-dependances/assets/159661363/7a2c05a5-9fd2-472c-89f8-76c7a90b2179)
