package X;

/* renamed from: X.IxZ  reason: case insensitive filesystem */
public final class C58788IxZ extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58788IxZ(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A05 = z;
        this.A02 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c1, code lost:
        if (r9 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0120, code lost:
        if (((r13.A00.getY() - ((float) r3)) / ((float) (r13.A01.getHeight() - r3))) < r8) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r13 = r20
            int r1 = r0.A00
            switch(r1) {
                case 2: goto L_0x0354;
                case 3: goto L_0x01b1;
                case 4: goto L_0x0125;
                case 5: goto L_0x0041;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Ln r13 = (X.1Ln) r13
            X.GkM r4 = new X.GkM
            r4.<init>()
            java.lang.Object r3 = r0.A04
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r4, r3)
            boolean r1 = r0.A05
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "perform_validation"
            r4.A03(r1, r2)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "account_mutation_data_list"
            X.G9t.A1L(r4, r3, r1, r2)
            java.lang.Object r2 = r0.A02
            X.HO3 r2 = (X.HO3) r2
            if (r2 == 0) goto L_0x0036
            java.lang.String r1 = "account_mutation_failure_step"
            r4.A01(r2, r1)
        L_0x0036:
            java.lang.String r1 = "event_payload"
            r13.A0N(r4, r1)
            java.lang.Object r0 = r0.A03
            X.C51969G9p.A1G(r13, r0)
            return r13
        L_0x0041:
            X.2W7 r13 = (X.AnonymousClass2W7) r13
            r5 = 0
            X.0qQ.A0B(r13, r5)
            java.lang.Object r3 = r0.A04
            X.GGt r3 = (X.C52151GGt) r3
            com.instagram.common.session.UserSession r7 = r3.A04
            X.0Tu r4 = X.0Tu.A06
            r1 = 2342164594156316225(0x20810a4a002f2641, double:4.0669297771341595E-152)
            boolean r1 = X.182.A06(r4, r7, r1)
            if (r1 == 0) goto L_0x00ac
            X.GDe r1 = r3.A03
            X.3W1 r8 = r1.A0E
            if (r8 == 0) goto L_0x00ac
            java.lang.Object r1 = r0.A03
            X.2Wc r1 = (X.C70832Wc) r1
            X.2V1 r10 = r1.Aqq()
            android.view.MotionEvent r1 = r13.A00
            float r2 = r1.getRawX()
            android.view.MotionEvent r1 = r13.A00
            float r9 = r1.getRawY()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r1 = "tap_x_position"
            r6.put(r1, r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r9)
            java.lang.String r1 = "tap_y_position"
            r6.put(r1, r2)
            android.content.Context r9 = X.C51965G9l.A0B(r10)
            int r1 = X.AnonymousClass0nB.A01(r9)
            float r1 = (float) r1
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            java.lang.String r1 = "screen_width"
            r6.put(r1, r2)
            int r1 = X.AnonymousClass0nB.A00(r9)
            float r1 = (float) r1
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            java.lang.String r1 = "screen_height"
            r6.put(r1, r2)
            r8.A1e = r6
        L_0x00ac:
            java.lang.Object r6 = r0.A03
            X.2Wc r6 = (X.C70832Wc) r6
            java.lang.Object r10 = r0.A01
            boolean r9 = r0.A05
            r1 = 37166009873400222(0x840a4a0039019e, double:3.5672725272233174E-306)
            float r8 = X.C51965G9l.A00(r4, r7, r1)
            r4 = 1
            if (r10 != 0) goto L_0x00c3
            r2 = 0
            if (r9 == 0) goto L_0x00c4
        L_0x00c3:
            r2 = 1
        L_0x00c4:
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00dd
            X.4bN r1 = r3.A02
            boolean r1 = r1.CcK()
            if (r1 == 0) goto L_0x00dd
            if (r2 == 0) goto L_0x00dd
            X.GDe r1 = r3.A03
            X.3W1 r1 = r1.A0E
            if (r1 == 0) goto L_0x00f0
            boolean r1 = r1.A1q
            if (r1 != r4) goto L_0x00f0
        L_0x00dd:
            r4 = 0
        L_0x00de:
            r1 = 1
            java.lang.Object r0 = r0.A02
            X.0r1 r0 = (X.0r1) r0
            if (r4 == 0) goto L_0x00ec
            r0.A00 = r1
        L_0x00e7:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            return r13
        L_0x00ec:
            r0.A00 = r5
            r1 = 0
            goto L_0x00e7
        L_0x00f0:
            X.2V1 r2 = r6.Aqq()
            java.lang.String r1 = "clips_cta_parent_component_tag"
            android.view.View r1 = r2.A03(r1)
            if (r1 == 0) goto L_0x0123
            X.0Tu r3 = X.DbS.A0J(r7, r5)
            r1 = 37169750786441725(0x840db1000401fd, double:3.5696382956942116E-306)
            double r1 = X.182.A00(r3, r7, r1)
            int r3 = X.C51972G9s.A0E(r6, r1)
        L_0x010d:
            android.view.MotionEvent r1 = r13.A00
            float r2 = r1.getY()
            float r1 = (float) r3
            float r2 = r2 - r1
            android.view.View r1 = r13.A01
            int r1 = r1.getHeight()
            int r1 = r1 - r3
            float r1 = (float) r1
            float r2 = r2 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x00dd
            goto L_0x00de
        L_0x0123:
            r3 = 0
            goto L_0x010d
        L_0x0125:
            X.JPA r13 = (X.JPA) r13
            r1 = 0
            X.0qQ.A0B(r13, r1)
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x0139
            X.Hz6 r4 = X.C56474Hz6.A00
            r3 = 0
            X.0sK r2 = X.C55398Hh4.A00
            java.lang.String r1 = "aggregated_wall_ptr"
            r13.Cf6(r4, r1, r3, r2)
        L_0x0139:
            java.lang.Object r2 = r0.A01
            X.4gU r2 = (X.C270284gU) r2
            java.lang.Object r1 = r2.getValue()
            X.Jw9 r1 = (X.C61071Jw9) r1
            boolean r1 = r1.A02
            r6 = -886456479(0xffffffffcb29bf61, float:-1.1124577E7)
            if (r1 == 0) goto L_0x0195
            java.lang.Object r1 = r2.getValue()
            X.Jw9 r1 = (X.C61071Jw9) r1
            java.lang.Object r5 = r1.A01
            java.util.List r5 = (java.util.List) r5
            X.J4k r3 = X.C59051J4k.A00
            X.J4l r2 = X.C59052J4l.A00
            java.lang.Object r4 = r0.A02
            int r18 = r5.size()
            r1 = 23
            X.J6T r14 = new X.J6T
            r14.<init>((int) r1, (java.util.List) r5, (X.0sP) r3)
            r1 = 3
            X.J6g r15 = X.C59098J6g.A01(r5, r1)
            r1 = 24
            X.J6T r3 = new X.J6T
            r3.<init>((int) r1, (java.util.List) r5, (X.0sP) r2)
            r2 = 23
        L_0x0173:
            X.GaB r1 = new X.GaB
            r1.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r5)
            X.5PJ r17 = X.AnonymousClass5PI.A03(r1, r6)
            r16 = r3
            r13.CfD(r14, r15, r16, r17, r18)
            java.lang.Object r0 = r0.A03
            X.Gmj r0 = (X.C53359Gmj) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x039a
            X.Hz6 r3 = X.C56474Hz6.A00
            r2 = 0
            X.0sK r1 = X.C55398Hh4.A01
            java.lang.String r0 = "end_loading"
            r13.Cf6(r3, r2, r0, r1)
            goto L_0x039a
        L_0x0195:
            java.lang.Object r5 = r0.A04
            java.util.List r5 = (java.util.List) r5
            X.J4m r2 = X.C59053J4m.A00
            java.lang.Object r4 = r0.A02
            int r18 = r5.size()
            r1 = 25
            X.J6T r14 = new X.J6T
            r14.<init>((int) r1, (java.util.List) r5, (X.0sP) r2)
            r1 = 4
            X.J6g r15 = X.C59098J6g.A01(r5, r1)
            r3 = 0
            r2 = 24
            goto L_0x0173
        L_0x01b1:
            X.1Xl r13 = (X.1Xl) r13
            r12 = 0
            X.0qQ.A0B(r13, r12)
            X.D9g r1 = X.C65211bM.A00
            X.DDf r2 = r1.A00()
            java.lang.Object r9 = r0.A02
            X.7dj r9 = (X.C335907dj) r9
            java.lang.String r1 = r9.A0K
            r2.A0r = r1
            java.lang.Long r1 = r9.A0I
            long r3 = X.DbY.A04(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.A0g = r1
            X.1Xj r1 = r13.BPf()
            java.lang.String r1 = r1.getId()
            r2.A0n = r1
            java.lang.String r1 = r9.A0J
            r2.A0t = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.A0f = r1
            com.instagram.user.model.User r8 = r9.A0C
            r2.A09 = r8
            java.lang.String r1 = r9.A0N
            r2.A0q = r1
            java.lang.Object r4 = r0.A03
            X.JwJ r4 = (X.C61081JwJ) r4
            java.lang.Object r7 = r4.A00
            X.3gp r7 = (X.C247733gp) r7
            java.lang.String r1 = r7.A0D
            r2.A0m = r1
            java.util.List r1 = r7.A0K
            r2.A0y = r1
            X.1bK r1 = r2.A02()
            X.3gp r3 = new X.3gp
            r3.<init>(r1)
            X.1Xj r1 = r13.BPf()
            r3.A02(r1)
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            r3.A0H = r1
            java.util.List r1 = r9.A0P
            r3.A0I = r1
            java.lang.String r1 = r3.A0d
            r6 = 1
            if (r1 == 0) goto L_0x022f
            int r1 = r1.length()
            if (r1 == 0) goto L_0x022f
            X.1Xj r2 = r13.BPf()
            java.lang.Object r1 = r0.A04
            X.GgO r1 = (X.C52971GgO) r1
            com.instagram.common.session.UserSession r1 = r1.A0E
            r2.A3y(r1, r3)
        L_0x022f:
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x0244
            X.1Xj r5 = r13.BPf()
            java.lang.Object r1 = r0.A04
            X.GgO r1 = (X.C52971GgO) r1
            com.instagram.common.session.UserSession r2 = r1.A0E
            X.1Xj r1 = r5.A1e(r2)
            r1.A3y(r2, r3)
        L_0x0244:
            X.1Xj r1 = r13.BPf()
            java.lang.Object r2 = r0.A04
            X.GgO r2 = (X.C52971GgO) r2
            com.instagram.common.session.UserSession r5 = r2.A0E
            r1.AE7(r5)
            boolean r0 = r9.A0k
            if (r0 == 0) goto L_0x0287
            X.7a0 r9 = r2.A0C
            X.1Xj r0 = r13.BPf()
            java.lang.String r11 = r0.BpP()
            X.1Xj r0 = r13.BPf()
            X.1iA r1 = r0.BR7()
            X.1Xj r0 = r13.BPf()
            com.instagram.model.mediatype.ProductType r10 = r0.A1v()
            if (r10 == 0) goto L_0x0287
            com.instagram.common.session.UserSession r0 = r9.A02
            X.4lm r9 = X.C272994ll.A00(r0)
            java.lang.String r8 = r8.getId()
            java.lang.String r1 = r1.name()
            java.lang.String r0 = r10.A00
            X.0qQ.A07(r0)
            r9.A0B(r8, r11, r1, r0)
        L_0x0287:
            X.0eM r9 = r2.A0K
            java.lang.Object r8 = r9.getValue()
            X.Hi8 r8 = (X.C55464Hi8) r8
            boolean r7 = r7.A0q
            X.1Xj r0 = r13.BPf()
            com.instagram.model.mediatype.ProductType r1 = r0.A1v()
            if (r7 == 0) goto L_0x02ea
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r1 == r0) goto L_0x02a3
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED
            if (r1 != r0) goto L_0x02ea
        L_0x02a3:
            com.instagram.common.session.UserSession r8 = r8.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318316469426255(0x8107510000184f, double:3.031187805162821E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x02ea
            java.lang.Object r8 = r9.getValue()
            X.Hi8 r8 = (X.C55464Hi8) r8
            X.1Xj r0 = r13.BPf()
            com.instagram.model.mediatype.ProductType r15 = r0.A1v()
            X.GmL r0 = r2.A08
            java.lang.Integer r7 = r0.A04
            X.05G r14 = r2.A0O
            r0 = 2
            X.0qQ.A0B(r14, r0)
            java.lang.String r0 = "PostCommentUtil"
            X.0xG r1 = X.DbS.A0O(r0)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.0wc r18 = X.AnonymousClass0kN.A01(r1, r0)
            X.HOa r13 = X.C54669HOa.CREATOR_RESHARE_NUDGE
            X.EZb r17 = X.EZb.COMMENTS
            X.FdI r11 = new X.FdI
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r1 = 3
            X.9IK r0 = new X.9IK
            r0.<init>((java.lang.Object) r11, (int) r1)
            r14.Epw(r0)
        L_0x02ea:
            X.7a3 r0 = r2.A09
            X.0Ud r0 = r0.A0E
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != r6) goto L_0x030a
            X.6oS r0 = X.C318116oQ.A00(r2)
            r10 = 0
            r11 = 28
            X.MH4 r6 = new X.MH4
            r7 = r3
            r8 = r2
            r9 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r6, r0)
        L_0x030a:
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x039a
            X.8Oa r0 = X.AnonymousClass8OY.A00(r5)
            java.util.List r7 = r0.A00(r1)
            if (r7 != 0) goto L_0x031a
            X.0sn r7 = X.0sn.A00
        L_0x031a:
            java.util.List r4 = r3.A0K
            X.1as r1 = X.1as.A04
            java.lang.String r0 = "COMMENT"
            r1.A0G(r5, r0, r4, r7)
            if (r4 == 0) goto L_0x039a
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x039a
            java.util.Iterator r6 = r4.iterator()
        L_0x032f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x039a
            com.instagram.user.model.User r4 = X.DbT.A0k(r6)
            boolean r0 = X.AnonymousClass8OY.A01(r5)
            if (r0 != 0) goto L_0x0349
            java.lang.String r0 = r4.getUsername()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x032f
        L_0x0349:
            X.05G r1 = r2.A0O
            X.9IW r0 = new X.9IW
            r0.<init>((X.C247733gp) r3, (com.instagram.user.model.User) r4)
            r1.Epw(r0)
            goto L_0x032f
        L_0x0354:
            X.6Gb r13 = (X.C305006Gb) r13
            r8 = 0
            X.0qQ.A0B(r13, r8)
            java.lang.Object r11 = r0.A04
            X.JcX r11 = (X.C59964JcX) r11
            java.lang.Object r6 = r11.A01
            java.util.List r6 = (java.util.List) r6
            X.JEU r2 = X.JEU.A00
            java.lang.Object r9 = r0.A01
            java.lang.Object r10 = r0.A03
            int r4 = r6.size()
            r5 = 0
            r1 = 22
            X.J6l r3 = new X.J6l
            r3.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r2)
            r1 = 6
            X.MP6 r2 = new X.MP6
            r2.<init>(r6, r1)
            r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            X.JJc r7 = new X.JJc
            r12 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r7, r1)
            r13.CfA(r3, r2, r1, r4)
            r4 = -618098925(0xffffffffdb288f13, float:-4.7445108E16)
            boolean r3 = r0.A05
            java.lang.Object r2 = r0.A02
            r1 = 2
            X.JGf r0 = new X.JGf
            r0.<init>(r1, r2, r3)
            X.C51967G9n.A11(r13, r0, r5, r4)
        L_0x039a:
            X.0gF r13 = X.C60340gF.A00
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58788IxZ.invoke(java.lang.Object):java.lang.Object");
    }
}
