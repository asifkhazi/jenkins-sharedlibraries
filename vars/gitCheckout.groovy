def call (String gitRepo, String gitBranch, String gitCredID) {
  git branch: '$gitBranch', credentialsId: '$gitCredId', url: '$gitRepo'
}
