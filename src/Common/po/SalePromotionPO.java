package Common.po;

import Common.util.SalePromotionType;

/**
 * Created by 曹利航 on 2016/10/16 17:12.
 */
public class SalePromotionPO {
    SalePromotionType type;
    double discount;
    public SalePromotionPO(SalePromotionType WEBSALE,double a){
        type=WEBSALE;
        discount=a;
    }
}
