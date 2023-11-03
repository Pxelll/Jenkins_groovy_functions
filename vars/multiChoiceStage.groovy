def call(){
    pipeline{
        agent any

        parameters {
            choice(name: 'ENVIRONMENT', choices: ['prod', 'dev', 'none'], description: 'choose the environment!') 
        }

        stages{
            stage("PROD_ENVIRONMENT"){
                when{
                    expression {
                        params.ENVIRONMENT == "prod"
                    }
                }
                steps{
                        echo "${ENVIRONMENT} STARTED!"
                }
            }
            stage("DEV_ENVIRONMENT"){
                when{
                    expression {
                        params.ENVIRONMENT == "dev"
                    }
                }
                steps{
                        echo "${ENVIRONMENT} STARTED!"
                }
            }
            stage("NO_ENVIRONMENT"){
                when{
                    expression {
                        params.ENVIRONMENT == "none"
                    }
                }
                steps{
                        echo "No environment!"
                }
            }
        }
    }
}