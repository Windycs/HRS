package Common.po;


import Common.util.ManagerType;

/**
 * Created by 曹利航 on 2016/10/16 16:47.
 */
public class ManagerPO {
    ManagerType type;
    String ID;
    String username;
    String password;

    public ManagerPO(ManagerType type,String ID,String username,String password){
        this.type=type;
        this.ID=ID;
        this.username=username;
        this.password=password;
    }
}
