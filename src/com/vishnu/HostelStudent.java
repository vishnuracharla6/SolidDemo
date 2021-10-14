package com.vishnu;
class HostelStudent extends StudentFeeStructure implements Hostel
{

    public void HostelFacilityFee()
    {
        System.out.println("Hostel student hostel fee " + HostelFee);
    }
    public void StudentTotalFee()
    {
        int TotalFee = CollegeFee + HostelFee;
        System.out.println("Hostel student  total fee " + TotalFee);
    }
}