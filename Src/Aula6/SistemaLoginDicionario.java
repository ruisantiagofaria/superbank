import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaLoginDicionario {
    public static void main(String[] args) {
        Map<String, String> usuariosCadastrados = new HashMap<>();
        usuariosCadastrados.put("Lula", "131313");
        usuariosCadastrados.put("Calleri", "122341");
        usuariosCadastrados.put("Diabo", "666");

        Scanner scanner = new Scanner(System.in);
        boolean loginSucesso = false;

        while (!loginSucesso) {
            System.out.println("=== TELA DE LOGIN ===");
            System.out.print("Digite o usuário: ");
            String usuarioDigitado = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senhaDigitada = scanner.nextLine();

            boolean usuarioEncontrado = senhaDigitada.equals(usuariosCadastrados.get(usuarioDigitado));

            if (usuarioEncontrado) {
                System.out.println("\nLogin realizado com sucesso! Bem-vindo(a), " + usuarioDigitado + "!\n");
                loginSucesso = true;
            } else {
                System.out.println("\nUsuário ou senha incorretos. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}