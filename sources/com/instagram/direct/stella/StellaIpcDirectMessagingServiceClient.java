package com.instagram.direct.stella;

import X.02z;
import X.0b6;
import X.0cQ;
import X.0lm;
import X.0qQ;
import X.106;
import X.1Zh;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C255183ti;
import X.C60020ci;
import X.C61560nl;
import X.C64011LIy;
import X.C66581MXm;
import X.C66583MXo;
import X.C71253OgK;
import X.C71821OrO;
import X.DbS;
import X.JTP;
import X.ONU;
import X.PWO;
import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class StellaIpcDirectMessagingServiceClient implements 0lm {
    public static final C64011LIy Companion = new Object();
    public static final String FB_PERMISSION = "com.instagram.android.fbpermission.SEND_ACTION_RESULT";
    public static final long KEEP_CONNECTION_ALIVE_MS = 60000;
    public static final String VIEW_APP_DIRECT_MESSAGING_HANDLER = "com.facebook.assistant.stella.ipc.instagram.service.InstagramIpcDirectMessagingServiceServer";
    public static volatile StellaIpcDirectMessagingServiceClient _instance;
    public Application context;
    public final Runnable disconnectRunnable;
    public Handler handler;
    public boolean isServiceConnectionInProgress;
    public final Object lock;
    public int runningRequests;
    public final ServiceConnection serviceConnection;
    public SettableFuture serviceInterfaceFuture;
    public UserSession userSession;

    public /* synthetic */ StellaIpcDirectMessagingServiceClient(Application application, UserSession userSession2, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, userSession2);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture runIpcRequest(ONU onu) {
        0qQ.A0B(onu, 0);
        ? obj = new Object();
        if (isPackageValid()) {
            synchronized (this.lock) {
                this.runningRequests++;
                C255183ti.A04(new C71821OrO(2, obj, onu, this), connect(), C61560nl.A00().A00);
            }
        }
        return obj;
    }

    public final AnonymousClass0Ud runIpcRequestAsFlow(ONU onu) {
        0qQ.A0B(onu, 0);
        02z A01 = 106.A01(DbS.A11().toString());
        if (isPackageValid()) {
            synchronized (this.lock) {
                this.runningRequests++;
                C255183ti.A04(new C71821OrO(3, A01, onu, this), connect(), C61560nl.A00().A00);
            }
        }
        return A01;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    private final ListenableFuture connect() {
        SettableFuture settableFuture;
        IllegalStateException illegalStateException;
        synchronized (this.lock) {
            if (this.isServiceConnectionInProgress || this.serviceInterfaceFuture.isDone()) {
                settableFuture = this.serviceInterfaceFuture;
            } else {
                if (!(this.context == null || this.userSession == null)) {
                    this.isServiceConnectionInProgress = true;
                    this.serviceInterfaceFuture = new Object();
                    Handler handler2 = this.handler;
                    if (handler2 != null) {
                        handler2.removeCallbacks(this.disconnectRunnable);
                    }
                    Intent A09 = DbS.A09();
                    1Zh r2 = 1Zh.A01;
                    Application application = this.context;
                    if (application != null) {
                        PackageInfo A00 = r2.A00(application, this.userSession);
                        if (A00 != null) {
                            C66581MXm.A17(A09, A00.packageName, VIEW_APP_DIRECT_MESSAGING_HANDLER);
                            try {
                                0b6.A00().A0B(0cQ.A02(JTP.A0y(C60020ci.A1d))).A06("MANAGE_DIRECT_MESSAGING").A04(this.context, A09, this.serviceConnection, 1);
                            } catch (Exception e) {
                                this.serviceInterfaceFuture.setException(e);
                                Application application2 = this.context;
                                if (application2 != null) {
                                    application2.unbindService(this.serviceConnection);
                                    C66583MXo.A1I(this.userSession, AnonymousClass05K.A01, e);
                                } else {
                                    illegalStateException = AnonymousClass7TE.A0y();
                                }
                            }
                        }
                    } else {
                        illegalStateException = AnonymousClass7TE.A0y();
                        throw illegalStateException;
                    }
                }
                settableFuture = this.serviceInterfaceFuture;
            }
        }
        return settableFuture;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            try {
                Application application = this.context;
                if (application != null) {
                    application.unbindService(this.serviceConnection);
                }
            } catch (Exception e) {
                C66583MXo.A1I(this.userSession, AnonymousClass05K.A0C, e);
            }
            this.isServiceConnectionInProgress = false;
            this.serviceInterfaceFuture = new Object();
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.7QZ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r4 = X.1Zh.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isPackageValid() {
        /*
            r5 = this;
            android.app.Application r1 = r5.context
            r3 = 0
            if (r1 == 0) goto L_0x0033
            com.instagram.common.session.UserSession r0 = r5.userSession
            if (r0 == 0) goto L_0x0033
            X.1Zh r4 = X.1Zh.A01
            java.lang.String r2 = "Required value was null."
            android.content.pm.PackageInfo r0 = r4.A00(r1, r0)
            if (r0 == 0) goto L_0x0033
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L_0x0033
            android.app.Application r1 = r5.context
            if (r1 == 0) goto L_0x0034
            com.instagram.common.session.UserSession r0 = r5.userSession
            android.content.pm.PackageInfo r0 = r4.A00(r1, r0)
            if (r0 == 0) goto L_0x0033
            X.7QZ r2 = new X.7QZ
            r2.<init>()
            java.lang.String r1 = r0.versionName
            java.lang.String r0 = "124.0.0.0.15"
            int r0 = r2.compare(r1, r0)
            if (r0 < 0) goto L_0x0033
            r3 = 1
        L_0x0033:
            return r3
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient.isPackageValid():boolean");
    }

    /* access modifiers changed from: private */
    public final void onRequestFinished() {
        synchronized (this.lock) {
            int i = this.runningRequests - 1;
            this.runningRequests = i;
            if (i <= 0) {
                Handler handler2 = this.handler;
                if (handler2 != null) {
                    handler2.removeCallbacks(this.disconnectRunnable);
                    handler2.postDelayed(this.disconnectRunnable, KEEP_CONNECTION_ALIVE_MS);
                }
                this.runningRequests = 0;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public StellaIpcDirectMessagingServiceClient(Application application, UserSession userSession2) {
        this.context = application;
        this.handler = AnonymousClass7TF.A0D();
        this.userSession = userSession2;
        this.lock = new Object();
        this.disconnectRunnable = new PWO(this);
        this.serviceInterfaceFuture = new Object();
        this.serviceConnection = new C71253OgK(this, 2);
    }

    public void onUserSessionWillEnd(boolean z) {
        disconnect();
        synchronized (this.lock) {
            this.userSession = null;
            this.context = null;
            this.handler = null;
            _instance = null;
        }
    }
}
