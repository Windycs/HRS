package Common.po;

/**
 * Created by 曹利航 on 2016/10/16 17:11.
 */
public class CreditInfoPO {
    String customerID;
    double change;
    String time;
    public CreditInfoPO(String sd,double ch,String ti){
        customerID=sd;
        change=ch;
        time=ti;
    }
}
