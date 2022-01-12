node(){

    stage('Build') {
        // run terrafrom
        docker.image('node:lts-alpine3.14').inside('-v /var/run/docker.sock:/var/run/docker.sock') {
            /* Wait until mysql service is up */
            sh "echo vinit"
            sh "mkdir -p tgtest"
        }
    }

}