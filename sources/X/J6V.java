package X;

public final class J6V extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6V(C284945Oz r2, 0sP r3, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
        if (2 - i2 != 0) {
            this.A03 = r3;
            this.A02 = r2;
        } else {
            this.A02 = r3;
            this.A03 = r2;
        }
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, X.9m0] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0266, code lost:
        r4 = (X.0sP) r4;
        r0 = r3.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x026c, code lost:
        r4.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02b3, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r5 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0284;
                case 1: goto L_0x0270;
                case 2: goto L_0x0251;
                case 3: goto L_0x0245;
                case 4: goto L_0x0200;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01a7;
                case 7: goto L_0x0192;
                case 8: goto L_0x0007;
                case 9: goto L_0x0007;
                case 10: goto L_0x0179;
                case 11: goto L_0x0133;
                case 12: goto L_0x0122;
                case 13: goto L_0x00ff;
                case 14: goto L_0x0076;
                case 15: goto L_0x0050;
                case 16: goto L_0x0026;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r8 = X.C41847B3o.A1E(r5)
            r0 = 0
            X.9m0 r7 = new X.9m0
            r7.<init>()
            r7.A01 = r0
            r7.A00 = r0
            java.lang.Object r5 = r15.A02
            android.content.Context r5 = (android.content.Context) r5
            int r9 = r15.A01
            java.lang.Object r6 = r15.A03
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r10 = 1
            X.9py r4 = new X.9py
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0026:
            X.2WE r6 = X.C51968G9o.A0f(r5)
            java.lang.Object r1 = r15.A02
            X.3bE r1 = (X.C244463bE) r1
            r0 = 1
            r1.A00 = r0
            java.lang.Object r5 = r15.A03
            X.Gx7 r5 = (X.C53963Gx7) r5
            X.HJx r4 = r5.A00
            int r3 = r15.A01
            java.lang.Object[] r2 = X.C51968G9o.A1Z(r4, r3)
            r1 = 23
            X.JGE r0 = new X.JGE
            r0.<init>(r3, r1, r5)
            r6.A02(r0, r2)
            X.2V5 r1 = r4.A04
            X.JJO r0 = X.JJO.A00
            X.C244463bE.A00(r1, r6, r0)
            goto L_0x02b1
        L_0x0050:
            X.2WE r5 = X.C51968G9o.A0f(r5)
            java.lang.Object r1 = r15.A02
            X.3bE r1 = (X.C244463bE) r1
            r0 = 1
            r1.A00 = r0
            java.lang.Object r4 = r15.A03
            X.Gx0 r4 = (X.C53956Gx0) r4
            com.instagram.common.session.UserSession r3 = r4.A02
            X.4bN r2 = r4.A00
            X.HJx r1 = r4.A03
            int r0 = r15.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}
            r0 = 35
            X.JGB.A01(r5, r4, r1, r0)
            goto L_0x02b1
        L_0x0076:
            java.lang.Object r7 = r15.A02
            X.3kE r7 = (X.C249703kE) r7
            int r1 = r7.mItemViewType
            X.2Rn r0 = X.AnonymousClass2Ro.A00
            int r5 = r0.Ewi(r1)
            java.lang.Object r8 = r15.A03
            X.GD5 r8 = (X.GD5) r8
            X.GBg r9 = r8.A02
            int r4 = r15.A01
            X.4bN r11 = r9.A0E(r4)
            X.GBC r3 = r8.A04
            X.5o2 r2 = r11.A01
            r0 = 1
            X.0qQ.A0B(r2, r0)
            if (r4 != 0) goto L_0x00b3
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r2 != r0) goto L_0x00b3
            X.GLu r6 = r3.A01
            if (r6 == 0) goto L_0x00b3
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "ON_BIND_VIEW_HOLDER"
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.C52278GLu.A00(r6, r0)
        L_0x00b3:
            X.Jvg r10 = r9.A0D()
            X.GDe r12 = r9.BzC(r11)
            com.instagram.common.session.UserSession r13 = r8.A01
            X.0Tu r6 = X.0Tu.A05
            r0 = 36312874747102511(0x81025e0013052f, double:3.0277464380532284E-306)
            boolean r14 = X.182.A06(r6, r13, r0)
            X.GDg r9 = new X.GDg
            r9.<init>(r10, r11, r12, r13, r14)
            X.GBe r6 = r8.A03
            r6.bind(r7, r9)
            java.lang.String r1 = r2.name()
            r0 = 0
            X.6t8 r1 = X.C320866t5.A00(r6, r9, r1, r0, r0)
            X.2Rn r0 = X.AnonymousClass2Ro.A00
            r0.ASI(r1, r5)
            if (r4 != 0) goto L_0x02b1
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r2 != r0) goto L_0x02b1
            X.GLu r2 = r3.A01
            if (r2 == 0) goto L_0x02b1
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x02b1
            java.lang.String r0 = "ON_BIND_VIEW_HOLDER"
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "_end"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.C52278GLu.A00(r2, r0)
            goto L_0x02b1
        L_0x00ff:
            java.lang.Object r5 = r15.A03
            X.GD6 r5 = (X.GD6) r5
            java.lang.Object r0 = r15.A02
            X.4bN r0 = (X.C267324bN) r0
            int r4 = r15.A01
            X.6t6 r3 = X.GD6.A02(r0, r5)
            X.GBY r0 = r5.A0B
            X.GBa r2 = r0.A05
            r1 = 1
            r0 = 0
            r2.D1O(r4, r1, r0)
            r5.A02 = r1
            X.GMh r0 = new X.GMh
            r0.<init>(r5, r3, r4)
            X.11Z.A02(r0)
            goto L_0x02b1
        L_0x0122:
            java.lang.Object r2 = r15.A02
            X.X9a r2 = (X.C21003X9a) r2
            java.lang.Object r0 = r15.A03
            java.lang.String r1 = X.C51966G9m.A1E(r0)
            int r0 = r15.A01
            r2.DZf(r1, r0)
            goto L_0x02b1
        L_0x0133:
            android.view.View r5 = (android.view.View) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r6 = r15.A02
            X.Hju r6 = (X.C55574Hju) r6
            java.lang.Object r4 = r15.A03
            X.4dG r4 = (X.C268364dG) r4
            int r3 = r15.A01
            X.0qQ.A0B(r4, r0)
            java.util.Map r2 = X.C55397Hh3.A00
            java.lang.String r0 = r4.A05
            java.lang.Object r1 = r2.get(r0)
            if (r1 != 0) goto L_0x0158
            X.VZd r1 = new X.VZd
            r1.<init>(r4, r3)
            r2.put(r0, r1)
        L_0x0158:
            X.VZd r1 = (X.C17524VZd) r1
            X.AnonymousClass7TG.A1O(r4, r1)
            X.Uau r0 = r6.A00
            X.0eM r3 = r0.A0M
            java.lang.Object r2 = r3.getValue()
            X.2qn r2 = (X.C231052qn) r2
            int r0 = r1.A01
            java.lang.String r1 = ""
            r2.A03(r4, r1, r0)
            java.lang.Object r0 = r3.getValue()
            X.2qn r0 = (X.C231052qn) r0
            r0.A01(r5, r4, r1)
            goto L_0x02b1
        L_0x0179:
            X.N4R r5 = (X.N4R) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r3 = r5.A02
            com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator r3 = (com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator) r3
            java.lang.Object r2 = r15.A02
            byte[] r2 = (byte[]) r2
            int r1 = r15.A01
            java.lang.Object r0 = r15.A03
            com.facebook.rsys.transport.gen.SignalingMessageIncomingStats r0 = (com.facebook.rsys.transport.gen.SignalingMessageIncomingStats) r0
            r3.receivedMultiwaySignalingMessage(r2, r1, r0)
            goto L_0x02b1
        L_0x0192:
            java.lang.Object r4 = r15.A03
            X.0sP r4 = (X.0sP) r4
            int r2 = r15.A01
            java.lang.Object r0 = r15.A02
            X.Drv r0 = (X.C47180Drv) r0
            boolean r0 = r0.A03
            r1 = r0 ^ 1
            X.EOe r0 = new X.EOe
            r0.<init>(r2, r1)
            goto L_0x026c
        L_0x01a7:
            X.2W7 r5 = (X.AnonymousClass2W7) r5
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Object r1 = r15.A02
            X.Hq4 r1 = (X.C55940Hq4) r1
            android.view.MotionEvent r0 = r5.A00
            X.0qQ.A06(r0)
            boolean r2 = r1.A00(r0)
            java.lang.Object r0 = r15.A03
            X.Gs8 r0 = (X.C53655Gs8) r0
            X.3g4 r0 = r0.A00
            X.3W1 r0 = r0.A03
            X.3WB r0 = r0.A0l
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x01df
            android.view.MotionEvent r1 = r5.A00
            X.0qQ.A06(r1)
            int r0 = r15.A01
            float r1 = r1.getY()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01df
            if (r2 == 0) goto L_0x01df
            r3 = 1
        L_0x01df:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L_0x01e4:
            java.lang.String r5 = (java.lang.String) r5
            r2 = 0
            X.0qQ.A0B(r5, r2)
            java.lang.Object r3 = r15.A02
            X.5Oz r3 = (X.C284945Oz) r3
            int r1 = r5.length()
            int r0 = r15.A01
            if (r1 <= r0) goto L_0x01fa
            java.lang.String r5 = X.C51967G9n.A0q(r5, r2, r0)
        L_0x01fa:
            r3.Epw(r5)
            java.lang.Object r4 = r15.A03
            goto L_0x0266
        L_0x0200:
            X.6Gb r10 = X.C51968G9o.A0L(r5)
            java.lang.Object r0 = r15.A02
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r9 = r15.A01
            java.lang.Object r8 = r15.A03
            X.0sP r8 = (X.0sP) r8
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
        L_0x0217:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02b1
            java.lang.Object r4 = r6.next()
            int r3 = r5 + 1
            if (r5 >= 0) goto L_0x022d
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x022d:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1 = -934090608(0xffffffffc852e890, float:-215970.25)
            X.JGi r0 = new X.JGi
            r0.<init>(r4, r8, r5, r9)
            X.C51967G9n.A11(r10, r0, r2, r1)
            X.0gF r0 = X.C60340gF.A00
            r7.add(r0)
            r5 = r3
            goto L_0x0217
        L_0x0245:
            java.lang.Object r2 = r15.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r15.A03
            int r0 = r15.A01
            X.C51967G9n.A1P(r1, r2, r0)
            goto L_0x02b1
        L_0x0251:
            java.lang.String r2 = X.C41847B3o.A1E(r5)
            int r1 = r2.length()
            int r0 = r15.A01
            if (r1 > r0) goto L_0x02b1
            java.lang.Object r3 = r15.A03
            X.5Oz r3 = (X.C284945Oz) r3
            r3.Epw(r2)
            java.lang.Object r4 = r15.A02
        L_0x0266:
            X.0sP r4 = (X.0sP) r4
            java.lang.Object r0 = r3.getValue()
        L_0x026c:
            r4.invoke(r0)
            goto L_0x02b1
        L_0x0270:
            java.lang.String r3 = X.C41847B3o.A1E(r5)
            java.lang.Object r2 = r15.A02
            android.content.Context r2 = (android.content.Context) r2
            int r1 = r15.A01
            java.lang.Object r0 = r15.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8vD r4 = new X.8vD
            r4.<init>(r2, r0, r3, r1)
            return r4
        L_0x0284:
            X.4cl r5 = (X.C268104cl) r5
            java.lang.Object r2 = r15.A03
            X.Geh r2 = (X.C52907Geh) r2
            X.IEj r0 = r2.A00
            X.5dh r0 = r0.A03
            int r1 = r0.BI6()
            int r0 = r15.A01
            r4 = 0
            int r0 = X.C229632nm.A03(r1, r4, r0)
            int r1 = -r0
            boolean r0 = r2.A01
            r3 = r1
            if (r0 == 0) goto L_0x02a1
            r3 = 0
            r4 = r1
        L_0x02a1:
            java.lang.Object r0 = r15.A02
            r2 = 0
            X.Iwt r1 = new X.Iwt
            r1.<init>(r0, r4, r3, r2)
            r0 = 1
            r5.A00 = r0
            r1.invoke(r5)
            r5.A00 = r2
        L_0x02b1:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6V.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6V(int i, int i2, Object obj, Object obj2) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }
}
