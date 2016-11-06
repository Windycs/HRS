package Client.businesslogic.orderbl;

import Common.vo.OrderEvaluationVO;
import Common.vo.OrderVO;

/**
 * Created by arloor on 2016/11/6.
 */
public class OrderLineItem {
    OrderVO ovo;
    OrderEvaluationVO oevo;

    public OrderLineItem(OrderVO ovo){
        this.ovo=ovo;
    }

    public void addOrder(OrderVO ovo) {
        System.out.println("生成订单成功");
    }

    public void evaluateOrder(double pingfen,String pingjia) {
        oevo=new OrderEvaluationVO(this.ovo.getOrderID(),pingfen,pingjia);
    }

    public void cancelOrder() {
        ovo.setStatus("已撤销");
    }

    public void excuteOrder(){
        ovo.setStatus("已执行");
        ovo.setCredtChange(String.valueOf(ovo.getCharge()));
    }
}
