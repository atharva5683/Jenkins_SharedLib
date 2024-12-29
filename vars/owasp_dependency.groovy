def call(){
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP' 
  # the name OWASP is come from the name you save while downloading dependency-check in jenkins system
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
