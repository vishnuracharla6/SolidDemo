package com.vishnu;
class StudentFeeDetails{
    public static void main (String[] args)
    {
              StudentFeeStructure s1 =new StudentFeeStructure();
                       s1.HostelFacilityFee();
                       s1.BusFacilityFee();
                       s1.StudentTotalFee();
              StudentFeeStructure s2 =new DayScholarStudent();               //Liskov substitution
                       s2.StudentTotalFee();
               StudentFeeStructure s3 =new HostelStudent();
                       s3.HostelFacilityFee();
    }
}