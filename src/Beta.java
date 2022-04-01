import java.io.IOException;

public class Beta {

    History history = new History();
    private float result;
    private float b = 0;

    public void sqrt(float a) throws IOException {
        result = (float)Math.sqrt(a);
        System.out.println("La radice quadrata di " + a + " è: " + result);
        history.write(a, b, result, "sqrt");
    }

    public void sin(float a) throws IOException {
        result = (float)Math.sqrt(a);
        System.out.println("Il seno di " + a + " è: " + result);
        history.write(a, b, result, "sin");
    }

    public void cos(float a) throws IOException {
        result = (float)Math.sqrt(a);
        System.out.println("Il coseno di " + a + " è: " + result);
        history.write(a, b, result, "cos");
    }

    public void tan(float a) throws IOException {
        result = (float)Math.sqrt(a);
        System.out.println("La tangente di " + a + " è: " + result);
        history.write(a, b, result, "tan");
    }
}
