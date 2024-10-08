package X;

/* renamed from: X.6L9  reason: invalid class name */
public final class AnonymousClass6L9 {
    public String A00 = "";
    public final C17850Vh3 A01;

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.X2R] */
    /* JADX WARNING: type inference failed for: r12v2, types: [X.WIB, java.lang.Object, X.X2Q] */
    /* JADX WARNING: type inference failed for: r15v0, types: [X.WIA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v45, types: [java.lang.Object, X.X2Q] */
    /* JADX WARNING: type inference failed for: r0v47, types: [java.lang.Object, X.X2Q] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0101, code lost:
        if (r12 == false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6L9(X.GZ0 r23, X.AnonymousClass59P r24) {
        /*
            r22 = this;
            r2 = r22
            r2.<init>()
            java.lang.String r0 = ""
            r2.A00 = r0
            r1 = r23
            java.util.Map r0 = r1.A04
            r21 = r0
            boolean r0 = r21.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0023
            java.util.Set r0 = r21.keySet()
            java.lang.Object r0 = X.00k.A09(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A00 = r0
        L_0x0023:
            X.2gu r0 = r1.A00
            r6 = 0
            X.Vh3 r3 = new X.Vh3
            r3.<init>(r0)
            java.util.Collection r0 = r21.values()
            java.util.List r19 = X.00k.A0a(r0)
            int r18 = r19.size()
            r5 = 0
        L_0x0038:
            r0 = r18
            if (r5 >= r0) goto L_0x016e
            r0 = r19
            java.lang.Object r10 = r0.get(r5)
            X.Hps r10 = (X.C55930Hps) r10
            r8 = 0
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Map r0 = r10.A01
            java.util.Collection r0 = r0.values()
            java.util.Iterator r17 = r0.iterator()
        L_0x0054:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0145
            java.lang.Object r11 = r17.next()
            X.Hpt r11 = (X.C55931Hpt) r11
            X.0qQ.A0A(r11)
            java.lang.String r0 = r10.A00
            r20 = r0
            X.0qQ.A07(r20)
            java.lang.String r0 = r11.A01
            X.WIL r4 = new X.WIL
            r4.<init>(r0)
            X.VgU r9 = new X.VgU
            r9.<init>(r3)
            com.google.common.collect.ImmutableList r0 = r11.A00
            X.3kO r16 = r0.iterator()
            X.0qQ.A07(r16)
            r14 = 1
        L_0x0080:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r1 = r16.next()
            X.X0r r1 = (X.C20842X0r) r1
            boolean r0 = r1 instanceof X.WKL
            if (r0 == 0) goto L_0x00c3
            r4 = r1
            X.WKL r4 = (X.WKL) r4
            X.WIC r0 = new X.WIC
            r0.<init>()
            r9.A00(r0, r6)
            float r12 = r4.A01
            float r4 = r4.A00
            X.WIH r0 = new X.WIH
            r0.<init>(r12, r4)
            r9.A00(r0, r6)
            X.WID r0 = new X.WID
            r0.<init>()
            r9.A00(r0, r6)
            java.lang.String r4 = r11.A01
            X.WIL r0 = new X.WIL
            r0.<init>(r4)
            r7.put(r0, r9)
            X.VgU r9 = new X.VgU
            r9.<init>(r3)
            X.WIJ r4 = new X.WIJ
            r4.<init>()
        L_0x00c3:
            boolean r0 = r1 instanceof X.WKJ
            if (r0 == 0) goto L_0x0106
            X.WIB r12 = new X.WIB
            r12.<init>()
            r0 = r20
            r12.A00 = r0
            r9.A00(r12, r6)
            r0 = r1
            X.WKJ r0 = (X.WKJ) r0
            java.lang.String r14 = r0.A00
            X.WIA r15 = new X.WIA
            r15.<init>()
            if (r14 == 0) goto L_0x015e
            r15.A00 = r14
            java.lang.String r12 = "on_entry"
            X.WIL r13 = new X.WIL
            r13.<init>(r12)
            X.WII r0 = new X.WII
            r0.<init>(r15, r13)
            r9.A00(r0, r6)
            r0 = r21
            java.lang.Object r0 = r0.get(r14)
            X.Hps r0 = (X.C55930Hps) r0
            if (r0 == 0) goto L_0x0103
            java.util.Map r0 = r0.A01
            boolean r12 = r0.containsKey(r12)
            r0 = 1
            if (r12 != 0) goto L_0x0104
        L_0x0103:
            r0 = 0
        L_0x0104:
            r14 = r0 ^ 1
        L_0x0106:
            boolean r0 = r1 instanceof X.WKK
            if (r0 == 0) goto L_0x0080
            X.WKK r1 = (X.WKK) r1
            X.V3K r12 = r1.A00
            boolean r0 = r12 instanceof X.UU2
            if (r0 == 0) goto L_0x0080
            java.lang.String r13 = r12.A01
            java.lang.String r0 = "opacity"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0080
            X.UU2 r12 = (X.UU2) r12
            java.lang.String r1 = r1.A01
            X.WIE r0 = new X.WIE
            r0.<init>(r1)
            X.WIG r1 = new X.WIG
            r1.<init>(r0)
            X.VLm r0 = new X.VLm
            r0.<init>(r12)
            r9.A00(r1, r0)
            goto L_0x0080
        L_0x0134:
            if (r14 == 0) goto L_0x0140
            X.WIF r0 = new X.WIF
            r1 = r24
            r0.<init>(r1)
            r9.A00(r0, r6)
        L_0x0140:
            r7.put(r4, r9)
            goto L_0x0054
        L_0x0145:
            if (r5 != 0) goto L_0x0148
            r8 = 1
        L_0x0148:
            java.lang.String r4 = r10.A00
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0166
            X.VUl r1 = new X.VUl
            r1.<init>(r3, r7, r8)
            java.util.Map r0 = r3.A03
            r0.put(r4, r1)
            int r5 = r5 + 1
            goto L_0x0038
        L_0x015e:
            java.lang.String r1 = "non-null group identifier required"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0166:
            java.lang.String r1 = "No interactions in interaction group"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x016e:
            X.VQp r0 = r3.A01
            java.util.Set r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0176:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0186
            java.lang.Object r0 = r1.next()
            X.Vix r0 = (X.C17963Vix) r0
            r0.A00()
            goto L_0x0176
        L_0x0186:
            X.Vix r1 = r3.A02
            X.WIK r0 = new X.WIK
            r0.<init>()
            r1.A01(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6L9.<init>(X.GZ0, X.59P):void");
    }
}
