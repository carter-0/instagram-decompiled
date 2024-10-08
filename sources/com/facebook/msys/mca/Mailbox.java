package com.facebook.msys.mca;

import X.0KC;
import X.1xN;
import X.AnonymousClass2Lq;
import X.AnonymousClass66d;
import X.AnonymousClass685;
import X.AnonymousClass68L;
import X.AnonymousClass6E6;
import X.AnonymousClass6E7;
import X.C66580MXl;
import X.C66582MXn;
import X.C66595MYh;
import X.C68339NBa;
import X.C68340NBb;
import X.C71722Opg;
import X.C71732Ops;
import X.NBX;
import X.NBY;
import X.NBZ;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mcs.SyncHandler;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Mailbox {
    public static final Mailbox $redex_init_class = null;
    public Database mDatabase;
    public final AnonymousClass66d mDbCommitCallback = new AnonymousClass6E6(this);
    public final AnonymousClass66d mDbCommitV2Callback = new AnonymousClass6E7(this);
    public final NativeHolder mNativeHolder;
    public final SlimMailbox mSlimMailbox;
    public final Set mStoredProcedureChangedListeners = Collections.newSetFromMap(new ConcurrentHashMap());
    public AnonymousClass68L mSynchronousMailboxApiHandleProvider = null;

    public static native boolean deleteDatabaseFilesNative(String str, String str2, int i);

    private native int getAppStateNative();

    private native int getStateNative();

    private native SyncHandler getSyncHandlerNative();

    private native NativeHolder initNativeHolder(MailboxConfig mailboxConfig);

    private native void invalidateNative_TestOnly();

    private native boolean isValidNative();

    /* access modifiers changed from: private */
    public native void logoutAndDeleteNative(NotificationScope notificationScope);

    /* access modifiers changed from: private */
    public native void logoutAndEncryptNative(NotificationScope notificationScope);

    private native void pauseSendSyncRequestsNative(NotificationScope notificationScope);

    private native void resumeSendSyncRequestsNative(NotificationScope notificationScope);

    /* access modifiers changed from: private */
    public native void scheduleTaskProcessingIfNeededNative();

    /* access modifiers changed from: private */
    public native void setStateNative(int i);

    /* access modifiers changed from: private */
    public native void shutdownAndDeleteNative(NotificationScope notificationScope);

    /* access modifiers changed from: private */
    public native void shutdownAndEncryptNative(NotificationScope notificationScope);

    /* access modifiers changed from: private */
    public native void shutdownNative(NotificationScope notificationScope);

    /* access modifiers changed from: private */
    public native void startAllDelayedSyncGroupsNative();

    private native void startDelayedSyncGroupsNative(List list);

    public synchronized AccountSession getAccountSession() {
        return this.mSlimMailbox.mAccountSession;
    }

    public synchronized SlimMailbox getSlimMailbox() {
        return this.mSlimMailbox;
    }

    public native void trimMemory();

    public native void updateAppStateToBackground();

    public native void updateAppStateToForeground();

    private void disableStoredProcedureChangedListeners() {
        this.mStoredProcedureChangedListeners.clear();
        getAccountSession().getSessionedNotificationCenter().removeObserver(this.mDbCommitCallback, "MCIDatabaseCommitNotificationV1", (AnonymousClass2Lq) null);
        getAccountSession().getSessionedNotificationCenter().removeObserver(this.mDbCommitV2Callback, "MCIDatabaseCommitNotificationV2", (AnonymousClass2Lq) null);
    }

    private NotificationScope getFutureNotificationScope(MailboxFutureImpl mailboxFutureImpl, String str, int i) {
        NotificationScope EBU = getSlimMailbox().getNotificationCenterCallbackManager().EBU(new C71732Ops(this, mailboxFutureImpl), "MCAMailboxDidShutdownNotification", 1);
        mailboxFutureImpl.setNotification("MCAMailboxDidShutdownNotification", EBU);
        return EBU;
    }

    public void addStoredProcedureChangedListener(1xN r4) {
        if (!this.mStoredProcedureChangedListeners.add(r4)) {
            0KC.A0Q("Mailbox", "StoredProcedureChangedListener %s was already registered, when going to add it", new Object[]{r4});
        }
    }

    static {
        C66595MYh.A00();
    }

    public Mailbox(SlimMailbox slimMailbox, boolean z, MailboxConfig mailboxConfig) {
        this.mSlimMailbox = slimMailbox;
        this.mNativeHolder = initNativeHolder(mailboxConfig);
        getAccountSession().getSessionedNotificationCenter().addObserver(this.mDbCommitCallback, "MCIDatabaseCommitNotificationV1", 1, (AnonymousClass2Lq) null);
        getAccountSession().getSessionedNotificationCenter().addObserver(this.mDbCommitV2Callback, "MCIDatabaseCommitNotificationV2", 6, (AnonymousClass2Lq) null);
    }

    public SyncHandler getSyncHandler() {
        return getSyncHandlerNative();
    }

    public boolean isValid() {
        return isValidNative();
    }

    public AnonymousClass685 logoutAndDelete() {
        MailboxFutureImpl A0G = C66580MXl.A0G(C66582MXn.A0I(this));
        Execution.executePossiblySync(new C68339NBa(this, getFutureNotificationScope(A0G, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        A0G.addResultCallback(C71722Opg.A00(this, 25));
        return A0G;
    }

    public AnonymousClass685 logoutAndEncrypt() {
        MailboxFutureImpl A0G = C66580MXl.A0G(C66582MXn.A0I(this));
        Execution.executePossiblySync(new C68340NBb(this, getFutureNotificationScope(A0G, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        A0G.addResultCallback(C71722Opg.A00(this, 28));
        return A0G;
    }

    public AnonymousClass685 shutdown() {
        MailboxFutureImpl A0G = C66580MXl.A0G(C66582MXn.A0I(this));
        Execution.executePossiblySync(new NBX(this, getFutureNotificationScope(A0G, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        A0G.addResultCallback(C71722Opg.A00(this, 29));
        return A0G;
    }

    public AnonymousClass685 shutdownAndDelete() {
        MailboxFutureImpl A0G = C66580MXl.A0G(C66582MXn.A0I(this));
        Execution.executePossiblySync(new NBY(this, getFutureNotificationScope(A0G, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        A0G.addResultCallback(C71722Opg.A00(this, 27));
        return A0G;
    }

    public AnonymousClass685 shutdownAndEncrypt() {
        MailboxFutureImpl A0G = C66580MXl.A0G(C66582MXn.A0I(this));
        Execution.executePossiblySync(new NBZ(this, getFutureNotificationScope(A0G, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        A0G.addResultCallback(C71722Opg.A00(this, 26));
        return A0G;
    }

    /* renamed from: lambda$logoutAndDelete$0$com-facebook-msys-mca-Mailbox  reason: not valid java name */
    public /* synthetic */ void m67lambda$logoutAndDelete$0$comfacebookmsysmcaMailbox(Void voidR) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$logoutAndEncrypt$1$com-facebook-msys-mca-Mailbox  reason: not valid java name */
    public /* synthetic */ void m68lambda$logoutAndEncrypt$1$comfacebookmsysmcaMailbox(Void voidR) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdown$2$com-facebook-msys-mca-Mailbox  reason: not valid java name */
    public /* synthetic */ void m69lambda$shutdown$2$comfacebookmsysmcaMailbox(Void voidR) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdownAndDelete$3$com-facebook-msys-mca-Mailbox  reason: not valid java name */
    public /* synthetic */ void m70lambda$shutdownAndDelete$3$comfacebookmsysmcaMailbox(Void voidR) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdownAndEncrypt$4$com-facebook-msys-mca-Mailbox  reason: not valid java name */
    public /* synthetic */ void m71lambda$shutdownAndEncrypt$4$comfacebookmsysmcaMailbox(Void voidR) {
        disableStoredProcedureChangedListeners();
    }
}
