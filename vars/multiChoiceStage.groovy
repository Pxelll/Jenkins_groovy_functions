def call(){
    pipeline{
        agent any

        parameters {
            choice(name: 'ENVIRONMENT', choices: ['prod', 'dev', 'none'], description: 'choose the environment!') 
        }

        stages{
            stage("PROD_ENVIRONMENT"){
                when{
                    choice name: "ENVIRONMENT", value: "prod"
                }
                steps{
                        echo "${ENVIRONMENT} STARTED!"
                }
            }
            stage("DEV_ENVIRONMENT"){
                when{
                    choice name: "ENVIRONMENT", value: "dev"
                }
                steps{
                        echo "${ENVIRONMENT} STARTED!"
                }
            }
            stage("NO_ENVIRONMENT"){
                when{
                    choice name: "ENVIRONMENT", value: "none"
                }
                steps{
                        echo "No environment!"
                }
            }
        }
    }
}