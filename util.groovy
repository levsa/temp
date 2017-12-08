class Utilities implements Serializable {
        def steps
        Utilities(steps) { this.steps = steps }
        def hash(args) {
                steps.sh "echo YES ${args}"
        }
}

def utilities(steps) {
    return new Utilities(steps)
}

return this;
