package Common.dataService.managerdataservice;


import Common.po.ManagerPO;
import Common.util.ManagerType;
import Common.util.ResultMessage;

import java.rmi.RemoteException;

/**
 * Created by 曹利航 on 2016/10/16 18:09.
 */
public class ManagerDataService_Stub implements ManagerDataService {
    @Override
    public ResultMessage check(String username, String password) {
        return ResultMessage.SUCCESS;
    }

    @Override
    public void insert(ManagerType type, String ID, ManagerPO po) {

        System.out.println("Insert Succeed!");
    }

    @Override
    public void update(ManagerType type, String ID, ManagerPO po) {

        System.out.println("Update Succeed!");
    }

    @Override
    public ManagerPO find(String ID) throws RemoteException {
        return new ManagerPO(ManagerType.WEBMANAGER, ID, "ruangong", "ruangong");
    }
}
