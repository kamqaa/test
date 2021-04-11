package pl.poznan.put;

import edu.princeton.cs.algs4.In;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphTest {

    @Test
    void testSimple() {
        In in = new In("simple.txt");

        Graph G = new Graph(in);

        assertEquals("10 vertices, 2 edges \n" +
                "0: \n" +
                "1: 2 \n" +
                "2: 3 1 \n" +
                "3: 2 \n" +
                "4: \n" +
                "5: \n" +
                "6: \n" +
                "7: \n" +
                "8: \n" +
                "9: \n", G.toString());
    }
    @Test
    void testSimple() {
        In in = new In("proba2.txt");

        Graph G = new Graph(in);

        assertEquals("15 vertices, 4 edges \n" +
                "0: \n" +
                "1: 2 \n" +
                "2: 3 1 \n" +
                "3: 2 \n" +
                "4: \n" +
                "5: \n" +
                "6: \n" +
                "7: \n" +
                "8: \n" +
                "9: \n" +
                "10: \n" +
                "11: \n" +
                "12: \n" +
                "13: \n" +
                "14: \n", G.toString());
    }
    @Test
    void testSimple() {
        In in = new In("proba3.txt");

        Graph G = new Graph(in);

        assertEquals("8 vertices, 3 edges \n" +
                "0: \n" +
                "1: 2 \n" +
                "2: 3 1 \n" +
                "3: 2 \n" +
                "4: \n" +
                "5: \n" +
                "6: \n" +
                "7: \n", G.toString());
    }
}
