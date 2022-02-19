/*
Arturo Henerto Argueta Avila
Carné 52527
*/


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
     public static void main(String[] args) throws IOException{
        
        //solicitar directorio de guardado
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el directorio del archivo de texto, ejemplo: D:\\Programas\\POO\\Parqueo\\src\\Data.txt");
        String direction = scan.nextLine();
        ArrayList<String> operations = new ArrayList<>();
        
        //verificar l existencia del archivo
        try {
            BufferedReader bf = new BufferedReader(new FileReader (direction));
            String line;
            while((line = bf.readLine()) != null){//guardar todas las expresiones
                operations.add(line);
            }
         
            //evaluarlas
           for(String expresion: operations){
            Decoder dec = new Decoder();
            System.out.println("Operacion realizada: " + expresion);
            System.out.println(dec.DecodeExpresion(expresion));
            }
        }
        catch(FileNotFoundException f){
            System.out.println("No existe el archivo");
            System.exit(0);
        }

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