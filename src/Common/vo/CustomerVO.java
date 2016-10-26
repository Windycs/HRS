package Common.vo;

/**
 * Created by 曹利航 on 2016/10/16 17:11.
 */
public class CustomerVO {
    String customerID;
    String password;
    String phoneNumber;
    String customerName;
    CreditVO vo;
    String time;
    int level;
    public CustomerVO(String str,String id,String pw,String pn,CreditVO Vo){
        customerName=str;
        customerID=id;
        password=pw;
        phoneNumber=pn;
        vo=Vo;
    }
}
