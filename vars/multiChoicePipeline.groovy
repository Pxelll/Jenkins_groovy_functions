def call(String choice){
    if (choice == "prod"){
        pipeline {
            agent any

            stages{
                stage("prod_stage"){
                    steps{
                        echo "prod stage started"
                    }
                }
            }
        }
    }
    else if (choice == "dev"){
        pipeline {
            agent any

            stages{
                stage("prod_stage"){
                    steps{
                        echo "dev stage started"
                    }
                }
            }
        }
    }
    else{
        pipeline {
            agent any

            stages{
                stage("prod_stage"){
                    steps{
                        echo "no environment started"
                    }
                }
            }
        }
    }
}