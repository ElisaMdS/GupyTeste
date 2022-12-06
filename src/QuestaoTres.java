import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class QuestaoTres {

    public static void main(String[] args) throws Exception {

        String file = "src/dados.json";
        String json = readFileAsString(file);
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        Faturamento [] faturamento = gson.fromJson(json, Faturamento [].class);
       
        GetMenorValor(faturamento);

        GetMaiorValor(faturamento);

        GetDiasMaioresQueAMedia(faturamento);  
    }

    private static void GetDiasMaioresQueAMedia(Faturamento[] faturamento) {
        double MediaMensal = 0;
        int dias = 0;

        for (int i = 0; i < faturamento.length; i++) {

            if (faturamento[i].valor != 0) {
                MediaMensal = MediaMensal + faturamento[i].valor;
                dias++;
            }
        }

        MediaMensal = MediaMensal/dias;
      

        int diasDeValorSuperiorAMediaMensal = 0;

        for (int i = 0; i < faturamento.length; i++) {

            if (faturamento[i].valor > MediaMensal) {
                diasDeValorSuperiorAMediaMensal++;
            }
        }

        System.out.println("O número de dias no mês em que o valor de faturamento diário foi superior à média mensal é " + diasDeValorSuperiorAMediaMensal);
    }

    private static void GetMaiorValor(Faturamento[] faturamento) {
        double MaiorValorDeFaturamento = 0;
        double valorAtual = 0;
        for (int i = 0; i < faturamento.length; i++) {

            if (faturamento[i].valor > valorAtual && faturamento[i].valor != 0) valorAtual = faturamento[i].valor;

        }

        MaiorValorDeFaturamento = valorAtual;
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês é " + MaiorValorDeFaturamento);
    }

    private static void GetMenorValor(Faturamento[] faturamento) {
        double MenorValorDeFaturamento = 0;
        double valorAtual = faturamento[0].valor;
        for (int i = 0; i < faturamento.length; i++) {

            if (faturamento[i].valor < valorAtual && faturamento[i].valor != 0) valorAtual = faturamento[i].valor;

        }

        MenorValorDeFaturamento = valorAtual;
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês é " + MenorValorDeFaturamento);
    }

    public static String readFileAsString (String file)  throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    } 

    class Faturamento {
        int dia;
        double valor;
    }
    
}
