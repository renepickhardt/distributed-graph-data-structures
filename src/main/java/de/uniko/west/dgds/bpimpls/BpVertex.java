package de.uniko.west.dgds.bpimpls;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Query;
import com.tinkerpop.blueprints.Vertex;

public class BpVertex implements Vertex {

	UUID id;
	Set<Edge> outEdges;
	
	public BpVertex(UUID id){
		this.id = id;
	}
	
	public BpVertex(UUID id, Set<Edge> outEdges){
		this(id);
		this.outEdges = outEdges; 	
	}
	
	public Object getId() {
		return id;
	}

	public Object getProperty(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> getPropertyKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeProperty(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setProperty(String arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	public Iterable<Edge> getEdges(Direction arg0, String... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Vertex> getVertices(Direction arg0, String... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Query query() {
		// TODO Auto-generated method stub
		return null;
	}

}
