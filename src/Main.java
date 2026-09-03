public class Main {
    public static void main(String[] args) {
        int alturaQueda = 20;
        int alturaMortal = 20;
        boolean caiuNaAgua = true;

        if (caiuNaAgua) {
            System.out.println("Sobreviveu na água!");
        } else if (alturaQueda >= alturaMortal) {
            System.out.println("Você morreu!");
        } else {
            System.out.println("Levou dano de queda");
        }
    }
}
