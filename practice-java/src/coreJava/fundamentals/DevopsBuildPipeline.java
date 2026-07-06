package coreJava.fundamentals;

public class DevopsBuildPipeline {
	public static void main(String[] args) {
		
		String buildId = args[0];
		String projectName = args[1];
		String repositoryName = args[2];
		String branchName = args[3];
		String commitId = args[4];
		String triggeredBy = args[5];
		TriggerType triggerType = TriggerType.valueOf(args[6]);
		SourceControl  sourceControl = SourceControl.valueOf(args[7]);
		float buildDuration = Float.parseFloat(args[8]);
		DeploymentEnvironment deploymentEnvironment = DeploymentEnvironment.valueOf(args[9]);
		BuildStatus buildStatus = BuildStatus.valueOf(args[10]);
		double codeCoverage = Double.parseDouble(args[11]);
		short artifactsGenerated = Short.parseShort(args[12]);
		String pipelineUrl = args[13];
		
		System.out.println(
					"======================================================" +
					"\nDEVOPS BUILD PIPELINE REPORT" +
					"\n======================================================" +
					"\nBuild ID              : " + buildId +
					"\nProject Name          : " + projectName +
					"\nRepository Name       : " + repositoryName +
					"\nBranch Name           : " + branchName +
					"\nCommit ID             : " + commitId +
					"\nTriggered By          : " + triggeredBy +
					"\nTriggered Type        : " + triggerType +
					"\nSource Control        : " + sourceControl +
					"\nBuild Duration        : " + buildDuration +
					"\nDeployment Environment: " + deploymentEnvironment +
					"\nBuild Status          : " + buildStatus +
					"\nCode Covergae         : " + codeCoverage +
					"\nArtifacts Generated   : " + artifactsGenerated +
					"\nPipeline URL          : " + pipelineUrl +
					"\n======================================================"
				);
	}
}
