def gv
pipepline{
    agent any 
    stages{
        stage("init"){
            steps{
                script{
                    gv= load "script.groovy"
                }
            }
        }
        
        stage("build image") {
            steps {
                script {
                    echo "building image"
                    gv.buildImage()
                }
            }
        }
        stage("Push image") {
            steps {
                script {
                    echo "pushing image"
                    gv.pushImage()
                }
            }
        }
        stage("deploy image") {
            steps {
                script {
                    echo "deploy image"
                    gv.deployApp()
                }
            }
        }
           
             }
}