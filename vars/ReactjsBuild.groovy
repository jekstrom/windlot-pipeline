package com.prj

def build(pipelineVars) {
    echo "Running ${pipelineVars.buildArgs}"
    sh 'npm run-script build'
}

def test() {

}