public class BigO_Linear {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i=0; i < array.length; i++){
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);
        }

        int number = 15;
        boolean find = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                System.out.println("O número " + number + " estava na posição: " +i);
                find = true;
                break;
            }
        }
        if (!find){
            System.out.println("Valor não encontrado!");
        }
    }
}
