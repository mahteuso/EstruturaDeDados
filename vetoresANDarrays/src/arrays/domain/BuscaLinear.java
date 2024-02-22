package arrays.domain;

public class BuscaLinear {
    public static void main(String[] args) {
        String[] estados = new String[5];
        estados[0] = "SP";
        estados[1] = "MG";
        estados[2] = "PB";
        estados[3] = "PI";
        estados[4] = "SC";

        String busca = "SC";

        for (String estado : estados){
            if(estado.equals(busca)){
                System.out.println(estado+" = "+busca);
            }
        }
        System.out.println("-----------------------");
        for (int i = 0; i < estados.length; i++){
            if (estados[i].equals(busca)){
                System.out.println("O estado: "+estados[i]+" estava na posição: "+i+" dentro do vetor");
                break;
            }
        }
    }
}
