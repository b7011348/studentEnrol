package com.enrol

class Student {
String studentName
String studentID
Date dob
Boolean isFundingAvailble 
String studentUsername
String studentPassword
String studentEmail
String course

    static constraints = {
	studentName nullable:false, blank:false 
	studentID nullable:false, blank:false
	dob nullable:false, blank:false
	isFundingAvailble nullable:false, blank:false
	studentUsername nullable:false, blank:false, unique :true
	studentPassword nullable:false, blank:false 
	studentEmail nullable:false, blank:false, email: true
	course nullable:false, blank:false
    }
}
