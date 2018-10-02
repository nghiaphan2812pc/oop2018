package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        int max;
        if(m > n)
            max = m;
        else
            max = n;
        return max;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(min > array [i])
                min = array[i];
        }
        return min;
    }
    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double n;
        n= weight / (height*height);
        if (n<18.5)
            System.out.println("Thieu can");
        else if(n>= 18.5 && n<=23)
            System.out.println("Binh Thuong");
        else if (n>= 23 && n<=25)
            System.out.println("Thua can");
        else if (n>25)
            System.out.println("Beo phi");
        return null;
    }
}
