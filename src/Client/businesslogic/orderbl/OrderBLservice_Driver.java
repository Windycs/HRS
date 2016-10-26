package Client.businesslogic.orderbl;


import Client.businesslogicservice.orderbusinesslogicservice.OrderBLservice;
import Common.vo.OrderVO;

/**
 * Created by 12931 on 2016/10/16.
 */
public class OrderBLservice_Driver {
    public static void main(String[] args){
        OrderBLservice obls=new OrderBLservice_Stub();
        OrderBLservice_Driver driver= new OrderBLservice_Driver(obls);
    }

    public OrderBLservice_Driver(OrderBLservice obls) {
        String OrderID="20161016052635";
        OrderVO vo=new OrderVO(OrderID);//新建order
        double price =obls.getOrderPrice(vo);
        System.out.println("the price is"+price);//显示价格
        obls.confirmNewOrder(vo,price);//确定生成订单

        obls.getOrderInfo(OrderID);//获取订单详情
        obls.executeUnexecutedOrder(OrderID);//执行订单
        obls.evaluateOrder(OrderID,"不错",4.3);//评价订单

    }
}
