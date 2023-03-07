package check;

public class tinhgiolam {

	public static boolean checkgiovao(int minute) {
		 
		if(minute < 8) {
			return false;
		}else {
			return true;
		}
		
	}
	public static boolean tangcahaykhong(int tangca) {
		if(tangca == 1) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean checkcuoituan(int checkcuoituan) {
		if(checkcuoituan == 1) {
			return true;
		}else {
			return false;
		}
	}
	
}
