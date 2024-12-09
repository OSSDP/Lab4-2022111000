package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution12Test {

    /**
     * 在测试multiply方法时，定义两个参数分别为A和B，可以进行如下等价类的划分：
     * 基于乘数是否为0的划分：A为0B不为0，A不为0B为0，A和B都不为0，A和B都为0；
     * 基于字符串长度的划分：A的长度大于B、B的长度大于A、A和B的长度相等；
     * 基于A的B的值是否超过Long.MAX_VALUE的最大值的划分：A与B均不超过、A超过B不超过、B超过A不超过、A和B均超过
     * 基于A与B的值相差的划分：A远大于B（10000000倍差距），A远小于B，A与B相差不大
     * 基于乘积是否产生进位的划分：有进位、无进位
     */

    /**
     * 测试目的：测试数值是否为0是否会影响计算的正确性
     * 测试用例：A为“0”，B为“0”；
     *      A为“7678324”，B为“21”；
     *      A为“0”，B为“8490276”；
     *      A为“2412“，B为”0“
     */
    @Test
    public void multiply_1() {
        Solution12 solution12 = new Solution12();
        assertEquals("0",solution12.multiply("0","0"));
        assertEquals("161244804",solution12.multiply("7678324","21"));
        assertEquals("0",solution12.multiply("0","8490276"));
        assertEquals("0",solution12.multiply("2412","0"));
    }

    /**
     * 测试目的：测试两个参数长度的相差是否会影响计算结果的正确性
     * 测试用例：A为“2398634”，B为“946”；
     *      A为“6352”，B为“987474321”；
     *      A为“44266”，B为“85024”。
     */
    @Test
    public void multiply_2(){
        Solution12 solution12 = new Solution12();
        assertEquals("2269107764",solution12.multiply("2398634","946"));
        assertEquals("6272436886992",solution12.multiply("6352","987474321"));
        assertEquals("3763672384",solution12.multiply("44266","85024"));
    }

    /**
     * 测试目的：测试计算是否产生进位是否会对计算结果的正确性造成影响
     * 测试用例：A为“879656”，B为“946”；
     *      A为“11111”，B为“6423476”；
     */
    @Test
    public void multiply_3(){
        Solution12 solution12 = new Solution12();
        assertEquals("832154576",solution12.multiply("879656","946"));
        assertEquals("71371241836",solution12.multiply("11111","6423476"));
    }

    /**
     * 测试目的：A和B的值是否超过整型的最大值、A与B的值是否相差巨大，这两个因素计算的正确性是否造成影响
     * 测试用例：A为“112”，B为“115”；
     *      A为“9223372036854775808”，B为“827”；
     *      A为“53”，B为“9223372036854775808”；
     *      A为“9223372036854775808”，B为“9223372036854775809”
     */
    @Test
    public void multiply_4(){
        Solution12 solution12 = new Solution12();
        assertEquals("7627728674478899593216",solution12.multiply("9223372036854775808","827"));
        assertEquals("488838717953303117824",solution12.multiply("53","9223372036854775808"));
        assertEquals("85070591730234615875067023894796828672",solution12.multiply("9223372036854775808","9223372036854775809"));
    }

    /*******************************************************************************/

    /**
     * 在测试addString方法时，定义两个参数分别为A和B，可以进行如下等价类的划分：
     * 基于字符串长度的划分：A的长度大于B、B的长度大于A、A和B的长度相等；
     * 基于数值是否为0的划分：A和B都为0、A和B都不为0、A为0B不为0、B为0A不为0；
     * 基于加和是否发生进位的划分：A加B不存在进位、A加B有一部分存在进位一部分不进位、A和B的每一位相加都发生进位
     * 基于A的B的值是否超过Long.MAX_VALUE的最大值的划分：A与B均不超过、A超过B不超过、B超过A不超过、A和B均超过
     * 基于A与B的值相差的划分：A远大于B（10000000倍差距），A远小于B，A与B相差不大
     */

    /**
     * 测试目的：测试字符串长度是否会对方法的正确性造成影响
     * 测试用例：A为“2398634”，B为“946”；
     *      A为“6352”，B为“987474321”；
     *      A为“44266”，B为“85024”。
     */
    @Test
    public void addStrings_1() {
        Solution12 solution12 = new Solution12();
        assertEquals("2399580", solution12.addStrings("2398634", "946"));
        assertEquals("987480673", solution12.addStrings("6352", "987474321"));
        assertEquals("129290", solution12.addStrings("44266", "85024"));
    }

    /**
     * 测试目的：测试数值是否为0是否会影响计算的正确性
     * 测试用例：A为“0”，B为“0”；
     *      A为“98546”，B为“221”；
     *      A为“0”，B为“435720”；
     *      A为“44167“，B为”0“
     */
    @Test
    public void addStrings_2(){
        Solution12 solution12 = new Solution12();
        assertEquals("0",solution12.addStrings("0","0"));
        assertEquals("98767",solution12.addStrings("98546","221"));
        assertEquals("435720",solution12.addStrings("0","435720"));
        assertEquals("44167",solution12.addStrings("44167","0"));
    }

    /**
     * 测试目的：加和是否产生进位是否对计算的正确性造成影响
     * 测试用例：A为“24113”，B为“1341122”；
     *      A为“1199911”，B为“2228888”；
     *      A为“989898988”，B为“77777777”
     */
    @Test
    public void addStrings_3(){
        Solution12 solution12 = new Solution12();
        assertEquals("1365235",solution12.addStrings("24113","1341122"));
        assertEquals("3428799",solution12.addStrings("1199911","2228888"));
        assertEquals("1067676765",solution12.addStrings("989898988","77777777"));
    }

    /**
     * 测试目的：A和B的值是否超过整型的最大值、A与B的值是否相差巨大，这两个因素计算的正确性是否造成影响
     * 测试用例：A为“112”，B为“115”；
     *      A为“9223372036854775808”，B为“827”；
     *      A为“53”，B为“9223372036854775808”；
     *      A为“9223372036854775808”，B为“9223372036854775809”
     */
    @Test
    public void addStrings_4(){
        Solution12 solution12 = new Solution12();
        assertEquals("227",solution12.addStrings("112","115"));
        assertEquals("9223372036854776635",solution12.addStrings("9223372036854775808","827"));
        assertEquals("9223372036854775861",solution12.addStrings("53","9223372036854775808"));
        assertEquals("18446744073709551617",solution12.addStrings("9223372036854775808","9223372036854775809"));
    }
}