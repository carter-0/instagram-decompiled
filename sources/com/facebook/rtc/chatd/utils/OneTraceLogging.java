package com.facebook.rtc.chatd.utils;

import X.C70915ORk;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.wamsys.wcp.MultiwayNotificationResult;
import java.util.Map;

public class OneTraceLogging {
    public native void logOnRSChatDHandlerCallback(String str, AccountSession accountSession, MsysError msysError, Map map);

    public native void logOnRSChatDHandlerNotification(AccountSession accountSession, MultiwayNotificationResult multiwayNotificationResult, Map map);

    public native void spotLogSend(String str, String str2, String str3);

    static {
        C70915ORk.A00();
    }
}
