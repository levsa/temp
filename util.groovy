class Utilities implements Serializable {
        def steps
        Utilities(steps) { this.steps = steps }

        def hash(filename) {
            steps.sh(returnStdout: true, script: 'md5sum ${filename}').trim().substring(0, 32)
        }
}

def utilities(steps) {
    return new Utilities(steps)
}

return this;
