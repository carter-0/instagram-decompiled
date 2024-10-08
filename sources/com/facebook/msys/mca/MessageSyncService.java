package com.facebook.msys.mca;

import X.C66595MYh;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;

public class MessageSyncService {
    public final AccountSession mAccountSession;
    public final NativeHolder mNativeHolder;

    private native NativeHolder initNativeHolder(MessageSyncServiceConfig messageSyncServiceConfig);

    private native boolean isValidNative();

    /* access modifiers changed from: private */
    public native void setStateNative(int i);

    private native void shutdownAndDeleteNative(NotificationScope notificationScope);

    /* access modifiers changed from: private */
    public native void shutdownNative(NotificationScope notificationScope);

    static {
        C66595MYh.A00();
    }

    public MessageSyncService(AccountSession accountSession, MessageSyncServiceConfig messageSyncServiceConfig) {
        this.mAccountSession = accountSession;
        this.mNativeHolder = initNativeHolder(messageSyncServiceConfig);
    }
}
