package com.facebook.msys.mca;

import X.C66595MYh;
import com.facebook.simplejni.NativeHolder;

public class MailboxMessengerMediaSendManagerConfig {
    public static final MailboxMessengerMediaSendManagerConfig $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    private native NativeHolder initNativeHolder(String str, String str2, int i, int i2, Integer num);

    public MailboxMessengerMediaSendManagerConfig(String str, String str2, int i, int i2, Integer num) {
        this.mNativeHolder = initNativeHolder(str, str2, 262144000, 262144000, (Integer) null);
    }

    static {
        C66595MYh.A00();
    }
}
