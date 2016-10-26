package Client.businesslogic.managerbl;


import Client.businesslogicservice.managerblservice.ManagerBLService;
import Common.util.ManagerType;
import Common.util.ResultMessage;
import Common.vo.ManagerVO;

/**
 * Created by 曹利航 on 2016/10/16 17:25.
 */
public class ManagerBLService_Stub implements ManagerBLService {
    @Override
    public ResultMessage addManager(ManagerType type, String ID, ManagerVO vo) {
        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage changeManagerInfo(ManagerType type, String ID, ManagerVO vo) {

        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage login(ManagerType type, String username, String password) {

        return ResultMessage.SUCCESS;
    }
}
