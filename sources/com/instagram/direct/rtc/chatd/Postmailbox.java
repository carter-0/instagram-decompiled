package com.instagram.direct.rtc.chatd;

import com.facebook.msys.mci.AccountSession;
import com.facebook.wamsys.wcp.MultiwayNotificationResult;
import com.facebook.wamsys.wcp.MultiwaySendResult;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;

public abstract class Postmailbox {
    public MsysActiveUserSession mAppContext;
    public AccountSession mPluginContext;

    public void IGDAndroidMsysMultiwaydPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract boolean IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMHandleInMultiwaySessionedNotification(MultiwayNotificationResult multiwayNotificationResult);

    public abstract void IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMMultiwayMessageSessionedHandler(MultiwaySendResult multiwaySendResult, Object obj);

    private void IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMMultiwayMessageSessionedHandlerJNI(MultiwaySendResult multiwaySendResult, Object obj) {
        if (obj == null) {
            obj = null;
        }
        IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMMultiwayMessageSessionedHandler(multiwaySendResult, obj);
    }

    public Postmailbox(AccountSession accountSession, MsysActiveUserSession msysActiveUserSession) {
        this.mPluginContext = accountSession;
        this.mAppContext = msysActiveUserSession;
    }

    private boolean IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMHandleInMultiwaySessionedNotificationJNI(MultiwayNotificationResult multiwayNotificationResult) {
        return IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMHandleInMultiwaySessionedNotification(multiwayNotificationResult);
    }
}
