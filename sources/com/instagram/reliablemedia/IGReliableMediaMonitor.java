package com.instagram.reliablemedia;

import X.002;
import X.0Tu;
import X.0cp;
import X.0di;
import X.0qQ;
import X.14i;
import X.15Y;
import X.182;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0qK;
import X.C3726591v;
import X.C61110lV;
import X.C61560nl;
import X.C61940qJ;
import X.C62670v5;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.LruCache;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGTigonService;

public final class IGReliableMediaMonitor implements C61110lV, AnonymousClass0qK {
    public static final C3726591v Companion = new Object();
    public final HybridData mHybridData;
    public final UserSession userSession;

    public IGReliableMediaMonitor(UserSession userSession2) {
        UserSession userSession3 = userSession2;
        0qQ.A0B(userSession3, 1);
        this.userSession = userSession3;
        IGTigonService tigonService = IGTigonService.getTigonService(userSession3);
        0qQ.A07(tigonService);
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(C61560nl.A00().A00);
        0Tu r2 = 0Tu.A05;
        this.mHybridData = initHybrid(tigonService, androidAsyncExecutorFactory2, 182.A04(r2, userSession3, 36892231475069868L), 182.A06(r2, userSession3, 2342172290734964692L), (int) 182.A01(r2, userSession3, 36610756497774720L), (int) 182.A01(r2, userSession3, 36610756498102401L), (int) 182.A01(r2, userSession3, 36610756498167938L), 182.A04(r2, userSession3, 36892231474938795L), getServerUrl(), 182.A04(r2, userSession3, 36892231475200942L), 180);
    }

    private final native HybridData initHybrid(IGTigonService iGTigonService, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, boolean z, int i, int i2, int i3, String str2, String str3, String str4, int i4);

    private final native void onAppBackgroundedNative();

    private final native void onAppForegroundedNative();

    private final native void onCellConnection();

    private final native void onNoConnection();

    private final native void onOtherConnection();

    private final native void onUserSessionStartNative(boolean z);

    private final native void onUserSessionWillEndNative();

    private final native void onWifiConnection();

    public synchronized void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-2031705521);
        onAppBackgroundedNative();
        AnonymousClass0fD.A0A(-1373493976, A03);
    }

    public synchronized void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(438280190);
        onAppForegroundedNative();
        AnonymousClass0fD.A0A(535822458, A03);
    }

    public synchronized void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                int type = networkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        onWifiConnection();
                    } else if (type != 6) {
                        onOtherConnection();
                    }
                }
                onCellConnection();
            }
        }
        onNoConnection();
    }

    public final synchronized void onUserSessionStart(boolean z) {
        onUserSessionStartNative(z);
        14i r0 = 14i.A08;
        14i.A03(15Y.A03, this);
        C62670v5.A0B.A03(this);
    }

    public final synchronized void onUserSessionWillEnd() {
        onUserSessionWillEndNative();
        14i.A06(this);
        C61940qJ.A00(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.91v, java.lang.Object] */
    static {
        0di.A01("reliablemedia");
    }

    private final String getServerUrl() {
        UserSession userSession2 = this.userSession;
        0Tu r5 = 0Tu.A05;
        String A04 = 182.A04(r5, userSession2, 36892231474414506L);
        String A0T = 002.A0T(AnonymousClass000.A00(94), AnonymousClass000.A00(600), '|');
        String A042 = 182.A04(r5, this.userSession, 36892231475135405L);
        LruCache lruCache = 0cp.A00;
        String obj = Uri.parse(A04).buildUpon().appendQueryParameter("access_token", A0T).appendQueryParameter("rule_context", A042).toString();
        0qQ.A07(obj);
        return obj;
    }

    public final UserSession getUserSession() {
        return this.userSession;
    }
}
