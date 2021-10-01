Installations:
================
Install Java JDK (11.x) - 64bit version
Install Maven
Download Maven x.x.x (Binary zip)
Unzip it to
C:\Program Files (x86)\Apache Software Foundation\apache-maven
Add Environment variables
Create a new System Variable
M2_HOME = C:\Program Files (x86)\Apache Software Foundation\apache-maven
JAVA_HOME = C:\Program Files\Java\jdk-11.x.x
Add to PATH: %M2_HOME%\bin
Create a new User Variable
%M2_HOME%\bin = C:\Program Files (x86)\Apache Software Foundation\apache-maven\bin
Make sure all paths are accessible
Open Command Prompt
Type: C:\Program Files (x86)\Apache Software Foundation\apache-maven\bin>mvn   and enter
If the output is like this everything is OK:

C:\Users\user>mvn
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.198 s
[INFO] Finished at: 2014-05-08T15:26:56+02:00
[INFO] Final Memory: 4M/15M
[INFO] ------------------------------------------------------------------------
[ERROR] No goals have been specified for this build. You must specify a valid lifecycle phase or a goal in the format <plugin-prefix>:<goal> or <plugin-group-id
>:<plugin-artifact-id>[:<plugin-version>]:<goal>. Available lifecycle phases are: validate, initialize, generate-sources, process-sources, generate-resources, p
rocess-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-
test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy, pre-clean, clean, post-cle
an, pre-site, site, post-site, site-deploy. -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/NoGoalSpecifiedException

In order to run tests you can simply run maven command from the project directory with the relevant testNG xml file. 
For Example:
mvn clean test -DsuiteFile=CloudinaryTest.xml