package X;

import android.content.ComponentName;
import android.content.ServiceConnection;

public final class SVR implements ServiceConnection {
    public final /* synthetic */ SRY A00;
    public final /* synthetic */ boolean A01;

    public SVR(SRY sry, boolean z) {
        this.A00 = sry;
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.browser.lite.ipc.BrowserLiteCallback$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r3.isEmpty() != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            r6 = this;
            X.SRY r4 = r6.A00
            if (r8 != 0) goto L_0x0018
            r2 = 0
        L_0x0005:
            r4.A06 = r2
            X.ObS r0 = r4.A07
            if (r0 == 0) goto L_0x000e
            r0.A05(r2)
        L_0x000e:
            X.Rvf r5 = r4.A05
            if (r5 == 0) goto L_0x005c
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r4.A06
            r3 = 0
            if (r0 == 0) goto L_0x004f
            goto L_0x003c
        L_0x0018:
            java.lang.String r0 = "com.facebook.browser.lite.ipc.BrowserLiteCallback"
            android.os.IInterface r2 = r8.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x0027
            boolean r0 = r2 instanceof com.facebook.browser.lite.ipc.BrowserLiteCallback
            if (r0 == 0) goto L_0x0027
            com.facebook.browser.lite.ipc.BrowserLiteCallback r2 = (com.facebook.browser.lite.ipc.BrowserLiteCallback) r2
            goto L_0x0005
        L_0x0027:
            com.facebook.browser.lite.ipc.BrowserLiteCallback$Stub$Proxy r2 = new com.facebook.browser.lite.ipc.BrowserLiteCallback$Stub$Proxy
            r2.<init>()
            r0 = 1327775068(0x4f243d5c, float:2.75548467E9)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r8
            r0 = -138292883(0xfffffffff7c1d16d, float:-7.862195E33)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x0005
        L_0x003c:
            java.util.ArrayList r0 = r0.Bej()     // Catch:{ RemoteException -> 0x0047 }
            if (r0 == 0) goto L_0x004f
            java.util.HashSet r3 = X.C66580MXl.A12(r0)     // Catch:{ RemoteException -> 0x0047 }
            goto L_0x004f
        L_0x0047:
            r2 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in getPrefetchedInitialUrlKeys"
            X.0KC.A0J(r1, r0, r2)
        L_0x004f:
            monitor-enter(r5)
            if (r3 == 0) goto L_0x0058
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            r5.A01 = r3     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
        L_0x005c:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x006a
            r0 = 1
            X.QJe r1 = new X.QJe
            r1.<init>(r4, r0)
            r0 = 0
            X.SRY.A02(r1, r4, r0)
        L_0x006a:
            r5 = r4
            monitor-enter(r5)
            X.Rnv r0 = r4.A04     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            X.0i1 r1 = X.AnonymousClass0LO.A70     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "alive"
            X.0LA.A05(r1, r0)     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r5)
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SVR.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        SRY sry = this.A00;
        synchronized (sry) {
            C10180Rnv rnv = sry.A04;
            if (rnv != null) {
                0LA.A05(AnonymousClass0LO.A70, "dead");
                int i = rnv.A00 + 1;
                rnv.A00 = i;
                0LA.A05(AnonymousClass0LO.A6z, String.valueOf(i));
            }
        }
        sry.A07 = null;
    }
}
