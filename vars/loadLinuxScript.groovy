def call (Map config = [:]) {
    def scriptContents = libraryResource "com/jenkinstest/scripts/linux/${config.name}"
    writeFile file: "${config.name}", text: scriptContents
    sh "chmod a+x ./${config.name}"
}