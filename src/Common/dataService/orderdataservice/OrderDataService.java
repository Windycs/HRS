package Common.dataService.orderdataservice;


import Common.po.OrderEvaluationPO;
import Common.po.OrderPO;
import Common.vo.CustomerOrderVO;

import java.util.ArrayList;

/**
 * Created by ganghuan liu on 2016/10/16.
 */
public interface OrderDataService {
    //获取订单信息
    public OrderPO getOrderInfo(String orderID);
    //获取用户订单列表
    public ArrayList<CustomerOrderVO> getCustomerOrderList(String customerID);
    //获取订单评价
    public OrderEvaluationPO getOrderEvaluation(String orderID);
    //更新订单评价
    public void updateOrderEvaluation(String orderID, OrderEvaluationPO oepo);
    //添加一个订单
    public void insertOrder(OrderPO opo);
    //删除一个订单
    public void deleteOrder(OrderPO opo);
    //更新订单信息
    public void updateOrder(OrderPO opo);
    //
}
