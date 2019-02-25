package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GNT"));
		
		try {
			Date d1 = sdf1.parse("20/02/2019");
			Date d2 = sdf2.parse("02/05/2018 14:07:31");
			Date now = new Date(); 
			Date actual = new Date(System.currentTimeMillis()); 
			Date first = new Date(0L); 
			Date first5th = new Date(1000L * 60 * 60 * 5); 
			Date iso = Date.from(Instant.parse("2018-06-25T15:43:07Z"));
			
			System.out.println("Default Date Format:");
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(now);
			System.out.println(actual);
			System.out.println(first);
			System.out.println(first5th);
			System.out.println(iso);
			System.out.println("------------------------------");
			
			System.out.println("Respective Local System Date Format:");
			System.out.println(sdf1.format(d1));
			System.out.println(sdf2.format(d2));
			System.out.println(sdf2.format(now));
			System.out.println(sdf2.format(actual));
			System.out.println(sdf2.format(first));
			System.out.println(sdf2.format(first5th));
			System.out.println(sdf2.format(iso));
			System.out.println("------------------------------");
			
			System.out.println("GMT Date Format:");
			System.out.println(sdf3.format(d1));
			System.out.println(sdf3.format(d2));
			System.out.println(sdf3.format(now));
			System.out.println(sdf3.format(actual));
			System.out.println(sdf3.format(first));
			System.out.println(sdf3.format(first5th));
			System.out.println(sdf3.format(iso));
			
			System.out.println("------------------------------");
			
			System.out.println("Calendar Opperations:");
			Calendar cal = Calendar.getInstance();
			cal.setTime(iso);
			cal.add(Calendar.HOUR_OF_DAY, 4);
			System.out.println(sdf3.format(cal.getTime()));
			System.out.println("With minutes: " + cal.get(Calendar.MINUTE));
			System.out.println("In the month: " + (cal.get(Calendar.MONTH) + 1)); // O mês começa com 0
			System.out.println("In the day of week: " + cal.get(Calendar.DAY_OF_WEEK)); // Começa no Domingo
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Data Invalida!");
		}
		
	}

}
