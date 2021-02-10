package com.prj

def runPipeline() {
    def reactJs = new com.prj.ReactjsBuild()

    // TODO set based on branch name
    pipelineVars.isFeature = false
    pipelinVars.isMaster = true


    node(any) {
        stage('PreBuild') {
            pipelineVars.buildArgs = readYaml file: "build.yaml"
        }

        stage('Build') {
            reactJs.build(pipelineVars)
        }
    }
}

return this


// def call(String name = 'human') {
//     echo "Hello, ${name}."
// }



// def preBuild() {
//     // gather credentials
// }

// def build() {
//     // build and compile code
//     reactJs.build(pipelineVars)
// }

// def test() {
//     // run unit tests and other tests
// }

// def deploy() {
//     // deploy to live server
//     // set up s3 bucket with cloudfront serving it.
//     // Deploy to s3, refresh cache on cloudfront ?? 
// }

// def postBuild() {
//     // cleanup and notifications
// }