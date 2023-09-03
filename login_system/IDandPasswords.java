import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<String, String>();  

    IDandPasswords() {
        logininfo.put("La", "pizza");
        logininfo.put("Woon", "hamburger");
        logininfo.put("Mi", "putting");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
         
}