package com.mycompany.thewineproject.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Variety.class)
public abstract class Variety_ {

	public static volatile SingularAttribute<Variety, Integer> vid;
	public static volatile SingularAttribute<Variety, String> vdescr;
	public static volatile ListAttribute<Variety, Product> productList;

}

