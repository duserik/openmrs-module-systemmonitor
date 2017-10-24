# openmrs-module-systemmonitor
------------------------------
This module is meant to support configurable monitoring of an OpenMRS Instance/EMR/System

The idea to have this project was concieved after contributing for some time to: https://github.com/jembi/openmrs-emt-ubuntu which at the time when this was first written monitored the following indicators:
File System Encoding, Free Memory (MB), Installed Modules, Java Runtime Name, Java Runtime Version, Java Vendor, Java Version, JVM Vendor, JVM Version, Number Of System Starts, OpenMRS App Name, OpenMRS Uptime (%), OpenMRS Version, Operating System, Operating System Arch, Operating System Version, Patient Viral Load Test Results - All, Patient Viral Load Test Results - Last 6 Months, Patient Viral Load Test Results - Last Year, Primary Clinic Days, Primary Clinic Hours, Server Id, Server's Real Location, System DateTime, System Language, System Timezone, System Uptime - LastMonth (%), System Uptime - LastWeek (%), System Uptime - ThisWeek (%), Temporary Directory, Total Encounters, Total Memory (MB), Total Observations, Total Patients - Active, Total Patients - New, Total Users, Total Visits, Used Memory (MB), User Directory, User Name

Requires https://github.com/kaweesi/oshi to be installed in mvn locally.

* If upgrading to update the previous indicator design, please run push from server instead of client first which will update all the data from May 2016 to current date only supporting until 31/03/2017
* 

---------------
DHIS Metadata:

* Dataelements at: http://82.196.9.250:8080/api/dataElementGroups/HZofpDxUOBY.json?fields=dataElements[:identifiable]
* All DHIS2 metadata under meta folder
