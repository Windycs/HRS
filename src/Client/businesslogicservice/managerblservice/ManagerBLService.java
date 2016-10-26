package Client.businesslogicservice.managerblservice;


import Common.util.ManagerType;
import Common.util.ResultMessage;
import Common.vo.ManagerVO;

/**
 * Created by 曹利航 on 2016/10/16 15:46.
 */
public interface ManagerBLService {
    public ResultMessage addManager(ManagerType type, String ID, ManagerVO vo);

    public ResultMessage changeManagerInfo(ManagerType type, String ID, ManagerVO vo);

    public ResultMessage login(ManagerType type, String username, String password);
}
