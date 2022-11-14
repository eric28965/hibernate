package tw.ericchen.action;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import tw.ericchen.model.HouseBean;
import tw.ericchen.model.IHouseBeanDAO;

public class HouseDAO implements IHouseBeanDAO {
 private Session session;
 public HouseDAO(Session session) {
	 this.session=session;
 }
 public HouseBean selectbyid(HouseBean hb) {
	return session.get(HouseBean.class, hb.getHouseid());
 }
 public List<HouseBean> showall(){
	 Query<HouseBean> query=session.createQuery("from HouseBean", HouseBean.class);
	return query.list();
	 
 }
 public HouseBean insert(HouseBean hb) {
	 HouseBean result=session.get(HouseBean.class,hb.getHouseid());
	 if(result==null) {
		 session.save(hb);
		 return hb;
	 }else {
		 return null;
	 }
 }
 public Boolean delete(int houseid) {
	 HouseBean result=session.get(HouseBean.class,houseid);
	 if(result!=null) {
		 session.delete(result);
		 return true;
	 }return false;
 }
 public HouseBean update(int houseid,String housename) {
	 HouseBean result=session.get(HouseBean.class,houseid);
     if(result!=null) {
    	result.setHousename(housename);
     }
     return result;
 
 
 
 }
}
