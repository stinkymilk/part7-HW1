pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn -B -ntp -Dmaven.test.failure.ignore verify'
                sleep(10000)
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }
    
}
