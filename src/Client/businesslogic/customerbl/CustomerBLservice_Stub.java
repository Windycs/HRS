package Client.businesslogic.customerbl;


import Client.businesslogicservice.customerblservice.CustomerBLService;
import Common.util.ResultMessage;
import Common.vo.CreditVO;
import Common.vo.CustomerVO;

/**
 * Created by 段梦洋 on 2016/10/16.
 */
public class CustomerBLService_Stub implements CustomerBLService {
    String customerID;
    String password;
    String phoneNumber;
    String customerName;
    double changeCredit;
    String time;
    int level;
    public CustomerBLService_Stub(String id,String pw,String pn,String cn,double c,String ti,int l){
        customerID=id;
        password=pw;
        phoneNumber=pn;
        customerName=cn;
        changeCredit=c;
        time=ti;
        level=l;
    }
    public CustomerVO getCustomerInfo(String ID){
        return new CustomerVO(customerName,customerID,password,phoneNumber,new CreditVO(this.customerID,changeCredit,time));
    }

    @Override
    public CreditVO getCustomerCreditInfo(String ID) {
        return null;
    }

    public CreditVO getCreditInfo(String ID){
        return new CreditVO(customerID,changeCredit,time);
    }
    public ResultMessage login(String userName, String password){
        if(userName=="customer"&&password=="123456")
            return ResultMessage.SUCCESS;
        else
            return ResultMessage.WRONG_PASSWORD;

    }
    public ResultMessage addCustomer(CustomerVO vo){
        return ResultMessage.SUCCESS;
    }
    public ResultMessage changeCustomerInfo(String ID,CustomerVO vo){
        if(ID=="00001")
            return ResultMessage.SUCCESS;
        else
            return ResultMessage.USER_NOT_EXIST;
    }
    public boolean updateCustomerCreditInfo(CreditVO cvo){
        return true;
    }
    public int getCustomerLevel(String ID){
        return level;
    }
}
//class CustomerView{
////    businesslogicservice.customerblservice.CustomerBLService customerBL=new businesslogicservice.customerblservice.CustomerBLservice("00001","123456","1234345678900","customer",120.0,"2016-09-01",3);
//}
