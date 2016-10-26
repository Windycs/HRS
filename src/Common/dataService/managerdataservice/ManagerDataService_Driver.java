package Common.dataService.managerdataservice;

import po.ManagerPO;
import utilitybl.ManagerType;
import utilitybl.ResultMessage;

import java.rmi.RemoteException;

/**
 * Created by 曹利航 on 2016/10/16 18:41.
 */
public class ManagerDataService_Driver {
    public static void main(String[] args) throws RemoteException {
        ManagerDataService mds=new ManagerDataService_Stub();
        new ManagerDataService_Driver(mds);
    }

    public ManagerDataService_Driver(ManagerDataService mds) throws RemoteException {
        ResultMessage result=mds.check("ruangong","ruangong");
        if(result==ResultMessage.SUCCESS){
            System.out.println("login successfully");
        }else{
            System.out.println("login failed");
        }
        mds.find("012345678");
        ManagerPO po=new ManagerPO(ManagerType.WEBMANAGER,"876543210","rg","rg");
        mds.insert(ManagerType.WEBMANAGER,"876543210",po);
        mds.update(ManagerType.WEBMANAGER,"876543210",po);
    }
}
