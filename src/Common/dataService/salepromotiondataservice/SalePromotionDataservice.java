package Common.dataService.salepromotiondataservice;


import Common.po.SalePromotionPO;
import Common.util.SalePromotionType;

import java.rmi.RemoteException;
import java.util.ArrayList;

public interface SalePromotionDataservice {
    public ArrayList<SalePromotionPO> getSalePromotions(SalePromotionType type) throws RemoteException;
    public void insertSale(SalePromotionPO po) throws RemoteException;
    public void deleteSale(SalePromotionPO po) throws RemoteException;
    public void updateSale(SalePromotionPO po) throws RemoteException;
}
