package Common.dataService.managerdataservice;


import Common.po.ManagerPO;
import Common.util.ManagerType;
import Common.util.ResultMessage;

import java.rmi.RemoteException;

/**
 * Created by 曹利航 on 2016/10/16 18:03.
 */
public interface ManagerDataService {
    public ResultMessage check(String username, String password);

    public void insert(ManagerType type, String ID, ManagerPO po);

    public void update(ManagerType type, String ID, ManagerPO po);

    public ManagerPO find(String ID) throws RemoteException;
}
