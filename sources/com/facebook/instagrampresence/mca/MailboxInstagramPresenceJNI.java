package com.facebook.instagrampresence.mca;

import X.0dV;
import java.util.List;

public class MailboxInstagramPresenceJNI {
    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOOOZ(int i, Object obj, Object obj2, Object obj3, boolean z);

    public static final native List getHeaderFields();

    static {
        0dV.A0C("mailboxinstagrampresencejni");
    }
}
