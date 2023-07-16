import java.util.HashMap;

public class IDandPasswords {

    // login  info
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Steven","java");
        logininfo.put("Daniel","JAVA");
        logininfo.put("Markus","java123");

    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
