package Client.businesslogic.orderbl;


import Client.businesslogicservice.orderbusinesslogicservice.OrderBLservice;
import Common.util.OrderType;
import Common.vo.CustomerOrderVO;
import Common.vo.HotelOrderVO;
import Common.vo.OrderEvaluationVO;
import Common.vo.OrderVO;

import java.util.ArrayList;

/**
 * Created by 12931 on 2016/10/16.
 */
public class OrderBLservice_Stub implements OrderBLservice {
    String OrderID;
    double price;
    OrderType state;

    @Override
    public boolean confirmNewOrder(OrderVO ovo, double price) {

        return true;
    }

    @Override
    public boolean updateCheckoutInfo(String OrderID, String time, String[] roomList) {
        return true;
    }

    @Override
    public OrderEvaluationVO getOrderEvaluationByID(String OrderID) {
        return new OrderEvaluationVO(OrderID);
    }

    @Override
    public double getOrderPrice(OrderVO ovo) {
        this.price=98;
        return price;
    }

    @Override
    public OrderVO showNewOrderInfo(OrderVO ovo, double price) {
        return new OrderVO(ovo,price);
    }


    @Override
    public void cancelNewOrder(OrderVO ovo) {

    }

    @Override
    public ArrayList<CustomerOrderVO> getCustomerExecutedOrderList(OrderType type, String customerID) {
        CustomerOrderVO vo1;vo1 = new CustomerOrderVO();
        ArrayList<CustomerOrderVO> listOfCustomerOrderVO=new ArrayList<>();
        listOfCustomerOrderVO.add(vo1);
        listOfCustomerOrderVO.add(vo1);
        listOfCustomerOrderVO.add(vo1);
        return listOfCustomerOrderVO;
    }

    @Override
    public ArrayList<HotelOrderVO> getHotelOrderList(OrderType type, String hotelName) {
        HotelOrderVO vo1=new HotelOrderVO();
        ArrayList<HotelOrderVO> listOfHotelOrderVO=new ArrayList<>();
        listOfHotelOrderVO.add(vo1);
        listOfHotelOrderVO.add(vo1);
        listOfHotelOrderVO.add(vo1);
        return listOfHotelOrderVO;
    }

    @Override
    public OrderVO getOrderInfo(String OrderID) {
        return new OrderVO(OrderID);
    }

    @Override
    public boolean evaluateOrder(String OrderID, String evaluation, double value) {
        return true;
    }

    @Override
    public boolean executeUnexecutedOrder(String orderID) {
        return true;
    }

    @Override
    public boolean executeAbnormalOrder(String orderID) {
        return true;
    }

    @Override
    public boolean cancelAbnormalOrder(String OrderID) {
        return true;
    }

    @Override
    public boolean updateCheckinInfo(String OrderID, String time, String[] roomList) {
        return true;
    }


}
