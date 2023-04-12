def call(String aws_account_id, String region, String ecr_repoName){
 
     sh """
     aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazon.
     docker push ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazon.com/${ecr_repoName}:latest

   }
