package com.facebook.featurelimits.mca;

import X.0dV;
import java.util.List;

public class MailboxFeatureLimitsJNI {
    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();

    static {
        0dV.A0C("mailboxfeaturelimitsjni");
    }
}
