import java.io.FileWriter;
import java.io.IOException;

public class History {

    public void write(float a, float b, float result, String type) throws IOException {
        FileWriter writer = new FileWriter("Calcolatrice/src/cronologia.txt", true);

        switch (type) {
            case "sum":
                writer.write("\n" + a + "+" + b + "=" + result);
                break;
            case "sub":
                writer.write("\n" + a + "-" + b + "=" + result);
                break;
            case "div":
                writer.write("\n" + a + "/" + b + "=" + result);
                break;
            case "mul":
                writer.write("\n" + a + "*" + b + "=" + result);
                break;
            case "pow":
                writer.write("\n" + a + "^" + b + "=" + result);
                break;
            case "sqrt":
                writer.write("\n" + "sqrt(" + a + ")" + "=" + result);
                break;
            case "sin":
                writer.write("\n" + "sin" + a + "=" + result);
                break;
            case "cos":
            writer.write("\n" + "cos" + a + "=" + result);
                break;
            case "tan":
            writer.write("\n" + "tan" + a + "=" + result);
                break;
            default:
                break;
        }
        writer.close();
    }

    public static void clear() throws IOException {
        FileWriter clearer = new FileWriter("Calcolatrice/src/cronologia.txt", false);
        clearer.write("HISTORY: ");
        clearer.close();
    }

}
