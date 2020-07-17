import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate nextYearDay = today.plusYears(1);
		System.out.print("Next year is\t\t\t" + nextYearDay);
		System.out.println("\t"+nextYearDay.getDayOfWeek());
		LocalDate After100Days = today.plusDays(100);
		System.out.print("100 days after will be\t\t" + After100Days);
		System.out.println("\t"+ After100Days.getDayOfWeek());
		LocalDate After6Months = today.plusMonths(6);
		System.out.print("6 months after will be\t\t" + After6Months);
		System.out.println("\t"+ After6Months.getDayOfWeek());
		
}
}
