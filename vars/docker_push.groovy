// Before executing this, add your Docker credentials in Jenkins Credentials 
// with the ID 'docker'. Ensure it includes the username and password.

def call(String Project, String ImageTag, String dockerhubuser) {
    // Use Jenkins credentials to securely access DockerHub
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
        // Log in to DockerHub using the credentials
        sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
    }
    
    // Push the Docker image to the repository
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
