public class Buscar {
    public static int[] generaArreglo(int tam, int valorMin, int valorMax) {
        int[] arreglo = new int[tam];
        for (int i = 0; i < tam; i++) {
            arreglo[i] = valorMin + i % (valorMax - valorMin);
        }
        return arreglo;
    }

    public int Lineal(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            return i;
        }
        return -1;
    }


    public int buscar (int[] nums, int target){
        int  izquierda = 0;
        int derecha = nums.length-1;
        while(izquierda <= derecha){
            int med = izquierda +( derecha - izquierda)/2;
            if (nums[med] == target){
                return med;

            }else if(nums[med]<target){

                izquierda = med +1;

            }else{
                derecha = med - 1;

            }
        }
        return  -1;
    }

}
