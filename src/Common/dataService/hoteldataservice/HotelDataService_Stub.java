package Common.dataService.hoteldataservice;

import Common.po.AvailableRoomPO;
import Common.po.HotelInfoPO;

import java.util.ArrayList;

/**
 * Created by 刘钦 on 2016/10/16.
 */
public class HotelDataService_Stub implements HotelDataService {
    public HotelInfoPO findHotelInfo (String hotelName) {
        System.out.println("查找酒店信息成功");
    }

    public void updateHotelInfo (HotelInfoPO hipo) {
        System.out.println("更新酒店详情成功");
    }

    public ArrayList<AvailableRoomPO> findAvailableRooms (String hotelName, String startDate, String endDate) {
        System.out.println("查找可用客房成功");
    }

    public void updateAvailableRooms (AvailableRoomPO arpo, String startDate, String endDate) {
        System.out.println("更新可用客房成功");
    }

    public void insertAvailableRooms (AvailableRoomPO arpo, String startDate, String endDate) {
        System.out.println("插入可用客房成功");
    }

    public ArrayList<HotelInfoPO> findHotels (SearchInfoPO sipo) {
        System.out.println("查找酒店列表成功");
    }

    public void insertHotel(HotelInfoPO hipo) {
        System.out.println("插入新的酒店成功");
    }
}
