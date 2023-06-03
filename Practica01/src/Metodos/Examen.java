package Metodos;

public class Examen {
    
    public static int numeros(int num1,int num2, char sel){
        
        int result=0;
        
        switch(sel){
            
            case '+' : result=num1+num2;break;      
            case '-' : result=num1-num2;break;
            case '*' : result=num1*num2;break;
            case '/' : result=num1/num2;break;
            case '%' : result=num1%num2;break;
            
        
        }   
       
        return (result);
        
  
    }
}





