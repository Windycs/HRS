package Common.dataService.orderdataservice;


import Common.po.OrderPO;

/**
 * Created by 12931 on 2016/10/16.
 */
public class OrderDataService_driver {
    public static void main(String[] args){
        OrderDataService ods=new OrderDataServiceImpl_stub();
        new OrderDataService_driver(ods);
    }

    public OrderDataService_driver(OrderDataService ods){
        String orderID="201610160523";
        OrderPO opo=new OrderPO(orderID);
       ods.insertOrder(opo);//插入order
        ods.getOrderInfo(orderID);//获取订单基本信息
        ods.getOrderEvaluation(orderID);//获取订单评价
    }
}
