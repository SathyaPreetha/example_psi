class Bank{
	int getROI(){return 0;}
}
class SBI extends Bank{
	int getROI(){return 8;}
}
class ICICI extends Bank{
	int getROI(){return 7;}
}
class AXIS extends Bank{
	int getROI(){return 6;}
}
class TestOR{
public static void main(String[] args){
	SBI sbi=new SBI();
	ICICI icici=new ICICI();
	AXIS axis=new AXIS();
	System.out.println("SBI ROI" +sbi.getROI()+"%");
	System.out.println("ICICI ROI" +icici.getROI()+"%");
	System.out.println("AXIS ROI" +axis.getROI()+"%");
}
}