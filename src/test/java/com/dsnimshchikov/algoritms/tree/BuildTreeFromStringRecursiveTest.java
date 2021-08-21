package com.dsnimshchikov.algoritms.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuildTreeFromStringRecursiveTest {
    //    Дана строка 8 (4(2(1))(5))(12(10(9)(11))(14(13)(15))))
//                 ——-8---
//               /         \
//              4          12
//            / \       /       \
//            2  5     10        14
//           |        9  11    13  15
//           1

    @Test
    void makeTree() {
        BuildTreeFromStringRecursive buildTreeFromString = new BuildTreeFromStringRecursive();
        assertEquals("[14, 2, 16, 3, 1, 15]", buildTreeFromString.makeTree("14(2(3)(1))(16(15))").toString());
        assertEquals("[8, 4, 12, 2, 5, 10, 14, 1, 9, 11, 13, 15]",
                buildTreeFromString.makeTree("8(4(2(1))(5))(12(10(9)(11))(14(13)(15)))").toString());
    }
}
