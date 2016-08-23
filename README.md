Restful Java with JAX-RS (example)
-----------

### How to run

	$ git clone https://github.com/amirghaffari/Example-Restful-Java-with-JAX-RS.git
	$ cd Example-Restful-Java-with-JAX-RS
	$ mvn clean package jboss-as:deploy-only
	$ http://localhost:8080/workshop_test/rest/testservice
	$ http://localhost:8080/workshop_test/index.jsp

**Note**) There was an inconsistency issue related to the resteasy version which is used in the pom.xml file (3.0.17) and my Jboss version located {Jboss_Home}\modules\system\layers\base\org\jboss\resteasy\
To solve this issue, I downloaded the resteasy-jaxrs-3.0.17.Final-all.zip file from [here](http://resteasy.jboss.org/downloads.html) which contains another zip file named resteasy-jboss-modules-3.0.17.Final.zip.

I unzipped the resteasy-jboss-modules-3.0.17.Final.zip file into this path ({Jboss_Home}\modules\system\layers\base\) to solve the issue.