package vars

def build(pipelineVars) {
    echo "Running ${pipelineVars.buildArgs}"
    sh 'npm run-script build'
}

def test() {

}