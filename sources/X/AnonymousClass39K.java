package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.39K  reason: invalid class name */
public final class AnonymousClass39K implements AnonymousClass39L {
    public static final String A0B = AnonymousClass389.A01("Processor");
    public Context A00;
    public PowerManager.WakeLock A01 = null;
    public WorkDatabase A02;
    public AnonymousClass38N A03;
    public Map A04 = new HashMap();
    public Map A05 = new HashMap();
    public Map A06 = new HashMap();
    public Set A07 = new HashSet();
    public AnonymousClass38C A08;
    public final Object A09 = new Object();
    public final List A0A = new ArrayList();

    public static C282905Ff A00(AnonymousClass39K r5, String str) {
        Map map = r5.A05;
        C282905Ff r4 = (C282905Ff) map.remove(str);
        boolean z = true;
        if (r4 == null) {
            z = false;
            r4 = (C282905Ff) r5.A04.remove(str);
        }
        r5.A06.remove(str);
        if (!z) {
            return r4;
        }
        synchronized (r5.A09) {
            if (!(!map.isEmpty())) {
                Context context = r5.A00;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    context.startService(intent);
                } catch (Throwable th) {
                    AnonymousClass389.A00();
                    Log.e(A0B, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = r5.A01;
                if (wakeLock != null) {
                    C60270fk.A01(wakeLock);
                    r5.A01 = null;
                }
            }
        }
        return r4;
    }

    public static void A01(C282905Ff r2, int i) {
        if (r2 != null) {
            r2.A0H = i;
            C282905Ff.A01(r2);
            C2379539x r1 = r2.A0F;
            r1.cancel(true);
            if (r2.A03 == null || !r1.isCancelled()) {
                AnonymousClass389.A00();
            } else {
                r2.A03.stop(i);
            }
        }
        AnonymousClass389.A00();
    }

    public final void A02(AnonymousClass39S r3) {
        synchronized (this.A09) {
            this.A0A.add(r3);
        }
    }

    public final void A03(AnonymousClass39S r3) {
        synchronized (this.A09) {
            this.A0A.remove(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C282915Fg r16, X.C2805352f r17) {
        /*
            r15 = this;
            r4 = r17
            X.3u1 r5 = r4.A00
            java.lang.String r3 = r5.A01
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r11 = r15
            androidx.work.impl.WorkDatabase r10 = r15.A02
            X.5Fb r0 = new X.5Fb
            r0.<init>(r15, r3, r14)
            java.lang.Object r12 = r10.runInTransaction((java.util.concurrent.Callable) r0)
            X.3DG r12 = (X.AnonymousClass3DG) r12
            r6 = 0
            if (r12 != 0) goto L_0x0044
            X.AnonymousClass389.A00()
            java.lang.String r2 = A0B
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Didn't find WorkSpec for id "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
            X.38N r0 = r15.A03
            X.38M r0 = (X.AnonymousClass38M) r0
            java.util.concurrent.Executor r1 = r0.A02
            X.TEp r0 = new X.TEp
            r0.<init>(r15, r5)
            r1.execute(r0)
            return r6
        L_0x0044:
            java.lang.Object r2 = r15.A09
            monitor-enter(r2)
            boolean r0 = r15.A05(r3)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x006f
            java.util.Map r0 = r15.A06     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x00c9 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x00c9 }
            X.52f r0 = (X.C2805352f) r0     // Catch:{ all -> 0x00c9 }
            X.3u1 r0 = r0.A00     // Catch:{ all -> 0x00c9 }
            int r1 = r0.A00     // Catch:{ all -> 0x00c9 }
            int r0 = r5.A00     // Catch:{ all -> 0x00c9 }
            if (r1 != r0) goto L_0x0087
            r3.add(r4)     // Catch:{ all -> 0x00c9 }
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x00c9 }
        L_0x006d:
            monitor-exit(r2)     // Catch:{ all -> 0x00c9 }
            goto L_0x0096
        L_0x006f:
            int r1 = r12.A0K     // Catch:{ all -> 0x00c9 }
            int r0 = r5.A00     // Catch:{ all -> 0x00c9 }
            if (r1 != r0) goto L_0x0087
            android.content.Context r0 = r15.A00     // Catch:{ all -> 0x00c9 }
            X.38C r8 = r15.A08     // Catch:{ all -> 0x00c9 }
            X.38N r13 = r15.A03     // Catch:{ all -> 0x00c9 }
            X.5Fg r9 = new X.5Fg     // Catch:{ all -> 0x00c9 }
            r9.<init>()     // Catch:{ all -> 0x00c9 }
            android.content.Context r7 = r0.getApplicationContext()     // Catch:{ all -> 0x00c9 }
            if (r16 == 0) goto L_0x0099
            goto L_0x0097
        L_0x0087:
            X.38N r0 = r15.A03     // Catch:{ all -> 0x00c9 }
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x00c9 }
            java.util.concurrent.Executor r1 = r0.A02     // Catch:{ all -> 0x00c9 }
            X.TEp r0 = new X.TEp     // Catch:{ all -> 0x00c9 }
            r0.<init>(r15, r5)     // Catch:{ all -> 0x00c9 }
            r1.execute(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x006d
        L_0x0096:
            return r6
        L_0x0097:
            r9 = r16
        L_0x0099:
            X.5Ff r6 = new X.5Ff     // Catch:{ all -> 0x00c9 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00c9 }
            X.39x r5 = r6.A0A     // Catch:{ all -> 0x00c9 }
            X.5Fl r1 = new X.5Fl     // Catch:{ all -> 0x00c9 }
            r1.<init>(r15, r6, r5)     // Catch:{ all -> 0x00c9 }
            X.38M r13 = (X.AnonymousClass38M) r13     // Catch:{ all -> 0x00c9 }
            java.util.concurrent.Executor r0 = r13.A02     // Catch:{ all -> 0x00c9 }
            r5.addListener(r1, r0)     // Catch:{ all -> 0x00c9 }
            java.util.Map r0 = r15.A04     // Catch:{ all -> 0x00c9 }
            r0.put(r3, r6)     // Catch:{ all -> 0x00c9 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            r1.add(r4)     // Catch:{ all -> 0x00c9 }
            java.util.Map r0 = r15.A06     // Catch:{ all -> 0x00c9 }
            r0.put(r3, r1)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r2)     // Catch:{ all -> 0x00c9 }
            X.38P r0 = r13.A01
            r0.execute(r6)
            X.AnonymousClass389.A00()
            r0 = 1
            return r0
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39K.A04(X.5Fg, X.52f):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (((X.C282905Ff) r3.A04.get(r4)) != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A09
            monitor-enter(r2)
            java.util.Map r0 = r3.A05     // Catch:{ all -> 0x001b }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x001b }
            X.5Ff r0 = (X.C282905Ff) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0018
            java.util.Map r0 = r3.A04     // Catch:{ all -> 0x001b }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x001b }
            X.5Ff r1 = (X.C282905Ff) r1     // Catch:{ all -> 0x001b }
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39K.A05(java.lang.String):boolean");
    }

    public AnonymousClass39K(Context context, AnonymousClass38C r3, WorkDatabase workDatabase, AnonymousClass38N r5) {
        this.A00 = context;
        this.A08 = r3;
        this.A03 = r5;
        this.A02 = workDatabase;
    }
}
