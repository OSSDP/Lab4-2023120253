import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testMultiply() {
        Solution solution = new Solution();

        // 测试用例 1: 基本功能测试
        assertEquals("62", solution.multiply("2", "3"));

        // 测试用例 2: 多位数相乘
        assertEquals("56088", solution.multiply("123", "456"));

        // 测试用例 3: 输入包含 "0"
        assertEquals("0", solution.multiply("0", "123"));
        assertEquals("0", solution.multiply("123", "0"));

        // 测试用例 4: 单位数相乘
        assertEquals("81", solution.multiply("9", "9"));

        // 测试用例 5: 较大数字
        assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));

        // 测试用例 6: 边界情况，输入都是 1
        assertEquals("1", solution.multiply("1", "1"));

        // 测试用例 7: 长度不同的字符串
        assertEquals("123456789", solution.multiply("1", "123456789"));
        assertEquals("123456789", solution.multiply("123456789", "1"));
    }

    @Test
    public void testAddStrings() {
        Solution solution = new Solution();

        // 测试用例 1: 基本加法
        assertEquals("579", solution.addStrings("123", "456"));

        // 测试用例 2: 进位测试
        assertEquals("1000", solution.addStrings("999", "1"));

        // 测试用例 3: 不同长度
        assertEquals("1001", solution.addStrings("1", "1000"));

        // 测试用例 4: 全零输入
        assertEquals("0", solution.addStrings("0", "0"));
    }
}