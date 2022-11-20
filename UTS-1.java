public class Main {
    public static void main(String[] args) {
        int arrang[] = {55,26,77,50,5,8,12,65,45,90,57,40,38,88,99};
        System.out.println("bilangan genap");
        for (int i = 0; i< arrang.length; i++){
            if (arrang[i]%2 == 0){
                System.out.println(arrang[i]);
            }
        }
        System.out.println("bilangan ganjil");
        for (int i =0; i<arrang.length; i++){
            if (arrang[i]%2!= 0){
                System.out.println(arrang[i]);
            }
        }
    }
}