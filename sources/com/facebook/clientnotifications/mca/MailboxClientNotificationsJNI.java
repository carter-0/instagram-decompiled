package com.facebook.clientnotifications.mca;

import X.0dV;
import java.util.List;

public class MailboxClientNotificationsJNI {
    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();

    static {
        0dV.A0C("mailboxclientnotificationsjni");
    }
}
