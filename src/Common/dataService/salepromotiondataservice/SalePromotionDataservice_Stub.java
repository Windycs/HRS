package Common.dataService.salepromotiondataservice;


import Common.po.SalePromotionPO;
import Common.util.SalePromotionType;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by 段梦洋 on 2016/10/16.
 */
public class SalePromotionDataservice_Stub {
    public ArrayList<SalePromotionPO> getSalePromotions(SalePromotionType type) throws RemoteException {
        return new ArrayList<SalePromotionPO>();
    }
    public void insertSale(SalePromotionPO po ) throws RemoteException{
        System.out.println("Success inseert!");
    }
    public void deleteSale(SalePromotionPO po ) throws RemoteException{
        System.out.println("Success delete!");
    }
    public void updateSale(SalePromotionPO po ) throws RemoteException{
        System.out.println("Success update!");
    }
}
