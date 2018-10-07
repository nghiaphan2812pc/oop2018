package week3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void test1(){
    assertEquals(3, Week3.max(2, 3));
    }
    @Test
    public void test2() {
        assertEquals(10, Week3.max(10, -5));
    }
    @Test
    public void test3() {
        assertEquals(9, Week3.max(-9, 9));
    }
    @Test
    public void test4() {
        assertEquals(1000, Week3.max(1000, -256));
    }
    @Test
    public void test5(){
        assertEquals(1024, Week3.max(256,1024));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testmin1() {

        int arr[] = {1, 2, 3, 4, 5};
        assertEquals(1, Week3.minOfArray(arr));
    }
    @Test
    public void testmin2() {
        int arr1[] = {-19, 2, 0, 99, 3, 8, 789, 2669};
        assertEquals(-19, Week3.minOfArray(arr1));
    }
    @Test
    public void testmin3() {
        int arr2[] = {-99, 2, 0, 99, 3, 8};
        assertEquals(-99, Week3.minOfArray(arr2));
    }
    @Test
    public void testmin4() {
        int arr4[] = {0,33,88,22,-8};
        assertEquals(-8, Week3.minOfArray(arr4));
    }
    @Test
    public void testmin5() {
        int arr5[] = {0,1,3,4,5,9,-99,33,20};
        assertEquals(-99, Week3.minOfArray(arr5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testbmi1()
    {
        assertEquals("Thua can", Week3.calculateBMI(60,1.6));
    }
    @Test
    public void testbmi2()
    {
        assertEquals("Thieu can", Week3.calculateBMI(36.5,1.55));
    }
    @Test
    public void testbmi3()
    {
        assertEquals("Beo phi", Week3.calculateBMI(100,1.9));
    }
    @Test
    public void testbmi4()
    {
        assertEquals("Binh thuong", Week3.calculateBMI(60,1.7));
    }
    @Test
    public void testbmi5()
    {
        assertEquals("Thua can", Week3.calculateBMI(70,1.7));
    }
}
