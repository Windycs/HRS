package Common.dataService.customerdataservice;


import Common.po.CreditInfoPO;
import Common.po.CustomerPO;

import java.rmi.RemoteException;

/**
 * Created by 段梦洋 on 2016/10/16.
 */
public class CustomerDataservice_Stub {
    int level;
    String customerID;
    String password;
    String phoneNumber;
    String customerName;
    CreditInfoPO po;
    public CustomerDataservice_Stub(int l,String id,String pw,String pn,String cn,CreditInfoPO Po){
        level=l;
        customerID=id;
        password=pw;
        phoneNumber=pn;
        customerName=cn;
        po=Po;
    }
    public CustomerPO find(String ID ) throws RemoteException{
        return new CustomerPO(customerID,password,phoneNumber,customerName,po);
    }
    public void insert(CustomerPO po ) throws RemoteException{
        System.out.println("Success insert！");
    }
    public void update(CustomerPO po ) throws RemoteException{
        System.out.println("Success update！");
    }
    public CustomerPO getCustomer(String ID ) throws RemoteException{
        return new CustomerPO(customerID,password,phoneNumber,customerName,po);
    }
    public CreditInfoPO getCustomerCreditInfo(String ID ) throws RemoteException{
        return null;
    }
    public void updateCustomerCredit(String ID,double change,String changeLog) throws RemoteException{
        System.out.println("Success update！");
    }
    public int getCustomerLevels(String ID)throws RemoteException{
        return level;
    }
}
