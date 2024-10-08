package X;

public final class J6H extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static Object A00(Object obj, J6H j6h) {
        0qQ.A0B(obj, 0);
        return j6h.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6H(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.3V3, X.GDy] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        r2.Epw(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03ee, code lost:
        if (r1.A02(r4) != false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f8, code lost:
        if (r1 != null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fa, code lost:
        r0 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = (X.C62320sa) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x025f, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0325, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0326, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r3 = r18
            r0 = r19
            int r1 = r3.A00
            switch(r1) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001d;
                case 2: goto L_0x002d;
                case 3: goto L_0x0040;
                case 4: goto L_0x0306;
                case 5: goto L_0x0316;
                case 6: goto L_0x0306;
                case 7: goto L_0x004c;
                case 8: goto L_0x0058;
                case 9: goto L_0x0071;
                case 10: goto L_0x007e;
                case 11: goto L_0x008c;
                case 12: goto L_0x02f4;
                case 13: goto L_0x032a;
                case 14: goto L_0x008c;
                case 15: goto L_0x0099;
                case 16: goto L_0x00d6;
                case 17: goto L_0x00e3;
                case 18: goto L_0x00ee;
                case 19: goto L_0x0100;
                case 20: goto L_0x010d;
                case 21: goto L_0x0134;
                case 22: goto L_0x0147;
                case 23: goto L_0x015e;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x0383;
                case 27: goto L_0x016a;
                case 28: goto L_0x0180;
                case 29: goto L_0x018e;
                case 30: goto L_0x01d7;
                case 31: goto L_0x01df;
                case 32: goto L_0x0395;
                case 33: goto L_0x01ef;
                case 34: goto L_0x01fe;
                case 35: goto L_0x020b;
                case 36: goto L_0x0218;
                case 37: goto L_0x022e;
                case 38: goto L_0x0237;
                case 39: goto L_0x0244;
                case 40: goto L_0x0251;
                case 41: goto L_0x026b;
                case 42: goto L_0x0275;
                case 43: goto L_0x03b8;
                case 44: goto L_0x0280;
                case 45: goto L_0x0297;
                case 46: goto L_0x02b6;
                case 47: goto L_0x02c0;
                case 48: goto L_0x02db;
                case 49: goto L_0x03f6;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r3.A01
        L_0x000b:
            X.0sa r0 = (X.C62320sa) r0
        L_0x000d:
            r0.invoke()
        L_0x0010:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0013:
            java.lang.Object r0 = r3.A01
            X.FEX r0 = (X.FEX) r0
            X.1a8 r0 = r0.A01
            r0.A01()
            goto L_0x0010
        L_0x001d:
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = (com.instagram.api.schemas.FanClubNextStepsRecommendationsType) r0
            java.lang.Object r1 = A00(r0, r3)
            X.Jgl r1 = (X.C60166Jgl) r1
            X.05G r2 = r1.A03
            X.Dtn r1 = new X.Dtn
            r1.<init>(r0)
            goto L_0x003c
        L_0x002d:
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = (com.instagram.api.schemas.FanClubNextStepsRecommendationsType) r0
            java.lang.Object r1 = A00(r0, r3)
            X.JiU r1 = (X.C60273JiU) r1
            X.05G r2 = r1.A05
            X.EKw r1 = new X.EKw
            r1.<init>(r0)
        L_0x003c:
            r2.Epw(r1)
            goto L_0x0010
        L_0x0040:
            X.8fe r0 = (X.C361088fe) r0
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r3.A01
            X.R8I r1 = (X.R8I) r1
            X.R8I.A00(r0, r1)
            goto L_0x0010
        L_0x004c:
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r3.A01
            X.IHg r0 = (X.C56911IHg) r0
            X.C56911IHg.A07(r0, r1)
            goto L_0x0010
        L_0x0058:
            X.2WA r4 = X.G9w.A0R(r0)
            java.lang.Object r0 = r3.A01
            X.3iP r0 = (X.C248683iP) r0
            X.3ha r2 = r0.A00
            X.JwG r0 = r2.A02
            java.lang.Object r1 = r0.A00
            X.0sL r1 = (X.0sL) r1
            android.view.View r0 = r4.A00
            X.0qQ.A06(r0)
            r1.invoke(r0, r2)
            goto L_0x0010
        L_0x0071:
            java.lang.Object r0 = r3.A01
            X.3iD r0 = (X.C248573iD) r0
            X.JwM r0 = r0.A00
            java.lang.Object r0 = r0.A00
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r0 = r0.A00
            goto L_0x000b
        L_0x007e:
            android.view.View r2 = X.C51969G9p.A0O(r0)
            java.lang.Object r1 = r3.A01
            X.3Dp r1 = (X.C238833Dp) r1
            X.3Ds r0 = X.C238863Ds.USER_MESSAGE
            r1.A05(r2, r0)
            goto L_0x0010
        L_0x008c:
            java.lang.Object r0 = r3.A01
            java.lang.Object r0 = X.C51968G9o.A0y(r0)
            java.util.Timer r0 = (java.util.Timer) r0
            r0.cancel()
            goto L_0x0010
        L_0x0099:
            X.IIR r0 = (X.IIR) r0
            java.lang.Object r7 = A00(r0, r3)
            X.GuI r7 = (X.C53789GuI) r7
            java.util.List r13 = r7.A02
            java.util.Iterator r6 = r13.iterator()
            r14 = 0
        L_0x00a8:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0010
            java.lang.Object r10 = r6.next()
            int r5 = r14 + 1
            if (r14 >= 0) goto L_0x00be
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00be:
            X.1Xj r10 = (X.1Xj) r10
            X.HrJ r8 = r7.A01
            X.4Fw r9 = r7.A00
            X.3W1 r12 = r9.A0G
            X.3dW r11 = r9.A0F
            X.3mp r4 = r8.A00(r9, r10, r11, r12, r13, r14)
            r3 = 0
            X.7en r2 = r0.A00
            r1 = 1120403456(0x42c80000, float:100.0)
            r2.A00(r4, r3, r1, r1)
            r14 = r5
            goto L_0x00a8
        L_0x00d6:
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r3.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r0.A0A(r1)
            goto L_0x0010
        L_0x00e3:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r3.A01
            X.Gux r0 = (X.C53830Gux) r0
            X.0sP r1 = r0.A00
            goto L_0x00fa
        L_0x00ee:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r3.A01
            X.GuJ r0 = (X.C53790GuJ) r0
            X.0sP r1 = r0.A04
            if (r1 == 0) goto L_0x0010
        L_0x00fa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x025f
        L_0x0100:
            java.lang.Object r1 = A00(r0, r3)
            X.335 r1 = (X.AnonymousClass335) r1
            java.util.HashMap r1 = r1.A00
            r1.remove(r0)
            goto L_0x0010
        L_0x010d:
            X.2WE r4 = X.C51968G9o.A0f(r0)
            java.lang.Object r2 = r3.A01
            X.GxR r2 = (X.C53983GxR) r2
            int r0 = r2.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            com.instagram.user.model.User r6 = r2.A03
            java.lang.String r7 = r2.A04
            X.0sL r8 = r2.A06
            X.0sL r9 = r2.A07
            X.0sL r10 = r2.A05
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10}
            r0 = 36
            X.JGK r0 = X.JGK.A01(r2, r0)
            r4.A02(r0, r1)
            goto L_0x0010
        L_0x0134:
            java.lang.Object r3 = r3.A01
            X.GxR r3 = (X.C53983GxR) r3
            X.0sL r2 = r3.A08
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.instagram.user.model.User r0 = r3.A03
            r2.invoke(r1, r0)
            goto L_0x0010
        L_0x0147:
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.1Yi r4 = X.C48732EjH.A00()
            java.lang.Object r1 = r3.A01
            X.Hic r1 = (X.C55494Hic) r1
            com.instagram.common.session.UserSession r2 = r1.A00
            java.lang.String r1 = "ctd_ad_inspiration_banner"
            r4.A01(r0, r2, r1)
            goto L_0x0010
        L_0x015e:
            java.lang.Object r0 = r3.A01
            X.3iC r0 = (X.C248563iC) r0
            X.3gj r0 = r0.A02
            X.9Ij r0 = r0.A00
            java.lang.Object r0 = r0.A01
            goto L_0x000b
        L_0x016a:
            java.lang.Object r1 = r3.A01
            X.3Zt r1 = (X.C243673Zt) r1
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r1.A00
            java.util.Timer r0 = (java.util.Timer) r0
            if (r0 == 0) goto L_0x017a
            r0.cancel()
        L_0x017a:
            r0 = 0
            r1.A00(r0)
            goto L_0x0010
        L_0x0180:
            java.lang.Object r0 = r3.A01
            X.Gs3 r0 = (X.C53650Gs3) r0
            X.Jvo r0 = r0.A00
            java.lang.Object r0 = r0.A01
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            goto L_0x000b
        L_0x018e:
            X.Hhf r0 = (X.C55435Hhf) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            r13 = 0
            long r14 = X.C56192HuL.A00(r13, r13)
            java.lang.Object r4 = r3.A01
            X.GtO r4 = (X.C53733GtO) r4
            int r1 = r4.A01
            float r3 = (float) r1
            int r1 = r4.A00
            float r1 = (float) r1
            long r16 = X.HSV.A00(r3, r1)
            X.GoC r12 = new X.GoC
            r12.<init>(r13, r14, r16)
            X.JVf r7 = r4.A02
            long r8 = X.C56192HuL.A00(r13, r13)
            long r10 = X.C56192HuL.A00(r3, r1)
            r4 = 0
            android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
            X.0qQ.A0B(r7, r2)
            X.Gnv r5 = new X.Gnv
            r5.<init>(r6, r7, r8, r10)
            X.Go8 r3 = new X.Go8
            r3.<init>(r5)
            r2 = 3
            X.GnR r0 = r0.A00
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            X.Gnx r0 = new X.Gnx
            r0.<init>(r4, r3, r12, r2)
            r1.add(r0)
            goto L_0x0010
        L_0x01d7:
            java.lang.Object r0 = r3.A01
            X.Guy r0 = (X.C53831Guy) r0
            X.0sa r0 = r0.A00
            goto L_0x000d
        L_0x01df:
            com.instagram.ui.mediaactions.LikeActionView r0 = (com.instagram.ui.mediaactions.LikeActionView) r0
            java.lang.Object r1 = A00(r0, r3)
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r1.A0T(r0)
            r1.A0X(r0)
            goto L_0x0010
        L_0x01ef:
            X.1Xj r1 = X.C51968G9o.A0m(r0)
            java.lang.Object r0 = r3.A01
            X.Hou r0 = (X.C55873Hou) r0
            X.3Wa r0 = r0.A06
            r0.D2c(r1)
            goto L_0x0010
        L_0x01fe:
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            java.lang.Object r1 = r3.A01
            X.Hou r1 = (X.C55873Hou) r1
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r1.A00
            r1.onStartTrackingTouch(r0)
            goto L_0x0010
        L_0x020b:
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            java.lang.Object r1 = r3.A01
            X.Hou r1 = (X.C55873Hou) r1
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r1.A00
            r1.onStopTrackingTouch(r0)
            goto L_0x0010
        L_0x0218:
            X.1Xj r2 = X.C51968G9o.A0m(r0)
            java.lang.Object r0 = r3.A01
            X.0lg r0 = (X.0lg) r0
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.3Kh r0 = new X.3Kh
            r0.<init>(r2)
            r1.A00(r0)
            goto L_0x0010
        L_0x022e:
            java.lang.Object r0 = r3.A01
            X.3fL r0 = (X.C246853fL) r0
            r0.Dqx()
            goto L_0x0010
        L_0x0237:
            java.lang.String r1 = X.C41847B3o.A1E(r0)
            java.lang.Object r0 = r3.A01
            X.3fL r0 = (X.C246853fL) r0
            r0.DwK(r1)
            goto L_0x0010
        L_0x0244:
            java.lang.String r1 = X.C41847B3o.A1E(r0)
            java.lang.Object r0 = r3.A01
            X.3fL r0 = (X.C246853fL) r0
            r0.DIf(r1)
            goto L_0x0010
        L_0x0251:
            java.lang.Object r2 = r3.A01
            X.GvP r2 = (X.C53858GvP) r2
            X.3fc r1 = r2.A01
            X.3fc r0 = X.C247003fc.SHARE_BUTTON
            if (r1 != r0) goto L_0x0264
            X.0sP r1 = r2.A06
        L_0x025d:
            X.3gM r0 = r2.A02
        L_0x025f:
            r1.invoke(r0)
            goto L_0x0010
        L_0x0264:
            X.3fc r0 = X.C247003fc.COMMENT_BUTTON
            if (r1 != r0) goto L_0x0010
            X.0sP r1 = r2.A05
            goto L_0x025d
        L_0x026b:
            java.lang.Object r0 = r3.A01
            X.3gM r0 = (X.C247453gM) r0
            X.9IT r0 = r0.A00
            java.lang.Object r0 = r0.A09
            goto L_0x000b
        L_0x0275:
            java.lang.Object r1 = A00(r0, r3)
            X.5Oz r1 = (X.C284945Oz) r1
            r1.Epw(r0)
            goto L_0x0010
        L_0x0280:
            X.GqC r0 = (X.C53541GqC) r0
            java.lang.Object r1 = A00(r0, r3)
            X.HmK r1 = (X.C55723HmK) r1
            android.content.Context r4 = r1.A00
            com.instagram.common.session.UserSession r3 = r1.A02
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r0.A08
            X.LTV.A02(r4, r3, r2, r1, r0)
            goto L_0x0010
        L_0x0297:
            X.GqC r0 = (X.C53541GqC) r0
            java.lang.Object r1 = A00(r0, r3)
            X.HmK r1 = (X.C55723HmK) r1
            com.instagram.common.session.UserSession r3 = r1.A02
            androidx.fragment.app.FragmentActivity r2 = r1.A01
            java.lang.String r4 = r0.A03
            java.lang.String r6 = r0.A06
            java.lang.String r7 = r0.A08
            java.lang.String r5 = "FEED_POST"
            r8 = 1
            X.LTV.A0A(r2, r3, r4, r5, r6, r7, r8)
            android.content.Context r2 = r1.A00
            X.LTV.A03(r2, r3, r4, r5, r6, r7)
            goto L_0x0010
        L_0x02b6:
            java.lang.Object r1 = r3.A01
            X.37D r1 = (X.AnonymousClass37D) r1
            r0 = 0
            r1.A0P(r0)
            goto L_0x0010
        L_0x02c0:
            X.GnX r0 = (X.C53400GnX) r0
            java.lang.Object r4 = A00(r0, r3)
            X.GKH r4 = (X.GKH) r4
            java.lang.Object r3 = r0.A00
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A03
            X.3fc r1 = (X.C247003fc) r1
            X.J3R r0 = X.J3R.A00
            r4.A00(r1, r2, r3, r0)
            goto L_0x0010
        L_0x02db:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r3.A01
            X.3fF r0 = (X.C246793fF) r0
            X.2xS r0 = r0.A02
            r0.onResume()
            X.2uK r0 = r0.A0G
            X.4M3 r1 = r0.A05
            if (r1 == 0) goto L_0x0010
            r0 = 1
            r1.EKy(r2, r0)
            goto L_0x0010
        L_0x02f4:
            java.lang.Object r0 = A00(r0, r3)
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r2 = r0.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 18
            X.JwA r4 = new X.JwA
            r4.<init>((int) r2, (java.lang.Integer) r1, (int) r0)
            return r4
        L_0x0306:
            X.S21 r0 = (X.S21) r0
            java.lang.Object r1 = A00(r0, r3)
            X.SEG r1 = (X.SEG) r1
            monitor-enter(r1)
            r1.A00 = r0     // Catch:{ all -> 0x0327 }
            X.S21 r4 = X.SEG.A00(r1)     // Catch:{ all -> 0x0327 }
            goto L_0x0325
        L_0x0316:
            X.S21 r0 = (X.S21) r0
            java.lang.Object r1 = A00(r0, r3)
            X.SEG r1 = (X.SEG) r1
            monitor-enter(r1)
            r1.A01 = r0     // Catch:{ all -> 0x0327 }
            X.S21 r4 = X.SEG.A00(r1)     // Catch:{ all -> 0x0327 }
        L_0x0325:
            monitor-exit(r1)
            return r4
        L_0x0327:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x032a:
            X.Hk6 r0 = (X.C55586Hk6) r0
            java.lang.Object r1 = A00(r0, r3)
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r3 = r1.A03
            java.util.List r2 = r0.A00
            if (r2 != 0) goto L_0x033e
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r0.A00 = r2
        L_0x033e:
            r2.add(r3)
            java.util.List r1 = r0.A01
            if (r1 == 0) goto L_0x034c
            int r0 = X.C51966G9m.A06(r2)
            r1.get(r0)
        L_0x034c:
            X.JwA r3 = (X.C61072JwA) r3
            if (r3 == 0) goto L_0x0381
            java.lang.Object r5 = r3.A02
        L_0x0352:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r3 = 0
            if (r5 != r4) goto L_0x0359
            r3 = 1000(0x3e8, float:1.401E-42)
        L_0x0359:
            X.3Zd r1 = X.C243533Zd.LOCAL
            java.lang.String r0 = "carousel_page_indicator"
            X.4Ey r2 = X.2Vi.A00(r1, r0)
            X.3du r0 = X.C246033ds.A00
            r2.A03(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            if (r5 != r4) goto L_0x036d
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x036d:
            r2.A01(r0)
            if (r5 != r4) goto L_0x0373
            r1 = 0
        L_0x0373:
            r2.A02(r1)
            r0 = 250(0xfa, float:3.5E-43)
            X.C51966G9m.A1M(r2, r0)
            X.2Vk r4 = new X.2Vk
            r4.<init>(r2, r3)
            return r4
        L_0x0381:
            r5 = 0
            goto L_0x0352
        L_0x0383:
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r1 = r0 + 1
            java.lang.Object r0 = r3.A01
            int r0 = X.DbS.A05(r0)
            int r1 = r1 % r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            return r4
        L_0x0395:
            com.facebook.litho.LithoView r0 = (com.facebook.litho.LithoView) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r3 = r3.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r1 = 1
            X.0qQ.A0B(r3, r1)
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE
            X.4h3 r1 = X.C51965G9l.A0i(r1, r3)
            com.instagram.clips.intf.ClipsViewerConfig r2 = r1.A00()
            X.HJp r1 = new X.HJp
            r1.<init>(r0, r2, r3, r4)
            X.3ri r4 = new X.3ri
            r4.<init>(r0, r1)
            return r4
        L_0x03b8:
            X.1Xj r4 = X.C51968G9o.A0m(r0)
            java.lang.Object r1 = r3.A01
            X.GTP r1 = (X.GTP) r1
            X.0eM r0 = r1.A0m
            java.lang.Object r0 = r0.getValue()
            X.GTQ r0 = (X.GTQ) r0
            X.0eM r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0i
            java.lang.Object r3 = r0.getValue()
            X.3YK r3 = (X.AnonymousClass3YK) r3
            android.content.Context r2 = r1.A0c
            com.instagram.common.session.UserSession r0 = r1.A0f
            X.3YL r1 = new X.3YL
            r1.<init>(r2, r0)
            java.lang.String r0 = r3.A00
            boolean r0 = X.C51969G9p.A1Z(r4, r0)
            if (r0 != 0) goto L_0x03f0
            boolean r1 = r1.A02(r4)
            r0 = 0
            if (r1 == 0) goto L_0x03f1
        L_0x03f0:
            r0 = 1
        L_0x03f1:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x03f6:
            java.lang.String r2 = X.C41848B3p.A1E(r0)
            if (r2 == 0) goto L_0x040d
            java.lang.Object r0 = r3.A01
            X.DHM r0 = (X.DHM) r0
            X.1E6 r1 = r0.A00
            java.lang.Class<com.instagram.user.model.User> r0 = com.instagram.user.model.User.class
            X.0Yh r0 = X.DbS.A0z(r0)
            X.17K r4 = r1.AX6(r2, r0)
            return r4
        L_0x040d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6H.invoke(java.lang.Object):java.lang.Object");
    }
}
