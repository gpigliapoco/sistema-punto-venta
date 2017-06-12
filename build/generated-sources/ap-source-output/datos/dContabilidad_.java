package datos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(dContabilidad.class)
public abstract class dContabilidad_ {

	public static volatile SingularAttribute<dContabilidad, Date> fecha;
	public static volatile SingularAttribute<dContabilidad, dOperadores> operadores;
	public static volatile SingularAttribute<dContabilidad, Integer> descarga;
	public static volatile SingularAttribute<dContabilidad, Integer> comprobante;
	public static volatile SingularAttribute<dContabilidad, Long> idContabilidad;
	public static volatile SingularAttribute<dContabilidad, Double> importe;
	public static volatile SingularAttribute<dContabilidad, dComprobantes> comprobantes;
	public static volatile SingularAttribute<dContabilidad, Integer> flete;

}

