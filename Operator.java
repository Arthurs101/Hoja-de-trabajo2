
import java.util.ArrayList;
/*
Arturo Henerto Argueta Avila
Carné 52527
*/


public class Operator {
    public String add(ArrayList<Integer> num){
    String result = "";
        if(num.size() != 0){
        int suma = num.remove((num.size()-1));  //obtener primer opreando
        
        if(num.size() == 0){
            result = "f";//fallo dado que no hay operadores
        }else{
            while(!num.isEmpty()){
                suma += num.remove((num.size()-1));  
            }
            result = String.valueOf(suma);    
        }
        
        }else{
            result = "f";//fallo dado que no hay operadores
        }
    return result;
    }
    
    public String quit(ArrayList<Integer> num){//resta
    
    String result = "";
    if(num.size() == 0){result = "f";}//fallo dado que no hay operadores
    else{
        int resta = num.remove((num.size()-1));  //obtener primer opreando
    if(num.size() == 0){
        result = "f";//fallo dado que no hay operadores
    }else{
        while(!num.isEmpty()){
            resta  -= num.remove((num.size()-1));  
        }
        result = String.valueOf(resta);    
    }
    }
    return result;
    }
    
    public String div(ArrayList<Integer> num){//multiplicacion 
    
    String result = "";
    if(num.size() == 0){result = "f";}//fallo dado que no hay operadores
    else{
        int divi = num.remove((num.size()-1));  //obtener primer opreando
    if(num.size() == 0){
        result = "f";//fallo dado que no hay operadores
    }else{
        while(!num.isEmpty()){
            divi /= num.remove((num.size()-1));  
        }
        result = String.valueOf(divi);    
    }
    }
    return result;
    }
     
    public String multi(ArrayList<Integer> num){
        String result = "";
        if(num.size() == 0){result = "f";}//fallo dado que no hay operadores
        else{
            int multi = num.remove((num.size()-1));  //obtener primer opreando

            if(num.size() == 0){
                result = "f";//fallo dado que no hay operadores
            }else{
                while(!num.isEmpty()){
                    multi *= num.remove((num.size()-1));  
                }
                result = String.valueOf(multi);    
            }
        }
    return result;
    }   
     
    
}
/*
          _____                    _____             _____                    _____                    _____                   _______         
         /\    \                  /\    \           /\    \                  /\    \                  /\    \                 /::\    \        
        /::\    \                /::\    \         /::\    \                /::\____\                /::\    \               /::::\    \       
       /::::\    \              /::::\    \        \:::\    \              /:::/    /               /::::\    \             /::::::\    \      
      /::::::\    \            /::::::\    \        \:::\    \            /:::/    /               /::::::\    \           /::::::::\    \     
     /:::/\:::\    \          /:::/\:::\    \        \:::\    \          /:::/    /               /:::/\:::\    \         /:::/~~\:::\    \    
    /:::/__\:::\    \        /:::/__\:::\    \        \:::\    \        /:::/    /               /:::/__\:::\    \       /:::/    \:::\    \   
   /::::\   \:::\    \      /::::\   \:::\    \       /::::\    \      /:::/    /               /::::\   \:::\    \     /:::/    / \:::\    \  
  /::::::\   \:::\    \    /::::::\   \:::\    \     /::::::\    \    /:::/    /      _____    /::::::\   \:::\    \   /:::/____/   \:::\____\ 
 /:::/\:::\   \:::\    \  /:::/\:::\   \:::\____\   /:::/\:::\    \  /:::/____/      /\    \  /:::/\:::\   \:::\____\ |:::|    |     |:::|    |
/:::/  \:::\   \:::\____\/:::/  \:::\   \:::|    | /:::/  \:::\____\|:::|    /      /::\____\/:::/  \:::\   \:::|    ||:::|____|     |:::|    |
\::/    \:::\  /:::/    /\::/   |::::\  /:::|____|/:::/    \::/    /|:::|____\     /:::/    /\::/   |::::\  /:::|____| \:::\    \   /:::/    / 
 \/____/ \:::\/:::/    /  \/____|:::::\/:::/    //:::/    / \/____/  \:::\    \   /:::/    /  \/____|:::::\/:::/    /   \:::\    \ /:::/    /  
          \::::::/    /         |:::::::::/    //:::/    /            \:::\    \ /:::/    /         |:::::::::/    /     \:::\    /:::/    /   
           \::::/    /          |::|\::::/    //:::/    /              \:::\    /:::/    /          |::|\::::/    /       \:::\__/:::/    /    
           /:::/    /           |::| \::/____/ \::/    /                \:::\__/:::/    /           |::| \::/____/         \::::::::/    /     
          /:::/    /            |::|  ~|        \/____/                  \::::::::/    /            |::|  ~|                \::::::/    /      
         /:::/    /             |::|   |                                  \::::::/    /             |::|   |                 \::::/    /       
        /:::/    /              \::|   |                                   \::::/    /              \::|   |                  \::/____/        
        \::/    /                \:|   |                                    \::/____/                \:|   |                   ~~              
         \/____/                  \|___|                                     ~~                       \|___|                                   
                                                                                                                                               
*/