package datos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(dComprobantes.class)
public abstract class dComprobantes_ {

	public static volatile SingularAttribute<dComprobantes, String> descripcion;
	public static volatile SingularAttribute<dComprobantes, Date> fecha;
	public static volatile SingularAttribute<dComprobantes, dOperadores> operadores;
	public static volatile ListAttribute<dComprobantes, dContabilidad> contabilidad;
	public static volatile SingularAttribute<dComprobantes, Integer> comprobante;
	public static volatile SingularAttribute<dComprobantes, Long> idComprobantes;
	public static volatile SingularAttribute<dComprobantes, String> tipoDeComprobante;
	public static volatile ListAttribute<dComprobantes, dDetalle_comprobante> detalleComprobante;
	public static volatile SingularAttribute<dComprobantes, Double> importe;

}

