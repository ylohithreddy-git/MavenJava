pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {
        stage('Git checkout and clean') {
            steps {
                deleteDir()
                git branch: 'main',
                    url: 'https://github.com/ylohithreddy-git/MavenJava.git'
                bat 'mvn clean'
            }
        }

        stage('Install') {
            steps {
                bat 'mvn install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }
        post {
        success {
            emailext(
                subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                    Hello,

                    Your Jenkins pipeline completed successfully.

                    Job: ${env.JOB_NAME}
                    Build Number: ${env.BUILD_NUMBER}

                    Check Jenkins for build details.
                """,
                to: "ylohith143r@gmail.com"
            )
        }

        failure {
            emailext(
                subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                    Hello,

                    Your Jenkins pipeline has failed.

                    Job: ${env.JOB_NAME}
                    Build Number: ${env.BUILD_NUMBER}

                    Please check the Jenkins Console Output.
                """,
                to: "ylohith143r@gmail.com"
            )
        }
    }
}
