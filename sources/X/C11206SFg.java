package X;

import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.SFg  reason: case insensitive filesystem */
public final class C11206SFg {
    public Socket A00;
    public final int A01;
    public final C10676RwF A02;
    public final InetAddress A03;
    public final InetAddress A04;
    public final ScheduledExecutorService A05;
    public final int A06;
    public final int A07;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(3:5|6|7)|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C11206SFg r2, java.net.InetAddress r3, java.net.Socket r4, java.net.Socket r5) {
        /*
            r0 = 1
            r4.setTcpNoDelay(r0)
            r0 = 0
            r4.setSoTimeout(r0)
            r4.setKeepAlive(r0)
            int r0 = r2.A06
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
            r1.<init>(r3, r0)
            int r0 = r2.A07
            r4.connect(r1, r0)
            monitor-enter(r2)
            java.net.Socket r0 = r2.A00     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r2.A00 = r4     // Catch:{ all -> 0x0023 }
            r5.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11206SFg.A00(X.SFg, java.net.InetAddress, java.net.Socket, java.net.Socket):void");
    }

    public C11206SFg(C10676RwF rwF, InetAddress inetAddress, InetAddress inetAddress2, ScheduledExecutorService scheduledExecutorService, int i, int i2, int i3) {
        this.A02 = rwF;
        this.A04 = inetAddress;
        this.A03 = inetAddress2;
        this.A06 = i;
        this.A07 = i2;
        this.A05 = scheduledExecutorService;
        this.A01 = i3;
    }
}
