package Common.vo;

import java.util.Vector;

/**
 * Created by 12931 on 2016/10/16.
 */

public class OrderEvaluationVO extends Vector<String> {

    /**
     * 构造函数
     * @param OrderID
     * @param pingfen
     * @param pingjia
     */
    public OrderEvaluationVO(int OrderID, double pingfen, String pingjia){
        this.add(String.valueOf(OrderID));
        this.add(String.valueOf(pingfen));
        this.add(pingjia);
    }

    public double getPingfen(){
        return Double.parseDouble(this.get(2));
    }

    public String getPingjia(){
        return this.getPingjia();
    }
}
