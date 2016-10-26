package Common.vo;

import Common.util.OrderType;

/**
 * Created by 曹利航 on 2016/10/16 17:08.
 */
public class OrderVO {
    String orderID;
    String customerID;
    OrderType orderState;
    double price;
    String timeOfAdd;
    String timeOfCancel;
    String timeOCheckin;
    String timeOfCheckout;
    String latestTimeOfChecking;
    String hotelName;
    String roomType;
    int numOfrooms;
    int numOfPeople;
    boolean hasChildren;

    public OrderVO(String OrderID) {
        this.orderID=OrderID;
    }

    public OrderVO(OrderVO orderVO,double price){
        setOrderID(orderVO.getOrderID());
        setCustomerID(orderVO.getCustomerID());
        setHasChildren(orderVO.isHasChildren());
        setHotelName(orderVO.getHotelName());
        setTimeOfCheckout(orderVO.getTimeOfCheckout());
        setTimeOfCancel(orderVO.getTimeOfCancel());
        setTimeOCheckin(orderVO.getTimeOCheckin());
        setLatestTimeOfChecking(orderVO.getLatestTimeOfChecking());
        setNumOfPeople(orderVO.getNumOfPeople());
        setNumOfrooms(orderVO.getNumOfrooms());
        setRoomType(orderVO.getRoomType());
        setTimeOfAdd(orderVO.getTimeOfAdd());
        setOrderState(orderVO.getOrderState());
        setPrice(price);
    }


    public String getOrderID() {
        return orderID;
    }

    public String getOrderID(OrderVO orderVO, double price) {
        this.orderID=orderVO.orderID;
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public int getNumOfPeople() {

        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public int getNumOfrooms() {

        return numOfrooms;
    }

    public void setNumOfrooms(int numOfrooms) {
        this.numOfrooms = numOfrooms;
    }

    public String getRoomType() {

        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getHotelName() {

        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLatestTimeOfChecking() {

        return latestTimeOfChecking;
    }

    public void setLatestTimeOfChecking(String latestTimeOfChecking) {
        this.latestTimeOfChecking = latestTimeOfChecking;
    }

    public String getTimeOfCheckout() {

        return timeOfCheckout;
    }

    public void setTimeOfCheckout(String timeOfCheckout) {
        this.timeOfCheckout = timeOfCheckout;
    }

    public String getTimeOCheckin() {

        return timeOCheckin;
    }

    public void setTimeOCheckin(String timeOCheckin) {
        this.timeOCheckin = timeOCheckin;
    }

    public String getTimeOfCancel() {

        return timeOfCancel;
    }

    public void setTimeOfCancel(String timeOfCancel) {
        this.timeOfCancel = timeOfCancel;
    }

    public OrderType getOrderState() {

        return orderState;
    }

    public void setOrderState(OrderType orderState) {
        this.orderState = orderState;
    }

    public String getTimeOfAdd() {

        return timeOfAdd;
    }

    public void setTimeOfAdd(String timeOfAdd) {
        this.timeOfAdd = timeOfAdd;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
