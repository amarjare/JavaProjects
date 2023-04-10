package test;
import java.security.AlgorithmConstraints;
import java.security.PKCS12Attribute;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicatesFinding {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("ENTER THE NUMBER OF ELEMENT YOU WANT TO ADDD IN ARRAYS     :");
	int n=s.nextInt();
	int a1[]=new int [n];
	int a2[]=new int [n];
	for (int i=0;i<a1.length;i++) {
	System.out.print("ENTER THE ELEMENT  "+(i+1)+" OF FIRST ARRAY     :");
	a1[i]=s.nextInt(); 
	}
    for (int i=0;i<a2.length;i++) {
    System.out.print("ENTER THE ELEMENT "+(i+1)+" OF SECOND ARRAY :");
    a2[i]=s.nextInt(); 
	}
    System.out.print("DUPLICATE ELEMENTS FROM THE ARRAYS ARE==>");
    for (int i=0;i<n;i++) {
    	for (int j=0;j<n;j ++){
    		if (a1[i]==a2[j]) {
    			System.out.print(a1[i]+",");
    		}
    	}
    } 
    int l1=a1.length;
    int l2=a2.length;
    int l3=l1+l2;
    int a3[]=new int[l3];
    for (int i=0;i<a1.length;i++) {
    	a3[i]=a1[i];
    }
    int j=0;
    for (int i=a1.length;i<a3.length;i++) {
    	
    	a3[i]=a2[j];
    	j++;	
    }
    System.out.println("\n=====PRINTING MERGED ARRAY====");
    for (int k:a3) {
    	System.out.print(k+" ");
    }
	s.close();
	}

}
