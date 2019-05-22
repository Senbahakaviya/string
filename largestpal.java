import java.io.*;
import java.util.*;
class largestpal{
public static void main (String args[]){
String s1,max="",s3="";
int i,j;
Scanner s=new Scanner (System.in);
s1=s.nextLine();
String []s2=s1.split("\\s");
for(i=0;i<s2.length;i++)
{
System.out.println(s2[i]);
}
int length=s1.length();
for(j=length-1;j>=0;j--){
s3=s3+s2[i].charAt(j);
}
if(s3.equals(s2[i])){
if(s3.length() > max.length ()){
max=s3;
}
}
System.out.println(max);
}
}