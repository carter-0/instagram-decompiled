package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.internal.gtm.zzce;

public final class SVX implements ServiceConnection {
    public volatile zzce A00;
    public volatile boolean A01;
    public final /* synthetic */ C8487QvZ A02;

    public SVX(C8487QvZ qvZ) {
        this.A02 = qvZ;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:12|(1:14)(1:16)|15|(4:21|(1:23)(1:24)|27|28)|25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3 = r5.A02;
        X.ST5.A0B(r3, "Service connect failed to get IAnalyticsService", 6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
        /*
            r5 = this;
            java.lang.String r2 = "AnalyticsServiceConnection.onServiceConnected"
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 != r0) goto L_0x008b
            monitor-enter(r5)
            if (r7 != 0) goto L_0x001b
            X.QvZ r2 = r5.A02     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "Service connected with null binder"
            r0 = 6
            X.ST5.A0B(r2, r1, r0)     // Catch:{ all -> 0x0083 }
            r5.notifyAll()     // Catch:{ all -> 0x0088 }
            goto L_0x0081
        L_0x001b:
            r2 = 0
            java.lang.String r4 = r7.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x004a }
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r0 = r1.equals(r4)     // Catch:{ RemoteException -> 0x004a }
            if (r0 == 0) goto L_0x0042
            android.os.IInterface r1 = r7.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x004a }
            boolean r0 = r1 instanceof com.google.android.gms.internal.gtm.zzce     // Catch:{ RemoteException -> 0x004a }
            if (r0 == 0) goto L_0x003c
            com.google.android.gms.internal.gtm.zzce r1 = (com.google.android.gms.internal.gtm.zzce) r1     // Catch:{ RemoteException -> 0x004a }
        L_0x0032:
            r2 = r1
            X.QvZ r3 = r5.A02     // Catch:{ RemoteException -> 0x004a }
            java.lang.String r1 = "Bound to IAnalyticsService interface"
            r0 = 2
            X.ST5.A0B(r3, r1, r0)     // Catch:{ RemoteException -> 0x004a }
            goto L_0x0052
        L_0x003c:
            com.google.android.gms.internal.gtm.zzcf r1 = new com.google.android.gms.internal.gtm.zzcf     // Catch:{ RemoteException -> 0x004a }
            r1.<init>(r7)     // Catch:{ RemoteException -> 0x004a }
            goto L_0x0032
        L_0x0042:
            X.QvZ r3 = r5.A02     // Catch:{ RemoteException -> 0x004a }
            java.lang.String r0 = "Got binder with a wrong descriptor"
            r3.A0H(r0, r4)     // Catch:{ RemoteException -> 0x004a }
            goto L_0x0071
        L_0x004a:
            X.QvZ r3 = r5.A02     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "Service connect failed to get IAnalyticsService"
            r0 = 6
            X.ST5.A0B(r3, r1, r0)     // Catch:{ all -> 0x0083 }
        L_0x0052:
            if (r2 == 0) goto L_0x0071
            boolean r0 = r5.A01     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x006e
            java.lang.String r1 = "onServiceConnected received after the timeout limit"
            r0 = 5
            X.ST5.A0B(r3, r1, r0)     // Catch:{ all -> 0x0083 }
            X.SFa r0 = X.C11381SQt.A00(r3)     // Catch:{ all -> 0x0083 }
            X.THA r1 = new X.THA     // Catch:{ all -> 0x0083 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0083 }
            X.TSq r0 = r0.A02     // Catch:{ all -> 0x0083 }
            r0.submit(r1)     // Catch:{ all -> 0x0083 }
            goto L_0x007e
        L_0x006e:
            r5.A00 = r2     // Catch:{ all -> 0x0083 }
            goto L_0x007e
        L_0x0071:
            X.64D r2 = X.AnonymousClass64D.A00()     // Catch:{ IllegalArgumentException -> 0x007e }
            X.SQt r0 = r3.A00     // Catch:{ IllegalArgumentException -> 0x007e }
            android.content.Context r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x007e }
            X.SVX r0 = r3.A01     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.A02(r1, r0)     // Catch:{ IllegalArgumentException -> 0x007e }
        L_0x007e:
            r5.notifyAll()     // Catch:{ all -> 0x0088 }
        L_0x0081:
            monitor-exit(r5)     // Catch:{ all -> 0x0088 }
            return
        L_0x0083:
            r0 = move-exception
            r5.notifyAll()     // Catch:{ all -> 0x0088 }
            throw r0     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0088 }
            throw r0
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SVX.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C11200SFa A002 = C11381SQt.A00(this.A02);
            A002.A02.submit(new THB(componentName, this));
            return;
        }
        throw AnonymousClass7TE.A0z("AnalyticsServiceConnection.onServiceDisconnected");
    }
}
