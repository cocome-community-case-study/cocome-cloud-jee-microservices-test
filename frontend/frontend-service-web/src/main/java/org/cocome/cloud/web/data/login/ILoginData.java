package org.cocome.cloud.web.data.login;

import org.cocome.cloud.web.data.logindata.IUser;

public interface ILoginData {
    public static final long STORE_ID_NOT_SET = Long.MIN_VALUE;

    
    public void setUser(IUser user);
    public String getUser();
    
    public void setActiveStoreId(long id);
    public String getActiveStoreId();
}
