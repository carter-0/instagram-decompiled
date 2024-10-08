package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3n9  reason: invalid class name and case insensitive filesystem */
public final class C251463n9 {
    public static C251463n9 A02;
    public static final long A03 = TimeUnit.SECONDS.toMillis(60);
    public final Context A00;
    public final C251483nB A01;

    public final int A02(Intent intent, C270404gg r11) {
        String str;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                Context context = this.A00;
                C251443n7 A002 = C251443n7.A00(context, extras);
                String A07 = 002.A07(A002.A02, "UploadServiceLogic-", intent.getComponent().getShortClassName(), "-service-");
                PowerManager.WakeLock newWakeLock = ((PowerManager) A002.A03.getApplicationContext().getSystemService("power")).newWakeLock(1, A07);
                0BX.A02(newWakeLock, A07);
                A002.A00 = newWakeLock;
                C60270fk.A02(newWakeLock);
                PowerManager.WakeLock wakeLock = A002.A00;
                long j = A03;
                wakeLock.acquire(j);
                0BX.A01(wakeLock, j);
                Messenger messenger = A002.A05;
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain());
                    } catch (RemoteException unused) {
                        0KC.A0D("UploadServiceLogic", "The peer died unexpectedly, possible wakelock gap detected.");
                    }
                }
                1uw r3 = A002.A06;
                String str2 = r3.A0A;
                if (str2 != null) {
                    1ss A003 = 1ss.A00(context);
                    1ss.A02(A003, str2, A003.A04);
                }
                A01(A002, r11, intent.getAction());
                return !r3.A0C ? 3 : 2;
            } catch (IllegalArgumentException e) {
                e = e;
                str = "Failure in runJobNow";
                0KC.A0H("UploadServiceLogic", str, e);
                r11.A01.stopSelf(r11.A00);
                return 2;
            } catch (C258093yS e2) {
                e = e2;
                str = "Misunderstood service intent: %s";
                0KC.A0H("UploadServiceLogic", str, e);
                r11.A01.stopSelf(r11.A00);
                return 2;
            }
        } else {
            throw new Exception("Received a null intent in runJobFromService, did you ever return START_STICKY?");
        }
    }

    public final void A05(C251443n7 r2, String str) {
        A01(r2, (C270404gg) null, str);
    }

    public static synchronized C251463n9 A00(Context context) {
        C251463n9 r0;
        synchronized (C251463n9.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new C251463n9(context);
                A02 = r0;
            }
        }
        return r0;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void A01(X.C251443n7 r7, X.C270404gg r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "com.facebook.analytics2.logger.UPLOAD_NOW"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0030
            X.3nB r3 = r6.A01
            X.0Sd.A00(r3)
            int r2 = r7.A02
            java.lang.String r1 = r7.A08
            X.1uw r0 = r7.A06
            X.3nC r5 = new X.3nC
            r5.<init>(r0, r1, r2)
        L_0x0018:
            X.3nE r1 = r7.A01
            if (r1 != 0) goto L_0x0029
            android.content.Context r0 = r7.A03
            X.1v1 r0 = X.1v1.A00(r0)
            X.3nD r1 = new X.3nD
            r1.<init>(r0, r7)
            r7.A01 = r1
        L_0x0029:
            X.3nF r4 = new X.3nF
            r4.<init>(r1, r8)
            monitor-enter(r3)
            goto L_0x005a
        L_0x0030:
            r0 = 2829(0xb0d, float:3.964E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0092
            android.os.Bundle r1 = r7.A04
            X.0Sd.A00(r1)
            java.lang.String r0 = "user_id"
            r1.getString(r0)
            X.3nB r3 = r6.A01
            X.0Sd.A00(r3)
            int r2 = r7.A02
            X.1uw r1 = r7.A06
            java.lang.String r0 = r7.A08
            X.0Sd.A00(r0)
            X.3nC r5 = new X.3nC
            r5.<init>(r1, r0, r2)
            goto L_0x0018
        L_0x005a:
            android.util.SparseArray r1 = r3.A01     // Catch:{ all -> 0x008f }
            int r0 = r5.A00     // Catch:{ all -> 0x008f }
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x008f }
            X.3nG r2 = (X.C251533nG) r2     // Catch:{ all -> 0x008f }
            monitor-enter(r3)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x006d
            X.3nJ r0 = r2.A00     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            r0 = 0
            goto L_0x0071
        L_0x006d:
            X.C251483nB.A00(r5, r4, r3)     // Catch:{ all -> 0x008c }
            r0 = 1
        L_0x0071:
            monitor-exit(r3)     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x008a
            X.0Sd.A00(r2)     // Catch:{ all -> 0x008f }
            X.41d r1 = new X.41d     // Catch:{ all -> 0x008f }
            r1.<init>(r5, r4, r3)     // Catch:{ all -> 0x008f }
            java.util.ArrayDeque r0 = r2.A01     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x0087
            java.util.ArrayDeque r0 = new java.util.ArrayDeque     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            r2.A01 = r0     // Catch:{ all -> 0x008f }
        L_0x0087:
            r0.offer(r1)     // Catch:{ all -> 0x008f }
        L_0x008a:
            monitor-exit(r3)
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0092:
            java.lang.String r0 = "Unknown action="
            java.lang.String r1 = X.002.A0R(r0, r9)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251463n9.A01(X.3n7, X.4gg, java.lang.String):void");
    }

    public final void A03(int i) {
        C251563nJ r1;
        C251483nB r2 = this.A01;
        0Sd.A00(r2);
        synchronized (r2) {
            C251533nG r0 = (C251533nG) r2.A01.get(i);
            if (!(r0 == null || (r1 = r0.A00) == null)) {
                r1.sendMessageAtFrontOfQueue(r1.obtainMessage(3));
            }
        }
    }

    public final void A04(1uw r6, C275334py r7, String str, int i) {
        boolean z;
        String str2 = r6.A0A;
        if (str2 != null) {
            1ss A002 = 1ss.A00(this.A00);
            1ss.A02(A002, str2, A002.A04);
        }
        C251483nB r4 = this.A01;
        0Sd.A00(r4);
        C251493nC r3 = new C251493nC(r6, str, i);
        C275344pz r2 = new C275344pz(r7);
        synchronized (r4) {
            C251533nG r0 = (C251533nG) r4.A01.get(r3.A00);
            if (r0 != null) {
                if (r0.A00 != null) {
                    z = false;
                }
            }
            C251483nB.A00(r3, r2, r4);
            z = true;
        }
        if (!z) {
            r7.Dzt(true);
        }
    }

    public C251463n9(Context context) {
        this.A00 = context.getApplicationContext();
        this.A01 = new C251483nB(context.getApplicationContext());
    }
}
