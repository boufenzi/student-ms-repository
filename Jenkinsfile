pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        },
         stage('Initialize'){
                def dockerHome = tool 'myDocker'
                env.PATH = "${dockerHome}/bin:${env.PATH}"
            }
    }
}
