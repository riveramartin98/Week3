
package homeworknumber3;


public class HomeworkNumber3 {

    public static void main(String[] args) {
        
        
        int lowerLimit = (int) -(61 * Math.random()); /*Useless, only tricked me*/
        
        int upperLimit = (int) (61 * Math.random());
        
        int start; /*Very important part that I did not use at first*/
        
        int count = 0;
        
         {
            
        }
        
        for(start = 2; start <= upperLimit; start++) { /*variable,test,statement*/
       
            boolean prime = true;
            
            for(int n = 2; n <= start/2; n++) {
                
                if(start % n == 0) { /*Always remember what percent sign means*/
                    
                    prime = false;
                    break;
                }
                
            }
        if(prime==true) {
            count++;
        }
            
        }
        
        System.out.println("\nThe number of primes between "+lowerLimit+" and "
        +upperLimit+" is: "+count);
    }
}
        
        
        
        
    
