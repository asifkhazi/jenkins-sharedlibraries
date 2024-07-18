def call (String gitRepo, String gitBranch, String gitCredID) {
  git branch: "$gitBranch", credentialsId: "$gitCredID", url: "$gitRepo"
}
