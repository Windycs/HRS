package Common.po;

/**
 * Created by 曹利航 on 2016/10/16 17:11.
 */
public class CustomerPO {
    String customerID;
    String password;
    String phoneNumber;
    String customerName;
    CreditInfoPO po;
    public CustomerPO(String str,String id,String pw,String pn,CreditInfoPO Po){
        customerName=str;
        customerID=id;
        password=pw;
        phoneNumber=pn;
        po=Po;
    }
}
