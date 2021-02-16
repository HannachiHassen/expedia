# Expedia Booking
```
Create a script by using Maven project with TestNG framework for following steps:
```
1. Go to https://expedia.com
2. Click on flights tab
3. Fill the form to search flight for roundtrip and click on search button
4. Select the flights
5. Click on “No thanks” for pop-up
6. Click on continue booking button
7. Fill the passenger’s information

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them
Eclipse or IntelliJ IDEA
TestNG software install on Eclipse
Download Apache Maven

### Installing

A step by step series to get a Development Environment running 
```
Download the Java JDK
```
1. Download the installer program from Oracle "Download Java" page: https://www.oracle.com/java/technologies/javase-jdk15-downloads.html
2. Download the correspondents JDK executable file to your OS (Operating System).
2. Start the Java JDK Installer executable
3. Select your installation folder

```
Set up Java JDK envir or change the PATH system variable
```
1. In Search, search for and then select: System (Control Panel)
2. Click the Advanced system settings link.
3. Click Environment Variables.
4. Click new and give the follwing name: JAVA_HOME, specify the value of the environment variable to Java JDK file in the Operating System.
5. In the section System Variables find the PATH environment variable and select it. 
6. Click Edit. 
6. In the Edit System Variable (or New System Variable) window, specify the value of the PATH environment variable to the "bin" file of Java JDK path in the OS.
7. Click OK. Close all remaining windows by clicking OK.
8. Reopen Command prompt window, and run the command line: java --version

```
Download the Eclipse Installer
```
1. Download Eclipse Installer from http://www.eclipse.org/downloads
2. Start the Eclipse Installer executable
3. Select the package to install
4. Select your installation folder
5. Launch Eclipse

```
Install TestNG software on Eclipse
```
1. Open Eclipse and go to Helpe tab
2. In Eclipse, on top menu bar, Under Help Menu, Click on "Install new Software"
3. Enter the URL: http://dl.bintray.com/testng-team/testng-p2-release at Work With field and click on "Add" button.
4. Once you click on "Add", it will display the screen, Enter the Name as "TestNG".
5. After clicking on "OK", it will scan and display the software available with the URL which you have mentioned.
6. Now select the checkbox at TestNG and Click on "Next" button.
7. It will check for the requirement and dependencies before starting the installation. If there is any problem with the requirements/dependencies, it will ask you to install them first before continuing with TestNG. Most of the cases it will successfully get installed nothing to worry about it.
8. Once the above step is done, it will ask you to review the installation details. If your are ready or Ok to install TestNG, click on "Next" to continue.
9. Accept the Terms of the license agreement and Click on "Finish" button.
```
Installing Apache Maven on Windows
```
1. Check Java using command line : java --version
Make sure you have a JDK installed on your system. Refer to Apache Maven System Requirements for details.
2. Download Apache Maven
3. Extract the Archive
4. In Search, search for and then select: System (Control Panel)
5. Click the Advanced system settings link.
6. Click Environment Variables.
7. Click new and give the follwing name: M2_HOME, specify the value of the environment variable to Apache Maven file in the Operating System. 
8. Click new and give the follwing name: MAVEN_HOME, specify the value of the environment variable to Apache Maven file in the Operating System.
8. In order to run Apache Maven, it is necessary to set up Path variable for M2_HOME, MAVEN_HOME:
   %M2_HOME% and %MAVEN_HOME%\bin
9. Verify Apache Maven Installation using CMD command line, type the following command and press Enter: mvn --version

## Built With

* [Java](https://www.oracle.com/java/) - Java JDK
* [Eclipse](https://www.eclipse.org/) - Eclipse IDE
* [TestNG](https://testng.org/doc/) - TestNG framework
* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

For the versions available, see the [tags on this repository](https://github.com/HannachiHassen/project/tags). 

## Authors

* **Hassen Hannachi** - *Initial work* - [HassenHannachi](https://github.com/HannachiHassen)

## License

This project is not under any License - Open source 
