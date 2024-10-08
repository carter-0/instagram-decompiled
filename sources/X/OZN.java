package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.facebook.assistant.stella.ipc.common.request.IpcRequest;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public abstract class OZN {
    public static final ScheduledExecutorService A08 = Executors.newSingleThreadScheduledExecutor();
    public Handler A00 = AnonymousClass7TF.A0D();
    public SettableFuture A01 = new Object();
    public boolean A02;
    public int A03;
    public final Context A04;
    public final ServiceConnection A05 = new C71253OgK(this, 0);
    public final Object A06 = new Object();
    public final Runnable A07 = new PUK(this);

    public static final void A00(IpcRequest ipcRequest, OZN ozn) {
        synchronized (ozn.A06) {
            ozn.A03--;
            C68378NEe nEe = ipcRequest.A00;
            nEe.A04("execution_end");
            if (ozn.A03 > 0) {
                nEe.A06(nEe.A00);
            } else {
                Handler handler = ozn.A00;
                Runnable runnable = ozn.A07;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                ozn.A03 = 0;
                nEe.A06(nEe.A00);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1K2] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.7QZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v41, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0172, code lost:
        if (r0 != null) goto L_0x0174;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.facebook.assistant.stella.ipc.common.request.IpcRequest r10) {
        /*
            r9 = this;
            X.NEe r3 = r10.A00
            r3.A03()
            r2 = r9
            X.N1M r2 = (X.N1M) r2     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            android.content.Context r0 = r2.A04     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            java.lang.String r8 = r2.A03     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            java.lang.String r6 = "Failed getting package %s"
            r4 = 0
            java.lang.String r5 = "StellaPackageUtils"
            if (r8 != 0) goto L_0x001e
            java.lang.String r0 = "packageName is null"
            X.0KC.A0C(r5, r0)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
        L_0x0018:
            X.N1I r0 = new X.N1I     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            r0.<init>()     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
        L_0x001d:
            throw r0     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
        L_0x001e:
            r7 = 1
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException | RuntimeException -> 0x007a }
            android.content.pm.PackageInfo r6 = r0.getPackageInfo(r8, r4)     // Catch:{ NameNotFoundException | RuntimeException -> 0x007a }
            if (r6 == 0) goto L_0x0018
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            if (r0 == 0) goto L_0x0018
            int r0 = r0.flags     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x003a
            X.N1J r0 = new X.N1J     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            r0.<init>(r6)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            goto L_0x001d
        L_0x003a:
            java.lang.String r5 = r2.A02     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            X.7QZ r1 = new X.7QZ     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            r1.<init>()     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            java.lang.String r0 = r6.versionName     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            int r0 = r1.compare(r0, r5)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            if (r0 < 0) goto L_0x0074
            java.lang.String r1 = r6.versionName     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = "destination_app_version"
            r3.A05(r0, r1)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
        L_0x0052:
            X.O8Z r6 = r2.A01     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            r0 = 91
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            X.0tX r5 = X.0xn.A01(r0)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            java.lang.String r1 = "pairedIgUserId"
            r0 = 0
            java.lang.String r1 = r5.getString(r1, r0)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            com.instagram.common.session.UserSession r0 = r6.A00     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            boolean r0 = X.C66580MXl.A1X(r0, r1)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            if (r0 == 0) goto L_0x006e
            goto L_0x0083
        L_0x006e:
            X.Nni r0 = new X.Nni     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            r0.<init>()     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            goto L_0x001d
        L_0x0074:
            X.N1K r0 = new X.N1K     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            r0.<init>(r6)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            goto L_0x001d
        L_0x007a:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r8}     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            X.0KC.A0L(r5, r6, r1, r0)     // Catch:{ Nn0 -> 0x0155, Nni -> 0x0197 }
            goto L_0x0018
        L_0x0083:
            com.google.common.util.concurrent.SettableFuture r5 = new com.google.common.util.concurrent.SettableFuture
            r5.<init>()
            java.lang.Object r6 = r9.A06
            monitor-enter(r6)
            int r0 = r9.A03     // Catch:{ all -> 0x0152 }
            int r0 = r0 + 1
            r9.A03 = r0     // Catch:{ all -> 0x0152 }
            monitor-exit(r6)
            java.lang.String r0 = "reconnect_start"
            r3.A04(r0)
            monitor-enter(r6)
            boolean r0 = r9.A02     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x0113
            com.google.common.util.concurrent.SettableFuture r0 = r9.A01     // Catch:{ all -> 0x014f }
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x0113
            r9.A02 = r7     // Catch:{ all -> 0x014f }
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x014f }
            r0.<init>()     // Catch:{ all -> 0x014f }
            r9.A01 = r0     // Catch:{ all -> 0x014f }
            android.os.Handler r1 = r9.A00     // Catch:{ all -> 0x014f }
            java.lang.Runnable r0 = r9.A07     // Catch:{ all -> 0x014f }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x014f }
            monitor-exit(r6)
            android.content.Intent r6 = X.DbS.A09()
            java.lang.String r0 = "com.facebook.wearable.assistant.ipc.MwaTunnelService"
            X.C66581MXm.A17(r6, r8, r0)
            X.0b6 r1 = X.0b6.A00()     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            X.0Pj r0 = r2.A00     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            X.0bs r1 = r1.A0B(r0)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            java.lang.String r0 = "IPC_REQUEST"
            X.0bs r2 = r1.A06(r0)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            X.0qQ.A07(r2)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            android.content.ServiceConnection r1 = r9.A05     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            android.content.Context r0 = r9.A04     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            boolean r0 = r2.A04(r0, r6, r1, r7)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            if (r0 != 0) goto L_0x00f6
            java.lang.String r1 = "reconnect_state"
            java.lang.String r0 = "reconnect_failed"
            r3.A05(r1, r0)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            com.google.common.util.concurrent.SettableFuture r2 = r9.A01     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            java.lang.String r0 = "App likely never started, hence service not registered. Could not bind to the IPC service, intent "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r0, r1)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            r2.setException(r0)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            goto L_0x013a
        L_0x00f6:
            java.lang.String r1 = "reconnect_state"
            java.lang.String r0 = "reconnect_successful"
            r3.A05(r1, r0)     // Catch:{ SecurityException -> 0x0126, Exception -> 0x00fe }
            goto L_0x013a
        L_0x00fe:
            r2 = move-exception
            java.lang.String r1 = "reconnect_state"
            java.lang.String r0 = "reconnect_failed"
            r3.A05(r1, r0)
            java.lang.String r0 = "reconnect_end"
            r3.A04(r0)
            android.content.Context r1 = r9.A04
            android.content.ServiceConnection r0 = r9.A05
            r1.unbindService(r0)
            throw r2
        L_0x0113:
            java.lang.String r1 = "reconnect_state"
            java.lang.String r0 = "reconnect_not_attempted"
            r3.A05(r1, r0)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = "reconnect_end"
            r3.A04(r0)     // Catch:{ all -> 0x014f }
            com.google.common.util.concurrent.SettableFuture r2 = r9.A01     // Catch:{ all -> 0x014f }
            X.0qQ.A06(r2)     // Catch:{ all -> 0x014f }
            monitor-exit(r6)
            goto L_0x0144
        L_0x0126:
            r2 = move-exception
            java.lang.String r1 = "reconnect_state"
            java.lang.String r0 = "reconnect_failed"
            r3.A05(r1, r0)
            com.google.common.util.concurrent.SettableFuture r0 = r9.A01
            r0.setException(r2)
            android.content.Context r1 = r9.A04
            android.content.ServiceConnection r0 = r9.A05
            r1.unbindService(r0)
        L_0x013a:
            java.lang.String r0 = "reconnect_end"
            r3.A04(r0)
            com.google.common.util.concurrent.SettableFuture r2 = r9.A01
            X.0qQ.A06(r2)
        L_0x0144:
            X.OrO r1 = new X.OrO
            r1.<init>(r4, r5, r10, r9)
            java.util.concurrent.ScheduledExecutorService r0 = A08
            X.C255183ti.A04(r1, r2, r0)
            return
        L_0x014f:
            r2 = move-exception
            monitor-exit(r6)
            throw r2
        L_0x0152:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0155:
            r4 = move-exception
            java.lang.String r1 = "Package is invalid"
            java.lang.String r0 = "MwaIpcServiceClient"
            X.0KC.A0F(r0, r1, r4)
            r5 = r4
            boolean r0 = r4 instanceof X.N1I
            if (r0 == 0) goto L_0x018d
            java.lang.String r2 = "app_not_installed"
        L_0x0164:
            r1 = 1
            java.lang.String r0 = "package_invalid"
            r3.A07(r0, r2, r1)
            boolean r0 = r4 instanceof X.N1K
            if (r0 == 0) goto L_0x017e
            X.N1K r5 = (X.N1K) r5
            android.content.pm.PackageInfo r0 = r5.A00
        L_0x0172:
            if (r0 == 0) goto L_0x01a7
        L_0x0174:
            java.lang.String r1 = r0.versionName
            if (r1 == 0) goto L_0x01a7
            java.lang.String r0 = "destination_app_version"
            r3.A05(r0, r1)
            goto L_0x01a7
        L_0x017e:
            boolean r0 = r4 instanceof X.N1J
            if (r0 == 0) goto L_0x0187
            X.N1J r5 = (X.N1J) r5
            android.content.pm.PackageInfo r0 = r5.A00
            goto L_0x0172
        L_0x0187:
            android.content.pm.PackageInfo r0 = new android.content.pm.PackageInfo
            r0.<init>()
            goto L_0x0174
        L_0x018d:
            boolean r0 = r4 instanceof X.N1K
            if (r0 == 0) goto L_0x0194
            java.lang.String r2 = "app_not_compatible"
            goto L_0x0164
        L_0x0194:
            java.lang.String r2 = "app_flavor_not_compatible"
            goto L_0x0164
        L_0x0197:
            r4 = move-exception
            java.lang.String r1 = "provider is not connected"
            java.lang.String r0 = "MwaIpcServiceClient"
            X.0KC.A0F(r0, r1, r4)
            java.lang.String r2 = "opt_out_user"
            r1 = 1
            java.lang.String r0 = "user_opt_out"
            r3.A07(r0, r2, r1)
        L_0x01a7:
            r0 = 3376(0xd30, float:4.731E-42)
            r3.A06(r0)
            X.R1v r0 = new X.R1v
            r0.<init>()
            r0.setException(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZN.A01(com.facebook.assistant.stella.ipc.common.request.IpcRequest):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public OZN(Context context) {
        this.A04 = context;
    }
}
