package X;

/* renamed from: X.G2l  reason: case insensitive filesystem */
public final class C51802G2l extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51802G2l(H1R h1r, int i) {
        super(0);
        this.A00 = i;
        this.A01 = h1r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x034d, code lost:
        r9 = X.DbY.A0F(r1, r0);
        X.0qQ.A0C(r9, "null cannot be cast to non-null type android.widget.TextView");
        r9 = (android.widget.TextView) r9;
        r9.setTextColor(X.2Yu.A0F(r1.getContext(), com.instagram.android.R.attr.textColorProfileName));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0366, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0317, code lost:
        r9 = X.DbY.A0F(r1, r0);
        X.0qQ.A0C(r9, "null cannot be cast to non-null type android.widget.TextView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0320, code lost:
        return r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x03b6;
                case 1: goto L_0x038a;
                case 2: goto L_0x037b;
                case 3: goto L_0x0371;
                case 4: goto L_0x0367;
                case 5: goto L_0x0344;
                case 6: goto L_0x0321;
                case 7: goto L_0x030e;
                case 8: goto L_0x0304;
                case 9: goto L_0x02fa;
                case 10: goto L_0x02f0;
                case 11: goto L_0x02e6;
                case 12: goto L_0x02c6;
                case 13: goto L_0x02c6;
                case 14: goto L_0x02bb;
                case 15: goto L_0x02b1;
                case 16: goto L_0x02a7;
                case 17: goto L_0x029d;
                case 18: goto L_0x0293;
                case 19: goto L_0x0289;
                case 20: goto L_0x01fa;
                case 21: goto L_0x01eb;
                case 22: goto L_0x03bd;
                case 23: goto L_0x01e4;
                case 24: goto L_0x03b6;
                case 25: goto L_0x01d4;
                case 26: goto L_0x016b;
                case 27: goto L_0x0154;
                case 28: goto L_0x0106;
                case 29: goto L_0x00a2;
                case 30: goto L_0x008f;
                case 31: goto L_0x0080;
                case 32: goto L_0x0039;
                case 33: goto L_0x03bd;
                case 34: goto L_0x01e4;
                case 35: goto L_0x03b6;
                case 36: goto L_0x0022;
                case 37: goto L_0x01b8;
                case 38: goto L_0x0007;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x0007;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x000f;
                case 45: goto L_0x03bd;
                case 46: goto L_0x01e4;
                case 47: goto L_0x03b6;
                case 48: goto L_0x0197;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
        L_0x000c:
            X.0gF r9 = X.C60340gF.A00
        L_0x000e:
            return r9
        L_0x000f:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "arg_media_id"
            java.lang.String r9 = r1.getString(r0)
            if (r9 != 0) goto L_0x000e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0022:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 4168(0x1048, float:5.84E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r9 = r1.getString(r0)
            if (r9 != 0) goto L_0x000e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0039:
            java.lang.Object r5 = r1.A01
            X.E1C r5 = (X.E1C) r5
            X.0eM r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            X.Dkx r0 = (X.C46770Dkx) r0
            android.content.Context r4 = r5.requireContext()
            X.HDi r3 = r0.A01
            java.lang.String r1 = r0.A02
            X.05G r2 = r0.A06
            java.lang.Object r0 = r2.getValue()
            X.Drx r0 = (X.C47182Drx) r0
            X.3Yl r0 = r0.A02
            r3.A00(r4, r5, r0, r1)
        L_0x005a:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.Drx r0 = (X.C47182Drx) r0
            X.3Yl r4 = X.C243363Yl.LIKED
            java.lang.String r6 = r0.A05
            java.lang.String r7 = r0.A06
            java.lang.String r8 = r0.A04
            java.lang.Integer r5 = r0.A03
            long r10 = r0.A00
            X.DgM r3 = r0.A01
            boolean r12 = r0.A08
            boolean r13 = r0.A09
            java.util.List r9 = r0.A07
            X.Drx r0 = X.C47182Drx.A00(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x005a
            goto L_0x000c
        L_0x0080:
            java.lang.Object r0 = r1.A01
            X.E1C r0 = (X.E1C) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.Dkx r1 = (X.C46770Dkx) r1
            X.Fg9 r0 = X.C50648Fg9.A00
            goto L_0x009d
        L_0x008f:
            java.lang.Object r0 = r1.A01
            X.E1C r0 = (X.E1C) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.Dkx r1 = (X.C46770Dkx) r1
            X.FgA r0 = X.C50649FgA.A00
        L_0x009d:
            r1.A00(r0)
            goto L_0x000c
        L_0x00a2:
            java.lang.Object r5 = r1.A01
            X.E1C r5 = (X.E1C) r5
            X.0eM r0 = r5.A04
            java.lang.Object r4 = r0.getValue()
            X.Dkx r4 = (X.C46770Dkx) r4
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.A00
            X.17i r1 = X.17h.A00(r0)
            java.lang.String r0 = r4.A03
            com.instagram.user.model.User r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x000c
            X.HDi r0 = r4.A01
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.String r0 = r5.A00
            X.FH6.A03(r3, r1, r2, r0)
            X.05G r1 = r4.A06
        L_0x00cb:
            java.lang.Object r3 = r1.getValue()
            r4 = r3
            X.Drx r4 = (X.C47182Drx) r4
            com.instagram.user.model.FollowStatus r0 = r2.B6o()
            int r5 = r0.ordinal()
            r0 = 4
            if (r5 == r0) goto L_0x0103
            r0 = 5
            if (r5 == r0) goto L_0x0100
            X.DgM r5 = X.C46519DgM.FOLLOW
        L_0x00e2:
            java.lang.String r8 = r4.A05
            java.lang.String r9 = r4.A06
            java.lang.String r10 = r4.A04
            java.lang.Integer r7 = r4.A03
            long r12 = r4.A00
            X.3Yl r6 = r4.A02
            boolean r14 = r4.A08
            boolean r15 = r4.A09
            java.util.List r11 = r4.A07
            X.Drx r0 = X.C47182Drx.A00(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            boolean r0 = r1.AIY(r3, r0)
            if (r0 == 0) goto L_0x00cb
            goto L_0x000c
        L_0x0100:
            X.DgM r5 = X.C46519DgM.REQUESTED
            goto L_0x00e2
        L_0x0103:
            X.DgM r5 = X.C46519DgM.FOLLOWING
            goto L_0x00e2
        L_0x0106:
            java.lang.Object r5 = r1.A01
            X.E1C r5 = (X.E1C) r5
            X.0eM r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            X.Dkx r0 = (X.C46770Dkx) r0
            android.content.Context r4 = r5.requireContext()
            X.HDi r3 = r0.A01
            java.lang.String r1 = r0.A02
            X.05G r2 = r0.A06
            java.lang.Object r0 = r2.getValue()
            X.Drx r0 = (X.C47182Drx) r0
            X.3Yl r0 = r0.A02
            r3.A00(r4, r5, r0, r1)
        L_0x0127:
            java.lang.Object r3 = r2.getValue()
            r1 = r3
            X.Drx r1 = (X.C47182Drx) r1
            X.3Yl r0 = r1.A02
            X.3Yl r5 = X.C243363Yl.LIKED
            if (r0 != r5) goto L_0x0136
            X.3Yl r5 = X.C243363Yl.NOT_LIKED
        L_0x0136:
            java.lang.String r7 = r1.A05
            java.lang.String r8 = r1.A06
            java.lang.String r9 = r1.A04
            java.lang.Integer r6 = r1.A03
            long r11 = r1.A00
            X.DgM r4 = r1.A01
            boolean r13 = r1.A08
            boolean r14 = r1.A09
            java.util.List r10 = r1.A07
            X.Drx r0 = X.C47182Drx.A00(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            boolean r0 = r2.AIY(r3, r0)
            if (r0 == 0) goto L_0x0127
            goto L_0x000c
        L_0x0154:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 3555(0xde3, float:4.982E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r9 = r1.getString(r0)
            if (r9 != 0) goto L_0x000e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x016b:
            java.lang.Object r2 = r1.A01
            X.H1R r2 = (X.H1R) r2
            android.os.Bundle r1 = r2.requireArguments()
            r0 = 1101(0x44d, float:1.543E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto L_0x000c
            X.0eM r0 = r2.A01
            X.2YL r2 = X.DbS.A0H(r0)
            r6 = 0
            X.6oS r0 = X.C318116oQ.A00(r2)
            r4 = 0
            r5 = 14
            X.MEW r1 = new X.MEW
            r1.<init>(r2, r3, r4, r5, r6)
            X.AnonymousClass7TE.A1Z(r1, r0)
            goto L_0x000c
        L_0x0197:
            java.lang.Object r1 = r1.A01
            X.E19 r1 = (X.E19) r1
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A01
            java.lang.String r2 = X.DbS.A0t(r0)
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r0 = 2131969709(0x7f1346ad, float:1.9576349E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            X.FR1 r9 = new X.FR1
            r9.<init>(r3, r2, r0)
            return r9
        L_0x01b8:
            java.lang.Object r3 = r1.A01
            X.E1C r3 = (X.E1C) r3
            X.0eM r0 = r3.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A03
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A01
            java.lang.String r0 = X.DbS.A0t(r0)
            X.FR0 r9 = new X.FR0
            r9.<init>(r2, r1, r0)
            return r9
        L_0x01d4:
            java.lang.Object r0 = r1.A01
            X.H1R r0 = (X.H1R) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.LZx r9 = new X.LZx
            r9.<init>(r0)
            return r9
        L_0x01e4:
            java.lang.Object r0 = r1.A01
            java.lang.Object r9 = X.DbT.A0r(r0)
            return r9
        L_0x01eb:
            java.lang.Object r1 = r1.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.L29 r0 = new X.L29
            r0.<init>(r1)
            X.HDi r9 = new X.HDi
            r9.<init>(r1, r0)
            return r9
        L_0x01fa:
            java.lang.Object r3 = r1.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36598704819408132(0x82065400000d04, double:3.208506526724623E-306)
            int r5 = X.DbS.A04(r2, r3, r0)
            r0 = 36598704819473669(0x82065400010d05, double:3.2085065267660686E-306)
            int r6 = X.DbS.A04(r2, r3, r0)
            r0 = 36598704819539206(0x82065400020d06, double:3.2085065268075145E-306)
            int r7 = X.DbS.A04(r2, r3, r0)
            r0 = 36598704819604743(0x82065400030d07, double:3.2085065268489603E-306)
            int r8 = X.DbS.A04(r2, r3, r0)
            if (r5 <= r8) goto L_0x0286
            r0 = 1
            if (r6 <= r0) goto L_0x0286
            if (r7 <= 0) goto L_0x0286
            if (r8 <= r7) goto L_0x0286
            r0 = 36880179796377914(0x8306540004013a, double:3.386512435569071E-306)
            java.lang.String r2 = X.182.A04(r2, r3, r0)
            int r1 = r2.hashCode()
            r0 = -84784816(0xfffffffffaf24950, float:-6.290114E35)
            if (r1 == r0) goto L_0x0277
            r0 = 1205267773(0x47d6ed3d, float:110042.48)
            if (r1 == r0) goto L_0x0268
            r0 = 1522055658(0x5ab8b9ea, float:2.59979052E16)
            if (r1 != r0) goto L_0x0286
            r0 = 4022(0xfb6, float:5.636E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0286
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
        L_0x0257:
            X.3LO r2 = new X.3LO
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.3LN r9 = new X.3LN
            r10 = r4
            r11 = r2
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0268:
            r0 = 2992(0xbb0, float:4.193E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0286
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            goto L_0x0257
        L_0x0277:
            r0 = 4025(0xfb9, float:5.64E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0286
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0257
        L_0x0286:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x0257
        L_0x0289:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2AQ r9 = new X.2AQ
            r9.<init>(r0)
            return r9
        L_0x0293:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2nN r9 = new X.2nN
            r9.<init>(r0)
            return r9
        L_0x029d:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2Kq r9 = new X.2Kq
            r9.<init>(r0)
            return r9
        L_0x02a7:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2Kl r9 = new X.2Kl
            r9.<init>(r0)
            return r9
        L_0x02b1:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2BD r9 = new X.2BD
            r9.<init>(r0)
            return r9
        L_0x02bb:
            java.lang.Object r0 = r1.A01
            X.5Ft r0 = (X.C283015Ft) r0
            android.content.Context r0 = r0.mAppContext
            X.385 r9 = X.AnonymousClass385.A00(r0)
            return r9
        L_0x02c6:
            X.08y r3 = X.09i.A0A
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.Object r0 = r1.A01
            X.5Ft r0 = (X.C283015Ft) r0
            androidx.work.WorkerParameters r0 = r0.mWorkerParams
            X.3tw r1 = r0.A02
            r0 = 1042(0x412, float:1.46E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.A03(r0)
            X.DbS.A1A(r2, r0)
            com.instagram.common.session.UserSession r9 = r3.A07(r2)
            return r9
        L_0x02e6:
            java.lang.Object r0 = r1.A01
            X.VZe r0 = (X.C17525VZe) r0
            android.view.View r1 = r0.A00
            r0 = 2131437544(0x7f0b27e8, float:1.849699E38)
            goto L_0x0317
        L_0x02f0:
            java.lang.Object r0 = r1.A01
            X.Vbp r0 = (X.C17659Vbp) r0
            android.view.View r1 = r0.A00
            r0 = 2131437540(0x7f0b27e4, float:1.8496982E38)
            goto L_0x0317
        L_0x02fa:
            java.lang.Object r0 = r1.A01
            X.Vbp r0 = (X.C17659Vbp) r0
            android.view.View r1 = r0.A00
            r0 = 2131437535(0x7f0b27df, float:1.8496971E38)
            goto L_0x034d
        L_0x0304:
            java.lang.Object r0 = r1.A01
            X.Vbp r0 = (X.C17659Vbp) r0
            android.view.View r1 = r0.A00
            r0 = 2131437533(0x7f0b27dd, float:1.8496967E38)
            goto L_0x034d
        L_0x030e:
            java.lang.Object r0 = r1.A01
            X.Vbp r0 = (X.C17659Vbp) r0
            android.view.View r1 = r0.A00
            r0 = 2131437531(0x7f0b27db, float:1.8496963E38)
        L_0x0317:
            android.view.View r9 = X.DbY.A0F(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r9, r0)
            return r9
        L_0x0321:
            java.lang.Object r0 = r1.A01
            X.Vbp r0 = (X.C17659Vbp) r0
            android.view.View r1 = r0.A00
            r0 = 2131437537(0x7f0b27e1, float:1.8496975E38)
            android.view.View r9 = X.DbY.A0F(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r9, r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.content.Context r1 = r1.getContext()
            r0 = 2130970246(0x7f040686, float:1.7549197E38)
            int r0 = X.2Yu.A0F(r1, r0)
            r9.setTextColor(r0)
            return r9
        L_0x0344:
            java.lang.Object r0 = r1.A01
            X.Vbp r0 = (X.C17659Vbp) r0
            android.view.View r1 = r0.A00
            r0 = 2131437529(0x7f0b27d9, float:1.849696E38)
        L_0x034d:
            android.view.View r9 = X.DbY.A0F(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r9, r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.content.Context r1 = r1.getContext()
            r0 = 2130971410(0x7f040b12, float:1.7551558E38)
            int r0 = X.2Yu.A0F(r1, r0)
            r9.setTextColor(r0)
            return r9
        L_0x0367:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.SHQ r9 = new X.SHQ
            r9.<init>(r0)
            return r9
        L_0x0371:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.90R r9 = new X.90R
            r9.<init>(r0)
            return r9
        L_0x037b:
            java.lang.Object r0 = r1.A01
            X.Dkq r0 = (X.C46763Dkq) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            boolean r0 = X.C49785F6t.A01(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x038a:
            java.lang.Object r4 = r1.A01
            X.E2p r4 = (X.C47443E2p) r4
            X.0eM r0 = r4.A00
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x03a2
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            com.instagram.api.schemas.IGRevShareProductType r2 = (com.instagram.api.schemas.IGRevShareProductType) r2
            if (r2 != 0) goto L_0x03a4
        L_0x03a2:
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
        L_0x03a4:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x03b4
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            java.lang.String r0 = r1.getString(r0)
        L_0x03ae:
            X.EFI r9 = new X.EFI
            r9.<init>(r2, r3, r0)
            return r9
        L_0x03b4:
            r0 = 0
            goto L_0x03ae
        L_0x03b6:
            java.lang.Object r0 = r1.A01
            X.07f r9 = X.DbY.A0I(r0)
            return r9
        L_0x03bd:
            java.lang.Object r9 = r1.A01
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51802G2l.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51802G2l(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }
}
