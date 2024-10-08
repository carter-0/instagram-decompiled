package X;

import java.io.File;
import java.util.List;

/* renamed from: X.SiG  reason: case insensitive filesystem */
public final class C11883SiG implements C13692TfA, C13695TfD {
    public int A00;
    public List A01;
    public int A02 = -1;
    public int A03;
    public C13892TjF A04;
    public C11858Shk A05;
    public File A06;
    public final C13766Tge A07;
    public final S77 A08;
    public volatile C10528Rth A09;

    public final void D7o(Object obj) {
        this.A07.D7m(this.A04, this.A05, this.A09.A01, AnonymousClass05K.A0N, obj);
    }

    public final void DOG(Exception exc) {
        this.A07.D7l(this.A05, this.A09.A01, exc, AnonymousClass05K.A0N);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.S5t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: X.S5t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.S5t} */
    /* JADX WARNING: type inference failed for: r0v49, types: [X.S5t, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean ExI() {
        /*
            r18 = this;
            r6 = r18
            X.S77 r2 = r6.A08     // Catch:{ all -> 0x01b6 }
            java.util.List r5 = r2.A02()     // Catch:{ all -> 0x01b6 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x01b6 }
            r4 = 0
            if (r0 != 0) goto L_0x01b5
            X.S7e r12 = X.C13882Tj5.A00(r2)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r0 = r2.A0A     // Catch:{ all -> 0x01b6 }
            java.lang.Class r11 = r0.getClass()     // Catch:{ all -> 0x01b6 }
            java.lang.Class r10 = r2.A08     // Catch:{ all -> 0x01b6 }
            java.lang.Class r9 = r2.A09     // Catch:{ all -> 0x01b6 }
            X.Rr7 r1 = r12.A06     // Catch:{ all -> 0x01b6 }
            java.util.concurrent.atomic.AtomicReference r7 = r1.A01     // Catch:{ all -> 0x01b6 }
            r3 = 0
            java.lang.Object r0 = r7.getAndSet(r3)     // Catch:{ all -> 0x01b6 }
            X.S5t r0 = (X.S5t) r0     // Catch:{ all -> 0x01b6 }
            if (r0 != 0) goto L_0x002f
            X.S5t r0 = new X.S5t     // Catch:{ all -> 0x01b6 }
            r0.<init>()     // Catch:{ all -> 0x01b6 }
        L_0x002f:
            r0.A00 = r11     // Catch:{ all -> 0x01b6 }
            r0.A01 = r10     // Catch:{ all -> 0x01b6 }
            r0.A02 = r9     // Catch:{ all -> 0x01b6 }
            X.0yf r8 = r1.A00     // Catch:{ all -> 0x01b6 }
            monitor-enter(r8)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r1 = r8.get(r0)     // Catch:{ all -> 0x00ce }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00ce }
            monitor-exit(r8)     // Catch:{ all -> 0x00ce }
            r7.set(r0)     // Catch:{ all -> 0x01b6 }
            if (r1 != 0) goto L_0x00d1
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01b6 }
            X.Rr2 r13 = r12.A01     // Catch:{ all -> 0x01b6 }
            monitor-enter(r13)     // Catch:{ all -> 0x01b6 }
            X.SHV r14 = r13.A01     // Catch:{ all -> 0x00cb }
            monitor-enter(r14)     // Catch:{ all -> 0x00cb }
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x00c8 }
            java.util.List r0 = r14.A02     // Catch:{ all -> 0x00c8 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x00c8 }
        L_0x0058:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x00c8 }
            X.Rti r0 = (X.C10529Rti) r0     // Catch:{ all -> 0x00c8 }
            java.lang.Class r7 = r0.A01     // Catch:{ all -> 0x00c8 }
            boolean r16 = r15.contains(r7)     // Catch:{ all -> 0x00c8 }
            if (r16 != 0) goto L_0x0058
            java.lang.Class r0 = r0.A02     // Catch:{ all -> 0x00c8 }
            boolean r0 = r0.isAssignableFrom(r11)     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0058
            r15.add(r7)     // Catch:{ all -> 0x00c8 }
            goto L_0x0058
        L_0x0078:
            monitor-exit(r14)     // Catch:{ all -> 0x00cb }
            monitor-exit(r13)     // Catch:{ all -> 0x01b6 }
            java.util.Iterator r14 = r15.iterator()     // Catch:{ all -> 0x01b6 }
        L_0x007e:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r7 = r14.next()     // Catch:{ all -> 0x01b6 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x01b6 }
            X.S12 r0 = r12.A07     // Catch:{ all -> 0x01b6 }
            java.util.ArrayList r0 = r0.A00(r7, r10)     // Catch:{ all -> 0x01b6 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x01b6 }
        L_0x0094:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r7 = r13.next()     // Catch:{ all -> 0x01b6 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x01b6 }
            X.S09 r0 = r12.A02     // Catch:{ all -> 0x01b6 }
            java.util.ArrayList r0 = r0.A00(r7, r9)     // Catch:{ all -> 0x01b6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01b6 }
            if (r0 != 0) goto L_0x0094
            X.JTR.A1S(r7, r1)     // Catch:{ all -> 0x01b6 }
            goto L_0x0094
        L_0x00b0:
            java.util.List r7 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x01b6 }
            monitor-enter(r8)     // Catch:{ all -> 0x01b6 }
            X.S5t r0 = new X.S5t     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            r0.A00 = r11     // Catch:{ all -> 0x00c5 }
            r0.A01 = r10     // Catch:{ all -> 0x00c5 }
            r0.A02 = r9     // Catch:{ all -> 0x00c5 }
            r8.put(r0, r7)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c5 }
            goto L_0x00d1
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c5 }
            goto L_0x0102
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01b6 }
            goto L_0x0102
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00ce }
            goto L_0x0102
        L_0x00d1:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x0103
            java.lang.Class<java.io.File> r1 = java.io.File.class
            java.lang.Class r0 = r2.A09     // Catch:{ all -> 0x01b6 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01b6 }
            if (r0 != 0) goto L_0x01b5
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = "Failed to find any load path from "
            r1.append(r0)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r0 = r2.A0A     // Catch:{ all -> 0x01b6 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01b6 }
            r1.append(r0)     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x01b6 }
            java.lang.Class r0 = r2.A09     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ all -> 0x01b6 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01b6 }
        L_0x0102:
            throw r0     // Catch:{ all -> 0x01b6 }
        L_0x0103:
            java.util.List r0 = r6.A01     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x0153
            int r7 = r6.A00     // Catch:{ all -> 0x01b6 }
            int r0 = r0.size()     // Catch:{ all -> 0x01b6 }
            if (r7 >= r0) goto L_0x0153
            r6.A09 = r3     // Catch:{ all -> 0x01b6 }
        L_0x0111:
            int r1 = r6.A00     // Catch:{ all -> 0x01b6 }
            java.util.List r0 = r6.A01     // Catch:{ all -> 0x01b6 }
            int r0 = r0.size()     // Catch:{ all -> 0x01b6 }
            if (r1 >= r0) goto L_0x01b5
            java.util.List r3 = r6.A01     // Catch:{ all -> 0x01b6 }
            int r1 = r6.A00     // Catch:{ all -> 0x01b6 }
            int r0 = r1 + 1
            r6.A00 = r0     // Catch:{ all -> 0x01b6 }
            java.lang.Object r7 = r3.get(r1)     // Catch:{ all -> 0x01b6 }
            X.TfG r7 = (X.C13698TfG) r7     // Catch:{ all -> 0x01b6 }
            java.io.File r5 = r6.A06     // Catch:{ all -> 0x01b6 }
            int r3 = r2.A01     // Catch:{ all -> 0x01b6 }
            int r1 = r2.A00     // Catch:{ all -> 0x01b6 }
            X.Shi r0 = r2.A05     // Catch:{ all -> 0x01b6 }
            X.Rth r0 = r7.AEZ(r0, r5, r3, r1)     // Catch:{ all -> 0x01b6 }
            r6.A09 = r0     // Catch:{ all -> 0x01b6 }
            X.Rth r0 = r6.A09     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x0111
            X.Rth r0 = r6.A09     // Catch:{ all -> 0x01b6 }
            X.Thf r0 = r0.A01     // Catch:{ all -> 0x01b6 }
            java.lang.Class r0 = r0.AvH()     // Catch:{ all -> 0x01b6 }
            X.S1c r0 = r2.A01(r0)     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x0111
            X.Rth r0 = r6.A09     // Catch:{ all -> 0x01b6 }
            X.Thf r1 = r0.A01     // Catch:{ all -> 0x01b6 }
            X.RE3 r0 = r2.A03     // Catch:{ all -> 0x01b6 }
            r1.CgB(r0, r6)     // Catch:{ all -> 0x01b6 }
            goto L_0x01b4
        L_0x0153:
            int r0 = r6.A02     // Catch:{ all -> 0x01b6 }
            int r7 = r0 + 1
            r6.A02 = r7     // Catch:{ all -> 0x01b6 }
            int r0 = r1.size()     // Catch:{ all -> 0x01b6 }
            if (r7 < r0) goto L_0x016d
            int r0 = r6.A03     // Catch:{ all -> 0x01b6 }
            int r7 = r0 + 1
            r6.A03 = r7     // Catch:{ all -> 0x01b6 }
            int r0 = r5.size()     // Catch:{ all -> 0x01b6 }
            if (r7 >= r0) goto L_0x01b5
            r6.A02 = r4     // Catch:{ all -> 0x01b6 }
        L_0x016d:
            int r0 = r6.A03     // Catch:{ all -> 0x01b6 }
            java.lang.Object r8 = r5.get(r0)     // Catch:{ all -> 0x01b6 }
            X.TjF r8 = (X.C13892TjF) r8     // Catch:{ all -> 0x01b6 }
            int r0 = r6.A02     // Catch:{ all -> 0x01b6 }
            java.lang.Object r13 = r1.get(r0)     // Catch:{ all -> 0x01b6 }
            java.lang.Class r13 = (java.lang.Class) r13     // Catch:{ all -> 0x01b6 }
            X.TlI r11 = r2.A00(r13)     // Catch:{ all -> 0x01b6 }
            X.Q6I r0 = r2.A02     // Catch:{ all -> 0x01b6 }
            X.ST0 r12 = r0.A04     // Catch:{ all -> 0x01b6 }
            X.TjF r9 = r2.A04     // Catch:{ all -> 0x01b6 }
            int r14 = r2.A01     // Catch:{ all -> 0x01b6 }
            int r15 = r2.A00     // Catch:{ all -> 0x01b6 }
            X.Shi r10 = r2.A05     // Catch:{ all -> 0x01b6 }
            X.Shk r7 = new X.Shk     // Catch:{ all -> 0x01b6 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01b6 }
            r6.A05 = r7     // Catch:{ all -> 0x01b6 }
            X.S10 r0 = r2.A07     // Catch:{ all -> 0x01b6 }
            X.TfE r7 = r0.A00()     // Catch:{ all -> 0x01b6 }
            X.Shk r0 = r6.A05     // Catch:{ all -> 0x01b6 }
            java.io.File r7 = r7.AXD(r0)     // Catch:{ all -> 0x01b6 }
            r6.A06 = r7     // Catch:{ all -> 0x01b6 }
            if (r7 == 0) goto L_0x0103
            r6.A04 = r8     // Catch:{ all -> 0x01b6 }
            X.S7e r0 = X.C13882Tj5.A00(r2)     // Catch:{ all -> 0x01b6 }
            java.util.List r0 = r0.A02(r7)     // Catch:{ all -> 0x01b6 }
            r6.A01 = r0     // Catch:{ all -> 0x01b6 }
            r6.A00 = r4     // Catch:{ all -> 0x01b6 }
            goto L_0x0103
        L_0x01b4:
            r4 = 1
        L_0x01b5:
            return r4
        L_0x01b6:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11883SiG.ExI():boolean");
    }

    public final void cancel() {
        C10528Rth rth = this.A09;
        if (rth != null) {
            rth.A01.cancel();
        }
    }

    public C11883SiG(C13766Tge tge, S77 s77) {
        this.A08 = s77;
        this.A07 = tge;
    }
}
