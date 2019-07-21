package com.mycompany.thewineproject.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Colour.class)
public abstract class Colour_ {

	public static volatile SingularAttribute<Colour, Integer> clid;
	public static volatile SingularAttribute<Colour, String> cldescr;
	public static volatile ListAttribute<Colour, Product> productList;

}

