package com.facebook.messenger.notification.engine;

import X.C70910ORf;
import X.OOT;
import com.facebook.simplejni.NativeHolder;

public final class MSGNotificationEngineUnreadMessage {
    public static final OOT Companion = new Object();
    public NativeHolder mNativeHolder;

    public static final native NativeHolder initNativeHolder(Long l, String str, Long l2, String str2, String str3, String str4);

    public final native String getMessageId();

    public final native String getPreviewUrl();

    public final native Long getSenderId();

    public final native String getSenderName();

    public final native String getText();

    public final native Long getTimestampMs();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OOT, java.lang.Object] */
    static {
        C70910ORf.A00();
    }

    public MSGNotificationEngineUnreadMessage(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
