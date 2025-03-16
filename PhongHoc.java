import java.util.Date;

public class PhongHoc {
	//khai báo
	int maPhong;
	String dayNha;
	double dienTich;
	int soBongDen;
	Date ngayHoatDong;
	
	PhongHoc(){
		super();
	}
		
	PhongHoc(int _maPhong ,String _dayNha ,double _dienTich,int _soBongDen,Date _ngayHoatDong){
		maPhong = _maPhong;
		dayNha = _dayNha;
		dienTich = _dienTich;
		soBongDen = _soBongDen;
		ngayHoatDong = _ngayHoatDong;
		
		
	}
	
	boolean kiemTraDatChuan() {
		return (dienTich / soBongDen) >= 10; // Kiểm tra đủ ánh sáng (trung bình 10m²/bóng đèn)

	}
	
}
