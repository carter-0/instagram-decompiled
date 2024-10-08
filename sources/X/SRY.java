package X;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.Map;

public final class SRY {
    public static SRY A08;
    public int A00;
    public ServiceConnection A01;
    public Handler A02;
    public HandlerThread A03;
    public C10180Rnv A04;
    public C10646Rvf A05;
    public BrowserLiteCallback A06;
    public C71087ObS A07;

    public final void A03(long j, String str, String str2, Map map) {
        A02(new C7567QJv(this, str, str2, map, 1, j), this, false);
    }

    public final void A04(long j, String str, String str2, Map map) {
        A02(new C7567QJv(this, str, str2, map, 0, j), this, false);
    }

    public final void A06(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy) {
        A02(new C7558QJi(bundle, this, iABEvent, zonePolicy), this, false);
    }

    public final void A07(Bundle bundle, Map map) {
        A02(new QJx(bundle, this, map, 1), this, false);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.SRY] */
    public static synchronized SRY A00() {
        SRY sry;
        synchronized (SRY.class) {
            SRY sry2 = A08;
            sry = sry2;
            if (sry2 == null) {
                ? obj = new Object();
                A08 = obj;
                sry = obj;
            }
        }
        return sry;
    }

    public static void A02(C10980S3o s3o, SRY sry, boolean z) {
        if (sry.A01 == null) {
            SQO.A01("BrowserLiteCallbacker", "Callback service is not available.", Pxe.A1b());
            0KC.A0E("BrowserLiteCallbacker", "Callback service is not available.");
            return;
        }
        sry.A02.post(new TIO(s3o, sry, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r4.isEmpty() != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.content.Context r7, boolean r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            r3 = 1
            int r0 = r0 + 1
            r6.A00 = r0
            android.content.ServiceConnection r0 = r6.A01
            if (r0 == 0) goto L_0x0050
            X.Rvf r5 = r6.A05
            if (r5 == 0) goto L_0x0050
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r6.A06
            r4 = 0
            if (r0 == 0) goto L_0x0027
            java.util.ArrayList r0 = r0.Bej()     // Catch:{ RemoteException -> 0x001f }
            if (r0 == 0) goto L_0x0027
            java.util.HashSet r4 = X.C66580MXl.A12(r0)     // Catch:{ RemoteException -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r2 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in getPrefetchedInitialUrlKeys"
            X.0KC.A0J(r1, r0, r2)
        L_0x0027:
            monitor-enter(r5)
            if (r4 == 0) goto L_0x0030
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            r5.A01 = r4     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            if (r8 == 0) goto L_0x003f
            X.QJe r1 = new X.QJe
            r1.<init>(r6, r3)
            r0 = 0
            A02(r1, r6, r0)
        L_0x003f:
            r5 = r6
            monitor-enter(r5)
            X.Rnv r0 = r6.A04     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x00b5
            X.0i1 r1 = X.AnonymousClass0LO.A70     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "alive"
            X.0LA.A05(r1, r0)     // Catch:{ all -> 0x004d }
            goto L_0x00b5
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0050:
            java.lang.String r0 = "com.facebook.browser.lite.BrowserLiteCallback"
            android.content.Intent r5 = X.Pxe.A0G(r0)
            X.Pxe.A1L(r7, r5)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r4 = 0
            java.util.List r1 = r0.queryIntentServices(r5, r4)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b6
            int r0 = r1.size()
            if (r0 > r3) goto L_0x00b6
            java.lang.String r0 = "BrowserLiteCallbacker"
            android.os.HandlerThread r0 = X.Pxf.A0I(r0)
            r6.A03 = r0
            r0.start()
            android.os.HandlerThread r0 = r6.A03
            android.os.Handler r0 = X.Pxf.A0H(r0)
            r6.A02 = r0
            X.ObS r0 = new X.ObS
            r0.<init>()
            r6.A07 = r0
            X.SVR r0 = new X.SVR
            r0.<init>(r6, r8)
            r6.A01 = r0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5)
            java.lang.Object r0 = r1.get(r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = r0.name
            X.C66581MXm.A17(r2, r1, r0)
            boolean r0 = X.SQY.A02(r7)
            if (r0 == 0) goto L_0x00ad
            r3 = 9
        L_0x00ad:
            android.content.ServiceConnection r1 = r6.A01
            r0 = r3 | 512(0x200, float:7.175E-43)
            r7.bindService(r2, r1, r0)
            return
        L_0x00b5:
            monitor-exit(r5)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRY.A05(android.content.Context, boolean):void");
    }

    public static void A01(Bundle bundle, Map map) {
        A00().A07(bundle, map);
    }
}
