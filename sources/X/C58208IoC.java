package X;

/* renamed from: X.IoC  reason: case insensitive filesystem */
public final class C58208IoC extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58208IoC(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: type inference failed for: r7v13, types: [X.4Lh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v121, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v219, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x088e, code lost:
        r0 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x091d, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0b61, code lost:
        r2.A0C(r4, r0, r1);
        r2.A0G = r8;
        r2.A0I((java.lang.String) null);
        r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0d42, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0d47, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0d85, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x035b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r30 = this;
            r0 = r30
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0d48;
                case 1: goto L_0x0d20;
                case 2: goto L_0x0d0c;
                case 3: goto L_0x0cc5;
                case 4: goto L_0x0cc5;
                case 5: goto L_0x0caf;
                case 6: goto L_0x0c99;
                case 7: goto L_0x0b76;
                case 8: goto L_0x0b05;
                case 9: goto L_0x0aa9;
                case 10: goto L_0x0a48;
                case 11: goto L_0x09d3;
                case 12: goto L_0x09be;
                case 13: goto L_0x097c;
                case 14: goto L_0x0922;
                case 15: goto L_0x0900;
                case 16: goto L_0x08d3;
                case 17: goto L_0x08b3;
                case 18: goto L_0x0847;
                case 19: goto L_0x05a3;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x0007;
                case 23: goto L_0x0588;
                case 24: goto L_0x0564;
                case 25: goto L_0x0544;
                case 26: goto L_0x0544;
                case 27: goto L_0x0535;
                case 28: goto L_0x051a;
                case 29: goto L_0x0504;
                case 30: goto L_0x0504;
                case 31: goto L_0x04ee;
                case 32: goto L_0x04ce;
                case 33: goto L_0x04b9;
                case 34: goto L_0x047a;
                case 35: goto L_0x044c;
                case 36: goto L_0x03e7;
                case 37: goto L_0x03d6;
                case 38: goto L_0x03ba;
                case 39: goto L_0x02d1;
                case 40: goto L_0x02a1;
                case 41: goto L_0x027f;
                case 42: goto L_0x01b5;
                case 43: goto L_0x0191;
                case 44: goto L_0x017b;
                case 45: goto L_0x0160;
                case 46: goto L_0x00bf;
                case 47: goto L_0x00a1;
                case 48: goto L_0x0080;
                case 49: goto L_0x0056;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A04
            X.IPS r4 = (X.IPS) r4
            boolean r1 = r4.A00
            r3 = 1
            r7 = r1 ^ 1
            r4.A00 = r7
            java.lang.Object r8 = r0.A02
            java.util.List r8 = (java.util.List) r8
            com.instagram.common.session.UserSession r2 = r4.A03
            java.lang.Object r1 = r0.A03
            X.4jz r1 = (X.C272034jz) r1
            int[] r6 = X.C297825sP.A04(r2, r1, r3)
            X.H3l r1 = r4.A02
            boolean r5 = r1.A01
            java.lang.Object r4 = r0.A01
            X.HpB r4 = (X.C55890HpB) r4
            r2 = 0
            int r3 = r8.size()
            if (r7 == 0) goto L_0x003f
        L_0x002f:
            if (r2 >= r3) goto L_0x004f
            java.lang.Object r1 = r8.get(r2)
            X.I5e r1 = (X.C56626I5e) r1
            r0 = r6[r2]
            r1.A04(r0)
            int r2 = r2 + 1
            goto L_0x002f
        L_0x003f:
            if (r2 >= r3) goto L_0x004f
            java.lang.Object r1 = r8.get(r2)
            X.I5e r1 = (X.C56626I5e) r1
            r0 = r6[r2]
            r1.A03(r0)
            int r2 = r2 + 1
            goto L_0x003f
        L_0x004f:
            X.I6I r0 = X.I6I.A00
            r0.A06(r4, r5, r7)
            goto L_0x0d83
        L_0x0056:
            java.lang.Object r2 = r0.A04
            X.33e r2 = (X.C2362933e) r2
            X.33Z r1 = r2.A05
            X.0eM r1 = r1.A0B
            java.lang.Object r3 = r1.getValue()
            X.4Fq r3 = (X.C262714Fq) r3
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r0.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            int r8 = r7.getPosition()
            java.lang.Object r0 = r0.A03
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r0)
            X.4DU r6 = r2.A06
            r9 = 0
            X.4Fw r4 = r3.A01(r4, r5, r6, r7, r8, r9)
            return r4
        L_0x0080:
            java.lang.Object r5 = r0.A04
            java.lang.Object r4 = r0.A03
            java.lang.Object r2 = r0.A02
            r1 = 1
            X.GPh r3 = new X.GPh
            r3.<init>(r1, r4, r5, r2)
            java.lang.Object r2 = r0.A01
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r1 = 0
            r0 = 0
            r2.A0L(r3, r1, r0)
            r1 = 32
            X.Inr r0 = new X.Inr
            r0.<init>(r1, r3, r2)
            X.3dj r4 = X.C51965G9l.A0V(r0)
            return r4
        L_0x00a1:
            java.lang.Object r1 = r0.A04
            X.GuJ r1 = (X.C53790GuJ) r1
            float r9 = r1.A00
            X.HLD r6 = r1.A02
            java.lang.Object r1 = r0.A03
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r5 = r1.A03
            X.Gms r5 = (X.C53368Gms) r5
            java.lang.Object r8 = r0.A02
            X.0sL r8 = (X.0sL) r8
            java.lang.Object r7 = r0.A01
            X.0sP r7 = (X.0sP) r7
            X.GiW r4 = new X.GiW
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x00bf:
            java.lang.Object r6 = r0.A04
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r2 = r0.A02
            X.2Dm r2 = (X.2Dm) r2
            java.lang.Object r5 = r0.A01
            X.2Ep r5 = (X.AnonymousClass2Ep) r5
            java.lang.Object r1 = r0.A03
            java.util.Collection r1 = (java.util.Collection) r1
            X.C51974G9v.A1O(r6, r2, r5, r1)
            java.lang.String r3 = r5.C6C()
            if (r3 == 0) goto L_0x0d83
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0d83
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x00e6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r1 = r4.next()
            X.3su r1 = (X.C254703su) r1
            java.lang.String r0 = r1.A0g()
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r5.CVb()
            if (r0 != 0) goto L_0x010a
            boolean r0 = r5.CVZ(r6)
            if (r0 != 0) goto L_0x010a
            boolean r0 = r1.A1T()
            if (r0 == 0) goto L_0x00e6
        L_0x010a:
            java.lang.String r0 = r1.A0g()
            if (r0 == 0) goto L_0x0114
            r11.add(r0)
            goto L_0x00e6
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0119:
            X.C370748x0.A00()
            X.MdY r7 = X.C66843Mdb.A01(r6)
            java.lang.Long r0 = r5.C6I()
            long r14 = r0.longValue()
            X.7Qc r8 = new X.7Qc
            r8.<init>(r5)
            java.lang.String r9 = X.AnonymousClass7TF.A0b()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36600366978109296(0x8207d700610f70, double:3.209557682580215E-306)
            long r16 = X.182.A01(r4, r6, r0)
            boolean r0 = r5.Axj()
            if (r0 == 0) goto L_0x0157
            r13 = 2
        L_0x0143:
            r12 = 0
            r0 = 690(0x2b2, float:9.67E-43)
            java.lang.String r10 = X.C66579MXk.A00(r0)
            X.0eP r0 = r7.A09(r8, r9, r10, r11, r12, r13, r14, r16)
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            r2.FKK(r0, r3)
            goto L_0x0d83
        L_0x0157:
            boolean r0 = r5.CVE()
            boolean r13 = X.AnonymousClass7TF.A1P(r0)
            goto L_0x0143
        L_0x0160:
            java.lang.Object r1 = r0.A04
            X.Ma7 r1 = (X.C66638Ma7) r1
            X.ONf r4 = r1.A02
            java.lang.Object r1 = r0.A02
            X.1OS r1 = (X.1OS) r1
            java.lang.String r3 = r1.A05
            X.4gN r2 = X.C270214gN.A0M
            java.lang.Object r1 = r0.A01
            X.Pwk r1 = (X.C74551Pwk) r1
            java.lang.Object r0 = r0.A03
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r0
            r4.A01(r0, r1, r2, r3)
            goto L_0x0d83
        L_0x017b:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A04
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A03
            X.1ua r1 = (X.1ua) r1
            java.lang.Object r0 = r0.A02
            X.7IF r0 = (X.AnonymousClass7IF) r0
            X.Lqb r4 = new X.Lqb
            r4.<init>(r3, r2, r0, r1)
            return r4
        L_0x0191:
            java.lang.Object r1 = r0.A03
            X.NYf r1 = (X.C68821NYf) r1
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r3 = r1.A03
            if (r3 == 0) goto L_0x0d83
            java.lang.Object r1 = r0.A02
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r1
            int r2 = r1.A00
            r1 = 2
            if (r2 != r1) goto L_0x0d83
            java.lang.Object r2 = r0.A04
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r0.A01
            X.7FV r0 = (X.AnonymousClass7FV) r0
            boolean r1 = r0.CU2()
            X.NmR r0 = X.C69483NmR.IN_THREAD
            X.C71137Odf.A04(r0, r2, r3, r1)
            goto L_0x0d83
        L_0x01b5:
            java.lang.Object r12 = r0.A01
            X.MjJ r12 = (X.C67161MjJ) r12
            java.lang.Object r8 = r0.A02
            X.HoD r8 = (X.C55830HoD) r8
            X.Nk7 r7 = r8.A04
            r4 = 0
            X.Nk7 r6 = X.C69367Nk7.HIDDEN
            if (r7 != r6) goto L_0x01de
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            r2 = 1
            r1 = 508(0x1fc, float:7.12E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r5.putBoolean(r1, r2)
            X.Ma2 r3 = r12.A00
            r2 = 0
            r1 = 139(0x8b, float:1.95E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.A15(r5, r2, r1, r4)
        L_0x01de:
            java.lang.Object r1 = r0.A04
            X.3kE r1 = (X.C249703kE) r1
            java.lang.Object r9 = r0.A03
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            android.view.View r5 = r1.itemView
            X.0qQ.A06(r5)
            X.Mle r10 = r8.A03
            X.2EM r13 = r8.A05
            if (r7 == r6) goto L_0x0d83
            X.0eP r8 = X.OXD.A02(r9, r7, r13)
            java.lang.Object r0 = r8.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0201:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0223
            java.lang.Object r7 = r14.next()
            X.Mle r7 = (X.C67304Mle) r7
            int r6 = r7.A00
            java.lang.Integer r3 = r7.A02
            boolean r2 = X.AnonymousClass7TF.A1W(r7, r10)
            r1 = 7
            X.Plr r0 = new X.Plr
            r0.<init>(r1, r12, r7)
            X.8rI r0 = X.C53153GjP.A00(r5, r3, r0, r6, r2)
            r11.add(r0)
            goto L_0x0201
        L_0x0223:
            java.lang.Object r0 = r8.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x022f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r7 = r8.next()
            X.2EM r7 = (X.2EM) r7
            int r6 = X.OXD.A00(r7)
            java.lang.Integer r3 = X.OXD.A01(r7)
            boolean r2 = X.0qQ.A0K(r7, r13)
            r1 = 8
            X.Plr r0 = new X.Plr
            r0.<init>(r1, r12, r7)
            X.8rI r0 = X.C53153GjP.A00(r5, r3, r0, r6, r2)
            r10.add(r0)
            goto L_0x022f
        L_0x0256:
            java.util.ArrayList r3 = X.00k.A0S(r10, r11)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r5)
            r0 = 0
            X.8Ov r2 = new X.8Ov
            r2.<init>(r1, r9, r0, r4)
            r2.A02(r3)
            android.view.View r0 = r2.getContentView()
            r0.measure(r4, r4)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = -r0
            r2.showAsDropDown(r5, r4, r0)
            goto L_0x0d83
        L_0x027f:
            java.lang.Object r5 = r0.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r1 = r0.A02
            X.3t3 r1 = (X.C254793t3) r1
            java.lang.String r4 = X.C300965yF.A07(r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            java.lang.Object r1 = r0.A03
            java.lang.String r1 = X.DbS.A0q(r1)
            X.C69938Nue.A00(r5, r3, r2, r4, r1)
            java.lang.Object r0 = r0.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.onBackPressed()
            goto L_0x0d83
        L_0x02a1:
            java.lang.Object r7 = r0.A04
            X.QP8 r7 = (X.QP8) r7
            java.lang.Object r2 = r0.A01
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Object r6 = r2.getValue()
            X.QP8 r6 = (X.QP8) r6
            java.lang.Object r5 = r0.A02
            X.5Oz r5 = (X.C284945Oz) r5
            java.lang.Object r4 = r5.getValue()
            android.media.MediaPlayer r4 = (android.media.MediaPlayer) r4
            r1 = 26
            X.PmE r3 = new X.PmE
            r3.<init>(r2, r1)
            r2 = 27
            X.PmE r1 = new X.PmE
            r1.<init>(r5, r2)
            X.C56291Hw4.A00(r4, r7, r6, r3, r1)
            java.lang.Object r0 = r0.A03
            X.C51965G9l.A1W(r0, r7)
            goto L_0x0d83
        L_0x02d1:
            java.lang.Object r4 = r0.A03
            X.HqG r4 = (X.C55952HqG) r4
            X.HOn r3 = X.C54682HOn.TAP_DONE
            java.lang.Object r8 = r0.A04
            X.GhI r8 = (X.C53027GhI) r8
            X.0Ud r2 = r8.A07
            java.lang.Object r1 = r2.getValue()
            X.GnO r1 = (X.C53391GnO) r1
            java.lang.String r1 = r1.A06
            if (r1 == 0) goto L_0x03b7
            X.Kk1 r1 = X.C62639Kk1.AI_GENERATED
        L_0x02e9:
            r4.A00(r3, r1)
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            r3 = 0
            X.0qQ.A0B(r4, r3)
            java.lang.Object r1 = r2.getValue()
            X.GnO r1 = (X.C53391GnO) r1
            java.lang.Object r7 = r1.A02
            java.lang.Object r1 = r2.getValue()
            X.GnO r1 = (X.C53391GnO) r1
            java.lang.String r6 = r1.A06
            if (r7 == 0) goto L_0x037b
            com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageRepository r5 = r8.A03
            X.3t3 r1 = r8.A04
            java.lang.String r14 = X.C300965yF.A07(r1)
            r3 = 2
            X.0qQ.A0B(r14, r3)
            long r1 = java.lang.System.nanoTime()
            java.lang.String r13 = java.lang.String.valueOf(r1)
            com.instagram.common.session.UserSession r9 = r5.A00
            X.TNd r2 = new X.TNd
            r2.<init>(r7, r9, r13, r3)
            r1 = 679(0x2a7, float:9.51E-43)
            X.5g0 r5 = new X.5g0
            r5.<init>(r2, r1)
            X.NHr r7 = new X.NHr
            r7.<init>(r9, r3)
            r8 = 0
            X.NQR r6 = new X.NQR
            r10 = r8
            r11 = r8
            r12 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r5.A00 = r6
        L_0x0338:
            X.1ES.A03(r5)
        L_0x033b:
            java.lang.Object r7 = r0.A02
            X.OJf r7 = (X.OJf) r7
            X.NIZ r0 = r7.A00
            X.0eM r0 = r0.A03
            java.lang.Object r6 = r0.getValue()
            X.GhI r6 = (X.C53027GhI) r6
            X.0Ud r2 = r6.A07
            java.lang.Object r0 = r2.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            java.lang.String r1 = r0.A05
            java.lang.String r0 = r6.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0376
            com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageRepository r5 = r6.A03
            X.3t3 r3 = r6.A04
            java.lang.Object r0 = r2.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            java.lang.String r2 = r0.A05
            boolean r1 = r6.A08
            r0 = 2
            X.0qQ.A0B(r2, r0)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.7ZA r0 = X.C69942Nui.A00(r0, r3)
            r0.AGp(r4, r3, r2, r1)
        L_0x0376:
            r7.A00()
            goto L_0x0d83
        L_0x037b:
            if (r6 == 0) goto L_0x038d
            X.6oS r5 = X.C318116oQ.A00(r8)
            r3 = 0
            r2 = 27
            X.MFW r1 = new X.MFW
            r1.<init>(r8, r6, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r5)
            goto L_0x033b
        L_0x038d:
            java.lang.Object r1 = r2.getValue()
            X.GnO r1 = (X.C53391GnO) r1
            java.lang.Object r1 = r1.A01
            if (r1 != 0) goto L_0x033b
            com.instagram.common.typedurl.ImageUrl r1 = r8.A01
            if (r1 == 0) goto L_0x033b
            com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageRepository r2 = r8.A03
            X.3t3 r1 = r8.A04
            X.3t0 r1 = X.C300965yF.A01(r1)
            java.lang.String r1 = r1.A00
            X.0qQ.A0B(r1, r3)
            com.instagram.common.session.UserSession r3 = r2.A00
            X.1OC r5 = com.instagram.direct.request.DirectThreadApi.A05(r3, r1)
            r2 = 1
            X.NHr r1 = new X.NHr
            r1.<init>(r3, r2)
            r5.A00 = r1
            goto L_0x0338
        L_0x03b7:
            r1 = 0
            goto L_0x02e9
        L_0x03ba:
            java.lang.Object r1 = r0.A03
            X.OMU r1 = (X.OMU) r1
            if (r1 == 0) goto L_0x03c3
            r1.A00()
        L_0x03c3:
            java.lang.Object r1 = r0.A04
            X.OJc r1 = (X.OJc) r1
            com.instagram.common.session.UserSession r2 = r1.A00
            java.lang.Object r1 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r0.A01
            com.instagram.clips.intf.ClipsViewerConfig r0 = (com.instagram.clips.intf.ClipsViewerConfig) r0
            X.C250563lf.A0Y(r1, r0, r2)
            goto L_0x0d83
        L_0x03d6:
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            java.util.HashMap r0 = (java.util.HashMap) r0
            X.OWP.A00(r1, r2, r0)
            goto L_0x0d83
        L_0x03e7:
            java.lang.Object r3 = r0.A04
            X.0lg r3 = (X.0lg) r3
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r5 = r0.A03
            com.instagram.model.direct.DirectShareTarget r5 = (com.instagram.model.direct.DirectShareTarget) r5
            java.lang.Object r6 = r0.A02
            X.Nin r6 = (X.C69287Nin) r6
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            r0 = 3015(0xbc7, float:4.225E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r4.putFloat(r1, r0)
            r0 = 3014(0xbc6, float:4.224E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1
            r4.putInt(r1, r0)
            r0 = 3013(0xbc5, float:4.222E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 3154(0xc52, float:4.42E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putString(r1, r0)
            r0 = 1098(0x44a, float:1.539E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putSerializable(r0, r6)
            if (r5 == 0) goto L_0x0434
            r0 = 668(0x29c, float:9.36E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4.putParcelable(r0, r5)
        L_0x0434:
            java.lang.Class<com.instagram.direct.fragment.thread.bottomsheet.activity.DirectThreadBottomSheetModalActivity> r1 = com.instagram.direct.fragment.thread.bottomsheet.activity.DirectThreadBottomSheetModalActivity.class
            r0 = 1277(0x4fd, float:1.79E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.6W8 r1 = X.AnonymousClass6W8.A03(r2, r4, r3, r1, r0)
            r1.A07()
            int[] r0 = com.instagram.modal.ModalActivity.A08
            r1.A0J = r0
            r1.A0C(r2)
            goto L_0x0d83
        L_0x044c:
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r0.A03
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r1 = r0.A02
            androidx.fragment.app.FragmentActivity r5 = X.DbT.A0E(r1)
            java.lang.Object r1 = r0.A04
            X.LDs r1 = (X.C63933LDs) r1
            X.3Q2 r11 = r1.A03
            X.82q r8 = r1.A00
            X.LnT r9 = new X.LnT
            r9.<init>((X.C63933LDs) r1)
            X.Lo7 r10 = new X.Lo7
            r10.<init>(r1)
            r0 = 13
            X.Jbg r12 = new X.Jbg
            r12.<init>(r1, r0)
            r13 = 0
            X.LoA r4 = new X.LoA
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
        L_0x047a:
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r10 = r0.A03
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.Object r9 = r0.A02
            X.4DH r9 = (X.AnonymousClass4DH) r9
            X.80X r18 = X.AnonymousClass80X.SUB_FRAGMENT
            com.instagram.music.common.constants.AudioTrackType r2 = com.instagram.music.common.constants.AudioTrackType.ORIGINAL
            com.instagram.music.common.constants.AudioTrackType r1 = com.instagram.music.common.constants.AudioTrackType.REACTIVE
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r2, r1)
            X.0qQ.A07(r7)
            java.lang.Object r15 = r0.A04
            X.IQE r15 = (X.IQE) r15
            r0 = 1
            X.LnN r14 = new X.LnN
            r14.<init>(r0)
            r6 = 0
            com.instagram.api.schemas.MusicProduct r8 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            r22 = 0
            X.89j r17 = X.C3515689j.UNKNOWN
            X.89k r4 = new X.89k
            r11 = r6
            r12 = r6
            r13 = r6
            r16 = r6
            r19 = r6
            r20 = r0
            r21 = r0
            r23 = r22
            r24 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r4
        L_0x04b9:
            java.lang.Object r2 = r0.A01
            X.5Oz r2 = (X.C284945Oz) r2
            r1 = 1
            X.C51967G9n.A16(r2, r1)
            java.lang.Object r3 = r0.A04
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r0.A02
            r1 = 24
            X.C51971G9r.A1Q(r2, r3, r1)
            goto L_0x088e
        L_0x04ce:
            java.lang.Object r9 = r0.A03
            X.86j r9 = (X.C3507986j) r9
            java.lang.Object r1 = r0.A01
            X.80D r1 = (X.AnonymousClass80D) r1
            com.instagram.common.session.UserSession r6 = r1.A0S
            X.0qQ.A07(r6)
            android.app.Activity r5 = r1.A05
            X.0qQ.A07(r5)
            java.lang.Object r7 = r0.A04
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = (com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider) r7
            java.lang.Object r8 = r0.A02
            X.86h r8 = (X.AnonymousClass86h) r8
            X.86m r4 = new X.86m
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x04ee:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A04
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            X.82W r1 = (X.AnonymousClass82W) r1
            java.lang.Object r0 = r0.A03
            X.81r r0 = (X.C3497681r) r0
            X.8nj r4 = new X.8nj
            r4.<init>(r3, r0, r1, r2)
            return r4
        L_0x0504:
            java.lang.Object r3 = r0.A02
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r1 = r0.A04
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A03
            X.821 r0 = (X.AnonymousClass821) r0
            X.8Xk r4 = new X.8Xk
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x051a:
            java.lang.Object r3 = r0.A04
            X.GOK r3 = (X.GOK) r3
            java.lang.Object r1 = r0.A03
            android.content.Context r2 = X.C51966G9m.A0Q(r1)
            java.lang.Object r1 = r0.A01
            X.GMQ r1 = (X.GMQ) r1
            java.lang.Object r1 = r1.A05
            X.3Zt r1 = (X.C243673Zt) r1
            java.lang.Object r0 = r0.A02
            X.2Wa r0 = (X.2Wa) r0
            X.GOK.A05(r2, r1, r0, r3)
            goto L_0x0d83
        L_0x0535:
            java.lang.Object r6 = r0.A02
            java.lang.Object r7 = r0.A03
            java.lang.Object r8 = r0.A01
            java.lang.Object r9 = r0.A04
            r5 = 0
            X.IaG r4 = new X.IaG
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0544:
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            r2 = 8
            r1.setVisibility(r2)
            java.lang.Object r1 = r0.A03
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            java.lang.Object r1 = r0.A04
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            goto L_0x0d83
        L_0x0564:
            java.lang.Object r1 = r0.A03
            X.GgO r1 = (X.C52971GgO) r1
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = r1.A0A
            r1.A0D()
            java.lang.Object r1 = r0.A01
            X.7ai r1 = (X.C334127ai) r1
            X.9IW r1 = (X.AnonymousClass9IW) r1
            java.lang.Object r1 = r1.A02
            int r3 = X.DbS.A05(r1)
            r2 = 1
            X.9I0 r1 = new X.9I0
            r1.<init>(r3, r2)
            java.lang.Object r0 = r0.A02
            android.content.Context r0 = (android.content.Context) r0
            X.C334177an.A00(r0, r1)
            goto L_0x0d83
        L_0x0588:
            java.lang.Object r4 = r0.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A03
            X.4DH r3 = (X.AnonymousClass4DH) r3
            java.lang.Object r1 = r0.A01
            X.7ag r1 = (X.C334107ag) r1
            X.7ch r1 = (X.C335277ch) r1
            boolean r2 = r1.A01
            X.1Xj r1 = r1.A00
            java.lang.Object r0 = r0.A02
            X.4DU r0 = (X.AnonymousClass4DU) r0
            X.C334337b6.A06(r3, r4, r1, r0, r2)
            goto L_0x0d83
        L_0x05a3:
            r21 = 2
            r6 = 0
            java.lang.String r2 = "FACE_BBOX"
            r20 = 1
            java.lang.String r1 = "FACE_EULER_ANGLE"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            X.0sr.A1P(r1)
            java.lang.Object r1 = r0.A04
            X.H8K r1 = (X.H8K) r1
            X.0eM r1 = r1.A02
            java.lang.Object r4 = r1.getValue()
            X.Hls r4 = (X.C55695Hls) r4
            java.lang.Object r2 = r0.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            X.XH4 r1 = new X.XH4
            r1.<init>(r2)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r1)
            java.lang.String r1 = r4.A00
            if (r1 == 0) goto L_0x07f5
            X.7xm r3 = r4.A01
            if (r3 != 0) goto L_0x05fb
            X.7xm r3 = X.C347997xi.A00(r1)     // Catch:{ Exception -> 0x05db }
            r4.A01 = r3     // Catch:{ Exception -> 0x05db }
            goto L_0x05fb
        L_0x05db:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            r1 = 455(0x1c7, float:6.38E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.append(r1)
            r2.append(r3)
            r2.toString()
            X.XUJ r1 = new X.XUJ
            r1.<init>()
            X.XHE r2 = new X.XHE
            r2.<init>(r1)
            goto L_0x080a
        L_0x05fb:
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            android.graphics.Bitmap r22 = X.C51976G9y.A06(r2)
            int r7 = r22.getWidth()
            int r8 = r22.getHeight()
            int r10 = r8 * r7
            int[] r9 = new int[r10]
            r23 = r9
            r24 = r6
            r25 = r7
            r26 = r6
            r27 = r6
            r28 = r7
            r29 = r8
            r22.getPixels(r23, r24, r25, r26, r27, r28, r29)
            int r1 = r7 * 3
            int r1 = r1 * r8
            java.nio.FloatBuffer r5 = org.pytorch.Tensor.allocateFloatBuffer(r1)
            r11 = 0
        L_0x0628:
            if (r11 >= r10) goto L_0x0650
            r13 = r9[r11]
            int r1 = r13 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r4 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r2
            int r1 = r13 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r12 = (float) r1
            float r12 = r12 / r2
            r1 = r13 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r2
            int r2 = r11 * 3
            r5.put(r2, r1)
            int r1 = r2 + 1
            r5.put(r1, r12)
            int r1 = r2 + 2
            r5.put(r1, r4)
            int r11 = r11 + 1
            goto L_0x0628
        L_0x0650:
            r13 = 4
            long[] r4 = new long[r13]
            r1 = 1
            r4[r6] = r1
            long r1 = (long) r8
            r4[r20] = r1
            long r1 = (long) r7
            r4[r21] = r1
            r1 = 3
            r7 = 3
            r4[r7] = r1
            X.XF6 r1 = X.XF6.CONTIGUOUS
            org.pytorch.Tensor r1 = org.pytorch.Tensor.fromBlob((java.nio.FloatBuffer) r5, (long[]) r4, (X.XF6) r1)
            org.pytorch.IValue r1 = org.pytorch.IValue.from((org.pytorch.Tensor) r1)
            org.pytorch.IValue[] r2 = new org.pytorch.IValue[]{r1}
            X.8EJ r1 = r3.A00
            org.pytorch.IValue r2 = r1.forward(r2)
            boolean r1 = r2.isTuple()
            if (r1 == 0) goto L_0x0800
            org.pytorch.IValue[] r2 = r2.toTuple()
            java.util.ArrayList r12 = X.DbV.A15(r2)
            int r1 = r2.length
            if (r1 <= r7) goto L_0x0802
            r1 = r2[r6]
            org.pytorch.Tensor r1 = r1.toTensor()
            float[] r1 = r1.getDataAsFloatArray()
            int r1 = r1.length
            r22 = r1
            r1 = r2[r21]
            org.pytorch.Tensor r1 = r1.toTensor()
            float[] r19 = r1.getDataAsFloatArray()
            r1 = r2[r13]
            org.pytorch.Tensor r1 = r1.toTensor()
            float[] r18 = r1.getDataAsFloatArray()
            r10 = 0
        L_0x06a9:
            r1 = r22
            if (r10 >= r1) goto L_0x0802
            X.0qQ.A0A(r18)
            int r2 = r10 * 3
            int r1 = r2 + 3
            X.2HY r2 = X.C229632nm.A0C(r2, r1)
            r1 = r18
            float[] r5 = X.03t.A0R(r2, r1)
            int r1 = r5.length
            if (r1 == r7) goto L_0x0775
            float[] r5 = new float[r6]
        L_0x06c3:
            X.0qQ.A0A(r19)
            int r2 = r10 * 4
            int r1 = r2 + 4
            X.2HY r2 = X.C229632nm.A0C(r2, r1)
            r1 = r19
            float[] r15 = X.03t.A0R(r2, r1)
            int r2 = r5.length
            r1 = 9
            if (r2 == r1) goto L_0x070a
            float[] r3 = new float[r6]
        L_0x06db:
            int r9 = r3.length
            java.util.ArrayList r8 = X.DbS.A0v(r9)
            r4 = 0
        L_0x06e1:
            if (r4 >= r9) goto L_0x06fb
            r2 = r3[r4]
            r1 = 1127481344(0x43340000, float:180.0)
            float r2 = r2 * r1
            double r1 = (double) r2
            r16 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r1 = r1 / r16
            float r11 = (float) r1
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            r8.add(r1)
            int r4 = r4 + 1
            goto L_0x06e1
        L_0x06fb:
            float[] r2 = X.00k.A0w(r8)
            X.Gja r1 = new X.Gja
            r1.<init>(r15, r5, r2)
            r12.add(r1)
            int r10 = r10 + 1
            goto L_0x06a9
        L_0x070a:
            r1 = 6
            r3 = r5[r1]
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x074c
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x074c
            double r1 = (double) r3
            double r1 = java.lang.Math.asin(r1)
            float r3 = (float) r1
            float r11 = -r3
            r1 = 7
            r3 = r5[r1]
            double r1 = (double) r11
            double r1 = java.lang.Math.cos(r1)
            float r9 = (float) r1
            float r3 = r3 / r9
            double r3 = (double) r3
            r1 = 8
            r1 = r5[r1]
            float r1 = r1 / r9
            double r1 = (double) r1
            double r1 = java.lang.Math.atan2(r3, r1)
            float r8 = (float) r1
            r1 = r5[r7]
            float r1 = r1 / r9
            double r3 = (double) r1
            r1 = r5[r6]
            float r1 = r1 / r9
            double r1 = (double) r1
            double r1 = java.lang.Math.atan2(r3, r1)
            float r9 = (float) r1
        L_0x0743:
            float[] r3 = new float[r7]
            r3[r6] = r11
            r3[r20] = r8
            r3[r21] = r9
            goto L_0x06db
        L_0x074c:
            r9 = 0
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0761
            r11 = 1070141403(0x3fc90fdb, float:1.5707964)
            r1 = r5[r20]
            double r3 = (double) r1
            r1 = r5[r21]
            double r1 = (double) r1
            double r1 = java.lang.Math.atan2(r3, r1)
            float r8 = (float) r1
            float r8 = r8 + r9
            goto L_0x0743
        L_0x0761:
            r11 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5[r20]
            float r1 = -r1
            double r3 = (double) r1
            r1 = r5[r21]
            float r1 = -r1
            double r1 = (double) r1
            double r1 = java.lang.Math.atan2(r3, r1)
            float r3 = (float) r1
            float r8 = r8 + r3
            goto L_0x0743
        L_0x0775:
            r16 = r5[r6]
            float r2 = r16 * r16
            r1 = r5[r20]
            float r1 = r1 * r1
            float r2 = r2 + r1
            r1 = r5[r21]
            float r1 = r1 * r1
            float r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            float r8 = (float) r1
            double r3 = (double) r8
            double r1 = java.lang.Math.cos(r3)
            float r9 = (float) r1
            r17 = 1065353216(0x3f800000, float:1.0)
            float r17 = r17 - r9
            double r1 = java.lang.Math.sin(r3)
            float r3 = (float) r1
            float[] r4 = new float[r7]
            float r16 = r16 / r8
            r4[r6] = r16
            r15 = r5[r20]
            float r15 = r15 / r8
            r4[r20] = r15
            r11 = r5[r21]
            float r11 = r11 / r8
            r4[r21] = r11
            r1 = 9
            float[] r5 = new float[r1]
            float r1 = r17 * r16
            float r1 = r1 * r16
            float r1 = r1 + r9
            r5[r6] = r1
            r16 = r4[r6]
            float r2 = r17 * r16
            float r2 = r2 * r15
            float r1 = r3 * r11
            float r2 = r2 - r1
            r5[r20] = r2
            float r2 = r17 * r16
            float r2 = r2 * r11
            r15 = r4[r20]
            float r1 = r3 * r15
            float r2 = r2 + r1
            r5[r21] = r2
            float r11 = r17 * r15
            float r2 = r11 * r16
            r8 = r4[r21]
            float r1 = r3 * r8
            float r2 = r2 + r1
            r5[r7] = r2
            float r1 = r11 * r15
            float r1 = r1 + r9
            r5[r13] = r1
            r1 = 5
            float r11 = r11 * r8
            float r4 = r3 * r16
            float r11 = r11 - r4
            r5[r1] = r11
            r2 = 6
            float r17 = r17 * r8
            float r1 = r17 * r16
            float r3 = r3 * r15
            float r1 = r1 - r3
            r5[r2] = r1
            r2 = 7
            float r1 = r17 * r15
            float r1 = r1 + r4
            r5[r2] = r1
            r1 = 8
            float r17 = r17 * r8
            float r9 = r9 + r17
            r5[r1] = r9
            goto L_0x06c3
        L_0x07f5:
            X.XUJ r1 = new X.XUJ
            r1.<init>()
            X.XHE r2 = new X.XHE
            r2.<init>(r1)
            goto L_0x080a
        L_0x0800:
            X.0sn r12 = X.0sn.A00
        L_0x0802:
            r14.addAll(r12)
            X.9ZE r2 = new X.9ZE
            r2.<init>(r14)
        L_0x080a:
            boolean r1 = r2 instanceof X.AnonymousClass9ZE
            if (r1 == 0) goto L_0x0832
            java.lang.Object r5 = r0.A03
            java.util.List r5 = (java.util.List) r5
            X.9ZE r2 = (X.AnonymousClass9ZE) r2
            java.util.List r1 = r2.A00
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x081e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x083b
            java.lang.Object r2 = r3.next()
            boolean r1 = r2 instanceof X.C53164Gja
            if (r1 == 0) goto L_0x081e
            if (r2 == 0) goto L_0x081e
            r4.add(r2)
            goto L_0x081e
        L_0x0832:
            boolean r1 = r2 instanceof X.XHE
            if (r1 != 0) goto L_0x083e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x083b:
            r5.addAll(r4)
        L_0x083e:
            java.lang.Object r0 = r0.A02
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            goto L_0x0d83
        L_0x0847:
            java.lang.Object r2 = r0.A01
            com.instagram.api.schemas.IntegrityInterstitialType r1 = com.instagram.api.schemas.IntegrityInterstitialType.WARN_USER
            java.lang.String r3 = "WebLinkHandler"
            if (r2 == r1) goto L_0x0892
            com.instagram.api.schemas.IntegrityInterstitialType r1 = com.instagram.api.schemas.IntegrityInterstitialType.BLOCK_ACCESS
            if (r2 == r1) goto L_0x0892
            java.lang.Object r2 = r0.A04
            X.0lg r2 = (X.0lg) r2
            X.0xG r1 = X.DbS.A0O(r3)
            java.lang.Object r5 = r0.A02
            X.HOZ r5 = (X.HOZ) r5
            X.HO6 r4 = X.HO6.THREADS_TEXT_POST_APP_POST_TEXT
            X.0wc r2 = X.DbX.A0O(r1, r2)
            java.lang.String r1 = "barcelona_link_protection"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x088e
            X.HOO r1 = X.HOO.LEARN_MORE_CLICK
        L_0x0873:
            X.C51965G9l.A19(r1, r3)
            java.lang.String r1 = "callsite"
            r3.A8M(r4, r1)
            r1 = 230(0xe6, float:3.22E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            r3.A8M(r5, r1)
            X.HO7 r2 = X.HO7.A02
            java.lang.String r1 = "component"
            r3.A8M(r2, r1)
            r3.Cgf()
        L_0x088e:
            java.lang.Object r0 = r0.A03
            goto L_0x091d
        L_0x0892:
            java.lang.Object r2 = r0.A04
            X.0lg r2 = (X.0lg) r2
            X.0xG r1 = X.DbS.A0O(r3)
            java.lang.Object r5 = r0.A02
            X.HOZ r5 = (X.HOZ) r5
            X.HO6 r4 = X.HO6.THREADS_TEXT_POST_APP_POST_TEXT
            X.0wc r2 = X.DbX.A0O(r1, r2)
            java.lang.String r1 = "barcelona_link_protection"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x088e
            X.HOO r1 = X.HOO.OPEN_LINK_CLICK
            goto L_0x0873
        L_0x08b3:
            java.lang.Object r1 = r0.A02
            X.DbS.A1U(r1)
            java.lang.Object r2 = r0.A04
            X.5Oz r2 = (X.C284945Oz) r2
            r1 = 0
            X.C51967G9n.A16(r2, r1)
            java.lang.Object r4 = r0.A01
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r3 = r0.A03
            r2 = 0
            r1 = 47
            X.MFS r0 = new X.MFS
            r0.<init>(r3, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r4)
            goto L_0x0d83
        L_0x08d3:
            java.lang.Object r1 = r0.A02
            X.4gU r1 = (X.C270284gU) r1
            boolean r1 = X.C51971G9r.A1X(r1)
            if (r1 != 0) goto L_0x08fd
            java.lang.Object r1 = r0.A01
            X.I4B r1 = (X.I4B) r1
            X.4gU r1 = r1.A06
            boolean r1 = X.C51971G9r.A1X(r1)
            if (r1 != 0) goto L_0x08fd
            java.lang.Object r1 = r0.A04
            X.GgM r1 = (X.C52969GgM) r1
            java.lang.Object r0 = r0.A03
            X.5Oz r0 = (X.C284945Oz) r0
            int r0 = X.C51971G9r.A0B(r0)
            java.lang.String r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x08fd
            goto L_0x0d42
        L_0x08fd:
            r0 = 0
            goto L_0x0d43
        L_0x0900:
            java.lang.Object r3 = r0.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r1 = r0.A02
            int r2 = X.AnonymousClass7TE.A0M(r1)
            X.C2594141p.A00(r3, r2)
            r1 = 13
            if (r2 == r1) goto L_0x091b
            java.lang.Object r1 = r0.A03
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            X.C51967G9n.A16(r1, r0)
            goto L_0x0d83
        L_0x091b:
            java.lang.Object r0 = r0.A04
        L_0x091d:
            X.DbS.A1U(r0)
            goto L_0x0d83
        L_0x0922:
            java.lang.Object r1 = r0.A03
            X.DbS.A1U(r1)
            java.lang.Object r1 = r0.A04
            X.0lg r1 = (X.0lg) r1
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            X.Glw r4 = (X.C53310Glw) r4
            X.3GX r6 = X.AnonymousClass3GX.A00(r1)
            X.0qQ.A07(r6)
            r0 = 35
            X.MMP r3 = new X.MMP
            r3.<init>(r4, r0)
            java.lang.String r0 = "back_press"
            java.util.Set r2 = java.util.Collections.singleton(r0)
            X.0qQ.A07(r2)
            r11 = 0
            X.IL7 r1 = new X.IL7
            r1.<init>(r3, r11)
            r0 = 0
            r10 = 1
            X.4Lh r7 = new X.4Lh
            r7.<init>()
            r7.A01 = r4
            r7.A02 = r5
            r7.A06 = r10
            r7.A04 = r0
            r7.A05 = r2
            r7.A00 = r1
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L_0x0979
            java.util.List r8 = X.AnonymousClass7TE.A1I(r0)
        L_0x0969:
            X.3Ds r1 = X.C238863Ds.PHOTO
            X.3Dt r0 = new X.3Dt
            r0.<init>(r1)
            java.util.List r9 = X.AnonymousClass7TE.A1I(r0)
            r6.A04(r7, r8, r9, r10, r11)
            goto L_0x0d83
        L_0x0979:
            X.0sn r8 = X.0sn.A00
            goto L_0x0969
        L_0x097c:
            java.lang.Object r2 = r0.A04
            X.K86 r2 = (X.K86) r2
            X.0eM r1 = r2.A08
            java.lang.Object r4 = r1.getValue()
            X.Jiz r4 = (X.C60301Jiz) r4
            java.lang.Object r3 = r0.A03
            X.MPr r3 = (X.C66385MPr) r3
            X.Jxt r3 = (X.C61143Jxt) r3
            X.Gn3 r1 = r3.A00
            int r8 = r1.A01
            java.lang.Object r5 = r0.A02
            X.Jw9 r5 = (X.C61071Jw9) r5
            if (r5 == 0) goto L_0x09bc
            X.7Sw r1 = X.C331897Sw.A0A
            android.content.Context r1 = r2.requireContext()
            X.7Sw r2 = X.C331917Sy.A00(r1)
            java.lang.Object r1 = r5.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r1 = r1.getUrl()
            X.0qQ.A07(r1)
            boolean r9 = r2.A07(r1)
        L_0x09b1:
            java.lang.Object r7 = r0.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.Integer r6 = r3.A04
            r4.A02(r5, r6, r7, r8, r9)
            goto L_0x0d83
        L_0x09bc:
            r9 = 0
            goto L_0x09b1
        L_0x09be:
            java.lang.Object r3 = r0.A04
            X.3ka r3 = (X.C249923ka) r3
            java.lang.Object r2 = r0.A01
            com.facebook.tigon.TigonError r2 = (com.facebook.tigon.TigonError) r2
            java.lang.Object r1 = r0.A02
            java.io.IOException r1 = (java.io.IOException) r1
            java.lang.Object r0 = r0.A03
            X.3Iu r0 = (X.C239923Iu) r0
            X.C249923ka.A09(r2, r0, r3, r1)
            goto L_0x0d83
        L_0x09d3:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r5 = r0.A04
            X.Qex r5 = (X.C8010Qex) r5
            com.facebookpay.logging.LoggingContext r3 = r5.A03
            java.lang.Object r1 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r1
            java.lang.String r1 = r1.A0A
            java.lang.Long r1 = X.DbV.A0q(r1)
            r2 = 0
            r4.A0M(r3, r1, r2)
            java.lang.Object r4 = r0.A03
            X.QFO r4 = (X.QFO) r4
            java.lang.Object r6 = r0.A02
            X.SUj r6 = (X.SUj) r6
            com.facebookpay.widget.listcell.ListCell r1 = r4.A01
            r1.setOnClickListener(r2)
            r1.setPrimaryText(r2)
            r1.setSecondaryText(r2)
            r1.setTertiaryText(r2)
            r1.setErrorText(r2)
            android.widget.FrameLayout r0 = r1.A07
            X.AnonymousClass7TH.A0R(r0)
            r1.setActionMenu(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r1.A08(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A09(r0)
            r1.A0A(r0)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            java.lang.Object r0 = r6.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r0
            if (r0 == 0) goto L_0x0a2b
            r1 = 12
            java.lang.String r0 = r0.A0A
            r2.put(r1, r0)
        L_0x0a2b:
            X.07Z r3 = r5.A01
            if (r3 == 0) goto L_0x0d83
            X.0sP r0 = r5.A03
            if (r0 == 0) goto L_0x0d83
            java.lang.Object r2 = r0.invoke(r2)
            X.2Fk r2 = (X.2Fk) r2
            if (r2 == 0) goto L_0x0d83
            r0 = 35
            X.Iwy r1 = new X.Iwy
            r1.<init>(r0, r6, r5, r4)
            r0 = 2
            X.C51969G9p.A15(r3, r2, r1, r0)
            goto L_0x0d83
        L_0x0a48:
            java.lang.Object r7 = r0.A01
            X.68u r7 = (X.C3034368u) r7
            java.lang.Object r6 = r0.A03
            X.4tV r6 = (X.C276544tV) r6
            java.lang.Object r5 = r0.A02
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.Object r4 = r0.A04
            X.6Rm r4 = (X.C307786Rm) r4
            boolean r8 = X.AnonymousClass7TG.A1Z(r7, r6)
            X.01W r0 = X.OUs.A03
            java.lang.Object r1 = r0.A0R()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0d83
            X.OUl r0 = X.OUl.A00
            android.app.Activity r3 = r0.A00(r1)
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            if (r3 == 0) goto L_0x0aa2
            java.lang.String r2 = X.C51972G9s.A0n()
            X.C56480HzC.A00(r2, r1)
            java.util.HashMap r1 = X.C56480HzC.A01
            X.Hlz r0 = new X.Hlz
            r0.<init>(r4, r7, r6)
            r1.put(r2, r0)
            X.H0L r4 = new X.H0L
            r4.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            if (r5 == 0) goto L_0x0a8f
            r1.putAll(r5)
        L_0x0a8f:
            java.lang.String r0 = "prompt_id"
            r1.putString(r0, r2)
            r4.setArguments(r1)
            X.0s1 r2 = X.DbW.A0D(r3)
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            java.lang.String r0 = "consent_screen"
            goto L_0x0b61
        L_0x0aa2:
            java.lang.String r0 = "No active consent flow is opened!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0aa9:
            java.lang.Object r7 = r0.A01
            X.68u r7 = (X.C3034368u) r7
            java.lang.Object r6 = r0.A03
            X.4tV r6 = (X.C276544tV) r6
            java.lang.Object r5 = r0.A02
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.Object r2 = r0.A04
            X.6Rm r2 = (X.C307786Rm) r2
            X.01W r0 = X.OUs.A03
            java.lang.Object r1 = r0.A0R()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0d83
            X.OUl r0 = X.OUl.A00
            android.app.Activity r4 = r0.A00(r1)
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            if (r4 == 0) goto L_0x0afe
            java.lang.String r3 = X.C51972G9s.A0n()
            X.C56480HzC.A00(r3, r1)
            java.util.HashMap r1 = X.C56480HzC.A01
            X.Hlz r0 = new X.Hlz
            r0.<init>(r2, r7, r6)
            r1.put(r3, r0)
            X.GzN r2 = new X.GzN
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "prompt_id"
            r1.putString(r0, r3)
            if (r5 == 0) goto L_0x0af1
            r1.putAll(r5)
        L_0x0af1:
            r2.setArguments(r1)
            X.TG1 r0 = new X.TG1
            r0.<init>(r2, r4)
            r4.runOnUiThread(r0)
            goto L_0x0d83
        L_0x0afe:
            java.lang.String r0 = "No active consent flow is opened!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0b05:
            java.lang.Object r7 = r0.A01
            X.68u r7 = (X.C3034368u) r7
            java.lang.Object r6 = r0.A03
            X.4tV r6 = (X.C276544tV) r6
            java.lang.Object r5 = r0.A02
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.Object r4 = r0.A04
            X.6Rm r4 = (X.C307786Rm) r4
            boolean r8 = X.AnonymousClass7TG.A1Z(r7, r6)
            X.01W r0 = X.OUs.A03
            java.lang.Object r1 = r0.A0R()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0d83
            X.OUl r0 = X.OUl.A00
            android.app.Activity r3 = r0.A00(r1)
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            if (r3 == 0) goto L_0x0b6f
            java.lang.String r2 = X.C51972G9s.A0n()
            X.C56480HzC.A00(r2, r1)
            java.util.HashMap r1 = X.C56480HzC.A01
            X.Hlz r0 = new X.Hlz
            r0.<init>(r4, r7, r6)
            r1.put(r2, r0)
            X.H02 r4 = new X.H02
            r4.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            if (r5 == 0) goto L_0x0b4c
            r1.putAll(r5)
        L_0x0b4c:
            java.lang.String r0 = "prompt_id"
            r1.putString(r0, r2)
            r4.setArguments(r1)
            X.0s1 r2 = X.DbW.A0D(r3)
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            r0 = 693(0x2b5, float:9.71E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
        L_0x0b61:
            r2.A0C(r4, r0, r1)
            r2.A0G = r8
            r0 = 0
            r2.A0I(r0)
            r2.A00()
            goto L_0x0d83
        L_0x0b6f:
            java.lang.String r0 = "No active consent flow is opened!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0b76:
            java.lang.Object r5 = r0.A01
            X.GbJ r5 = (X.C52706GbJ) r5
            java.lang.Object r2 = r0.A04
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.text.Editable r1 = r2.getText()
            r5.A05 = r1
            r4 = 0
            r5.A02 = r4
            java.lang.Object r3 = r0.A03
            X.GbP r3 = (X.C52712GbP) r3
            java.lang.Object r1 = r0.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r3.A00
            r0.remove(r1)
            r2.setOnFocusChangeListener(r4)
            X.GbK r0 = r5.A01
            r2.removeTextChangedListener(r0)
            X.GbO r3 = r5.A03
            if (r3 == 0) goto L_0x0c94
            android.text.Editable r0 = r2.getText()
            android.text.Editable r1 = r3.A0F
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0bb1
            r2.setText(r1)
        L_0x0bb1:
            float r0 = r2.getTextSize()
            float r1 = r3.A03
            r5 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0bbf
            r2.setTextSize(r1)
        L_0x0bbf:
            android.content.res.ColorStateList r1 = r2.getTextColors()
            android.content.res.ColorStateList r0 = r3.A0A
            if (r1 == r0) goto L_0x0bca
            r2.setTextColor(r0)
        L_0x0bca:
            java.lang.CharSequence r0 = r2.getHint()
            java.lang.CharSequence r1 = r3.A0J
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0bd9
            r2.setHint(r1)
        L_0x0bd9:
            android.content.res.ColorStateList r1 = r2.getHintTextColors()
            android.content.res.ColorStateList r0 = r3.A09
            if (r1 == r0) goto L_0x0be4
            r2.setHintTextColor(r0)
        L_0x0be4:
            int r1 = r3.A05
            int r0 = r2.getHighlightColor()
            if (r0 == r1) goto L_0x0bef
            r2.setHighlightColor(r1)
        L_0x0bef:
            int r1 = r2.getGravity()
            int r0 = r3.A04
            if (r1 == r0) goto L_0x0bfa
            r2.setGravity(r0)
        L_0x0bfa:
            android.graphics.Rect r0 = r3.A0B
            int r7 = r0.left
            int r6 = r0.top
            int r1 = r0.right
            int r0 = r0.bottom
            r2.setPadding(r7, r6, r1, r0)
            X.GbN r0 = r3.A0I
            float r7 = r0.A02
            float r6 = r0.A00
            float r1 = r0.A01
            int r0 = r0.A03
            r2.setShadowLayer(r7, r6, r1, r0)
            float r1 = r3.A01
            float r0 = r3.A02
            r2.setLineSpacing(r1, r0)
            boolean r0 = X.C52700GbC.A01()
            if (r0 == 0) goto L_0x0c26
            android.graphics.drawable.Drawable r0 = r3.A0E
            X.C52714GbR.A00(r0, r2)
        L_0x0c26:
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            android.graphics.drawable.Drawable r0 = r3.A0D
            if (r1 == r0) goto L_0x0c31
            r2.setBackground(r0)
        L_0x0c31:
            int r1 = r2.getImeOptions()
            int r0 = r3.A06
            if (r1 == r0) goto L_0x0c3c
            r2.setImeOptions(r0)
        L_0x0c3c:
            int r1 = r2.getInputType()
            int r0 = r3.A07
            if (r1 == r0) goto L_0x0c47
            r2.setInputType(r0)
        L_0x0c47:
            boolean r0 = r3.A0K
            r2.setSingleLine(r0)
            int r1 = r2.getMaxLines()
            int r0 = r3.A08
            if (r1 == r0) goto L_0x0c57
            r2.setMaxLines(r0)
        L_0x0c57:
            android.text.method.KeyListener r1 = r2.getKeyListener()
            android.text.method.KeyListener r0 = r3.A0H
            if (r1 == r0) goto L_0x0c62
            r2.setKeyListener(r0)
        L_0x0c62:
            r2.setEnabled(r5)
            android.graphics.Typeface r0 = r2.getTypeface()
            android.graphics.Typeface r1 = r3.A0C
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0c74
            r2.setTypeface(r1)
        L_0x0c74:
            r2.setOnEditorActionListener(r4)
            android.text.TextUtils$TruncateAt r1 = r2.getEllipsize()
            android.text.TextUtils$TruncateAt r0 = r3.A0G
            if (r1 == r0) goto L_0x0c82
            r2.setEllipsize(r0)
        L_0x0c82:
            float r0 = r3.A00
            r2.setLetterSpacing(r0)
            boolean r1 = r3.A0L
            boolean r0 = r2.getShowSoftInputOnFocus()
            if (r0 == r1) goto L_0x0d83
            r2.setShowSoftInputOnFocus(r1)
            goto L_0x0d83
        L_0x0c94:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0c99:
            java.lang.Object r3 = r0.A03
            java.lang.Double r3 = (java.lang.Double) r3
            java.lang.Object r2 = r0.A02
            java.lang.Double r2 = (java.lang.Double) r2
            java.lang.Object r1 = r0.A04
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.3zy r0 = (X.C258993zy) r0
            X.A7a r4 = new X.A7a
            r4.<init>(r0, r1, r3, r2)
            return r4
        L_0x0caf:
            java.lang.Object r3 = r0.A04
            X.RRF r3 = (X.RRF) r3
            java.lang.Object r2 = r0.A03
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2
            java.lang.Object r1 = r0.A02
            X.0rk r1 = (X.0rk) r1
            java.lang.Object r0 = r0.A01
            android.os.Handler r0 = (android.os.Handler) r0
            X.Iis r4 = new X.Iis
            r4.<init>(r0, r3, r1, r2)
            return r4
        L_0x0cc5:
            java.lang.Object r7 = r0.A03
            X.2Wh r7 = (X.2Wh) r7
            java.lang.Object r1 = r0.A02
            X.7go r1 = (X.C337727go) r1
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.A04
            X.7h8 r0 = (X.C337927h8) r0
            X.7Pn r5 = r0.A08
            X.7gG r4 = X.C337407gI.A00(r7)
            r3 = 0
            r7.A01 = r3
            if (r1 == 0) goto L_0x0ced
            r1.A01 = r3
            X.Hhg r0 = r1.A02
            if (r0 == 0) goto L_0x0ceb
            X.0sP r0 = r0.A00
            r0.invoke(r3)
        L_0x0ceb:
            r1.A00 = r3
        L_0x0ced:
            if (r6 == 0) goto L_0x0d02
            r2 = 0
            int r1 = r6.size()
        L_0x0cf4:
            if (r2 >= r1) goto L_0x0d02
            java.lang.Object r0 = r6.get(r2)
            X.3jg r0 = (X.C249403jg) r0
            r4.A16(r0)
            int r2 = r2 + 1
            goto L_0x0cf4
        L_0x0d02:
            if (r5 == 0) goto L_0x0d07
            r4.A14(r5)
        L_0x0d07:
            r4.A00 = r3
            r7.A0E = r3
            goto L_0x0d83
        L_0x0d0c:
            java.lang.Object r3 = r0.A03
            X.4tV r3 = (X.C276544tV) r3
            java.lang.Object r2 = r0.A04
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object r1 = r0.A01
            X.6Tm r1 = (X.AnonymousClass6Tm) r1
            java.lang.Object r0 = r0.A02
            X.6Rm r0 = (X.C307786Rm) r0
            X.C307886Rw.A03(r0, r3, r1, r2)
            goto L_0x0d83
        L_0x0d20:
            java.lang.Object r1 = r0.A04
            X.Gc7 r1 = (X.C52754Gc7) r1
            X.5Oz r1 = r1.A0A
            boolean r1 = X.C51971G9r.A1W(r1)
            if (r1 != 0) goto L_0x0d33
            java.lang.Object r1 = r0.A01
            X.I1b r1 = (X.C56547I1b) r1
            r1.A01()
        L_0x0d33:
            java.lang.Object r0 = r0.A03
            X.Gb9 r0 = (X.C52697Gb9) r0
            X.0V2 r1 = X.C52697Gb9.A00(r0)
            if (r1 == 0) goto L_0x0d42
            X.0gF r0 = X.C60340gF.A00
            r1.FIA(r0)
        L_0x0d42:
            r0 = 1
        L_0x0d43:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0d48:
            java.lang.Object r8 = r0.A02
            java.lang.Object r3 = r0.A04
            X.GRG r3 = (X.GRG) r3
            java.lang.Object r1 = r3.A03
            boolean r1 = X.0qQ.A0K(r8, r1)
            if (r1 == 0) goto L_0x0d60
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r3.A04
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0d83
        L_0x0d60:
            java.lang.Object r9 = r0.A03
            java.lang.Object r5 = r0.A01
            X.GRJ r5 = (X.GRJ) r5
            r3.A03 = r8
            r3.A04 = r9
            r3.A01 = r5
            X.5an r7 = r3.A07
            r6 = 0
            X.64f r4 = new X.64f
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A02 = r4
            X.GRI r0 = r3.A09
            r1 = 1
            X.5Oz r0 = r0.A02
            X.C51967G9n.A16(r0, r1)
            r0 = 0
            r3.A05 = r0
            r3.A06 = r1
        L_0x0d83:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58208IoC.invoke():java.lang.Object");
    }
}
