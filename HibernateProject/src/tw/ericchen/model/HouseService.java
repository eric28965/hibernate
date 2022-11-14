package tw.ericchen.model;

import java.util.List;

import org.hibernate.Session;

import tw.ericchen.action.HouseDAO;

public class HouseService implements IHouseBeanService {
     private HouseDAO hDAO;
	public HouseService(Session session) {
       hDAO=new HouseDAO(session);
	}

	@Override
	public HouseBean selectbyid(HouseBean hb) {
		// TODO Auto-generated method stub
		return hDAO.selectbyid(hb);
	}

	@Override
	public List<HouseBean> showall() {
		// TODO Auto-generated method stub
		return hDAO.showall();
	}

	@Override
	public HouseBean insert(HouseBean hb) {
		// TODO Auto-generated method stub
		return hDAO.insert(hb);
	}

	@Override
	public Boolean delete(int houseid) {
		// TODO Auto-generated method stub
		return hDAO.delete(houseid);
	}

	@Override
	public HouseBean update(int houseid, String housename) {
		// TODO Auto-generated method stub
		return hDAO.update(houseid, housename);
	}

}
