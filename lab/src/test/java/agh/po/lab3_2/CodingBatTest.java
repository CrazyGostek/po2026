package agh.po.lab3_2;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {
    @Test
    public void mapAB4_() {
        assertEquals(Map.of("a", "aaa", "b", "bb", "c", "aaa"), CodingBat.mapAB4(Map.of("a", "aaa", "b", "bb", "c", "cake")));
        assertEquals(Map.of("a", "aa", "b", "bbb", "c", "bbb"), CodingBat.mapAB4(Map.of("a", "aa", "b", "bbb", "c", "cake")));
        assertEquals(Map.of("a", "aa", "b", "bbb", "c", "bbb"), CodingBat.mapAB4(Map.of("a", "aa", "b", "bbb")));
    }

    @Test
    public void wordLen() {
        assertEquals(Map.of("bb", 2, "a", 1), CodingBat.wordLen(new String[]{"a", "bb", "a", "bb"}));
        assertEquals(Map.of("that", 4, "and", 3, "this", 4), CodingBat.wordLen(new String[]{"this", "and", "that", "and"}));
        assertEquals(Map.of("code", 4, "bug", 3), CodingBat.wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}