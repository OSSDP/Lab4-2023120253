import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试类：SolutionTest
 * 用于测试 Solution 类中 multiply 方法的功能和边界情况。
 * 等价类划分为有效输入和无效输入，重点验证方法的正确性、鲁棒性和异常处理。
 */
class SolutionTest {

    /**
     * 测试普通情况的字符串相乘。
     */
    @Test
    public void testMultiply_Normal() {
        Solution solution = new Solution();

        // 测试示例 1: 2 * 3 = 6
        assertEquals("6", solution.multiply("2", "3"));

        assertEquals("100", solution.multiply("10", "10"));

        // 测试示例 2: 123 * 456 = 56088
        assertEquals("56088", solution.multiply("123", "456"));
    }

    /**
     * 测试边界情况：有一个数字为 0。
     */
    @Test
    public void testMultiply_Zero() {
        Solution solution = new Solution();

        // 测试 0 * 12345 = 0
        assertEquals("0", solution.multiply("0", "12345"));

        // 测试 12345 * 0 = 0
        assertEquals("0", solution.multiply("12345", "0"));
    }

    /**
     * 测试数字为 1 的情况。
     */
    @Test
    public void testMultiply_One() {
        Solution solution = new Solution();

        // 测试 1 * 9999 = 9999
        assertEquals("9999", solution.multiply("1", "9999"));

        // 测试 9999 * 1 = 9999
        assertEquals("9999", solution.multiply("9999", "1"));
    }

    /**
     * 测试大数字相乘。
     */
    @Test
    public void testMultiply_LargeNumbers() {
        Solution solution = new Solution();

        // 测试大数乘法: 123456789 * 987654321
        assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));
    }

    /**
     * 测试只有一个数字为一位数，另一个为多位数的情况。
     */
    @Test
    public void testMultiply_OneDigitAndMultipleDigits() {
        Solution solution = new Solution();

        // 测试 5 * 12345 = 61725
        assertEquals("61725", solution.multiply("5", "12345"));

        // 测试 9 * 98765 = 888885
        assertEquals("888885", solution.multiply("9", "98765"));
    }
}
