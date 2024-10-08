package X;

import android.content.ComponentName;
import android.content.ServiceConnection;

public final class SVP implements ServiceConnection {
    public final /* synthetic */ SFR A00;

    public SVP(SFR sfr) {
        this.A00 = sfr;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.google.ar.core.dependencies.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
        /*
            r4 = this;
            X.SFR r3 = r4.A00
            monitor-enter(r3)
            if (r6 != 0) goto L_0x0007
            r2 = 0
            goto L_0x0013
        L_0x0007:
            java.lang.String r1 = "com.google.android.play.core.install.protocol.IInstallService"
            android.os.IInterface r2 = r6.queryLocalInterface(r1)     // Catch:{ all -> 0x0043 }
            boolean r0 = r2 instanceof com.google.ar.core.dependencies.f     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x002e
            com.google.ar.core.dependencies.f r2 = (com.google.ar.core.dependencies.f) r2     // Catch:{ all -> 0x0043 }
        L_0x0013:
            r3.A01 = r2     // Catch:{ all -> 0x0043 }
            r0 = 3
            r3.A04 = r0     // Catch:{ all -> 0x0043 }
            java.util.Queue r0 = r3.A03     // Catch:{ all -> 0x0043 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0043 }
        L_0x001e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0043 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0043 }
            r0.run()     // Catch:{ all -> 0x0043 }
            goto L_0x001e
        L_0x002e:
            com.google.ar.core.dependencies.f r2 = new com.google.ar.core.dependencies.f     // Catch:{ all -> 0x0043 }
            r2.<init>(r1, r6)     // Catch:{ all -> 0x0043 }
            r0 = 1052700873(0x3ebef0c9, float:0.3729308)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ all -> 0x0043 }
            r0 = 2876430(0x2be40e, float:4.030737E-39)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ all -> 0x0043 }
            goto L_0x0013
        L_0x0041:
            monitor-exit(r3)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SVP.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        SFR sfr = this.A00;
        synchronized (sfr) {
            sfr.A04 = 1;
            sfr.A01 = null;
        }
    }
}
