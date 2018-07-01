***Pivotal Cloud Foundry Blue Green Deployment Example***

  Steps:
    
        - Build the application using Maven: mvn clean package
        - Set your pivotal api end point. run >>cf api <give api endpoint here>
        - Login with your pivotal credentials : >> cf login -u  <login email>
        - Deploy your "Blue" Application: >>cf push -f manifest-blue.yml      //(-f to select given manifest file and not default manifest file)
        - Deploy your "Green" Application: >>cf push -f manifest-green.yml
        
        
     ***Now Map Application Route to both Blue and Green Routes***