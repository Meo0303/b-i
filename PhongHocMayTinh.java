
public class PhongHocMayTinh extends PhongHoc{
	// khai báo
	int soLuongMayTinh;
	PhongHocMayTinh(){
		super();
		soLuongMayTinh = 0;
		
	}
	PhongHocMayTinh(int slmt){
		soLuongMayTinh = slmt;	
	}
	boolean kiemTraDatChuan() {
		return dienTich / soLuongMayTinh >= 1.5;
				
	}
}
