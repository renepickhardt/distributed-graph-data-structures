package de.uniko.west.dgds.bpimpls;


import java.util.Map;
import java.util.UUID;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Features;
import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;

public class LocalGraph implements Graph {

	Map<UUID, Vertex> localVertices;
	Map<UUID, Edge> localEdges;
	
	public LocalGraph(Map<UUID ,Vertex> localVertices, Map<UUID, Edge> localEdges){
		this.localVertices = localVertices;
		this.localEdges = localEdges;
	}
	
	public Edge addEdge(Object arg0, Vertex arg1, Vertex arg2, String arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Vertex addVertex(Object arg0){
		Vertex vertex  = (Vertex)arg0; 
		localVertices.put((UUID)vertex.getId(), vertex);	
		return vertex;
	}
	
	public Edge getEdge(Object arg0) {
		return localEdges.get((UUID)arg0);
	}

	public Iterable<Edge> getEdges() {
		return localEdges.values();
	}

	public Iterable<Edge> getEdges(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Features getFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

	public Vertex getVertex(Object arg0) {
		return localVertices.get((UUID)arg0);
	}

	public Iterable<Vertex> getVertices() {
		return localVertices.values();
	}

	public Iterable<Vertex> getVertices(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeEdge(Edge arg0) {
		localEdges.remove((UUID)arg0.getId());
	}

	public void removeVertex(Vertex arg0) {
		localVertices.remove((UUID)arg0.getId());
	}

	public void shutdown() {
		// TODO Auto-generated method stub

	}

}
