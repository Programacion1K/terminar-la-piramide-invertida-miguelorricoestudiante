public class PiramideInvertida {
    public static void main(String[] args) {
        int filas=5;
        System.out.println(cadenaPiramideInvertida(filas));
    }

    public static String cadenaPiramideInvertida(int filas) {
        if(filas<=0){
            return "";
        }
        return "*";
    }
}
