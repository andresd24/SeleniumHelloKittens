
1. Download and install Java SDK / JRE 1.8 (or latest) for Windows / Mac
2. Download and install Eclipse for Java
3. Download Selenium Java library   (Jar file or Add to Maven)  Maven is recommended (see step 4b)
3a. Install Maven for Windows https://maven.apache.org/guides/getting-started/windows-prerequisites.html
3b. Install Maven for eclipse http://stackoverflow.com/questions/8620127/maven-in-eclipse-step-by-step-installation
4. Create a project named "SeleniumHelloKittens" (use default Settings) 
5. Convert to Maven project:
	a. Click on an existing project
	b. Select Configure -> Convert to Maven Project  (packaging:  pom)
6. Edit POM.xml with XML Editor with followng dependency:
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>2.50.1</version>
	</dependency>
7. In Project create Source folder src and a test folder
8. Add Class SeleniumHelloKittens.java with main() method included
9. Import selenium driver in SeleniumHelloKittens.java:

import org.openqa.selenium.chrome.*;

	
10. Download ChromeDriver.exe (for Windows) https://sites.google.com/a/chromium.org/chromedriver/downloads
11. Create ext folder in root project 
