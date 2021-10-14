package com.vishnu;
class DayScholarStudent extends StudentFeeStructure implements DayScholar
{

    public void BusFacilityFee()
    {
        System.out.println("Bus fee " + BusFee);
    }
    public void StudentTotalFee()
    {
        int TotalFee = CollegeFee + BusFee;
        System.out.println("DayScholar Student total fee " + TotalFee);
    }
}