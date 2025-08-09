import java.util.Random;

public class Contador {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("=== Sistema de Validação de Processo Seletivo ===");

        // Lista de candidatos
        String[] candidatos = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gustavo", "Helena"};
        double salarioBase = 2000.0;

        System.out.println("\nLista de candidatos e salários pretendidos:");
        String[] aprovados = new String[candidatos.length];
        int indiceAprovados = 0;

        for (String candidato : candidatos) {
            double salarioPretendido = 1800 + random.nextInt(800); // entre 1800 e 2600
            boolean aprovado = salarioPretendido <= salarioBase;

            System.out.printf("Candidato: %-10s | Salário Pretendido: R$ %.2f | %s%n",
                    candidato, salarioPretendido, (aprovado ? "APROVADO" : "REPROVADO"));

            if (aprovado) {
                aprovados[indiceAprovados++] = candidato;
            }
        }

        // Simulação de ligação para cada aprovado
        System.out.println("\n--- Tentativas de contato com candidatos aprovados ---");
        for (int i = 0; i < indiceAprovados; i++) {
            tentarContato(aprovados[i]);
        }

        System.out.println("\n✅ Processo seletivo finalizado com sucesso!");
    }

    // Método auxiliar para tentar contato com candidato
    static void tentarContato(String candidato) {
        Random random = new Random();
        boolean atendeu = false;
        int tentativa = 0;
        int maxTentativas = 3;

        while (!atendeu && tentativa < maxTentativas) {
            tentativa++;
            // Simula se atendeu (50% de chance)
            atendeu = random.nextBoolean();

            if (atendeu) {
                System.out.println("📞 Conseguimos contato com " + candidato + " após " + tentativa + " tentativa(s).");
            } else if (tentativa < maxTentativas) {
                System.out.println("Tentando contato com " + candidato + " novamente...");
            } else {
                System.out.println("❌ Não conseguimos contato com " + candidato + ".");
            }
        }
    }
}