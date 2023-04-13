def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     //aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
     aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 089826821991.dkr.ecr.ap-south-1.amazonaws.com
     docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}
