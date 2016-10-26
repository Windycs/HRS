package Client.businesslogicservice.customerblservice;

import Common.util.ResultMessage;
import Common.vo.CreditVO;
import Common.vo.CustomerVO;

/**
 * Created by arloor on 2016/10/26.
 */
public interface CustomerBLService {
    //����ӿ�
    public CustomerVO getCustomerInfo(String ID);
    public CreditVO getCustomerCreditInfo(String ID);
    //��Ա���ӿ�
    public ResultMessage login(String userName, String password);
    public ResultMessage addCustomer(CustomerVO vo);
    public ResultMessage changeCustomerInfo(String ID, CustomerVO vo);
    public boolean updateCustomerCreditInfo(CreditVO cvo);
    public int getCustomerLevel(String ID);
}
