/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Huynh Nhu
 */

import java.util.ArrayList;
import java.util.List;

//
public class Vert implements Comparable<Vert> {

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    private boolean visited;
    private String name;
    private int x, y;
    private List<Edge> List;
    private double dist = Double.MAX_VALUE;
    private Vert pr;

    public Vert(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name; // 
        this.List = new ArrayList<>(); //
    }

    public List<Edge> getList() {
        return List;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<Edge> List) {
        this.List = List;
    }

    public void addNeighbour(Edge edge) {
        this.List.add(edge);
    }

    public boolean Visited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vert getPr() {
        return pr;
    }

    public void setPr(Vert pr) {
        this.pr = pr;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Vert otherV) {
        return Double.compare(this.dist, otherV.getDist());
    }
}