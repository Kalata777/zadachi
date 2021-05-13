package alg;
import java.util.Scanner;
public class Nizove {
static String str1=" ";
static String str2=" ";
static char[] ch1;
static char[] ch2;
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter strings:");
str1=sc.nextLine();
str2=sc.nextLine();
ch1=str1.toCharArray();
ch2=str2.toCharArray();
int n=0;
int lent=ch1.length-ch2.length;
for(int i=0;i<ch1.length;i++) {
	
	if(ch1[i]==ch2[n]&&ch1.length-1-i>=ch2.length-n-1) {
	
	
	if(n==ch2.length-1) {
		System.out.println("yes, at index:");
		System.out.println(i-ch2.length+1);
		i=ch1.length-1;
	}
	n++;
	}else if(ch1.length-i-1>=ch2.length){
		n=0;
			}else {
				System.out.println("no");
				//System.out.println(n);
				i=ch1.length-1;

			}
}
	}

}
