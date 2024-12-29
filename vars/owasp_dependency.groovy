def call() {
    // The name 'OWASP' here is the label you configured while setting up 
    // the Dependency-Check tool in the Jenkins system.
    dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
