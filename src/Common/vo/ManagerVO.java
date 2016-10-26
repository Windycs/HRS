package Common.vo;

import Common.util.ManagerType;

/**
 * Created by 曹利航 on 2016/10/16 16:47.
 */
public class ManagerVO {
    ManagerType type;
    String ID;
    String username;
    String password;

    public ManagerVO(){
        this.type=null;
        this.ID=null;
        this.username=null;
        this.password=null;
    }



    public ManagerVO(ManagerType type,String ID,String username,String password){
        this.type=type;
        this.ID=ID;
        this.username=username;
        this.password=password;
    }
}
