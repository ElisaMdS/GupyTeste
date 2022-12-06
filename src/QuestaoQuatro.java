public class QuestaoQuatro {

    public static void main(String[] args) {

        double faturamentoMensalTotal = 0;

        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        faturamentoMensalTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        System.out.println("O percentual de representação de SP dentro do valor total mensal da distribuidora é " + percentual(faturamentoMensalTotal, faturamentoSP) + "%");
        System.out.println("O percentual de representação de RJ dentro do valor total mensal da distribuidora é " + percentual(faturamentoMensalTotal, faturamentoRJ) + "%");
        System.out.println("O percentual de representação de MG dentro do valor total mensal da distribuidora é " + percentual(faturamentoMensalTotal, faturamentoMG) + "%");
        System.out.println("O percentual de representação de ES dentro do valor total mensal da distribuidora é " + percentual(faturamentoMensalTotal, faturamentoES) + "%");
        System.out.println("O percentual de representação de Outros dentro do valor total mensal da distribuidora é " + percentual(faturamentoMensalTotal, faturamentoOutros) + "%");

    }

    public static double percentual(double total, double parte) {

        double percentual = (parte * 100) / total;
        return percentual;

    }
}
