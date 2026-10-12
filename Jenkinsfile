
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Code recupere depuis GitHub'
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation de Spring Boot...'
                sh 'chmod +x mvnw'
                sh './mvnw -B clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Execution des tests...'
                sh './mvnw -B test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creation du fichier JAR...'
                sh './mvnw -B package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar',
                                 fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Pipeline termine avec succes !'
        }
        failure {
            echo 'Le pipeline a echoue. Consultez la console.'
        }
    }
}
