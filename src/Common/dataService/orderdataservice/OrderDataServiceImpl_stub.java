package Common.dataService.orderdataservice;


import Common.po.OrderEvaluationPO;
import Common.po.OrderPO;
import Common.vo.CustomerOrderVO;

import java.util.ArrayList;

/**
 * Created by 12931 on 2016/10/16.
 */
public class OrderDataServiceImpl_stub implements OrderDataService{

    @Override
    public OrderPO getOrderInfo(String orderID) {
        return new OrderPO(orderID);
    }

    @Override
    public ArrayList<CustomerOrderVO> getCustomerOrderList(String customerID) {
        CustomerOrderVO vo=new CustomerOrderVO();
        ArrayList<CustomerOrderVO> ListOfCustomerOrderVO =new ArrayList<>();
        ListOfCustomerOrderVO.add(vo);
        ListOfCustomerOrderVO.add(vo);
        ListOfCustomerOrderVO.add(vo);
        return ListOfCustomerOrderVO;
    }

    @Override
    public OrderEvaluationPO getOrderEvaluation(String orderID) {
        return new OrderEvaluationPO(orderID);
    }

    @Override
    public void updateOrderEvaluation(String orderID, OrderEvaluationPO oepo) {

    }

    @Override
    public void insertOrder(OrderPO opo) {

    }

    @Override
    public void deleteOrder(OrderPO opo) {

    }

    @Override
    public void updateOrder(OrderPO opo) {

    }
}
