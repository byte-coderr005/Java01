public class LinearSearch {
    public static int search(int[] arr, int target){
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i; // bulundugu yerin indeksi
            }
        }
        return -1; // bulunamadı.
    }
    public static int stringAra(String[] arr, String hedef)
    {
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i].toLowerCase().equals(hedef))
            {
                return i;
            }
        }
        return -1;
    }
}
