
public class PhongHocThiNghiem extends PhongHoc{
	//khai báo
	String chuyenNganh;
	int sucChua;
	boolean coBonRua;
	PhongHocThiNghiem(){
		chuyenNganh = null;
		sucChua = 0;
		coBonRua = false;
		
		
	}
	PhongHocThiNghiem(String _chuyenNganh,int _sucChua,boolean _coBonRua){
		chuyenNganh = _chuyenNganh;
		sucChua = _sucChua;
		coBonRua = _coBonRua;
		
	}
	 @Override
	    boolean kiemTraDatChuan() {
	        return coBonRua;
	    }
	}	

