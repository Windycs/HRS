package Client.businesslogic.managerbl;


import Client.businesslogicservice.managerblservice.ManagerBLService;
import Common.util.ManagerType;
import Common.util.ResultMessage;
import Common.vo.ManagerVO;

/**
 * Created by 曹利航 on 2016/10/16 18:41.
 */
public class ManagerBLService_Driver {
    public static void main(String[] args) {
        ManagerBLService mbls = new ManagerBLService_Stub();
        new ManagerBLService_Driver(mbls);
    }

    public ManagerBLService_Driver(ManagerBLService mbls) {
        ManagerVO vo = new ManagerVO();
        ResultMessage rm = mbls.addManager(ManagerType.WEBMANAGER, "012345678", vo);
        if (rm == ResultMessage.USER_EXIST) {
            System.out.println("User already exist!");
        } else if (rm == ResultMessage.SUCCESS) {
            System.out.println("Successfully added.");
        }
        rm = mbls.changeManagerInfo(ManagerType.WEBMANAGER, "012345678", vo);
        if (rm == ResultMessage.SUCCESS) {
            System.out.println("Successfully updated.");
        }
        rm = mbls.login(ManagerType.WEBMANAGER, "ruangong", "ruangong");
        if (rm == ResultMessage.USER_NOT_EXIST || rm == ResultMessage.WRONG_PASSWORD) {
            System.out.println("Wrong username or password!");
        } else if (rm == ResultMessage.SUCCESS) {
            System.out.println("Successfully login.");
        }

    }
}
