package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Road {
	
	private String name;
	private HashMap<String,Point> points;
	private ArrayList<MapSection> nodes;
	private HashMap<String, Intersection> intersections;
	
	
	public HashMap<String, Intersection> getIntersections() {
		return intersections;
	}

	public Road(String name){
		this.name = name;
		points = new HashMap<String, Point>();
		nodes = new ArrayList<MapSection>();
	};
	
	public void addNode(Point point, String name){
		points.put(name, point);
	}
	
	public Point createPoint(String name, Point previous, ArrayList<String> nodes){
		
		Point point = new Point(name);
		point.generateNodes(previous,nodes);
		
		return point;	
	}
	
	public void addSection(MapSection section){
		nodes.add(section);
	}
	
}