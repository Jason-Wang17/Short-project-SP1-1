package cs6301.g18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import cs6301.g18.Graph.Vertex;

public class Diameter {
	
	Graph g;
	Vertex start;
	Vertex newEnd;
	LinkedList<Graph.Vertex> path;
	
	public Diameter(Graph g) {
		this.start = g.v[(int) (Math.random() * g.n)];
		this.g = g;
	}
	
	public void diameter(Graph g) {
		Bfs b = new Bfs(g);
		Vertex oldEnd = b.bfs(start);
		b.pathMap = new HashMap<>();
		b.visited = new HashMap<>();
		Vertex newEnd = b.bfs(oldEnd);
		this.newEnd = newEnd;
		this.path = b.pathMap.get(newEnd);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner uin = new Scanner(new File("ugraph.in"));
		Graph ug = Graph.readGraph(uin);
		Diameter d = new Diameter(ug);
		d.diameter(ug);
		LinkedList<Graph.Vertex> upath = d.path;
		System.out.println("In the graph, the longest path is: " + upath);
		
	}
}
