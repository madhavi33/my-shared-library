def call(String aws_account_id , String region, String ecr_repoName){

    sh """
    
    
    docker rmi ${aws_account_id}.dkr.ecr.${region}.amazon.com/${ecr_repoName}:latest
    
    """
}