package com.facebook.standalonedatabase.mca;

import X.0dV;
import java.util.List;

public class MailboxStandaloneDatabaseJNI {
    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native List getHeaderFields();

    static {
        0dV.A0C("mailboxstandalonedatabasejni");
    }
}
