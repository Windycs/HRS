package Common.dataService.hoteldataservice;


import Common.po.AvailableRoomPO;
import Common.po.HotelInfoPO;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by TERRANS FORCE on 2016/10/16.
 */
public class HotelDataService_Driver {
    public static void main(String[] args) throws RemoteException {
        HotelDataService hds= new HotelDataService_Stub();
        new HotelDataService_Driver(hds);
    }

    public HotelDataService_Driver(HotelDataService hds) throws RemoteException {
        HotelInfoPO hipo_1 = hds.findHotelInfo ("如家酒店");
        SearchInfoPO sipo = new SearchInfoPO();
        ArrayList<HotelInfoPO> hotelList = hds.findHotels(sipo);
        ArrayList<AvailableRoomPO> availableList = hds.findAvailableRooms("如家酒店", "2016-10-16", "2016-10-17");
        HotelInfoPO hipo_2 = new HotelInfoPO();
        hds.insertHotel(hipo_2);
        HotelInfoPO hipo_3 = new HotelInfoPO();
        hds.updateHotelInfo(hipo_3);
        AvailableRoomPO arpo_1 = new AvailableRoomPO();
        hds.updateAvailableRooms (arpo_1, "2016-10-16", "2016-10-17");
        AvailableRoomPO arpo_2 = new AvailableRoomPO();
        hds.insertAvailableRooms(arpo_2, "2016-10-16", "2016-10-17");
    }
}
