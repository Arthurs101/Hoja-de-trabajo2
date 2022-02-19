/*
Arturo Henerto Argueta Avila
Carné 52527

esta clase se encarga de decodificar la expresion y realizar las experiones correspondientes, ademas de verificar que este corrrecta la expresion
*/

import java.util.ArrayList;

public class Decoder {
    private Stacker st = new Stacker<Integer>();
    private Operator calc = new Operator();
    
    public String DecodeExpresion(String line){
    int result = 0;
    boolean evaluate = true;//en caso de haber un error de sintaxis al colocr dos signos juntos
    boolean valid = false;//en caso de no haber ningun signo no es valida la expresion
    String message = "";
    for(int n = 0; n <line.length(); n ++){
        char c = line.charAt(n);
        switch(c){//ver que representa el caracter
            case '+' ->{//suma
                ArrayList<Integer> in = NumbersGetter();
                String R = calc.add(in);
                if(R.equals("f")){
                    evaluate = false;
                    
                }else{
                    result = Integer.valueOf(R);//colocar el resutlado en la variable
                    st.push(result);//colocar el resultado en la pila
                    valid = true; //al haber un tipo de operacion es valida
                }
            }
            
            default->{
                //comprobar que sea un numero
                boolean number_check = Character.isDigit(c);
                if(number_check){
                    String c_string = String.valueOf(c);//convertir de chr a String , luego a int, dado que de char a int obtiene su valor segun codigo ascii 
                    st.push(Integer.valueOf(c_string));
                }

            }
        }
    }
   
    if (evaluate && valid){//si es valida la operacion mostrar el resultado
     message = String.valueOf(result);
     
    }else{
        message = "Error de sintaxis";
        
    }
        return message;
    } 
    private ArrayList<Integer> NumbersGetter(){//obtencion de todos los numeros
         ArrayList<Integer> numbers = new ArrayList<>();
         while(!st.empty()) {
             int p = (int) st.pull();
             numbers.add(p);
         }
         return numbers;
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