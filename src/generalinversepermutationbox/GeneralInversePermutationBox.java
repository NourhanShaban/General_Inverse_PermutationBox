
package generalinversepermutationbox;


import static java.lang.Math.floor;
import java.util.Scanner;
import java.util.Vector;


public class GeneralInversePermutationBox {


        
    public static void main(String[] args) {
      Vector v=new Vector();
      Vector v1=new Vector();
      Scanner sc=new Scanner(System.in);
      int input=sc.nextInt();
      int out=sc.nextInt();
      String output="";
        for (int i = 0; i < out; i++) {
            int s=Integer.parseInt(sc.next());
            v.add(s);
            if(s>input||s<1||input>out)
            {
                System.out.println("IMPOSSIBLE");
            
                System.exit(0);
            }
            
            
           
            
          
            
        }
      
        
      
            for (int i = 0; i <= v.size()-1; i++) 
         {
             int y=i+1;
             int index=v.indexOf(y);
             if(index==-1)
             {
                 if(v1.size()<input)
                 {
             
                  System.out.println("IMPOSSIBLE");
                     System.exit(0);
                 }
                 else{
                     break;
                 }
                 
             }
             v1.add(index+1);
             output=output+(index+1);
             output=output+" ";
                  
         }
            if(v1.size()==input)
            {
            System.out.println(output);
            }
            else{
                System.out.println("IMPOSSIBLE");
            }
            
           
            
            
    }
    
       
            
       
     
        
 
    
}