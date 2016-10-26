package Common.dataService.customerdataservice;


import Common.po.CreditInfoPO;
import Common.po.CustomerPO;

import java.rmi.RemoteException;
public interface CustomerDataservice {
    public CustomerPO find(String ID) throws RemoteException;
    public void insert(CustomerPO po) throws RemoteException;
    public void update(CustomerPO po) throws RemoteException;
    public CustomerPO getCustomer(String ID) throws RemoteException;
    public CreditInfoPO getCustomerCreditInfo(String ID) throws RemoteException;
    public void updateCustomerCredit(String ID, double change, String changeLog) throws RemoteException;
    public int getCustomerLevels(String ID)throws RemoteException;
}
