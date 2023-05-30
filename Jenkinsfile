pipeline {
    agent any

    stages {
        stage('Clone Application') {
            steps {
               git credentialsId: 'GITLABUsernamePassword', url: 'https://gitlab.com/karimulla.shaik/employees.git' 
            }
        }
        
        stage('Build') {
            steps {
               bat 'mvn clean install'
            }
        }
    }
    post {
        always {
                    echo "This block always runs after this stage."
                }
                
                unstable {
                    echo "This block runs when the status of this stage is marked unstable."
                }
                
                success {
                    echo "This block runs when the stage succeeded."
                }
                
                failure {
                    echo "This block runs when the stage failed."
                }
                
                
    }
}
