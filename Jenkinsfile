// Final GitHub webhook test 2
pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {

        stage('git repo & clean') {
            steps {
                bat "mvn clean"
            }
        }

        stage('install') {
            steps {
                bat "mvn install"
            }
        }

        stage('test') {
            steps {
                bat "mvn test"
            }
        }

        stage('package') {
            steps {
                bat "mvn package"
            }
        }
    }

    post {
        success {
            emailext(
                subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """Build SUCCESS

Job: ${env.JOB_NAME}
Build: #${env.BUILD_NUMBER}
Result: ${currentBuild.currentResult}

Jenkins: ${env.BUILD_URL}
""",
                to: "yloh143n@gmail.com"
            )
        }

        failure {
            emailext(
                subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """Build FAILED

Job: ${env.JOB_NAME}
Build: #${env.BUILD_NUMBER}
Result: ${currentBuild.currentResult}

Jenkins: ${env.BUILD_URL}
""",
                to: "yloh143n@gmail.com"
            )
        }
    }
}
