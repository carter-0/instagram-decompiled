package com.facebook.proactivewarnings.mca;

import X.0dV;
import java.util.List;

public class MailboxProactiveWarningsJNI {
    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();

    static {
        0dV.A0C("mailboxproactivewarningsjni");
    }
}
