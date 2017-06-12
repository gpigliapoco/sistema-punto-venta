package datos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(dDetalle_comprobante.class)
public abstract class dDetalle_comprobante_ {

	public static volatile SingularAttribute<dDetalle_comprobante, Date> fecha;
	public static volatile SingularAttribute<dDetalle_comprobante, Long> idDetalleComprobante;
	public static volatile SingularAttribute<dDetalle_comprobante, Double> precio;
	public static volatile SingularAttribute<dDetalle_comprobante, Integer> comprobante;
	public static volatile SingularAttribute<dDetalle_comprobante, Integer> cantidad;
	public static volatile ListAttribute<dDetalle_comprobante, dStock> stock;
	public static volatile SingularAttribute<dDetalle_comprobante, dProductos> productos;
	public static volatile SingularAttribute<dDetalle_comprobante, dComprobantes> comprobantes;

}

