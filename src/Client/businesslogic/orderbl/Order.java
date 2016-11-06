package Client.businesslogic.orderbl;

import Common.vo.OrderVO;

import java.util.ArrayList;

/**
 * Created by arloor on 2016/11/6.
 */
public class Order {
    OrderVO ovo=new OrderVO(0,"arloor","汉庭","未执行","标准间",1,2,"无小孩","0","0",250,200,2000);
    OrderList olist;

    /**
     * 增加订单
     * @param ovo
     */
    public void addOrder(OrderVO ovo){
        olist.addOrder(ovo);
    }

    /**
     * 按会员名或者酒店名称获取订单列表
     * @param tag
     * @return
     */
    public ArrayList getOrderList(String tag){
        this.olist=new OrderList(tag);
        return olist.orderVOlist;
    }

    public void evaluateOrder(int orderID,double pingfen,String pingjia){
        olist.evaluateOrder(orderID,pingfen,pingjia);
    }

    public void cancelOrder(int OrderID){
        olist.cancelOrder( OrderID);
    }


}
