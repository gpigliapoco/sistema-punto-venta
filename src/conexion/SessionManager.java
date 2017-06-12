/*
 * SessionManager.java
 *
 */
package conexion;

import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Sebasti�n S. Sanga <SebastianSanga@gmail.com>
 */
public abstract class SessionManager {

    /**
     * Creates a new instance of SessionManager
     */
    
     // Atributo que guarda una fabrica de sesiones
     // Atributo que guarda una fabrica de sesiones
    private static SessionFactory factory;
    public SessionManager() {
    }

    public static Session getSession() throws HibernateException {

        // Instancia un objeto del tipo Configuration
        Configuration config = new Configuration();

        // Registra los mappers en la configuracion
        registerMappers(config);

        // Establece las propiedades de configuracion
        config.setProperties(getHibernateProperties());

        // Guarda la fabrica de sesiones
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
        SessionFactory factory = config.buildSessionFactory(builder.build());

        // Retorna una sesion de trabajo
        return factory.openSession();



    }

    private static Properties getHibernateProperties() {
        // Instancia un objeto del tipo Properties
        Properties props = new Properties();

        // Establece el driver de conexion dependiente del RDBMS
        props.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

        // Establece la url de conexion dependiente del RDBMS
        props.put("hibernate.connection.url", "jdbc:mysql://192.168.2.33:3306/tahin_2");

        // Establece el usuario
        props.put("hibernate.connection.username", "root");

        // Establece la clave
        props.put("hibernate.connection.password", "1234");

        // Establece el dialecto a utilizar
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        
        // Establece el uso de logging, deber� existir el archivo log4j.properties
        props.put("hibernate.show_sql", "true");
    //  props.put("hibernate.hbm2ddl.auto","create");

        // Retorna las propiedades
        return props;

    }

    private static void registerMappers(Configuration config) throws MappingException {
        config.addAnnotatedClass(datos.dOperadores.class);
        config.addAnnotatedClass(datos.dComprobantes.class);
        config.addAnnotatedClass(datos.dContabilidad.class);
        config.addAnnotatedClass(datos.dDetalle_comprobante.class);
        config.addAnnotatedClass(datos.dProductos.class);
        config.addAnnotatedClass(datos.dStock.class);
        
    }
}
