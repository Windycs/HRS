package Client.businesslogic.orderbl;

import Common.vo.OrderVO;

import java.util.ArrayList;

/**
 * Created by arloor on 2016/11/6.
 */
public class OrderList {
    ArrayList<OrderVO> orderVOlist=new ArrayList<>();
    OrderLineItem oListItem;

    public OrderList(){}

    public OrderList(String tag){}


     public ArrayList<OrderVO> getOrderList(){
         return this.orderVOlist;
     }

     public void getOrderLineItemByID(int orderID){
         for (OrderVO ovo:this.orderVOlist
                 ) {
             if(ovo.getOrderID()==orderID){
                 oListItem=new OrderLineItem(ovo);
             }
         }
     }

    public void addOrder(OrderVO ovo) {
        oListItem.addOrder(ovo);
    }


    public void evaluateOrder(int orderID,double pingfen,String pingjia) {
        getOrderLineItemByID(orderID);
        oListItem.evaluateOrder(pingfen,pingjia);
        //oListItem.evaluateOrder(pingfen,pingjia);
    }

    public void cancelOrder(int orderID) {
        getOrderLineItemByID(orderID);
        oListItem.cancelOrder();
    }
}
