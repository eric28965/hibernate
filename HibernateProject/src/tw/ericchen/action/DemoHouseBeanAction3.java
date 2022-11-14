package tw.ericchen.action;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import tw.ericchen.model.HouseBean;
import tw.ericchen.util.HibernateUtil;

public class DemoHouseBeanAction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
             SessionFactory factory=HibernateUtil.getSessionFactory();
             Session session=factory.getCurrentSession();
             System.out.println("search result-------------------");
    
            	  session.beginTransaction();
//            	  HouseBean result=session.get(HouseBean.class, 1001);
//                  if(result!=null) {
//                	  System.out.println(result.getHouseid()+":"+result.getHousename());
//                  }else {
//                	  System.out.println("no result");
//         
//                  }
                  System.out.println("show all result-------------------");
//                Query<HouseBean> query=session.createQuery("from HouseBean",HouseBean.class);
//                  List<HouseBean> list=query.list();
//                  Iterator<HouseBean> i1=list.iterator();
//                  while(i1.hasNext()) {
//                	  HouseBean result2=i1.next();
//                	  System.out.println(result2.getHouseid()+":"+result2.getHousename());
//                  }
                  System.out.println("delete value by id-------------------");
                  HouseBean delete=new HouseBean();
                  delete.setHouseid(1005);
                  session.delete(delete);
                  
            	  session.getTransaction().commit();
           HibernateUtil.closeSeesionFactory();
             }  
	
}
