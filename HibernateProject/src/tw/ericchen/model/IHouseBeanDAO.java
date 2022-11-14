package tw.ericchen.model;

import java.util.List;

public interface IHouseBeanDAO {
	 public HouseBean selectbyid(HouseBean hb);
	 public List<HouseBean> showall();
	 public HouseBean insert(HouseBean hb);
	 public Boolean delete(int houseid);
	 public HouseBean update(int houseid,String housename) ;
}
