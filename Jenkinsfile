pipeline {
    agent any
    tools {
        maven 'maven3.8.2'
    }
    environment {
        BUILD_TIME = sh (returnStdout: true, script: 'echo $(date \'+%Y-%m-%d_%H:%M:%S\')').trim()
    }
    stages {
        stage('Build') { 
            steps {
                sh "mvn -DskipTests=true clean package"
                sh "echo halloooo"
            }
        }
        stage('Deploy ds-web-backend') { 
            steps {
                sh "env"
                sh "echo $BUILD_TIME"
                sh "echo ${GIT_COMMIT}"
            }
        }
        stage('Done'){
            steps {
                sh "echo done"
            }
        }
    }    
}
