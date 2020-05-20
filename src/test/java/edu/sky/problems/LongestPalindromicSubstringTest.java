package edu.sky.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @BeforeEach
    void beforeEach() {
        LongestPalindromicSubstring.max = 1;
        LongestPalindromicSubstring.start = 0;
        LongestPalindromicSubstring.end = 1;

    }

    @Test
    void longestPalindrome() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = longestPalindromicSubstring.longestPalindrome("babaaaaatykui");
        assertEquals("aaaaa", s);
    }

    @Test
    void oneCharLong() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = longestPalindromicSubstring.longestPalindrome("s");
        assertEquals("s", s);
    }

    @Test
    void emptyString() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = longestPalindromicSubstring.longestPalindrome("");
        assertEquals("", s);
    }

    @Test
    void firstWrongLeet() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = longestPalindromicSubstring.longestPalindrome("cbbd");
        assertEquals("bb", s);
    }

    @Test
    void secondWrongLeet() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = longestPalindromicSubstring.longestPalindrome("rgczcpratwyqxaszbuwwcadruayhasynuxnakpmsyhxzlnxmdtsqqlmwnbxvmgvllafrpmlfuqpbhjddmhmbcgmlyeypkfpreddyencsdmgxysctpubvgeedhurvizgqxclhpfrvxggrowaynrtuwvvvwnqlowdihtrdzjffrgoeqivnprdnpvfjuhycpfydjcpfcnkpyujljiesmuxhtizzvwhvpqylvcirwqsmpptyhcqybstsfgjadicwzycswwmpluvzqdvnhkcofptqrzgjqtbvbdxylrylinspncrkxclykccbwridpqckstxdjawvziucrswpsfmisqiozworibeycuarcidbljslwbalcemgymnsxfziattdylrulwrybzztoxhevsdnvvljfzzrgcmagshucoalfiuapgzpqgjjgqsmcvtdsvehewrvtkeqwgmatqdpwlayjcxcavjmgpdyklrjcqvxjqbjucfubgmgpkfdxznkhcejscymuildfnuxwmuklntnyycdcscioimenaeohgpbcpogyifcsatfxeslstkjclauqmywacizyapxlgtcchlxkvygzeucwalhvhbwkvbceqajstxzzppcxoanhyfkgwaelsfdeeviqogjpresnoacegfeejyychabkhszcokdxpaqrprwfdahjqkfptwpeykgumyemgkccynxuvbdpjlrbgqtcqulxodurugofuwzudnhgxdrbbxtrvdnlodyhsifvyspejenpdckevzqrexplpcqtwtxlimfrsjumiygqeemhihcxyngsemcolrnlyhqlbqbcestadoxtrdvcgucntjnfavylip");
        assertEquals("qgjjgq", s);
    }
}