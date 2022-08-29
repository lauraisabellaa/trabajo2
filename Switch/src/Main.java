public class Main {
    public static void main(String[] args) {
        String que_mes_es = "agosto";

        switch (que_mes_es) {
            case "julio":
            case "agosto":
            case "septiembre":
                System.out.println("es verano");
                 break;
            case "marzo":
            case "abril":
            case "mayo":
            case "junio":
                System.out.println("es primavera");
                break;
            case "octubre":
            case "noviembre":
                System.out.println("es otoño");
                break;
            case "enero":
            case "febrero":
            case "diciembre":
                System.out.println("es invierno");
                break;
            default:
                System.out.println( "escribir nombre del mes");
        }
    }


}