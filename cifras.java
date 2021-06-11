import java.util.Scanner;
public class cifras{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("\nSelecione a Técnica de cifragem:\n1. Código de César\n2. Lingua do P\n3. Sair");
       int opcaoDecifragem = sc.nextInt();
       switch(opcaoDecifragem){
            case 1:
                System.out.println("\nCÓDIGO DE CÉSAR Selecionado");
                opcaoCifrar(opcaoDecifragem);
                break;
            case 2:
                System.out.println("\nLINGUA DO P Selecionada");
                opcaoCifrar(opcaoDecifragem);
                break;
            case 3:
                System.out.println("\nOpção SAIR Selecionada\n\nAté Logo!");
                System.exit(0);
            default:
                System.out.println("\nOpção Invalida");
                break;
        }
        sc.close();
    }
    public static void opcaoCifrar(int opcaoDecifragem){
       Scanner sc = new Scanner(System.in);
       while(true){
           System.out.println("\nSelecione a operação desejada:\n1. Cifrar\n2. Decifrar\n3. Sair");
           int opcao = sc.nextInt();
               switch(opcao){
                  case 1:
                        System.out.println("\nOpção CIFRAR Selecionada");
                        cCifrar(true, opcaoDecifragem);
                        break;
                  case 2:
                        System.out.println("\nOpção Decifrar Selecionada");
                        cCifrar(false, opcaoDecifragem);
                        break;
                  case 3:
                    System.out.println("\nOpção SAIR Selecionada\n\nAté Logo!");
                    System.exit(0);
                  default:
                    System.out.println("\nOpção Invalida");
                    break;    
           }
           sc.close();
       }
       }
    public static void cCifrar(boolean opcao, int opcaoDecifragem){
        Scanner sc = new Scanner(System.in);
        if(opcaoDecifragem==1){
           String alfa="abcdefghijklnmopqrstuvwxyz";
           int qPosicoes = 0;
           
           System.out.println("\nDigite o número de posições: \n");
           qPosicoes = sc.nextInt();
               
           System.out.println("\nDigite a frase que deseja Converter: \n");
           sc.nextLine();
           
           String texto = sc.nextLine().toLowerCase();
           for(int i=0;i<texto.length();i++){
               int posAlfa = alfa.indexOf(texto.charAt(i));
               int contAlfa =(opcao) ? posAlfa + qPosicoes : posAlfa - qPosicoes;
        
               if(posAlfa!=-1){
                   if(contAlfa >= alfa.length()){
                       contAlfa = (contAlfa % alfa.length());
                   }
                   System.out.print(alfa.charAt(contAlfa));
               }else{
                   System.out.print(texto.charAt(i));
            }
           }
        }else{
            System.out.println("\nDigite a frase que deseja converter: \n");
            String texto = sc.nextLine();
            if(opcao==true){
                texto = texto.replace("","p");
            }else{
                texto = texto.replace("ppp","\0");
                texto = texto.replace("p","");
                texto = texto.replace("\0","p");
            }
            //texto = (opcao) ? texto.replace("","p") : texto.replace("p","");
            System.out.println("\n"+texto+"\n");
        }
        sc.close();
   }
}


