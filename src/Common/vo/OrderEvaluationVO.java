package Common.vo;

/**
 * Created by 12931 on 2016/10/16.
 */
public class OrderEvaluationVO {
    String orderID;
    double value;
    String evaluation;

    public OrderEvaluationVO(String OrderID) {
        this.orderID=OrderID;
    }
}
