package X;

/* renamed from: X.8A7  reason: invalid class name */
public final class AnonymousClass8A7 implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8A0 A00;

    public AnonymousClass8A7(AnonymousClass8A0 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v6, types: [X.Awb] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r21
            X.8YP r1 = (X.AnonymousClass8YP) r1
            r0 = r20
            X.8A0 r12 = r0.A00
            X.0qQ.A0A(r1)
            boolean r0 = r1 instanceof X.AnonymousClass8YV
            if (r0 == 0) goto L_0x008b
            X.8YV r1 = (X.AnonymousClass8YV) r1
            X.51M r14 = r1.A01
            X.0sL r5 = r1.A02
            X.89v r13 = r1.A00
            r6 = 0
            X.9Km r0 = new X.9Km
            r0.<init>(r13, r6)
            java.lang.Object r15 = r0.invoke(r14)
            java.lang.String r15 = (java.lang.String) r15
            X.89w r2 = r12.A03
            java.util.HashMap r1 = r2.A09
            java.lang.Object r0 = r1.get(r15)
            if (r0 != 0) goto L_0x0035
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r15, r0)
        L_0x0035:
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r5)
            r0 = 7
            X.J74 r4 = new X.J74
            r4.<init>(r15, r12, r0)
            X.0sP r0 = r13.A05
            java.lang.Object r0 = r0.invoke(r14)
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            X.0qQ.A0B(r14, r6)
            int r0 = r14.A09
            float r1 = (float) r0
            float r0 = r14.A00
            float r0 = java.lang.Math.abs(r0)
            float r1 = r1 * r0
            int r7 = (int) r1
            r3 = 0
        L_0x005b:
            if (r3 >= r8) goto L_0x0238
            X.0sL r10 = r13.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r10.invoke(r0, r14)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r9 = r3 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r10.invoke(r0, r14)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r1 - r7
            int r1 = java.lang.Math.abs(r1)
            int r0 = r0 - r7
            int r0 = java.lang.Math.abs(r0)
            if (r1 <= r0) goto L_0x023a
            r3 = r9
            goto L_0x005b
        L_0x008b:
            boolean r0 = r1 instanceof X.AnonymousClass8YW
            if (r0 == 0) goto L_0x00c4
            X.8YW r1 = (X.AnonymousClass8YW) r1
            X.51M r6 = r1.A00
            boolean r0 = X.AnonymousClass51Q.A05(r6)
            if (r0 != 0) goto L_0x025e
            java.util.TreeSet r5 = r12.A04
            java.util.Iterator r4 = r5.iterator()
        L_0x009f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x025e
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.A9g r2 = (X.C39786A9g) r2
            X.9tv r1 = r2.A00
            X.9nh r0 = X.C388359nh.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x009f
            X.51M r0 = r2.A01
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x009f
            if (r3 == 0) goto L_0x025e
            r5.remove(r3)
            return
        L_0x00c4:
            boolean r0 = r1 instanceof X.AnonymousClass8YX
            if (r0 == 0) goto L_0x014f
            X.8YX r1 = (X.AnonymousClass8YX) r1
            X.51M r8 = r1.A00
            X.89w r7 = r12.A03
            X.89v r14 = r7.A00()
            if (r8 == 0) goto L_0x025e
            java.util.TreeSet r6 = r12.A04
            X.AzC r0 = X.C41721AzC.A00
            X.018.A17(r6, r0)
            X.0sP r0 = r14.A05
            java.lang.Object r0 = r0.invoke(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r4 = 0
            X.9Km r0 = new X.9Km
            r0.<init>(r14, r4)
            java.lang.Object r3 = r0.invoke(r8)
            java.lang.String r3 = (java.lang.String) r3
            r11 = 0
            r2 = 0
        L_0x00f5:
            if (r2 >= r5) goto L_0x0145
            X.0sL r1 = r14.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.invoke(r0, r8)
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            X.0qQ.A0B(r3, r4)
            X.89y r10 = r7.A08
            r1 = 2
            X.9Ir r0 = new X.9Ir
            r0.<init>(r3, r9, r1)
            java.lang.Object r0 = r10.get(r0)
            if (r0 != 0) goto L_0x0142
            X.9nf r0 = new X.9nf
            r0.<init>(r9)
            r19 = 4
            X.IoN r13 = new X.IoN
            r15 = r12
            r16 = r8
            r17 = r3
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.A9g r1 = new X.A9g
            r1.<init>(r0, r8, r13)
            X.A9g r0 = r12.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0141
            boolean r0 = r6.add(r1)
            if (r0 == 0) goto L_0x0141
            X.AnonymousClass8A0.A00(r12)
        L_0x0141:
            r11 = 1
        L_0x0142:
            int r2 = r2 + 1
            goto L_0x00f5
        L_0x0145:
            if (r11 != 0) goto L_0x025e
            X.2Fj r1 = r7.A07
            X.89y r0 = r7.A08
            r1.A0B(r0)
            return
        L_0x014f:
            boolean r0 = r1 instanceof X.AnonymousClass8YO
            if (r0 == 0) goto L_0x01fd
            X.8YO r1 = (X.AnonymousClass8YO) r1
            X.831 r6 = r1.A00
            X.89w r0 = r12.A03
            X.89v r5 = r0.A00()
            java.util.List r0 = r6.A01
            int r0 = r0.size()
            r4 = 0
            X.2HY r0 = X.C229632nm.A0C(r4, r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x016c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x025e
            r0 = r9
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            X.51O r2 = r6.A04(r0)
            X.51M r2 = (X.AnonymousClass51M) r2
            if (r2 == 0) goto L_0x016c
            boolean r0 = X.AnonymousClass51Q.A05(r2)
            if (r0 != 0) goto L_0x016c
            X.0sL r1 = r5.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.invoke(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            X.0sP r0 = r5.A06
            java.lang.Object r1 = r0.invoke(r2)
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.8A5 r15 = r12.A02
            java.lang.String r0 = r2.A0E()
            X.0qQ.A0B(r0, r4)
            X.51M r2 = X.LIO.A00(r0)
            X.9Rz r14 = new X.9Rz
            r14.<init>(r1)
            com.instagram.common.session.UserSession r8 = r15.A01
            X.0qQ.A0B(r8, r4)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36317397346817135(0x81067b0006146f, double:3.030606548323804E-306)
            boolean r19 = X.182.A06(r7, r8, r0)
            X.0rm r1 = new X.0rm
            r1.<init>()
            if (r19 != 0) goto L_0x01dd
            java.io.File r0 = X.AnonymousClass8A5.A00(r14, r15, r2, r3)     // Catch:{ IOException -> 0x016c }
            r1.A00 = r0
        L_0x01dd:
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x01e9
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x016c
        L_0x01e9:
            X.0nO r0 = X.0nY.A00()
            X.9lQ r13 = new X.9lQ
            r16 = r2
            r17 = r1
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.ATE(r13)
            goto L_0x016c
        L_0x01fd:
            boolean r0 = r1 instanceof X.C390049qe
            if (r0 == 0) goto L_0x026d
            X.9qe r1 = (X.C390049qe) r1
            X.51M r14 = r1.A01
            int r2 = r1.A00
            X.0sL r1 = r1.A02
            X.89w r0 = r12.A03
            X.89v r6 = r0.A00()
            X.9ng r0 = new X.9ng
            r0.<init>(r2)
            r9 = 0
            X.9MU r11 = new X.9MU
            r3 = r11
            r4 = r12
            r5 = r14
            r7 = r1
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x021f:
            X.A9g r1 = new X.A9g
            r1.<init>(r0, r14, r11)
            X.A9g r0 = r12.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x025e
            java.util.TreeSet r0 = r12.A04
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L_0x025e
            X.AnonymousClass8A0.A00(r12)
            return
        L_0x0238:
            int r3 = r8 + -1
        L_0x023a:
            X.0sL r1 = r13.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r1.invoke(r0, r14)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            X.0qQ.A0B(r15, r6)
            X.89y r2 = r2.A08
            r1 = 2
            X.9Ir r0 = new X.9Ir
            r0.<init>(r15, r3, r1)
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x025f
            r5.invoke(r0, r15)
        L_0x025e:
            return
        L_0x025f:
            X.9nh r0 = X.C388359nh.A00
            X.Awb r11 = new X.Awb
            r16 = r5
            r17 = r4
            r18 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x021f
        L_0x026d:
            boolean r0 = r1 instanceof X.C390059qf
            if (r0 == 0) goto L_0x0277
            java.util.TreeSet r0 = r12.A04
            r0.clear()
            return
        L_0x0277:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8A7.onChanged(java.lang.Object):void");
    }
}
