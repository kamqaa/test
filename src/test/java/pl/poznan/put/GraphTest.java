package pl.poznan.put;

import edu.princeton.cs.algs4.In;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphTest {

    String separator = System.getProperty("line.separator");

    @Test
    void testSimple() {
        In in = new In("simple.txt");

        Graph G = new Graph(in);

        assertEquals("10 vertices, 2 edges " + separator +
                "0: " + separator +
                "1: 2 " + separator +
                "2: 3 1 " + separator +
                "3: 2 " + separator +
                "4: " + separator +
                "5: " + separator +
                "6: " + separator +
                "7: " + separator +
                "8: " + separator +
                "9: " + separator, G.toString());
    }
}
