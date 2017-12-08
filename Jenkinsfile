def utilfile
def util

node {
    timestamps {
        properties([buildDiscarder(logRotator(daysToKeepStr: '150'))])

        stage('Checkout Code') {
            checkout scm
        }

        utilfile = load 'util.groovy'
        util = utilfile.utilities(this)

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

def getDockerTagName(building = false) {
    return "snapshot-PC-1240"
}

