package partidasRankeadas;

public class CalcularRank {
    public static String rank(int vitorias, int derrotas){
        int rank = vitorias - derrotas;
        String nivelRank;

        if(rank < 10){
            nivelRank = "Ferro";
        }else if(rank <= 20){
            nivelRank = "Bronze";
        }else if(rank <= 50){
            nivelRank = "Prata";
        }else if(rank <= 80){
            nivelRank = "Ouro";
        }else if(rank <= 90){
            nivelRank = "Diamante";
        }else if(rank <= 100){
            nivelRank = "Lendário";
        }else{
            nivelRank = "Imortal";
        }
        return "O herói tem saldo de " + rank + " e está no nível " + nivelRank;
    }
}
