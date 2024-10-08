package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.49k  reason: invalid class name and case insensitive filesystem */
public final class C2613949k extends C71642eY {
    public WeakReference A00 = new WeakReference((Object) null);
    public boolean A01;
    public final C229932oe A02 = new C229932oe();
    public final AnonymousClass49X A03;
    public final String A04;
    public final WeakHashMap A05 = new WeakHashMap();
    public final AnonymousClass0eK A06;
    public final AnonymousClass0eK A07;

    private final synchronized void A00(JR0 jr0, boolean z) {
        AnonymousClass2hP BWQ = jr0.BWQ();
        if (BWQ != null) {
            2el.A02((1yC) null, (2el) this.A07.get(), BWQ);
            if (z) {
                this.A05.remove(jr0);
            }
        }
    }

    public final synchronized void A03() {
        WeakHashMap weakHashMap = this.A05;
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Object key = ((Map.Entry) it.next()).getKey();
            0qQ.A07(key);
            A00((JR0) key, false);
            it.remove();
        }
        weakHashMap.clear();
    }

    public final synchronized void A05(JR0 jr0) {
        if (this.A05.containsKey(jr0)) {
            A00(jr0, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        if (r27 != false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A04(X.C55513Hiv r22, X.JQQ r23, X.C2614249n r24, X.JR0 r25, X.0sL r26, boolean r27) {
        /*
            r21 = this;
            r2 = r21
            monitor-enter(r2)
            r5 = 0
            r1 = 1
            r4 = r25
            X.2hP r0 = r4.BWQ()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0133
            if (r27 != 0) goto L_0x0029
            java.util.WeakHashMap r3 = r2.A05     // Catch:{ all -> 0x0135 }
            boolean r0 = r3.containsKey(r4)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0029
            r2.A05(r4)     // Catch:{ all -> 0x0131 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.A01     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x0029
            r2.A01 = r5     // Catch:{ all -> 0x0122 }
            r2.A02()     // Catch:{ all -> 0x0122 }
        L_0x0029:
            X.0eK r6 = r2.A06     // Catch:{ all -> 0x0131 }
            java.lang.Object r7 = r6.get()     // Catch:{ all -> 0x0131 }
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ all -> 0x0131 }
            if (r7 == 0) goto L_0x0124
            java.lang.ref.WeakReference r0 = r2.A00     // Catch:{ all -> 0x0131 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0131 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0131 }
            if (r0 != 0) goto L_0x0069
            r2.A03()     // Catch:{ all -> 0x0131 }
            android.view.View r5 = X.C296515qB.A00(r7)     // Catch:{ all -> 0x0131 }
            if (r5 != 0) goto L_0x0051
            java.lang.String r1 = r2.A04     // Catch:{ all -> 0x0131 }
            java.lang.String r0 = "valid container unavailable"
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x0131 }
            goto L_0x012b
        L_0x0051:
            X.0eK r0 = r2.A07     // Catch:{ all -> 0x0131 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0131 }
            X.2el r3 = (X.2el) r3     // Catch:{ all -> 0x0131 }
            X.ToT r0 = X.C14027ToT.A00     // Catch:{ all -> 0x0131 }
            X.2eo[] r0 = new X.AnonymousClass2eo[]{r0}     // Catch:{ all -> 0x0131 }
            r3.A07(r5, r2, r0)     // Catch:{ all -> 0x0131 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0131 }
            r0.<init>(r7)     // Catch:{ all -> 0x0131 }
            r2.A00 = r0     // Catch:{ all -> 0x0131 }
        L_0x0069:
            java.lang.String r5 = r4.Apg()     // Catch:{ all -> 0x0131 }
            X.49S r12 = r4.Apm()     // Catch:{ all -> 0x0131 }
            X.2hP r3 = r4.BWQ()     // Catch:{ all -> 0x0131 }
            if (r3 == 0) goto L_0x0112
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0131 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0131 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r3 = r2.A04     // Catch:{ all -> 0x0131 }
            java.lang.String r0 = "active activity unavailable"
            X.0KC.A0C(r3, r0)     // Catch:{ all -> 0x0131 }
            goto L_0x0112
        L_0x0088:
            X.HjO r14 = new X.HjO     // Catch:{ all -> 0x0131 }
            r0 = r23
            r14.<init>(r0)     // Catch:{ all -> 0x0131 }
            X.HjN r13 = new X.HjN     // Catch:{ all -> 0x0131 }
            r0 = r22
            r13.<init>(r0)     // Catch:{ all -> 0x0131 }
            java.lang.String r15 = r4.getModuleName()     // Catch:{ all -> 0x0131 }
            java.lang.String r16 = r4.BRt()     // Catch:{ all -> 0x0131 }
            X.49X r11 = r2.A03     // Catch:{ all -> 0x0131 }
            java.lang.Integer r6 = r12.A03     // Catch:{ all -> 0x0131 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0131 }
            if (r6 == r0) goto L_0x00aa
            r18 = 0
            if (r27 == 0) goto L_0x00ac
        L_0x00aa:
            r18 = 1
        L_0x00ac:
            r19 = 0
            if (r6 != r0) goto L_0x00b2
            r19 = 1
        L_0x00b2:
            X.49T r0 = r12.A01     // Catch:{ all -> 0x0131 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0131 }
            X.GO8 r10 = new X.GO8     // Catch:{ all -> 0x0131 }
            r17 = r26
            r20 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0131 }
            X.30Y r0 = X.AnonymousClass30Y.A07     // Catch:{ all -> 0x0131 }
            X.30a r0 = new X.30a     // Catch:{ all -> 0x0131 }
            r9 = r24
            r0.<init>(r4, r9, r5)     // Catch:{ all -> 0x0131 }
            r0.A00(r10)     // Catch:{ all -> 0x0131 }
            X.30Y r6 = r0.A01()     // Catch:{ all -> 0x0131 }
            if (r27 == 0) goto L_0x00fd
            java.lang.String r8 = r4.B9x()     // Catch:{ all -> 0x0131 }
            X.2oe r7 = r2.A02     // Catch:{ all -> 0x0131 }
            X.30Y r6 = r7.A00(r8)     // Catch:{ all -> 0x0131 }
            X.30Y r0 = X.AnonymousClass30Y.A07     // Catch:{ all -> 0x0131 }
            boolean r0 = X.0qQ.A0K(r6, r0)     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x00f2
            X.30a r0 = new X.30a     // Catch:{ all -> 0x0131 }
            r0.<init>(r4, r9, r8)     // Catch:{ all -> 0x0131 }
            r0.A00(r10)     // Catch:{ all -> 0x0131 }
            X.30Y r6 = r0.A01()     // Catch:{ all -> 0x0131 }
            r7.A01(r6, r8)     // Catch:{ all -> 0x0131 }
        L_0x00f2:
            X.30a r0 = new X.30a     // Catch:{ all -> 0x0131 }
            r0.<init>(r4, r9, r5)     // Catch:{ all -> 0x0131 }
            r0.A00 = r6     // Catch:{ all -> 0x0131 }
            X.30Y r6 = r0.A01()     // Catch:{ all -> 0x0131 }
        L_0x00fd:
            X.0eK r0 = r2.A07     // Catch:{ all -> 0x0131 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x0131 }
            X.2el r5 = (X.2el) r5     // Catch:{ all -> 0x0131 }
            r0 = 0
            X.2el.A01(r0, r6, r5, r3)     // Catch:{ all -> 0x0131 }
            java.util.WeakHashMap r3 = r2.A05     // Catch:{ all -> 0x0131 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0131 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0131 }
        L_0x0112:
            java.util.WeakHashMap r0 = r2.A05     // Catch:{ all -> 0x0122 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0122 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0133
            r2.A01 = r1     // Catch:{ all -> 0x0131 }
            r2.A01()     // Catch:{ all -> 0x0131 }
            goto L_0x0133
        L_0x0122:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0131 }
        L_0x0124:
            java.lang.String r1 = r2.A04     // Catch:{ all -> 0x0131 }
            java.lang.String r0 = "active activity unavailable"
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x0131 }
        L_0x012b:
            java.lang.String r0 = "unable to watch activity"
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x0135 }
            goto L_0x0133
        L_0x0131:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x0133:
            monitor-exit(r2)
            return
        L_0x0135:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2613949k.A04(X.Hiv, X.JQQ, X.49n, X.JR0, X.0sL, boolean):void");
    }

    public C2613949k(AnonymousClass49X r3, AnonymousClass0eK r4, AnonymousClass0eK r5) {
        this.A03 = r3;
        this.A06 = r4;
        this.A07 = r5;
        String name = C2613949k.class.getName();
        0qQ.A07(name);
        this.A04 = name;
    }
}
