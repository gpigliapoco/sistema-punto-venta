package datos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(dProductos.class)
public abstract class dProductos_ {

	public static volatile SingularAttribute<dProductos, String> descripcion;
	public static volatile ListAttribute<dProductos, dDetalle_comprobante> detalle_comprobante;
	public static volatile SingularAttribute<dProductos, Long> idProductos;
	public static volatile SingularAttribute<dProductos, Double> peso;
	public static volatile ListAttribute<dProductos, dStock> stock;
	public static volatile SingularAttribute<dProductos, String> nombre;

}

