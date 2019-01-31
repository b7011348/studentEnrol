package com.enrol

class Course {
String department
String courseTitle
String courseLeader
String courseCode
Date startDate
Date endDate
String discription
int numberOfStudent
double tuitionFees
String studyMode
    static constraints = {
	courseTitle nullable:false , blank:false
	department nullable:false , blank:false
	courseLeader nullable:false , blank:false
	courseCode nullable:false , blank:false
	numberOfStudent nullable:false , blank:false 
	startDate nullable:false , blank:false ,size: 20..60
	endDate nullable:false , blank:false
	studyMode nullable:false , blank:false , size: 20..20
	discription nullable:false, blank:false, maxsize:5000, widget: 'textarea'
	tuitionFees nullable:false, blank:false
    }
}
