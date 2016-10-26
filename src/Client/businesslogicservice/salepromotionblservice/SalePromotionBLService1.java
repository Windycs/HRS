package Client.businesslogicservice.salepromotionblservice;

import Common.util.ResultMessage;
import Common.util.SalePromotionType;
import Common.vo.SalePromotionVO;

import java.util.ArrayList;

/**
 * Created by arloor on 2016/10/26.
 */
public interface SalePromotionBLService1 {
    public SalePromotionVO getSalePromotions(int SaleID);
    public ArrayList<SalePromotionVO> getSalePromotions(SalePromotionType type);
    //�������ԵĽӿ�
    public ResultMessage addSale(SalePromotionVO vo, SalePromotionType type);
    public void delSale(int saleID);
    public ResultMessage changeSaleInfo(int saleID, SalePromotionVO vo);
    public ArrayList<String> enrollLevelPromotions(ArrayList<String> levelPromotions);
    public ArrayList<String> getLevelPromotions();
}
