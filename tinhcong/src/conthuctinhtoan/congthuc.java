package conthuctinhtoan;
import java.util.Scanner;

import check.tinhgiolam;
public class congthuc {
	
	int giovao;
	int phutvao;
	int giora;
	int phutra;
	int giotangca;
	int giocong;
	int phutcong;
	int checktangca;
	int gionghi = 1; 
	
	// hiện tại đang mặc định giờ nghỉ là 1 tiếng tính từ 11:00 tới 12:00
	
	public void nhangiatri() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giờ vào: ");
		giovao = sc.nextInt();
		phutvao = sc.nextInt();
		System.out.print("Nhập giờ ra: ");
		giora = sc.nextInt();
		phutra = sc.nextInt();
		System.out.print(giovao+":"+phutvao+"\n");
		
		System.out.print(giora+":"+phutra+"\n");
		thaydoigiatridetinhtoan();
	}
	public void thaydoigiatridetinhtoan() {
		if(check.tinhgiolam.checkgiovao(giovao) == false) {
			giovao = giovaosom();
			phutvao = 0;
		}
		if(giora == 1) {
			giora = 13;
		}
		if(giora == 2) {
			giora = 14;
		}
		if(giora == 3) {
			giora = 15;
		}
		if(giora == 4) {
			giora = 16;
		}
		if(giora == 5) {
			giora = 17;
		}
		tinh();
	}
	public void tinh() {
		if(phutra < phutvao) {
			giocong = giora - giovao -1 -gionghi;
			phutcong = phutra+60-phutvao;
		}else {
			giocong = giora - giovao - gionghi;
			phutcong = phutra-phutvao;
		}
		System.out.print("số giờ làm là: "+ giocong+":"+phutcong);
	}
	
	public int giovaosom() {
		return 8;
	}
}
// chia giờ

// đổi giờ ra phút tổng phút chia 60

// phần nguyên : số giờ;

// phần dư: số phút;

// 8:32 = 512 phút ;

// 512 / 60   = // 8

// 480


// hôm nay tôi xin tăng ca từ 17h00 tới 20h30 tối

// hôm nay tôi xin tăng ca 2 tiêngs


//32
