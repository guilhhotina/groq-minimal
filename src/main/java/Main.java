import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChatLanguageModel model = OpenAiChatModel.builder()
            .apiKey("gsk_sua_api_key_aqui")
            // endpoint da api
            .baseUrl("https://api.groq.com/openai/v1")
            
            // modelo que eu gosto (pode trocar, só dar uma olhadinha na lista de modelos da groq)
            .modelName("moonshotai/kimi-k2-instruct-0905")
            .build();

        // inicializa leitor de pergunta
        Scanner scanner = new Scanner(System.in);
        
        // print simples pra usuário
        System.out.print("digite sua pergunta: ");
        
        // lê a entrada do usuário
        String input = scanner.nextLine();

        // chama o modelo via langchain4j para gerar resposta
        String response = model.generate(input);
        
        // print da requisição
        System.out.println("resposta: " + response);

        scanner.close();
    }
}
