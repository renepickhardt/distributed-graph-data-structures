package de.uniko.west.dgds.bpimpls;

import java.util.Set;
import java.util.UUID;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;

public class BpEdge implements Edge {

	UUID id;
	UUID start;
	UUID end;
	
	public BpEdge(UUID id){
		this.id = id;
	}
	
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
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

	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	public Vertex getVertex(Direction arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}
