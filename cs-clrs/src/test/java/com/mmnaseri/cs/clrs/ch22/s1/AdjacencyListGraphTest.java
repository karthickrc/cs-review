package com.mmnaseri.cs.clrs.ch22.s1;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (8/3/15)
 */
public class AdjacencyListGraphTest extends BaseGraphTest {

    @Override
    protected Graph<EdgeDetails, VertexDetails> graph() {
        return new AdjacencyListGraph<>();
    }

}