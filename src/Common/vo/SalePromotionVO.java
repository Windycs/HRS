package Common.vo;

import Common.util.SalePromotionType;

/**
 * Created by 段梦洋 on 2016/10/16 17:12.
 */
public class SalePromotionVO {
    SalePromotionType type;
    double discount;
    public SalePromotionVO(SalePromotionType WEBSALE,double a){
        type=WEBSALE;
        discount=a;
    }
}
