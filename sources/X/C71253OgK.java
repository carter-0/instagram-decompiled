package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.OgK  reason: case insensitive filesystem */
public final class C71253OgK implements ServiceConnection {
    public final int A00;
    public final Object A01;

    public C71253OgK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onBindingDied(ComponentName componentName) {
        Handler handler;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                OZN ozn = (OZN) this.A01;
                ScheduledExecutorService scheduledExecutorService = OZN.A08;
                handler = ozn.A00;
                runnable = ozn.A07;
                break;
            case 2:
                StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A01;
                handler = stellaIpcDirectMessagingServiceClient.handler;
                if (handler != null) {
                    runnable = stellaIpcDirectMessagingServiceClient.disconnectRunnable;
                    break;
                } else {
                    return;
                }
            default:
                super.onBindingDied(componentName);
                return;
        }
        handler.post(runnable);
    }

    public final void onNullBinding(ComponentName componentName) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(componentName, 0);
                OZN ozn = (OZN) this.A01;
                ScheduledExecutorService scheduledExecutorService = OZN.A08;
                synchronized (ozn.A06) {
                    ozn.A02 = false;
                }
                ozn.A01.setException(C66582MXn.A0k(componentName, "onNullBinding, component name ", AnonymousClass7TE.A1A()));
                return;
            case 2:
                StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A01;
                synchronized (stellaIpcDirectMessagingServiceClient.lock) {
                    stellaIpcDirectMessagingServiceClient.isServiceConnectionInProgress = false;
                }
                return;
            default:
                super.onNullBinding(componentName);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [com.instagram.direct.stella.api.IStellaDirectMessagingService$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r0 != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.0qQ.A0B(r8, r0)
            java.lang.Object r4 = r6.A01
            com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient r4 = (com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient) r4
            com.google.common.util.concurrent.SettableFuture r3 = r4.serviceInterfaceFuture
            java.lang.String r0 = "com.instagram.direct.stella.api.IStellaDirectMessagingService"
            android.os.IInterface r2 = r8.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x0022
            boolean r0 = r2 instanceof com.instagram.direct.stella.api.IStellaDirectMessagingService
            if (r0 == 0) goto L_0x0022
        L_0x001b:
            r3.set(r2)
            java.lang.Object r1 = r4.lock
            monitor-enter(r1)
            goto L_0x0037
        L_0x0022:
            com.instagram.direct.stella.api.IStellaDirectMessagingService$Stub$Proxy r2 = new com.instagram.direct.stella.api.IStellaDirectMessagingService$Stub$Proxy
            r2.<init>()
            r0 = 1470581340(0x57a74a5c, float:3.67875626E14)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r8
            r0 = -604873084(0xffffffffdbf25e84, float:-1.36441731E17)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x001b
        L_0x0037:
            r0 = 0
            r4.isServiceConnectionInProgress = r0     // Catch:{ all -> 0x00c2 }
            goto L_0x00c0
        L_0x003c:
            if (r8 == 0) goto L_0x0084
            X.Mrm r8 = (X.C67659Mrm) r8
            java.lang.Object r4 = r6.A01
            X.OdA r4 = (X.C71116OdA) r4
            r4.A03 = r8
            X.OZt r5 = r4.A0B
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325252841812763(0x810da00003331b, double:3.0355743949905785E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0070
            X.0wX r3 = r3.A03
            java.lang.Class<X.OTq> r2 = X.C70969OTq.class
            r1 = 22
            X.Pln r0 = new X.Pln
            r0.<init>(r5, r1)
            java.lang.Object r1 = r3.A01(r2, r0)
            X.OTq r1 = (X.C70969OTq) r1
            if (r1 == 0) goto L_0x0070
            com.facebook.rtc.notification.RtcNotificationForegroundService r0 = r8.A00
            if (r0 == 0) goto L_0x0070
            r0.A01 = r1
        L_0x0070:
            com.facebook.rtc.notification.RtcNotificationForegroundService r1 = r8.A00
            if (r1 == 0) goto L_0x0078
            X.0sa r0 = r4.A0J
            r1.A04 = r0
        L_0x0078:
            r2 = 0
            r4.A07 = r2
            X.Npk r1 = r4.A02
            if (r1 == 0) goto L_0x00c1
            r0 = 1
            X.C71116OdA.A00(r1, r4, r0, r2)
            return
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0089:
            r0 = 1
            X.0qQ.A0B(r8, r0)
            java.lang.Object r3 = r6.A01
            X.OZN r3 = (X.OZN) r3
            java.util.concurrent.ScheduledExecutorService r0 = X.OZN.A08
            java.lang.String r0 = "com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface"
            android.os.IInterface r2 = r8.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x00a9
            boolean r0 = r2 instanceof com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface$Stub$Proxy
            if (r0 == 0) goto L_0x00a9
        L_0x009f:
            com.google.common.util.concurrent.SettableFuture r0 = r3.A01
            r0.set(r2)
            java.lang.Object r1 = r3.A06
            monitor-enter(r1)
            r0 = 0
            goto L_0x00be
        L_0x00a9:
            com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface$Stub$Proxy r2 = new com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface$Stub$Proxy
            r2.<init>()
            r0 = -2069440649(0xffffffff84a6d777, float:-3.9224286E-36)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r8
            r0 = 993244726(0x3b33b636, float:0.0027421839)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x009f
        L_0x00be:
            r3.A02 = r0     // Catch:{ all -> 0x00c2 }
        L_0x00c0:
            monitor-exit(r1)
        L_0x00c1:
            return
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71253OgK.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.A00) {
            case 0:
                ((OZN) this.A01).A01 = new Object();
                return;
            case 1:
                C71116OdA odA = (C71116OdA) this.A01;
                C67659Mrm mrm = odA.A03;
                if (mrm != null) {
                    mrm.A00 = null;
                }
                odA.A03 = null;
                odA.A07 = false;
                return;
            default:
                ((StellaIpcDirectMessagingServiceClient) this.A01).serviceInterfaceFuture = new Object();
                return;
        }
    }
}
