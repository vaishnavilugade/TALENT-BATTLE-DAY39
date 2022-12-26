import java.util.Scanner;
import java.util.Arrays;
public class Main
{
static boolean isAnagram(String str1 , String str2) {
 String s1 = str1.replaceAll("[\\s]", "");
 String s2 = str2.replaceAll("[\\s]", "");
 boolean stat=true;
 if(s1.length()!=s2.length())
 stat = false;
 else {
 char[] arr1 = s1.toLowerCase().toCharArray();
 char[] arr2 = s2.toLowerCase().toCharArray();
 Arrays.sort(arr1);
 Arrays.sort(arr2);
 stat = Arrays.equals(arr1, arr2);
 }
 return stat;
}
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter two string: ");
 String str1 = sc.next();
 String str2 = sc.next();
 boolean stat = isAnagram(str1,str2);
 if(stat)
 System.out.println("Anagram");
 else
 System.out.println("Not Anagram");
 }
}
