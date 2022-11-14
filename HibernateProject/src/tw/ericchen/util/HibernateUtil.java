package tw.ericchen.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
private static final SessionFactory factory=createSessionFactory();

private static SessionFactory createSessionFactory() {
//	try {
		StandardServiceRegistry sr=new StandardServiceRegistryBuilder().configure().build();
     SessionFactory factory=new MetadataSources(sr).buildMetadata().buildSessionFactory();
	return factory;
//	}catch(Exception e) {
//		e.printStackTrace();
//		throw new ExceptionInInitializerError(e);
//	}
//	 
}
public static SessionFactory getSessionFactory() {
	return factory;
	
}
public static void closeSeesionFactory() {
	if(factory!=null) {
		factory.close();
	}
}

}
