import java.io.*;
import java.util.*;
class longestsub{
public static void main (String args[]){
String s1;
int max=0;
int[] len=new int[10];
int i;
Scanner s = new Scanner(System.in);
s1=s.nextLine();
String []s2=s1.split(" ");
for(i=0;i<s2.length;i++){
System.out.println(s2[i]);
}
for(i=0;i<s2.length;i++){
len[i]=s2[i].length();
System.out.println(len[i]);
}
for(i=0;i<s2.length;i++){
if(len[i]>max){
max=len[i];
}
}
System.out.println(max);
for(i=0;i<s2.length;i++)
{
if(max==len[i])
System.out.println(s2[i]);
}
}
}





