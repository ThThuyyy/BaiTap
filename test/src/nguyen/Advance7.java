package nguyen;
import java.util.Calendar;

public class Advance7 {
	public int tinhThu(int ngay, int thang, int nam) {
		Calendar cal = Calendar.getInstance();
		cal.set(nam, thang-1, ngay);
		return cal.get(Calendar.DAY_OF_WEEK);
		 }
		}

