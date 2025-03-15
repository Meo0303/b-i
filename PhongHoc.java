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
	 public int getMaPhong() { return maPhong; }
	    public void setMaPhong(int maPhong) { this.maPhong = maPhong; }

	    public String getDayNha() { return dayNha; }
	    public void setDayNha(String dayNha) { this.dayNha = dayNha; }

	    public double getDienTich() { return dienTich; }
	    public void setDienTich(double dienTich) { this.dienTich = dienTich; }

	    public int getSoBongDen() { return soBongDen; }
	    public void setSoBongDen(int soBongDen) { this.soBongDen = soBongDen; }

	    public Date getNgayHoatDong() { return ngayHoatDong; }
	    public void setNgayHoatDong(Date ngayHoatDong) { this.ngayHoatDong = ngayHoatDong; }

	boolean kiemTraDatChuan() {
	return (dienTich / soBongDen) >= 10; // Kiểm tra đủ ánh sáng (trung bình 10m²/bóng đèn)

	}
	
}
