package com.theiostream.orcamento;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.rdf.model.impl.ResIteratorImpl;

import java.util.ArrayDeque;

public class OResource {
	protected ArrayDeque<Resource> set;
	protected Resource resource;

	public OResource(Resource res) {
		resource = res;
		set = new ArrayDeque<Resource>();
	}

	public Resource getResource() {
		return resource;
	}

	public void addDespesa(Resource despesa) {
		set.add(despesa);
	}

	public ResIterator getDespesas() {
		return new ResIteratorImpl(set.iterator());
	}
	
	@Override
	public boolean equals(Object cmp) {
		return resource.equals(((OResource)cmp).getResource());
	}
	
	@Override
	public int hashCode() {
		return resource.hashCode();
	}
}
