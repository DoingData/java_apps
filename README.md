# Introduction
This repository have three java apps in three sub packages.which are java grep app, JDBC app and Twitter CLI app. <some details>Understanding and knoweledge of previous apps is required for completuon in linear order. 

## Java Grep app

This application scans files in provided directory and all sub directories and matches provided argument line by line for writing matched lines in output file.

### Usage

Three arguments are provided to the application.

1. pattern for matching
2. An absolute path to directory of operation
3. An output file
   `regex_pattern absolute_path output_file`

### Design and Implementation
In this application we have two scripts **JavaGrep** and **JavaGrepImp**
* JavaGrep is an interface which is used to write abstraction of methods used in the app.

* JavaGrepImp is the only class written for this app .First the main method is called  in which arguments are set into JavaGrepImp's instance. Then files are processed using process method which calls other defined methods and final results are written if any to ouput file.

  ### Enhancements and Issues

  1. app use alot of memory by saving all the files in memory. It will be huge improvement if the  app do  read and match simultaneously and only use memory to store the matched lines.
  2. All files for provided directories and subdirectories are scanned Improvements can be made by adding  file format escape filter and directory exclusion filter.
  3. Support for multiple regex filters can be added to improve the usability considerably.

* 

* 

* 

* :rocket:
:tada:
:camel:
:sleepy:

:confused:
