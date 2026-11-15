pipeline {
    agent any

    tools {
        maven 'MAVEN-3.9'
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
}
