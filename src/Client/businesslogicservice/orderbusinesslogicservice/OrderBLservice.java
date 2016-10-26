package Client.businesslogicservice.orderbusinesslogicservice;


import Common.util.OrderType;
import Common.vo.CustomerOrderVO;
import Common.vo.HotelOrderVO;
import Common.vo.OrderEvaluationVO;
import Common.vo.OrderVO;

import java.util.ArrayList;

/**
 * Created by ganghuan liu on 2016/10/16.
 */
public interface OrderBLservice {
    //订单处理界面订单评价信息
    public OrderEvaluationVO getOrderEvaluationByID(String OrderID);

    //生成订单的步骤
    public double getOrderPrice(OrderVO ovo); //计算订单的价格
    public OrderVO showNewOrderInfo(OrderVO ovo, double price);//计算价格后显示订单详情供用户查看
    public boolean confirmNewOrder(OrderVO ovo, double price);//用户确认生成订单
    public void cancelNewOrder(OrderVO ovo);//用户取消生成订单

    //查看订单详情的步骤
    public ArrayList<CustomerOrderVO> getCustomerExecutedOrderList(OrderType type, String customerID);//获取用户已执行的订单列表
    public ArrayList<HotelOrderVO> getHotelOrderList(OrderType type, String hotelName);//获取酒店已执行的订单列表
    public OrderVO getOrderInfo(String OrderID);//获取订单详情

    //评价订单
    public boolean evaluateOrder(String OrderID, String evaluation, double value);

    //执行未执行订单
    public boolean executeUnexecutedOrder(String orderID);
    //执行异常订单
    public boolean executeAbnormalOrder(String orderID);
    //取消异常订单
    public boolean cancelAbnormalOrder(String OrderID);

    //更新入住信息
    public boolean updateCheckinInfo(String OrderID, String time, String[] roomList);
    //更新退房信息
    public boolean updateCheckoutInfo(String OrderID, String time, String[] roomList);


}
