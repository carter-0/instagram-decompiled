package com.facebook.msys.mca;

import X.C295125nc;
import X.C66595MYh;
import X.C71735Opv;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;
import java.util.concurrent.Executor;

public class SlimMailbox {
    public static final SlimMailbox $redex_init_class = null;
    public final AccountSession mAccountSession;
    public final Executor mCallbackExecutor;
    public final NativeHolder mNativeHolder;
    public NotificationCenter mNotificationCenter;
    public C295125nc mNotificationCenterCallbackManager;

    private native NotificationCenter getNotificationCenterNative();

    private native NativeHolder initNativeHolder(AccountSession accountSession, NotificationCenter notificationCenter, String str);

    private native boolean nativeEquals(SlimMailbox slimMailbox);

    public native void deployEarlyDatabaseConnection(String str, String str2, Database.OpenCallback openCallback, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, boolean z, Map map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    public synchronized NotificationCenter getNotificationCenter() {
        NotificationCenter notificationCenter;
        notificationCenter = this.mNotificationCenter;
        if (notificationCenter == null) {
            notificationCenter = getNotificationCenterNative();
            this.mNotificationCenter = notificationCenter;
        }
        return notificationCenter;
    }

    public synchronized C295125nc getNotificationCenterCallbackManager() {
        C295125nc r1;
        r1 = this.mNotificationCenterCallbackManager;
        if (r1 == null) {
            r1 = new C71735Opv(getNotificationCenter());
            this.mNotificationCenterCallbackManager = r1;
        }
        return r1;
    }

    public native int hashCode();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SlimMailbox) {
            return nativeEquals((SlimMailbox) obj);
        }
        return false;
    }

    static {
        C66595MYh.A00();
    }

    public SlimMailbox(AccountSession accountSession, NotificationCenter notificationCenter, String str, Executor executor) {
        this.mAccountSession = accountSession;
        this.mNotificationCenter = notificationCenter;
        this.mCallbackExecutor = executor;
        this.mNativeHolder = initNativeHolder(accountSession, notificationCenter, str);
    }
}
