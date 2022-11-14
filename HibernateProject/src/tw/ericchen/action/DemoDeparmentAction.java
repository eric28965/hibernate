package tw.ericchen.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import tw.ericchen.model.Department;
import tw.ericchen.model.HouseBean;

public class DemoDeparmentAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             StandardServiceRegistry sr=new StandardServiceRegistryBuilder().configure().build();
             SessionFactory factory=new MetadataSources(sr).buildMetadata().buildSessionFactory();
             Session session=factory.openSession();
             session.beginTransaction();
             
             Department db=new Department();
             db.setDeptname("hr");
             session.save(db);
             
             session.getTransaction().commit();
             session.close();
             factory.close();
	}

}
