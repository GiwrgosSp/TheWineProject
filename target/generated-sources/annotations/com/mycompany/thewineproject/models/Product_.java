package com.mycompany.thewineproject.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, Variety> vid;
	public static volatile SingularAttribute<Product, Integer> psize;
	public static volatile SingularAttribute<Product, String> pdryness;
	public static volatile SingularAttribute<Product, String> pname;
	public static volatile SingularAttribute<Product, Double> pprice;
	public static volatile SingularAttribute<Product, String> pcompany;
	public static volatile SingularAttribute<Product, Integer> pid;
	public static volatile SingularAttribute<Product, Colour> clid;
	public static volatile SingularAttribute<Product, Integer> palcohol;
	public static volatile SingularAttribute<Product, String> pdescr;
	public static volatile SingularAttribute<Product, Integer> pyear;
	public static volatile SingularAttribute<Product, Country> cid;

}

