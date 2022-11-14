package tw.ericchen.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import tw.ericchen.model.HouseBean;

public class DemoHouseBeanAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             StandardServiceRegistry sr=new StandardServiceRegistryBuilder().configure().build();
             SessionFactory factory=new MetadataSources(sr).buildMetadata().buildSessionFactory();
             Session session=factory.openSession();
             session.beginTransaction();
             
             HouseBean hb=new HouseBean();
             hb.setHousename("green house");
             session.save(hb);
             
             session.getTransaction().commit();
             session.close();
             factory.close();
	}

}
