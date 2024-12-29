// The value of SonarQubeAPI in the label you configured while setting up 
// the SonarQube in the Jenkins system.
def call(String SonarQubeAPI, String Projectname, String ProjectKey){
  withSonarQubeEnv("${SonarQubeAPI}"){
      sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -Dsonar.java.binaries=. -X"
  }
}
