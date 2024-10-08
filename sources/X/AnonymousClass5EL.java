package X;

/* renamed from: X.5EL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5EL implements C264954Ry {
    public final /* synthetic */ AnonymousClass5EJ A00;
    public final /* synthetic */ Object A01;

    public /* synthetic */ AnonymousClass5EL(AnonymousClass5EJ r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.RCU, java.io.IOException] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r15 != r6.A01.A0E(r13, 0, 0).A02) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dlq(com.google.android.exoplayer2.Timeline r18, X.C265164Su r19) {
        /*
            r17 = this;
            r0 = r17
            X.5EJ r6 = r0.A00
            java.lang.Object r4 = r0.A01
            boolean r0 = r6 instanceof X.AnonymousClass5EI
            r11 = r18
            if (r0 == 0) goto L_0x00dd
            X.5EI r6 = (X.AnonymousClass5EI) r6
            boolean r0 = r6 instanceof X.AnonymousClass5EH
            if (r0 == 0) goto L_0x001c
            X.5EH r6 = (X.AnonymousClass5EH) r6
            X.5HW r0 = r6.A00
            if (r0 != 0) goto L_0x001b
            X.AnonymousClass5EH.A00(r11, r6)
        L_0x001b:
            return
        L_0x001c:
            X.5EK r6 = (X.AnonymousClass5EK) r6
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x004e
            X.5EQ r0 = r6.A01
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A00
            X.5EQ r0 = new X.5EQ
            r0.<init>(r11, r2, r1)
            r6.A01 = r0
            X.5Nh r0 = r6.A00
            if (r0 == 0) goto L_0x0038
            long r0 = r0.A00
            X.AnonymousClass5EK.A00(r6, r0)
        L_0x0038:
            r1 = 0
        L_0x0039:
            r0 = 1
            r6.A02 = r0
            r6.A04 = r0
            X.5EQ r0 = r6.A01
            r6.A0C(r0)
            if (r1 == 0) goto L_0x001b
            X.5Nh r0 = r6.A00
            r0.getClass()
            r0.A00(r1)
            return
        L_0x004e:
            int r0 = r11.A02()
            if (r0 != 0) goto L_0x006b
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0066
            X.5EQ r0 = r6.A01
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A00
        L_0x005e:
            X.5EQ r0 = new X.5EQ
            r0.<init>(r11, r2, r1)
            r6.A01 = r0
            goto L_0x0038
        L_0x0066:
            java.lang.Object r2 = X.AnonymousClass4RE.A0H
            java.lang.Object r1 = X.AnonymousClass5EQ.A02
            goto L_0x005e
        L_0x006b:
            X.4RE r13 = r6.A06
            r14 = 0
            r0 = 0
            r11.A0E(r13, r14, r0)
            long r4 = r13.A02
            java.lang.Object r7 = r13.A0C
            X.5Nh r8 = r6.A00
            if (r8 == 0) goto L_0x00db
            long r2 = r8.A04
            X.5EQ r10 = r6.A01
            X.4Rq r8 = r8.A05
            java.lang.Object r9 = r8.A04
            X.4Rc r8 = r6.A05
            r10.A0B(r8, r9)
            long r15 = r8.A02
            long r15 = r15 + r2
            X.5EQ r2 = r6.A01
            X.4RE r0 = r2.A0E(r13, r14, r0)
            long r0 = r0.A02
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00db
        L_0x0097:
            X.4Rc r12 = r6.A05
            android.util.Pair r0 = r11.A09(r12, r13, r14, r15)
            java.lang.Object r3 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x00b1
            X.5EQ r0 = r6.A01
            java.lang.Object r7 = r0.A01
            java.lang.Object r3 = r0.A00
        L_0x00b1:
            X.5EQ r0 = new X.5EQ
            r0.<init>(r11, r7, r3)
            r6.A01 = r0
            X.5Nh r0 = r6.A00
            if (r0 == 0) goto L_0x0038
            X.AnonymousClass5EK.A00(r6, r1)
            X.4Rq r2 = r0.A05
            java.lang.Object r1 = r2.A04
            X.5EQ r0 = r6.A01
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = X.AnonymousClass5EQ.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d5
            X.5EQ r0 = r6.A01
            java.lang.Object r1 = r0.A00
        L_0x00d5:
            X.4Rq r1 = r2.A00(r1)
            goto L_0x0039
        L_0x00db:
            r15 = r4
            goto L_0x0097
        L_0x00dd:
            X.5pC r6 = (X.C295965pC) r6
            java.lang.Number r4 = (java.lang.Number) r4
            X.RCU r0 = r6.A01
            if (r0 != 0) goto L_0x001b
            int r2 = r6.A00
            r0 = -1
            r5 = 0
            int r1 = r11.A01()
            if (r2 != r0) goto L_0x0127
            r6.A00 = r1
            r0 = r1
        L_0x00f2:
            long[][] r1 = r6.A02
            int r1 = r1.length
            if (r1 != 0) goto L_0x010c
            com.google.android.exoplayer2.Timeline[] r1 = r6.A07
            int r3 = r1.length
            r1 = 2
            int[] r2 = new int[r1]
            r1 = 1
            r2[r1] = r3
            r2[r5] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            long[][] r0 = (long[][]) r0
            r6.A02 = r0
        L_0x010c:
            java.util.ArrayList r2 = r6.A05
            r0 = r19
            r2.remove(r0)
            com.google.android.exoplayer2.Timeline[] r1 = r6.A07
            int r0 = r4.intValue()
            r1[r0] = r18
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x001b
            r0 = r1[r5]
            r6.A0C(r0)
            return
        L_0x0127:
            int r0 = r6.A00
            if (r1 == r0) goto L_0x00f2
            X.RCU r0 = new X.RCU
            r0.<init>()
            r6.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5EL.Dlq(com.google.android.exoplayer2.Timeline, X.4Su):void");
    }
}
