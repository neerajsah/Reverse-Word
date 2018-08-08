/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author neerajsah
 */
public class ReverseString 
{
  public static void main(String[] args)    
   {
      
       int count=0,i=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter String");
        String string=scn.nextLine();
        Scanner scn1=new Scanner(string);
        
        
        
        List<String> list=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        
//          list.add(scn1.next());
//          list.add(scn1.next());
//          list.add(scn1.next());

        for(i=0;i<string.length();i++)
        {
          if(string.charAt(i)==' ')
          {
             count++;  
          }  
        }

        for(i=0;i<count+1;i++)
        {
           list.add(scn1.next());
        }
        
        
        for(i=list.size()-1;i>=0;i--)
        {
           list1.add(list.get(i));
        }
        System.out.println(list1);
        
   }
   
    
}
