def buildImage(){
    echo "building application"
    sh "docker build -t tp2:1.0.0"}
def  pushImage(){
    echo"pushing image to docker hub"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', 
    passwordVariable: '10827685A', 
    usernameVariable: 'walach')
    ])
    [sh "echo $PASS | docker login -u $USER --password-stdin"
    sh "docker push tp2:1.0.0"
    ]
    
}
def deployApp(){
    echo" deploy the application"
    sh "echo $PASS | docker login -u $USER --password-stdin"
    sh "docker pull tp2:1.0.0"
    sh "docker run tp2:1.0.0"

}

return this