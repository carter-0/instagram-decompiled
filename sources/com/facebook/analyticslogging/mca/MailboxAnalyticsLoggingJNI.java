package com.facebook.analyticslogging.mca;

import X.0dV;
import java.util.List;

public class MailboxAnalyticsLoggingJNI {
    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();

    static {
        0dV.A0C("mailboxanalyticsloggingjni");
    }
}
