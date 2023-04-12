def call(credentialsId){

  waitForQualityGate abortpipeline: false, credentialsId: credentialsId

}