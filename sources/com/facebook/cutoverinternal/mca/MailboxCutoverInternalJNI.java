package com.facebook.cutoverinternal.mca;

import X.0dV;
import java.util.List;

public class MailboxCutoverInternalJNI {
    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();

    static {
        0dV.A0C("mailboxcutoverinternaljni");
    }
}
