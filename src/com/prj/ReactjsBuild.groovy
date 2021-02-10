package com.prj

def build(pipelineVars) {
    echo "Running ${pipelineVars.buildArgs}"
    sh "cd ${pipelineVars.buildArgs.name}"
    sh 'npm run-script build'
}

def test() {

}

return this