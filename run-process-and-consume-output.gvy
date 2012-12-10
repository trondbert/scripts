def runCommand(command) {
  def process = command.execute()
  process.consumeProcessOutput(System.out, System.err)
  println 'requested consume output' //hoping this will come out first
  process.waitForOrKill(100000)
  println 'finished' //hoping this will come out last
  return process // use to get exit code et cetera
}

runCommand('cmd /c mvn clean')