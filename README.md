***Pivotal Cloud Foundry Blue Green Deployment Example***

  Steps:
    
        - Build the application using Maven: mvn clean package
        - Set your pivotal api end point. run >>cf api <give api endpoint here>
        - Login with your pivotal credentials : >> cf login -u  <login email>
        - Deploy your "Blue" Application: >>cf push -f manifest-blue.yml      //(-f to select given manifest file and not default manifest file)
        - Deploy your "Green" Application: >>cf push -f manifest-green.yml
        
  ***Now Map Application Route to both Blue and Green Routes***   
  - After pushing both the applications to Pivotal Cloud Foundry we need to create an application route url and configure it as a domain to both green and blue url's.
  
  In this example, we have pcf-blue-${random-word} and pcf-green-${random-word} url's where random-word is generated automatically. 
  