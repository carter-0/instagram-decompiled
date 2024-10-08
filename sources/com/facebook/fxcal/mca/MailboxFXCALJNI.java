package com.facebook.fxcal.mca;

import X.0dV;
import java.util.List;

public class MailboxFXCALJNI {
    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();

    static {
        0dV.A0C("mailboxfxcaljni");
    }
}
