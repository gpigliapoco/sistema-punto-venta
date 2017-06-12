package datos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(dOperadores.class)
public abstract class dOperadores_ {

	public static volatile SingularAttribute<dOperadores, String> cuit;
	public static volatile SingularAttribute<dOperadores, String> ciudad;
	public static volatile ListAttribute<dOperadores, dContabilidad> contabilidad;
	public static volatile SingularAttribute<dOperadores, Long> idOperadores;
	public static volatile SingularAttribute<dOperadores, String> direccion;
	public static volatile SingularAttribute<dOperadores, String> tel;
	public static volatile SingularAttribute<dOperadores, String> provincia;
	public static volatile SingularAttribute<dOperadores, String> nombre;
	public static volatile SingularAttribute<dOperadores, String> observacion;
	public static volatile ListAttribute<dOperadores, dComprobantes> comprobantes;

}

