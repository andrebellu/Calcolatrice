import java.io.IOException;

public class Alfa {

    History history = new History();
    float result;

    public void sum(float a, float b) throws IOException {
        result = a + b;
        System.out.println("La somma dei due numeri è: " + result);
        history.write(a, b, result, "sum");
    }

    public void sub(float a, float b) throws IOException {
        result = a - b;
        System.out.println("La sottrazione dei due numeri è: " + result);
        history.write(a, b, result, "sub");
    }

    public void div(float a, float b) throws IOException {
        result = a/b;
        System.out.println("La divisione dei due numeri è: " + result);
        history.write(a, b, result, "div");
    }

    public void mul(float a, float b) throws IOException {
        result = a*b;
        System.out.println("La moltiplicazione dei due numeri è: " + result);
        history.write(a, b, result, "mul");
    }

    public void pow(float a, float b) throws IOException {
        result = (float)Math.pow(a, b);
        System.out.println("La potenza è: " + result);
        history.write(a, b, result, "pow");
    }
}
