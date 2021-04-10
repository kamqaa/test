package pl.poznan.put;

import edu.princeton.cs.algs4.In;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphTest {

    @Test
    void testSimple() {
        In in = new In("dupa.txt");

        Graph G = new Graph(in);

        assertEquals("dupa", G.toString());
    }
}
