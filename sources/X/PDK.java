package X;

public final class PDK implements C74409PuP {
    public final C71088Obj A00;
    public final 0sL A01;
    public final 0sL A02;
    public final 2Dh A03;
    public final 0sP A04;
    public final 0sP A05;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        if (r6.isPending() != true) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0138, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36320360874320229L) == false) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D8t(com.instagram.common.session.UserSession r38, X.C68149N2p r39) {
        /*
            r37 = this;
            r5 = 1
            r8 = r37
            X.0sP r1 = r8.A05
            X.0sP r0 = r8.A04
            X.OFL r3 = new X.OFL
            r3.<init>(r1, r0)
            java.util.List r1 = r3.A00
            r15 = r38
            r0 = r39
            X.MeD r2 = X.C66876MeC.A00(r15, r0, r1)
            X.PuQ r1 = r2.A00
            if (r1 != 0) goto L_0x0028
            X.N3b r2 = r0.A01
            if (r2 == 0) goto L_0x016a
            X.0eM r1 = r3.A01
            java.util.List r1 = X.JTO.A15(r1)
            X.MeD r2 = X.C66876MeC.A00(r15, r2, r1)
        L_0x0028:
            X.PuQ r3 = r2.A00
            if (r3 != 0) goto L_0x0126
            X.N3b r1 = r0.A01
            if (r1 != 0) goto L_0x0037
            java.lang.String r0 = "getClass"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0037:
            android.content.Context r12 = X.C51966G9m.A0P(r15)
            X.0sL r2 = r8.A01
            java.lang.String r7 = r1.A0A
            java.lang.Object r6 = r2.invoke(r15, r7)
            X.2Ep r6 = (X.AnonymousClass2Ep) r6
            X.ONt r11 = X.C70125Nxf.A00(r6, r0)
            java.lang.String r4 = r1.A09
            r3 = 0
            if (r4 == 0) goto L_0x006f
            if (r6 == 0) goto L_0x0056
            com.instagram.user.model.User r9 = r6.CCf(r4)
            if (r9 != 0) goto L_0x005e
        L_0x0056:
            X.0sL r2 = r8.A02
            java.lang.Object r9 = r2.invoke(r15, r4)
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
        L_0x005e:
            X.Prd r2 = r1.A02
            boolean r34 = X.N8Z.A00(r5, r2)
            java.lang.String r2 = r15.A06
            if (r34 == 0) goto L_0x006a
            java.lang.String r3 = "ds"
        L_0x006a:
            java.lang.String r20 = X.AnonymousClass7QG.A02(r2, r7, r3)
            goto L_0x0071
        L_0x006f:
            r9 = r3
            goto L_0x005e
        L_0x0071:
            X.OIw r2 = X.O4a.A00     // Catch:{ UnsupportedOperationException -> 0x0111 }
            java.lang.String r2 = r2.A00(r12, r6, r1, r5)     // Catch:{ UnsupportedOperationException -> 0x0111 }
            java.lang.String r4 = r2.toString()     // Catch:{ UnsupportedOperationException -> 0x0111 }
            X.0Tu r10 = X.0Tu.A05     // Catch:{ UnsupportedOperationException -> 0x0111 }
            r2 = 36320360874254692(0x81092d00062164, double:3.032480695008482E-306)
            boolean r2 = X.182.A06(r10, r15, r2)     // Catch:{ UnsupportedOperationException -> 0x0111 }
            if (r2 == 0) goto L_0x0094
            java.lang.Integer r2 = r0.A02     // Catch:{ UnsupportedOperationException -> 0x0111 }
            com.instagram.common.notifications.push.intf.PushChannelType r2 = X.C66878MeE.A00(r2)     // Catch:{ UnsupportedOperationException -> 0x0111 }
            java.lang.String r2 = r2.A00     // Catch:{ UnsupportedOperationException -> 0x0111 }
            java.lang.String r4 = X.C66580MXl.A10(r2, r4)     // Catch:{ UnsupportedOperationException -> 0x0111 }
        L_0x0094:
            if (r6 == 0) goto L_0x0107
            boolean r2 = r6.CWe()
            if (r2 == 0) goto L_0x0107
            java.lang.String r2 = ""
            com.instagram.common.typedurl.SimpleImageUrl r16 = X.DbS.A0V(r2)
        L_0x00a2:
            X.3t0 r18 = X.C66580MXl.A0g(r7)
            if (r6 == 0) goto L_0x00f8
            boolean r2 = r6.CWe()
            if (r2 != 0) goto L_0x00ff
            java.lang.String r22 = X.AnonymousClass48N.A07(r12, r15, r6)
        L_0x00b2:
            X.0qQ.A07(r22)
        L_0x00b5:
            java.lang.String r25 = r11.A02()
            java.lang.String r8 = r1.A07
            r13 = 0
            if (r6 == 0) goto L_0x00c6
            boolean r2 = r6.isPending()
            r33 = 1
            if (r2 == r5) goto L_0x00c8
        L_0x00c6:
            r33 = 0
        L_0x00c8:
            boolean r35 = r1.A00()
            boolean r3 = r1.A0C
            java.lang.Integer r2 = r0.A02
            com.instagram.common.notifications.push.intf.PushChannelType r14 = X.C66878MeE.A00(r2)
            java.lang.String r28 = r11.A03()
            long r5 = r0.A00
            java.lang.String r2 = r0.A04
            java.lang.String r0 = r1.A08
            java.lang.String r24 = "message_recieved"
            r17 = r13
            r19 = r13
            r21 = r7
            r23 = r4
            r26 = r13
            r27 = r8
            r29 = r2
            r30 = r0
            r31 = r5
            r36 = r3
            X.2Dh.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36)
            return
        L_0x00f8:
            if (r9 == 0) goto L_0x00ff
            java.lang.String r22 = r9.B8Q()
            goto L_0x00b5
        L_0x00ff:
            r2 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r22 = r12.getString(r2)
            goto L_0x00b2
        L_0x0107:
            if (r9 == 0) goto L_0x010e
            com.instagram.common.typedurl.ImageUrl r16 = r9.Bh3()
            goto L_0x00a2
        L_0x010e:
            r16 = 0
            goto L_0x00a2
        L_0x0111:
            r2 = move-exception
            X.Obj r4 = r8.A00
            java.lang.String r1 = "content error: "
            java.lang.String r3 = X.AnonymousClass7TF.A0m(r1, r2)
            X.OWE r2 = X.C66880MeH.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.MeH r0 = r2.A01(r0, r1)
            r4.A04(r15, r0, r3)
            return
        L_0x0126:
            java.lang.Integer r1 = r0.A02
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            if (r1 != r7) goto L_0x013a
            X.0Tu r4 = X.0Tu.A05
            r1 = 36320360874320229(0x81092d00072165, double:3.032480695049928E-306)
            boolean r2 = X.182.A06(r4, r15, r1)
            r1 = 1
            if (r2 != 0) goto L_0x013b
        L_0x013a:
            r1 = 0
        L_0x013b:
            java.lang.String r5 = "display policy failure: "
            if (r1 == 0) goto L_0x0154
            X.Obj r6 = r8.A00
            java.lang.String r1 = r3.AUf(r15)
            java.lang.String r4 = X.002.A0R(r5, r1)
            X.OWE r1 = X.C66880MeH.A03
            X.MeH r2 = r1.A01(r0, r7)
            r1 = 1021(0x3fd, float:1.431E-42)
            r6.A05(r15, r2, r4, r1)
        L_0x0154:
            java.lang.String r1 = r0.A04
            X.69F r6 = X.AnonymousClass69E.A00(r1)
            long r10 = r0.A00
            r9 = 1021(0x3fd, float:1.431E-42)
            java.lang.String r0 = r3.AUf(r15)
            java.lang.String r8 = X.002.A0R(r5, r0)
            r6.DUg(r7, r8, r9, r10)
            return
        L_0x016a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PDK.D8t(com.instagram.common.session.UserSession, X.N2p):void");
    }

    public final Integer Bll() {
        return AnonymousClass05K.A01;
    }

    public PDK(2Dh r2, C71088Obj obj, 0sP r4, 0sP r5, 0sL r6, 0sL r7) {
        C51974G9v.A1M(r6, r7, r4);
        0qQ.A0B(r5, 5);
        this.A03 = r2;
        this.A01 = r6;
        this.A02 = r7;
        this.A05 = r4;
        this.A04 = r5;
        this.A00 = obj;
    }
}
