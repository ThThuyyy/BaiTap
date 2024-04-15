package nguyen;

import java.time.LocalDate;
import java.time.Period;

public class Advance6 {
	public int tinhTuoi(int ngay, int thang, int nam) {

		LocalDate ngaySinh = LocalDate.of(nam, thang, ngay);
		LocalDate ngayHienTai = LocalDate.now();
		return Period.between(ngaySinh, ngayHienTai).getYears();
	}
}



