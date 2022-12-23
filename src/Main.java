import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> StopGo=new ArrayList<int[]>();
        StopGo.add(new int[] {10,0});
        StopGo.add(new int[] {3,5});
        StopGo.add(new int[] {2,5});
        System.out.println("Sisa Penumpang : " + getPassenger(StopGo));

    }
    public static int getPassenger(ArrayList<int[]> bisKota){
        int result = 0;
        for (int[] array : bisKota){
            result += array[0] - array[1];
        }
        return result;

    }

}