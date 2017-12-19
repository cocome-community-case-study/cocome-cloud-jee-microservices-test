package org.cocome.cloud.web.data.login;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.cocome.cloud.web.data.logindata.IUser;

@Named
@SessionScoped
public class LoginData implements ILoginData, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private static final Logger LOG = Logger.getLogger(LoginData.class);
    private long activeStoreID; //TODO: Man muss den store aus der Datenbank holen
    private IUser user;

    @Override
    public void setUser(IUser user) {
        this.user = user;

    }

    @Override
    public String getUser() {
       return null; //Todo: User zu String casten, damit andere JSF ihn bekommt
    }

    @Override
    public void setActiveStoreId(long id) {
        this.activeStoreID = id;

    }

    @Override
    public String getActiveStoreId() {
        return Long.toString(activeStoreID);
    }

}
