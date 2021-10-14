package com.vishnu;

class StudentFeeStructure implements Hostel ,DayScholar
{
     int CollegeFee = 50000;
     int HostelFee = 40000;
     int BusFee = 10000;
     public void HostelFacilityFee()                                            //Single responsibility
     {
        System.out.println("College Hostel Fee is " + HostelFee);
     }
     public void BusFacilityFee()
     {
         System.out.println("College Bus  Fee is " + BusFee);
     }
     public void StudentTotalFee()
     {
         System.out.println("Total Fee depends on whether he was DayScholar or Hosteler ");
     }
}