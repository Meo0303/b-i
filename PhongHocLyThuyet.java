
public class PhongHocLyThuyet extends PhongHoc{
	//khai báo
	boolean coMayChieu;
	PhongHocLyThuyet(){
		super();
		coMayChieu = false;
		
	}
	PhongHocLyThuyet(boolean _coMayChieu){
		super();
		coMayChieu = _coMayChieu;
		
	}
	@Override
	boolean kiemTraDatChuan() {
	    return  coMayChieu;//gọi lớp cha
	}
}
