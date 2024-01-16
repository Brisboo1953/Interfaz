public class Interfacess implements aritmeticos{
    public static void main (String[] args){
       System.out.println(new Interfacess().suma(2,7));
       System.out.println(new Interfacess().resta(15,7));
       System.out.println(new Interfacess().multiplicacion(8,9));
       System.out.println(new Interfacess().division(50,10));
    }  

    public int suma (int x, int y){
        return x+y;
    }

    public int resta (int x, int y){
        return x-y;
    }

    public float division (int x, int y){
        return x/y;
    }

    public int multiplicacion (int x, int y){
        return x*y;
    }
}
    public interface aritmeticos{
        public int suma (int x, int y);
        public int resta (int x, int y);
        public float division (int x, int y);
        public int multiplicacion (int x, int y);
    }
