package tw.ericchen.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import tw.ericchen.model.HouseBean;
import tw.ericchen.util.HibernateUtil;

public class DemoHouseBeanAction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
             SessionFactory factory=HibernateUtil.getSessionFactory();
             Session session=factory.getCurrentSession();
             try {
            	 System.out.print("transaction begin");
            	  session.beginTransaction();
            	  
            	   HouseBean hb=new HouseBean();
                   hb.setHousename("blue house");
                   session.save(hb);
               
                   System.out.print("transaction commit");
            	  session.getTransaction().commit();
             }catch(Exception e) {
            	 System.out.print("transaction rollback");
            	 session.getTransaction().rollback();
            	 e.printStackTrace();
            	 
            	 
             }finally {
            	 System.out.print("session close");
           HibernateUtil.closeSeesionFactory();
             }  
	}

}
