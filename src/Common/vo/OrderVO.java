package Common.vo;

import java.util.Vector;

/**
 * Created by arloor on 2016/11/6.
 */


/**
 * orderID          0订单编号
 * memberID         1会员编号
 * hotel            2酒店名称
 * status           3订单状态
 * roomID           4房间类型
 * roomNum          5房间数量
 * peopleNum        6入住人数
 * hasChild         7有无小孩
 * lastCheckinTime  8最晚入住时间
 * checkoutTime     9退房时间
 * price            10原价
 * charge           11实际收费
 * creditChange     12信用值变化
 * @author arloor
 */

public class OrderVO extends Vector<String> {

    /**
     * 构造函数：从一个个参数中构造order
     * @param orderID   0
     * @param memberID  1
     * @param hotel     2
     * @param status    3
     * @param roomID    4
     * @param roomNum   5
     * @param peopleNum 6
     * @param haschild  7
     * @param lastCheckinTime   8
     * @param checkOutime   9
     * @param price     10
     * @param charge    11
     * @param creditChange  12
     */
    public OrderVO(int orderID, String memberID, String hotel, String status, String roomID,
                   int roomNum, int peopleNum, String haschild, String lastCheckinTime, String checkOutime,
                   double price, double charge, double creditChange){

        this.add(String.valueOf(orderID));
        this.add(memberID);
        this.add(hotel);
        this.add(status);
        this.add(roomID);
        this.add(String.valueOf(roomNum));
        this.add(String.valueOf(peopleNum));
        this.add(haschild);
        this.add(lastCheckinTime);
        this.add(checkOutime);
        this.add(String.valueOf(price));
        this.add(String.valueOf(charge));
        this.add(String.valueOf(creditChange));
    }

    public int getOrderID(){return Integer.parseInt(this.get(0));}

    public String getMemberID(){return this.get(1);}

    public String getHotel(){return this.get(2);}

    public String getStatus(){return this.get(3);}

    public String getRoomID(){return this.get(4);}

    public int getRoomNum(){return Integer.parseInt(this.get(5));}

    public int getPeopleNum(){return Integer.parseInt(this.get(6));}

    public String getHasChild(){return this.get(7);}

    public String getLastCheckinTime(){return this.get(8);}

    public String getCheckouTime(){return this.get(9);}

    public int getPrice(){return Integer.parseInt(this.get(10));}

    public int getCharge(){return Integer.parseInt(this.get(11));}

    public int getCreditChange(){return Integer.parseInt(this.get(12));}

    public void setStatus(String status){
        //OrderVO ovo=new OrderVO(this.getOrderID(),this.getMemberID(),this.getHotel(),status,this.getRoomID(),this.getRoomNum(),this.getPeopleNum(),this.getHasChild(),this.getLastCheckinTime(),this.getCheckouTime(),this.getPrice(),this.getCharge(),this.getCreditChange());
        this.set(3,status);
    }

    public void setCredtChange(String s) {
        this.set(12,s);
    }
}
