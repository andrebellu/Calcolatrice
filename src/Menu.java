import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Alfa alfa = new Alfa();
    Beta beta = new Beta();
    private int scelta = 999;
    private float a, b;

    public void run() throws IOException{
            System.out.println("0- Addizione \n 1- Sottrazione \n 2- Divisione \n 3- Moltiplicazione \n 4- Potenza" +
                    " \n 5- Radice Quadrata \n 6- Seno \n 7- Coseno \n 8- Tangente \n 9- Cancella Cronologia" );

            System.out.println("Operazione: ");

            try{
                while(scelta < 0 || scelta > 9){
                    scelta = Integer.parseInt(scanner.next());
                }
            } catch (Exception e){
                System.out.println("Errore di input");
            }

            if (scelta < 5){
                System.out.println("Inserisci il primo numero: ");
                a = scanner.nextFloat();
                System.out.println("Inserisci il secondo numero: ");
                b = scanner.nextFloat();
            }else if(scelta != 9){
                System.out.println("Inserisci il numero: ");
                a = scanner.nextFloat();
            }

            switch (scelta){
                case 0:
                    alfa.sum(a, b);
                    break;
                case 1:
                    alfa.sub(a, b);
                    break;
                case 2:
                    alfa.div(a, b);
                    break;
                case 3:
                    alfa.mul(a, b);
                    break;
                case 4:
                    alfa.pow(a, b);
                    break;
                case 5:
                    beta.sqrt(a);
                    break;
                case 6:
                    beta.sin(a);
                    break;
                case 7:
                    beta.cos(a);
                    break;
                case 8:
                    beta.tan(a);
                    break;
                case 9:
                    History.clear();
                    break;
                default:
                    break;
            }
    }
}
