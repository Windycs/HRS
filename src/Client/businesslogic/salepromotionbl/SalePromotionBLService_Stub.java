package Client.businesslogic.salepromotionbl;


import Common.util.ResultMessage;
import Common.util.SalePromotionType;
import Common.vo.SalePromotionVO;

import java.util.ArrayList;

import static Common.util.SalePromotionType.WEBSALE;

/**
 * Created by 段梦洋 on 2016/10/16.
 */
public class SalePromotionBLService_Stub {
    int saleID;
    SalePromotionType type;
    ArrayList<String> levelPromotions;
    double discount;
    public SalePromotionBLService_Stub(int id, SalePromotionType webSale, ArrayList<String> a, double dis){
        saleID=id;
        type=WEBSALE;
        levelPromotions=a;
        discount=dis;
    }
    public SalePromotionVO getSalePromotions(int saleID){
        return new SalePromotionVO(type,discount);
    }
    public ArrayList<SalePromotionVO> getSalePromotions(SalePromotionType type){
        return new ArrayList<SalePromotionVO>();
    }
    public ResultMessage addSale(SalePromotionVO vo, SalePromotionType type){
        return ResultMessage.SUCCESS;
    }
    public void delSale(int saleID){
        System.out.println("delete the sale");
    }
    public ResultMessage changeSaleInfo(int saleID, SalePromotionVO vo){
        return ResultMessage.SUCCESS;
    }
    public ArrayList<String> enrollLevelPromotions(ArrayList<String>levelPromotions){
        return new ArrayList<String>();
    }
    public ArrayList<String> getLevelPromotions(){
        return new ArrayList<String>();
    }
}
