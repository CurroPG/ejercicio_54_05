public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la figura: "));
        int fila = altura;
        int base = 0;

        do{
            if(base == 0){
                for(int i = 0; i < fila; i++){
                    System.out.print("*");
                }
            }else{
                for(int i = 1; i <= fila; i++){
                    if(i == 1 || i == fila)
                        System.out.print("*");
                        else
                            System.out.print(" ");
                }
            }  
            System.out.println();
            base++;
            fila--;
        }while(base < altura);
    }
}
