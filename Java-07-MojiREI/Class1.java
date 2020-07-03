
public class Class1 {

	public static void main(String[] args) {
String str1 = "Java";
String str2 = new String("Programming");

String str3 = str1 + str2;
System.out.println(str3);
int len = str3.length();
System.out.println(str3.substring(0,12));

System.out.print(str3.substring(4,7));
System.out.print("mot");
System.out.println(str3.substring(len - 3, len));

int year = 2020;
int month = 6;
int date = 22;
int dt = year;
dt *= 100;
dt += month;
dt *= 100;
dt += date;
//System.out.println(dt);
System.out.println(("" + dt).substring(4,6));
	}

}
