package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8di  reason: invalid class name and case insensitive filesystem */
public abstract class C359928di {
    public final C359808dW A00;
    public final C359708dM A01;
    public final C359908dg A02;
    public final C359888de A03;

    public static void A01(C359928di r6) {
        int intValue;
        ArrayList arrayList;
        C375959Fx r1 = C375959Fx.A03;
        String A012 = r6.A01.A01();
        synchronized (r1.A01) {
            intValue = ((Integer) r1.A00.getOrDefault(A012, 0)).intValue();
        }
        if (intValue <= 0) {
            List list = r6.A02.A01;
            if (list == null || list.isEmpty()) {
                C359808dW r2 = r6.A00;
                synchronized (r2) {
                    arrayList = new ArrayList(r2.A01);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C359928di r5 = (C359928di) it.next();
                    if (r5 != null) {
                        C359918dh r52 = (C359918dh) r5;
                        if (r52.A02.compareAndSet(true, false)) {
                            C359898df r3 = r52.A01;
                            C359888de r22 = r3.A02;
                            if (!r22.CYP()) {
                                r22.E3G(new C40751Aih(r3), "Emitter_onDetach");
                            }
                        }
                        C359898df r32 = r52.A01;
                        C359888de r23 = r32.A02;
                        if (r23.CYP()) {
                            C359898df.A01(r52, r32);
                        } else {
                            r23.E3G(new C40971AmH(r52, r32), "Emitter_unsubscribe");
                        }
                        C359908dg r33 = r52.A00;
                        synchronized (r33) {
                            r33.A00 = null;
                        }
                        C359888de r24 = r33.A02;
                        if (r24.CYP()) {
                            List list2 = r33.A01;
                            if (list2 != null) {
                                list2.clear();
                            }
                        } else {
                            r24.E3G(new C40750Aig(r33), "DataSynchronizer_removeAllDataObserver");
                        }
                    }
                }
            }
        }
    }

    public final void A02() {
        C359888de r2 = this.A03;
        if (r2.CYP()) {
            A01(this);
        } else {
            r2.E3G(new C40749Aif(this), "CleanupDelegateData_destroyData");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r6 == 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r20) {
        /*
            r19 = this;
            r10 = r19
            X.8dh r10 = (X.C359918dh) r10
            r9 = 0
            r0 = 1
            r1 = r20
            if (r20 == 0) goto L_0x0093
            if (r1 == r0) goto L_0x0096
            r12 = 2
            if (r1 != r12) goto L_0x0096
            X.8dg r8 = r10.A00
            monitor-enter(r8)
            java.lang.Object r11 = r8.A00     // Catch:{ all -> 0x0090 }
            monitor-exit(r8)
            X.8df r7 = r10.A01
            X.8da r3 = r7.A01
            boolean r0 = r3 instanceof X.C359838dZ
            if (r0 == 0) goto L_0x007a
            X.8dZ r3 = (X.C359838dZ) r3
            java.util.concurrent.atomic.AtomicReference r0 = r3.A06
            java.lang.Object r0 = r0.get()
            r6 = 1
            if (r0 != 0) goto L_0x0032
            X.8dY r1 = r3.A02
            X.0lg r0 = r1.A04
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = r1.A05
            if (r0 != 0) goto L_0x003d
        L_0x0032:
            r0 = 3
            if (r6 == r12) goto L_0x0038
            r1 = 0
            if (r6 != r0) goto L_0x0087
        L_0x0038:
            r1 = 1
            if (r6 != r0) goto L_0x0087
            monitor-enter(r8)
            goto L_0x007c
        L_0x003d:
            java.util.concurrent.atomic.AtomicReference r0 = r3.A05
            java.lang.Object r2 = r0.get()
            X.8dr r2 = (X.C360018dr) r2
            boolean r0 = r2 instanceof X.C361128fi
            if (r0 == 0) goto L_0x0078
            X.8fh r0 = r2.A00
            X.8fg r0 = r0.A01
            long r4 = r0.A03
            X.0JR r0 = r3.A01
            long r17 = r0.now()
            long r2 = r1.A03
            long r0 = r1.A02
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r14.toMillis(r0)
            long r15 = r4 + r0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r13 = 0
            if (r0 > 0) goto L_0x0067
            r13 = 1
        L_0x0067:
            long r0 = r14.toMillis(r2)
            long r4 = r4 + r0
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0072
            r0 = 1
        L_0x0072:
            if (r13 == 0) goto L_0x0078
            if (r0 == 0) goto L_0x0032
            r6 = 2
            goto L_0x0032
        L_0x0078:
            r6 = 3
            goto L_0x0032
        L_0x007a:
            r6 = 1
            goto L_0x0032
        L_0x007c:
            java.lang.Object r0 = r8.A00     // Catch:{ all -> 0x0090 }
            if (r0 != r11) goto L_0x0086
            r0 = 0
            r8.A00 = r0     // Catch:{ all -> 0x0084 }
            goto L_0x0086
        L_0x0084:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x0086:
            monitor-exit(r8)
        L_0x0087:
            X.C359918dh.A00(r10)
            if (r1 == 0) goto L_0x009b
            r7.A03(r9)
            return
        L_0x0090:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0093:
            X.C359918dh.A00(r10)
        L_0x0096:
            X.8df r0 = r10.A01
            r0.A03(r1)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359928di.A03(int):void");
    }

    public C359928di(C359808dW r2, C359908dg r3, C359888de r4) {
        synchronized (r2) {
            r2.A01.add(this);
        }
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2.A00;
    }
}
