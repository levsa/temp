def utilfile
def util

node {
    utilfile = load 'util.groovy'
    util = new utilfile.Utilities(this)

    timestamps {
        properties([buildDiscarder(logRotator(daysToKeepStr: '150'))])

        stage('Checkout Code') {
            checkout scm
        }

        def profilerImage
        def profilerWebImage
        def profilerDependenciesImage
        def dockerTagName = getDockerTagName()
        def buildDockerTagName = getDockerTagName(building: true)

        def dependenciesDockerfile = "amra/docker/Dockerfile"
        def profilerDockerfile = "amra/profiler/docker/Dockerfile"
        def webDockerfile = "amra/web/docker/Dockerfile"

        def dependenciesDockerfileHash = util.hash(dependenciesDockerfile)
        def profilerDockerfileHash = util.hash(profilerDockerfile)
        def webDockerfileHash = util.hash(webDockerfile)
    }
}
