package X;

public final class TWR extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWR(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b0, code lost:
        if (X.SUj.A0Q((X.2Fk) r10.A01) == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0165, code lost:
        if (X.SUj.A0Q((X.2Fk) r10.A01) == false) goto L_0x0167;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0141;
                case 1: goto L_0x008c;
                case 2: goto L_0x002f;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.OCq r11 = (X.C70593OCq) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A04
            X.325 r0 = (X.AnonymousClass325) r0
            X.AnonymousClass325.A01(r11, r0)
            java.lang.Object r2 = r10.A03
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r1 = r10.A05
            boolean r0 = r2.A5D()
            if (r0 == 0) goto L_0x0025
            X.1Xj r0 = r2.A1f(r1)
            X.0qQ.A0A(r0)
        L_0x0025:
            java.lang.Object r0 = r10.A02
            X.JQL r0 = (X.JQL) r0
            r0.DeI()
        L_0x002c:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x002f:
            X.2HJ r11 = (X.2HJ) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.String r3 = r11.A00()
            java.lang.Object r4 = r10.A01
            X.2Mg r4 = (X.2Mg) r4
            byte[] r0 = r11.A03()
            java.lang.String r7 = r4.A02(r0)
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.lang.String r6 = r10.A05
            java.lang.String r0 = "cred_id"
            r2.put(r0, r6)
            java.lang.String r1 = r4.A00()
            java.lang.String r0 = "device_key"
            r2.put(r0, r1)
            java.lang.String r0 = "result_key"
            r2.put(r0, r3)
            java.lang.String r0 = "signature"
            r2.put(r0, r7)
            java.lang.String r1 = r10.A06
            java.lang.String r0 = "csc"
            r2.put(r0, r1)
            X.SFo r0 = X.C10448RsP.A00(r0, r2)
            X.QCn r0 = X.SQA.A01(r0)
            X.0qQ.A07(r0)
            java.lang.Object r2 = r10.A02
            X.59w r2 = (X.C2818659w) r2
            java.lang.Object r5 = r10.A04
            X.Svp r5 = (X.C12512Svp) r5
            java.lang.Object r3 = r10.A03
            X.OMB r3 = (X.OMB) r3
            X.Sdk r1 = new X.Sdk
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.SUj.A0H(r0, r1)
            goto L_0x002c
        L_0x008c:
            X.SUj r11 = (X.SUj) r11
            boolean r0 = X.SUj.A0V(r11)
            if (r0 == 0) goto L_0x0190
            java.lang.Object r0 = X.SUj.A0D(r11)
            X.S5J r0 = (X.S5J) r0
            X.TYQ r8 = X.TYQ.A00
            X.QXb r3 = r0.A00
            r6 = 0
            if (r3 == 0) goto L_0x00a7
            X.QVE r0 = r3.A0E()
            if (r0 != 0) goto L_0x00b2
        L_0x00a7:
            java.lang.Object r0 = r10.A01
            X.2Fk r0 = (X.2Fk) r0
            boolean r1 = X.SUj.A0Q(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            java.lang.String r9 = r10.A05
            java.lang.String r1 = "DELETE"
            X.0qQ.A0K(r9, r1)
            if (r0 == 0) goto L_0x0190
            java.lang.Object r5 = r10.A01
            X.2gB r5 = (X.AnonymousClass2gB) r5
            java.lang.Object r0 = X.SUj.A0C(r5)
            X.S60 r0 = (X.S60) r0
            X.S6J r0 = r0.A02
            java.util.List r7 = r0.A03
            boolean r0 = X.0qQ.A0K(r9, r1)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r1 = r10.A06
            X.TYR r0 = X.TYR.A00
            java.util.List r1 = X.C11296SKe.A01(r1, r7, r0)
            java.lang.Object r0 = r10.A04
            X.Std r0 = (X.C12404Std) r0
            X.C12404Std.A03(r5, r6, r0, r6, r1)
            goto L_0x0190
        L_0x00e1:
            if (r3 == 0) goto L_0x011f
            java.lang.Class<X.QVF> r2 = X.QVF.class
            java.lang.String r1 = "phone"
            r0 = -1981689008(0xffffffff89e1d350, float:-5.4365497E-33)
            X.3lr r3 = r3.A03(r2, r1, r0)
        L_0x00ef:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x0207
            java.lang.Class<X.QTI> r1 = X.QTI.class
            r0 = 1741235608(0x67c92598, float:1.8997783E24)
            X.3lr r0 = r3.A01(r1, r0)
            X.QTI r0 = (X.QTI) r0
            X.0qQ.A07(r0)
            X.S6V r4 = X.C11080S9a.A01(r0)
            java.lang.String r0 = "CREATE"
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 == 0) goto L_0x0121
            java.lang.Object r2 = r10.A04
            X.Std r2 = (X.C12404Std) r2
            java.lang.Object r1 = r10.A03
            X.SJ1 r1 = (X.SJ1) r1
            X.ScK r0 = X.C11559ScK.A00
            X.SUj r0 = X.SUj.A03(r0, r11)
            r2.A0C(r1, r0)
            goto L_0x0190
        L_0x011f:
            r3 = r6
            goto L_0x00ef
        L_0x0121:
            java.lang.String r3 = r10.A06
            if (r3 == 0) goto L_0x0202
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x01fd
            X.S5b r2 = new X.S5b
            r2.<init>(r3, r0)
            r1 = 8
            X.MYK r0 = new X.MYK
            r0.<init>(r3, r1)
            java.util.List r1 = X.C11296SKe.A00(r4, r7, r0, r8)
            java.lang.Object r0 = r10.A04
            X.Std r0 = (X.C12404Std) r0
            X.C12404Std.A03(r5, r2, r0, r6, r1)
            goto L_0x0190
        L_0x0141:
            X.SUj r11 = (X.SUj) r11
            boolean r0 = X.SUj.A0V(r11)
            if (r0 == 0) goto L_0x0190
            java.lang.Object r0 = X.SUj.A0D(r11)
            X.S5I r0 = (X.S5I) r0
            X.TYO r8 = X.TYO.A00
            X.QXN r3 = r0.A00
            r7 = 0
            if (r3 == 0) goto L_0x015c
            X.QSH r0 = r3.A0E()
            if (r0 != 0) goto L_0x0167
        L_0x015c:
            java.lang.Object r0 = r10.A01
            X.2Fk r0 = (X.2Fk) r0
            boolean r1 = X.SUj.A0Q(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0168
        L_0x0167:
            r0 = 0
        L_0x0168:
            java.lang.String r2 = r10.A05
            java.lang.String r1 = "DELETE"
            X.0qQ.A0K(r2, r1)
            if (r0 == 0) goto L_0x0190
            java.lang.Object r6 = r10.A01
            X.2gB r6 = (X.AnonymousClass2gB) r6
            java.lang.Object r0 = X.SUj.A0C(r6)
            X.S60 r0 = (X.S60) r0
            X.S6I r0 = r0.A00
            java.util.List r5 = r0.A03
            boolean r0 = X.0qQ.A0K(r2, r1)
            if (r0 == 0) goto L_0x01a3
            java.lang.String r1 = r10.A06
            X.TYP r0 = X.TYP.A00
            java.util.List r0 = X.C11296SKe.A01(r1, r5, r0)
            X.C12404Std.A04(r6, r7, r7, r0)
        L_0x0190:
            boolean r0 = X.SUj.A0T(r11)
            if (r0 != 0) goto L_0x002c
            java.lang.Object r1 = r10.A01
            X.2gB r1 = (X.AnonymousClass2gB) r1
            java.lang.Object r0 = r10.A02
            X.2Fk r0 = (X.2Fk) r0
            r1.A0D(r0)
            goto L_0x002c
        L_0x01a3:
            java.lang.String r0 = "CREATE"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r2 = r10.A04
            X.Std r2 = (X.C12404Std) r2
            java.lang.Object r1 = r10.A03
            X.SJ1 r1 = (X.SJ1) r1
            X.ScH r0 = X.C11556ScH.A00
            X.SUj r0 = X.SUj.A03(r0, r11)
            r2.A0A(r1, r0)
            goto L_0x0190
        L_0x01bd:
            if (r3 == 0) goto L_0x01fb
            java.lang.Class<X.QSG> r2 = X.QSG.class
            java.lang.String r1 = "email"
            r0 = -1147891044(0xffffffffbb94929c, float:-0.0045340788)
            X.3lr r3 = r3.A03(r2, r1, r0)
        L_0x01ca:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x0216
            java.lang.Class<X.QT5> r1 = X.QT5.class
            r0 = 693675366(0x2958a566, float:4.8105095E-14)
            X.3lr r0 = r3.A01(r1, r0)
            X.QT5 r0 = (X.QT5) r0
            X.0qQ.A07(r0)
            X.S6Z r4 = X.C11080S9a.A00(r0)
            java.lang.String r3 = r10.A06
            if (r3 == 0) goto L_0x0211
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x020c
            X.S5b r2 = new X.S5b
            r2.<init>(r3, r0)
            r1 = 7
            X.MYK r0 = new X.MYK
            r0.<init>(r3, r1)
            java.util.List r0 = X.C11296SKe.A00(r4, r5, r0, r8)
            X.C12404Std.A04(r6, r2, r7, r0)
            goto L_0x0190
        L_0x01fb:
            r3 = r7
            goto L_0x01ca
        L_0x01fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0202:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0207:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x020c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0211:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0216:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWR.invoke(java.lang.Object):java.lang.Object");
    }
}
