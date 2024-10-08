package X;

/* renamed from: X.JFy  reason: case insensitive filesystem */
public final class C59346JFy extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59346JFy(Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C59346JFy A00(Object obj, int i) {
        return new C59346JFy(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d6, code lost:
        r4.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03dc, code lost:
        if (r0 != null) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03f4, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0552, code lost:
        if (X.C62953Kp5.A00(r5, r5.getIntrinsicWidth(), r5.getIntrinsicHeight()).isRecycled() != false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0568, code lost:
        if (r5 != null) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x056a, code lost:
        r2 = (X.C53949Gwt) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0570, code lost:
        if (r2.A03 == false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0572, code lost:
        r3 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0574, code lost:
        if (r3 <= 0) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0576, code lost:
        r1 = new android.graphics.drawable.TransitionDrawable(new android.graphics.drawable.Drawable[]{r5, r2.A01});
        r0.A01(r1);
        r1.startTransition(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05fd, code lost:
        if (r1.containsKey(r2) != false) goto L_0x05cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0dd5, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0ddc, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0f2b, code lost:
        r4 = new X.GL8(r3, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0f61, code lost:
        r4 = new X.C20698WxU((java.lang.Object) r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0f87, code lost:
        return X.C51965G9l.A0f(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x1072, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x1076, code lost:
        r1.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x10bd, code lost:
        X.AnonymousClass7TE.A1Z(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x10c2, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x027f, code lost:
        if ((r9 instanceof X.C44042CTd) == false) goto L_0x0281;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r40, java.lang.Object r41) {
        /*
            r39 = this;
            r4 = r39
            r1 = r40
            r0 = r41
            int r2 = r4.A00
            switch(r2) {
                case 0: goto L_0x0fca;
                case 1: goto L_0x107a;
                case 2: goto L_0x0fb1;
                case 3: goto L_0x0f98;
                case 4: goto L_0x0f88;
                case 5: goto L_0x0f67;
                case 6: goto L_0x0f4e;
                case 7: goto L_0x0f31;
                case 8: goto L_0x0f12;
                case 9: goto L_0x0ef8;
                case 10: goto L_0x0e1d;
                case 11: goto L_0x0dea;
                case 12: goto L_0x0dc1;
                case 13: goto L_0x0db0;
                case 14: goto L_0x0c49;
                case 15: goto L_0x0ab9;
                case 16: goto L_0x0a60;
                case 17: goto L_0x0a2d;
                case 18: goto L_0x0984;
                case 19: goto L_0x08bc;
                case 20: goto L_0x085f;
                case 21: goto L_0x082f;
                case 22: goto L_0x07f7;
                case 23: goto L_0x07c4;
                case 24: goto L_0x078c;
                case 25: goto L_0x0759;
                case 26: goto L_0x0739;
                case 27: goto L_0x0705;
                case 28: goto L_0x06d2;
                case 29: goto L_0x069a;
                case 30: goto L_0x0667;
                case 31: goto L_0x0603;
                case 32: goto L_0x0588;
                case 33: goto L_0x052b;
                case 34: goto L_0x0435;
                case 35: goto L_0x03f8;
                case 36: goto L_0x03e1;
                case 37: goto L_0x038c;
                case 38: goto L_0x037d;
                case 39: goto L_0x0356;
                case 40: goto L_0x0343;
                case 41: goto L_0x0329;
                case 42: goto L_0x023a;
                case 43: goto L_0x01eb;
                case 44: goto L_0x01ae;
                case 45: goto L_0x015d;
                case 46: goto L_0x014a;
                case 47: goto L_0x0121;
                case 48: goto L_0x005e;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.QAQ r0 = (X.QAQ) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            X.Gwb r1 = (X.C53931Gwb) r1
            X.Hsd r3 = r1.A00
            r1 = 2131886207(0x7f12007f, float:1.9406986E38)
            r0.setAnimation((int) r1)
            r1 = -1
            r0.setRepeatCount(r1)
            java.util.Set r2 = r0.A09
            X.RET r1 = X.RET.PLAY_OPTION
            r2.add(r1)
            X.Q6Y r6 = r0.A08
            r6.A07()
            java.lang.Integer r1 = r3.A01
            if (r1 == 0) goto L_0x004f
            int r5 = r1.intValue()
            java.lang.String r1 = "**"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            X.SPM r4 = new X.SPM
            r4.<init>((java.lang.String[]) r1)
            android.graphics.ColorFilter r3 = X.C13881Tj4.A01
            X.HjV r2 = new X.HjV
            r2.<init>(r5)
            X.Gjb r1 = new X.Gjb
            r1.<init>(r0, r2)
            r6.A0G(r4, r1, r3)
        L_0x004f:
            X.IHV r1 = X.IHV.A00
            r0.A01 = r1
            r1 = 20
            X.IwH r0 = X.C58708IwH.A01(r0, r1)
            X.3eI r0 = X.C51965G9l.A0f(r0)
            return r0
        L_0x005e:
            X.Ge2 r0 = (X.C52869Ge2) r0
            r7 = 1
            X.0qQ.A0B(r0, r7)
            java.lang.Object r1 = r4.A01
            X.Gwo r1 = (X.C53944Gwo) r1
            com.meta.foa.session.FoaUserSession r9 = r1.A00
            X.HlT r5 = r1.A02
            X.HjT r4 = r1.A01
            r6 = 0
            X.0qQ.A0B(r9, r6)
            X.AnonymousClass7TF.A1B(r5, r7, r4)
            X.HlT r1 = r0.A00
            if (r1 != 0) goto L_0x0119
            r0.A00 = r5
            com.instagram.common.session.UserSession r8 = X.C56316HwT.A00(r9)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36607311934920229(0x820e2800101625, double:3.213949701232545E-306)
            int r10 = X.DbS.A04(r3, r8, r1)
            r0.removeAllViews()
            com.instagram.common.session.UserSession r2 = X.C56316HwT.A00(r9)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            r11 = 0
            X.KHO r3 = new X.KHO
            r3.<init>(r1)
            r5.A00 = r3
            X.0sa r1 = r5.A01
            java.lang.Object r1 = r1.invoke()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.0qQ.A0B(r2, r6)
            r27 = 3
            r3.A00 = r1
            X.LzN r1 = new X.LzN
            r1.<init>(r2, r3)
            r3.A02 = r1
            android.widget.FrameLayout r1 = r3.A05
            android.content.Context r9 = r3.getContext()
            r8 = 2131965943(0x7f1337f7, float:1.956871E38)
            java.lang.String r15 = X.AnonymousClass7TE.A16(r9, r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r17 = 1065353216(0x3f800000, float:1.0)
            X.LFd r9 = new X.LFd
            r12 = r11
            r13 = r11
            r14 = r11
            r16 = r11
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r7
            r23 = r7
            r24 = r6
            r25 = r6
            r26 = r6
            r18 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.8XO r21 = X.AnonymousClass8XO.PHOTO_ONLY
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r7)
            X.LPF r7 = new X.LPF
            r20 = r11
            r22 = r2
            r23 = r11
            r24 = r11
            r25 = r9
            r28 = r6
            r29 = r6
            r30 = r6
            r31 = r6
            r18 = r7
            r19 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.MVV r2 = r3.A02
            r7.A01 = r2
            X.LOJ r1 = r7.A09
            r1.A00 = r2
            X.IaD r1 = new X.IaD
            r1.<init>(r7, r4)
            r7.A02 = r1
            r3.A01 = r7
            X.KHO r1 = r5.A00
            r0.addView(r1)
        L_0x0119:
            r1 = 19
            X.IwH r4 = X.C58708IwH.A01(r0, r1)
            goto L_0x0f83
        L_0x0121:
            X.7et r1 = (X.C336607et) r1
            X.HtE r0 = (X.C56126HtE) r0
            r7 = 0
            X.AnonymousClass7TF.A1H(r1, r0)
            X.3XV r2 = X.2WX.A02
            long r5 = X.C53887Gvs.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A06
            r2 = 0
            X.2WX r5 = X.AnonymousClass9JR.A00(r2, r3, r7, r5)
            java.lang.Object r3 = r4.A01
            X.Gvs r3 = (X.C53887Gvs) r3
            X.2V1 r2 = r1.A00
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r2)
            X.0sP r3 = r3.A01
            X.Gvt r2 = new X.Gvt
            r2.<init>(r0, r3)
            X.2Tl r0 = X.C51967G9n.A0N(r2, r4, r1, r5)
            return r0
        L_0x014a:
            java.lang.Object r0 = r4.A01
            X.HIq r0 = (X.C54555HIq) r0
            X.GgN r2 = X.C54555HIq.A00(r0)
            X.0sn r1 = X.0sn.A00
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.C52970GgN.A03(r2, r1)
            goto L_0x10c0
        L_0x015d:
            X.HIE r1 = (X.HIE) r1
            boolean r2 = X.C51975G9x.A1X(r0, r1)
            java.lang.Object r3 = r4.A01
            X.GgI r3 = (X.C52965GgI) r3
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0171
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0171
            goto L_0x10c0
        L_0x0171:
            if (r2 == 0) goto L_0x01ab
            X.Hzm r4 = r3.A03
            X.HOC r2 = X.HOC.GENERATED
            java.lang.String r0 = "ask_for_edit_click"
            X.C56515Hzm.A00(r2, r4, r0)
            X.HHh r6 = X.C54521HHh.A00
        L_0x017e:
            r2 = 0
            X.HtY r8 = r1.A03
            java.lang.String r9 = r1.A04
            boolean r10 = r1.A07
            boolean r11 = r1.A06
            X.JMR r5 = r1.A00
            X.HQ1 r7 = r1.A02
            boolean r12 = r1.A05
            r0 = 5
            X.0qQ.A0B(r5, r0)
            X.HIE r4 = new X.HIE
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.HQ0 r0 = r4.A01
            boolean r0 = r0 instanceof X.C54520HHg
            if (r0 == 0) goto L_0x019f
            X.C52965GgI.A00(r3, r2, r2)
        L_0x019f:
            X.05G r0 = r3.A08
            r0.Epw(r4)
            X.05G r0 = r3.A07
            r0.FIA(r6)
            goto L_0x10c0
        L_0x01ab:
            X.HHg r6 = X.C54520HHg.A00
            goto L_0x017e
        L_0x01ae:
            boolean r7 = X.AnonymousClass7TE.A1a(r0)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r5 = r4.A01
            X.GgP r5 = (X.C52972GgP) r5
            com.meta.foa.session.FoaUserSession r0 = r5.A0A
            com.instagram.common.session.UserSession r4 = X.C56316HwT.A00(r0)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36328998053756630(0x811108000a3ed6, double:3.037942882104638E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x10c0
            X.Htc r0 = r5.A0G
            boolean r0 = r0.A0I
            if (r0 != 0) goto L_0x10c0
            boolean r0 = r1 instanceof X.HI8
            if (r0 == 0) goto L_0x01e0
            if (r7 == 0) goto L_0x01e0
            X.HIC r0 = X.HIC.A00
            X.C52972GgP.A02(r5, r0, r6)
            goto L_0x10c0
        L_0x01e0:
            boolean r0 = r1 instanceof X.HIC
            if (r0 == 0) goto L_0x10c0
            if (r7 != 0) goto L_0x10c0
            r5.A0H()
            goto L_0x10c0
        L_0x01eb:
            boolean r2 = X.C51975G9x.A1X(r0, r1)
            boolean r0 = r1 instanceof X.HI8
            if (r0 == 0) goto L_0x10c0
            java.lang.Object r1 = r4.A01
            X.GgP r1 = (X.C52972GgP) r1
            X.Htc r0 = r1.A0G
            boolean r0 = r0.A0R
            if (r0 != 0) goto L_0x10c0
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r0 = r1.A0E
            if (r2 == 0) goto L_0x0212
            X.KhO r5 = X.C62532KhO.MEMU
        L_0x0203:
            X.05G r4 = r0.A0D
            java.util.List r2 = r0.A0A
            if (r5 != 0) goto L_0x0214
            java.util.List r1 = r0.A09
            X.Icw r0 = new X.Icw
            r0.<init>(r2, r1)
            goto L_0x03d6
        L_0x0212:
            r5 = 0
            goto L_0x0203
        L_0x0214:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x021c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Icx r0 = (X.C57570Icx) r0
            X.KhO r0 = r0.A01
            if (r0 != r5) goto L_0x021c
            r3.add(r1)
            goto L_0x021c
        L_0x0231:
            X.0sn r1 = X.0sn.A00
            X.Icw r0 = new X.Icw
            r0.<init>(r3, r1)
            goto L_0x03d6
        L_0x023a:
            X.HQ2 r1 = (X.HQ2) r1
            X.HtB r0 = (X.C56123HtB) r0
            r5 = 0
            X.0qQ.A0B(r1, r5)
            boolean r2 = r1 instanceof X.HI9
            if (r2 == 0) goto L_0x10c0
            r10 = 0
            if (r0 == 0) goto L_0x0325
            java.util.List r3 = r0.A02
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0305
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0305
            r7 = 0
        L_0x0256:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            int r2 = r0.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0260:
            boolean r3 = X.0qQ.A0K(r3, r2)
            if (r0 == 0) goto L_0x0302
            java.util.List r2 = r0.A02
            java.lang.Object r2 = X.00k.A0J(r2)
            X.I1k r2 = (X.C56556I1k) r2
            if (r2 == 0) goto L_0x0302
            X.HQf r9 = r2.A00
        L_0x0272:
            if (r3 == 0) goto L_0x02a6
            java.lang.Object r7 = r4.A01
            X.GgP r7 = (X.C52972GgP) r7
            boolean r2 = r7.A0R
            if (r2 == 0) goto L_0x0281
            boolean r2 = r9 instanceof X.C44042CTd
            r8 = 1
            if (r2 != 0) goto L_0x0282
        L_0x0281:
            r8 = 0
        L_0x0282:
            boolean r2 = r9 instanceof X.C54544HIf
            r3 = 0
            if (r2 == 0) goto L_0x0300
            r3 = 1
            r2 = r9
            X.HIf r2 = (X.C54544HIf) r2
            if (r2 == 0) goto L_0x0300
            boolean r2 = r2.A01
            if (r2 == 0) goto L_0x0300
            r2 = 10
            X.Ivx r6 = X.C58688Ivx.A00(r0, r7, r2)
        L_0x0297:
            if (r8 == 0) goto L_0x02e3
            if (r0 == 0) goto L_0x02e1
            java.lang.String r6 = r0.A01
        L_0x029d:
            r3 = 0
            X.HII r2 = new X.HII
            r2.<init>(r3, r6, r3, r5)
            X.C52972GgP.A03(r7, r2)
        L_0x02a6:
            if (r0 == 0) goto L_0x02df
            java.util.List r2 = r0.A02
            java.lang.Object r2 = X.00k.A0J(r2)
            X.I1k r2 = (X.C56556I1k) r2
            if (r2 == 0) goto L_0x02df
            java.lang.Integer r3 = r2.A02
        L_0x02b4:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            boolean r14 = X.AnonymousClass7TF.A1W(r3, r2)
            java.lang.Object r6 = r4.A01
            X.GgP r6 = (X.C52972GgP) r6
            X.HI9 r1 = (X.HI9) r1
            if (r0 == 0) goto L_0x02d3
            X.05G r2 = r6.A0M
            boolean r4 = X.DbX.A1b(r2)
            java.lang.String r3 = r0.A01
            java.util.List r2 = r0.A02
            int r0 = r0.A00
            X.HtB r10 = new X.HtB
            r10.<init>(r3, r2, r0, r4)
        L_0x02d3:
            boolean r13 = r1.A04
            java.lang.String r12 = r1.A02
            X.I1t r11 = r1.A01
            X.HI9 r9 = new X.HI9
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x033e
        L_0x02df:
            r3 = r10
            goto L_0x02b4
        L_0x02e1:
            r6 = r10
            goto L_0x029d
        L_0x02e3:
            if (r3 == 0) goto L_0x02f6
            X.HIf r9 = (X.C54544HIf) r9
            if (r9 == 0) goto L_0x02f4
            java.lang.String r3 = r9.A00
        L_0x02eb:
            X.HIO r2 = new X.HIO
            r2.<init>(r3, r6)
            X.C52972GgP.A03(r7, r2)
            goto L_0x02a6
        L_0x02f4:
            r3 = r10
            goto L_0x02eb
        L_0x02f6:
            r3 = 0
            X.HIO r2 = new X.HIO
            r2.<init>(r3, r6)
            X.C52972GgP.A03(r7, r2)
            goto L_0x02a6
        L_0x0300:
            r6 = r10
            goto L_0x0297
        L_0x0302:
            r9 = r10
            goto L_0x0272
        L_0x0305:
            java.util.Iterator r6 = r3.iterator()
            r7 = 0
        L_0x030a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0256
            java.lang.Object r2 = r6.next()
            X.I1k r2 = (X.C56556I1k) r2
            java.lang.Integer r3 = r2.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r3 != r2) goto L_0x030a
            int r7 = r7 + 1
            if (r7 >= 0) goto L_0x030a
            X.0sr.A1S()
            goto L_0x0dd8
        L_0x0325:
            r3 = r10
            r2 = r10
            goto L_0x0260
        L_0x0329:
            X.JMS r0 = (X.JMS) r0
            r5 = 0
            X.AnonymousClass7TF.A1H(r1, r0)
            java.lang.Object r6 = r4.A01
            X.GgP r6 = (X.C52972GgP) r6
            r6.A04 = r0
            boolean r1 = r1 instanceof X.HI8
            if (r1 == 0) goto L_0x10c0
            X.HI8 r9 = new X.HI8
            r9.<init>(r0)
        L_0x033e:
            X.C52972GgP.A02(r6, r9, r5)
            goto L_0x10c0
        L_0x0343:
            X.Hss r0 = (X.C56105Hss) r0
            if (r0 == 0) goto L_0x10c0
            java.lang.Object r2 = r4.A01
            X.GgP r2 = (X.C52972GgP) r2
            X.HID r1 = new X.HID
            r1.<init>(r0)
            r0 = 0
            X.C52972GgP.A02(r2, r1, r0)
            goto L_0x10c0
        L_0x0356:
            X.HqB r1 = (X.C55947HqB) r1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            boolean r2 = r1 instanceof X.C54519HHf
            if (r2 == 0) goto L_0x10c0
            X.HHf r1 = (X.C54519HHf) r1
            if (r1 == 0) goto L_0x10c0
            X.I1k r1 = r1.A01
            X.HtY r1 = r1.A01
            if (r1 == 0) goto L_0x10c0
            java.lang.String r3 = r1.A04
            java.lang.Object r1 = r4.A01
            X.GwI r1 = (X.C53912GwI) r1
            X.0sP r2 = r1.A02
            X.HHs r1 = new X.HHs
            r1.<init>(r0, r3)
            r2.invoke(r1)
            goto L_0x10c0
        L_0x037d:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r4.A01
            X.Gvr r2 = (X.C53886Gvr) r2
            X.0sL r2 = r2.A00
            r2.invoke(r1, r0)
            goto L_0x10c0
        L_0x038c:
            X.Hsu r0 = (X.C56107Hsu) r0
            r9 = 0
            X.0qQ.A0B(r1, r9)
            java.lang.Object r2 = r4.A01
            X.HIr r2 = (X.C54556HIr) r2
            X.GgP r8 = r2.A01
            r7 = 0
            if (r8 == 0) goto L_0x03f4
            if (r0 == 0) goto L_0x03db
            X.HtI r2 = r0.A00
            if (r2 == 0) goto L_0x03db
            java.lang.String r6 = r2.A03
        L_0x03a3:
            X.HtI r0 = r0.A00
            if (r0 == 0) goto L_0x03df
            java.lang.String r5 = r0.A04
        L_0x03a9:
            X.I44 r0 = r8.A0C
            X.Hzd r4 = r0.A02
            X.Htc r0 = r0.A01
            X.Nky r0 = r0.A02
            X.XSJ r3 = X.XXv.A00(r0)
            X.HOe r2 = X.C54673HOe.CREATE
            X.AnonymousClass7TF.A1B(r3, r9, r2)
            java.lang.String r0 = "negative_feedback_click"
            X.C56507Hzd.A00(r2, r3, r4, r0, r7)
            X.6oS r2 = X.C318116oQ.A00(r8)
            r13 = 21
            X.MGN r0 = new X.MGN
            r10 = r5
            r11 = r6
            r12 = r7
            r7 = r0
            r9 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7TE.A1Z(r0, r2)
            X.05G r4 = r8.A0I
            X.I1J r0 = X.I1J.A00
        L_0x03d6:
            r4.Epw(r0)
            goto L_0x10c0
        L_0x03db:
            r6 = r7
            if (r0 == 0) goto L_0x03df
            goto L_0x03a3
        L_0x03df:
            r5 = r7
            goto L_0x03a9
        L_0x03e1:
            java.lang.Object r0 = r4.A01
            X.HIr r0 = (X.C54556HIr) r0
            X.GgP r3 = r0.A01
            if (r3 == 0) goto L_0x03f4
            X.HtY r2 = r3.A03
            if (r2 == 0) goto L_0x10c0
            r1 = 0
            r0 = 0
            X.C52972GgP.A04(r3, r2, r1, r0, r0)
            goto L_0x10c0
        L_0x03f4:
            java.lang.String r0 = "viewModel"
            goto L_0x0dd5
        L_0x03f8:
            X.2V1 r1 = (X.2V1) r1
            X.Hse r0 = (X.C56091Hse) r0
            r7 = 0
            X.AnonymousClass7TF.A1H(r1, r0)
            java.lang.Object r3 = r4.A01
            X.I4d r3 = (X.C56604I4d) r3
            com.meta.foa.session.FoaUserSession r2 = r3.A01
            boolean r6 = X.C55220HeB.A00(r2)
            r2 = 23
            X.Ivm r5 = X.C58677Ivm.A00(r3, r2)
            r4 = 24
            X.Ivm r3 = X.C58677Ivm.A00(r3, r4)
            X.2VW r2 = r0.A00
            X.2Sn r2 = r2.A00
            if (r2 == 0) goto L_0x10c0
            android.view.View r2 = r2.BUI()
            if (r2 == 0) goto L_0x10c0
            X.GN2 r2 = new X.GN2
            r2.<init>(r4, r3, r5, r6)
            r9 = 8388659(0x800033, float:1.1755015E-38)
            X.Iu2 r5 = X.C58569Iu2.A00
            r4 = r0
            r6 = r2
            r8 = r7
            r3 = r1
            X.C55230HeL.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x10c0
        L_0x0435:
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.3cH r0 = (X.C245073cH) r0
            long r2 = r0.A00
            r6 = 0
            X.0qQ.A0B(r1, r6)
            r37 = 1
            int r0 = X.C245073cH.A00(r2)
            java.lang.Object[] r7 = X.AnonymousClass7TF.A1b(r0)
            r5 = 5
            X.AwX r0 = new X.AwX
            r0.<init>(r2, r1, r5)
            java.lang.Object r0 = X.AnonymousClass3Zw.A00(r1, r0, r7)
            float r7 = X.AnonymousClass7TE.A04(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r0}
            X.Inb r0 = new X.Inb
            r0.<init>(r7)
            java.lang.Object r0 = X.AnonymousClass3Zw.A00(r1, r0, r5)
            float r15 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r5 = r4.A01
            X.Gsp r5 = (X.C53698Gsp) r5
            java.util.List r14 = r5.A01
            java.lang.Object[] r4 = new java.lang.Object[]{r14}
            X.Inv r0 = new X.Inv
            r10 = r5
            r11 = r15
            r12 = r2
            r8 = r0
            r9 = r1
            r8.<init>(r9, r10, r11, r12)
            java.lang.Object r0 = X.AnonymousClass3Zw.A00(r1, r0, r4)
            float r9 = X.AnonymousClass7TE.A04(r0)
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            r2 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r0 = X.C51965G9l.A0b(r12, r2, r6)
            r4 = 0
            X.2WX r0 = X.C51965G9l.A0X(r4, r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.2WX r13 = X.C51971G9r.A0X(r0, r8, r2, r6)
            X.2Wb r0 = X.C51972G9s.A0Q(r1)
            long r16 = X.C51970G9q.A0G()
            long r2 = X.C51970G9q.A0H()
            X.2Wd r10 = X.C51965G9l.A0e(r2)
            X.2Wd r3 = X.C51965G9l.A0e(r16)
            X.2Wd r2 = X.C51965G9l.A0e(r16)
            X.Mva r17 = X.HSQ.A00(r0, r10, r3, r2)
            double r2 = (double) r9
            X.2WX r20 = X.C51973G9u.A0X(r4, r8, r2, r6)
            r25 = -2147483648(0xffffffff80000000, float:-0.0)
            long r2 = X.C51969G9p.A0D()
            X.3AS r16 = X.C336767f9.A00
            X.2V1 r9 = r0.A00
            X.3X5 r8 = r9.A02
            X.2Sa r10 = r8.A01
            X.3X7 r8 = r10.A02
            r19 = r8
            boolean r8 = r10.A0W
            r18 = r8
            X.7en r8 = new X.7en
            r8.<init>(r9)
            X.J58 r11 = X.J58.A00
            X.J6z r10 = new X.J6z
            r10.<init>(r5, r7, r15)
            r8.A01(r14, r11, r10)
            int r26 = X.G9t.A0i(r0, r2)
            r21 = r9
            r22 = r19
            r23 = r12
            r24 = r6
            r27 = r6
            r28 = r18
            X.7f1 r22 = X.C336677f0.A01(r21, r22, r23, r24, r25, r26, r27, r28)
            X.7eo r3 = r8.A01
            X.7f3 r2 = new X.7f3
            r19 = r4
            r21 = r4
            r23 = r3
            r24 = r4
            r25 = r4
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            r31 = r4
            r32 = r4
            r33 = r4
            r34 = r4
            r35 = r4
            r36 = r4
            r38 = r6
            r18 = r4
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r0.A00(r2)
            X.2Tl r0 = X.C243563Zg.A01(r0, r1, r13)
            return r0
        L_0x052b:
            X.Tyy r0 = (X.C14594Tyy) r0
            r2 = 1
            X.0qQ.A0B(r0, r2)
            android.graphics.drawable.Drawable r5 = r0.getDrawable()
            boolean r1 = r5 instanceof android.graphics.drawable.TransitionDrawable
            if (r1 == 0) goto L_0x0568
            android.graphics.drawable.LayerDrawable r5 = (android.graphics.drawable.LayerDrawable) r5
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r2)
            X.0qQ.A0A(r5)
            int r2 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            android.graphics.Bitmap r1 = X.C62953Kp5.A00(r5, r2, r1)
            boolean r1 = r1.isRecycled()
            if (r1 == 0) goto L_0x056a
        L_0x0554:
            java.lang.Object r1 = r4.A01
            X.Gwt r1 = (X.C53949Gwt) r1
            android.graphics.drawable.Drawable r1 = r1.A01
            r0.A01(r1)
        L_0x055d:
            r0.A00()
            r1 = 12
            X.Ivm r4 = X.C58677Ivm.A00(r0, r1)
            goto L_0x0f83
        L_0x0568:
            if (r5 == 0) goto L_0x0554
        L_0x056a:
            java.lang.Object r2 = r4.A01
            X.Gwt r2 = (X.C53949Gwt) r2
            boolean r1 = r2.A03
            if (r1 == 0) goto L_0x0554
            int r3 = r2.A00
            if (r3 <= 0) goto L_0x0554
            android.graphics.drawable.Drawable r1 = r2.A01
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[]{r5, r1}
            android.graphics.drawable.TransitionDrawable r1 = new android.graphics.drawable.TransitionDrawable
            r1.<init>(r2)
            r0.A01(r1)
            r1.startTransition(r3)
            goto L_0x055d
        L_0x0588:
            X.5cr r1 = (X.C289005cr) r1
            long r5 = r1.A00
            androidx.compose.ui.unit.Constraints r0 = (androidx.compose.ui.unit.Constraints) r0
            long r0 = r0.A00
            int r0 = androidx.compose.ui.unit.Constraints.A00(r0)
            float r3 = (float) r0
            java.lang.Object r2 = r4.A01
            X.Hri r2 = (X.C56035Hri) r2
            r4 = 3
            X.Iwr r1 = new X.Iwr
            r1.<init>(r2, r3, r4, r5)
            X.HjQ r0 = new X.HjQ
            r0.<init>()
            r1.invoke(r0)
            java.util.Map r0 = r0.A00
            X.Htm r4 = new X.Htm
            r4.<init>(r0)
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r5 = r2.A02
            X.Htm r0 = com.meta.compose.material.bottomsheet.AnchoredDraggableState.A01(r5)
            java.util.Map r0 = r0.A00
            int r0 = r0.size()
            r3 = 0
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            X.5Oz r0 = r5.A05
            java.lang.Object r2 = r0.getValue()
            if (r1 != 0) goto L_0x05d4
            java.util.Map r0 = r4.A00
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x05d4
        L_0x05cf:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r4, r2)
            return r0
        L_0x05d4:
            X.4gU r0 = r5.A08
            java.lang.Object r0 = r0.getValue()
            X.HLh r0 = (X.C54624HLh) r0
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0600
            r0 = 2
            if (r1 == r0) goto L_0x05ed
            r0 = 1
            if (r1 == r0) goto L_0x05ed
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x05ed:
            X.HLh r2 = X.C54624HLh.HalfExpanded
            java.util.Map r1 = r4.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x05cf
            X.HLh r2 = X.C54624HLh.Expanded
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0600
            goto L_0x05cf
        L_0x0600:
            X.HLh r2 = X.C54624HLh.Hidden
            goto L_0x05cf
        L_0x0603:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0612
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0612:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0620
            r2 = 809408572(0x303e983c, float:6.9337935E-10)
            java.lang.String r0 = "com.meta.compose.material.bottomsheet.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:422)"
            X.0fL.A01(r2, r0)
        L_0x0620:
            java.lang.Object r7 = r4.A01
            X.0sK r7 = (X.0sK) r7
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            X.5Zx r3 = X.C287275Zs.A07
            X.5Zr r2 = X.C287215Zl.A02
            r0 = 0
            X.5RD r2 = X.C291495hO.A02(r3, r1, r2, r0)
            int r5 = X.C287425a7.A00(r1)
            r4 = r1
            X.5Wx r4 = (X.C286565Wx) r4
            X.5RM r0 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r1, r6)
            X.C51973G9u.A0y(r1, r4)
            X.C51971G9r.A12(r1, r2, r0)
            X.0sL r2 = X.C287485aD.A02
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x0650
            boolean r0 = X.C51972G9s.A1Q(r1, r5)
            if (r0 != 0) goto L_0x0653
        L_0x0650:
            X.C51971G9r.A13(r1, r2, r5)
        L_0x0653:
            X.C51965G9l.A18(r1, r3)
            X.6Et r2 = X.C304676Et.A00
            r0 = 6
            X.C51967G9n.A1M(r2, r1, r7, r0)
            boolean r0 = X.C51967G9n.A1R(r1)
            if (r0 == 0) goto L_0x10c0
            r0 = -235470117(0xfffffffff1f702db, float:-2.44628E30)
            goto L_0x1072
        L_0x0667:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0676
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0676:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0684
            r2 = -1478549273(0xffffffffa7df20e7, float:-6.1930606E-15)
            java.lang.String r0 = "com.instagram.wonderwall.ui.fragment.WallPostPreviewFragment.onCreateView.<anonymous> (WallPostPreviewFragment.kt:73)"
            X.0fL.A01(r2, r0)
        L_0x0684:
            r3 = 915630162(0x36936852, float:4.393086E-6)
            java.lang.Object r2 = r4.A01
            r0 = 29
            X.JFy r0 = A00(r2, r0)
            boolean r0 = X.C51975G9x.A1T(r1, r0, r3)
            if (r0 == 0) goto L_0x10c0
            r0 = 329273891(0x13a05223, float:4.047067E-27)
            goto L_0x1072
        L_0x069a:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x06a9
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x06a9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x06b7
            r2 = 14781886(0xe18dbe, float:2.0713834E-38)
            java.lang.String r0 = "com.instagram.wonderwall.ui.fragment.WallPostPreviewFragment.onCreateView.<anonymous>.<anonymous> (WallPostPreviewFragment.kt:73)"
            X.0fL.A01(r2, r0)
        L_0x06b7:
            java.lang.Object r0 = r4.A01
            X.H0b r0 = (X.C54132H0b) r0
            X.0eM r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            X.Ghg r2 = (X.C53048Ghg) r2
            r0 = 0
            X.I5D.A03(r1, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10c0
            r0 = -999477352(0xffffffffc46d2f98, float:-948.74365)
            goto L_0x1072
        L_0x06d2:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x06e1
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x06e1:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x06ef
            r2 = 499760634(0x1dc9bdfa, float:5.340069E-21)
            java.lang.String r0 = "com.instagram.wonderwall.ui.fragment.WallPostComposerFragment.onCreateView.<anonymous> (WallPostComposerFragment.kt:88)"
            X.0fL.A01(r2, r0)
        L_0x06ef:
            r3 = -207897674(0xfffffffff39bbbb6, float:-2.4676918E31)
            java.lang.Object r2 = r4.A01
            r0 = 27
            X.JFy r0 = A00(r2, r0)
            boolean r0 = X.C51975G9x.A1T(r1, r0, r3)
            if (r0 == 0) goto L_0x10c0
            r0 = 886418614(0x34d5acb6, float:3.9800005E-7)
            goto L_0x1072
        L_0x0705:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0714
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0714:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0722
            r2 = -316494931(0xffffffffed22abad, float:-3.1465072E27)
            java.lang.String r0 = "com.instagram.wonderwall.ui.fragment.WallPostComposerFragment.onCreateView.<anonymous>.<anonymous> (WallPostComposerFragment.kt:88)"
            X.0fL.A01(r2, r0)
        L_0x0722:
            java.lang.Object r0 = r4.A01
            X.H0t r0 = (X.C54149H0t) r0
            X.GhK r2 = X.G9w.A0c(r0)
            r0 = 0
            X.C55202Hds.A00(r1, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10c0
            r0 = 1594959263(0x5f11259f, float:1.045894E19)
            goto L_0x1072
        L_0x0739:
            java.lang.String r1 = (java.lang.String) r1
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r2 = r4.A01
            X.H0t r2 = (X.C54149H0t) r2
            X.0eM r2 = r2.A03
            X.2YL r8 = X.DbS.A0H(r2)
            X.6oS r5 = X.C318116oQ.A00(r8)
            r10 = 0
            r11 = 35
            X.MGk r4 = new X.MGk
            r6 = r4
            r7 = r0
            r9 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x10bd
        L_0x0759:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0768
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0768:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0776
            r2 = -949610060(0xffffffffc76619b4, float:-58905.703)
            java.lang.String r0 = "com.instagram.wonderwall.ui.fragment.WallFeedFragment.onCreateView.<anonymous> (WallFeedFragment.kt:74)"
            X.0fL.A01(r2, r0)
        L_0x0776:
            r3 = 1068017526(0x3fa8a776, float:1.3176105)
            java.lang.Object r2 = r4.A01
            r0 = 24
            X.JFy r0 = A00(r2, r0)
            boolean r0 = X.C51975G9x.A1T(r1, r0, r3)
            if (r0 == 0) goto L_0x10c0
            r0 = -1877382033(0xffffffff90196c6f, float:-3.0257464E-29)
            goto L_0x1072
        L_0x078c:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x079b
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x079b:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x07a9
            r2 = 229557662(0xdaec59e, float:1.0771153E-30)
            java.lang.String r0 = "com.instagram.wonderwall.ui.fragment.WallFeedFragment.onCreateView.<anonymous>.<anonymous> (WallFeedFragment.kt:74)"
            X.0fL.A01(r2, r0)
        L_0x07a9:
            java.lang.Object r0 = r4.A01
            X.H0S r0 = (X.H0S) r0
            X.0eM r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            X.Ghf r2 = (X.C53047Ghf) r2
            r0 = 0
            X.I60.A03(r1, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10c0
            r0 = -440002302(0xffffffffe5c61902, float:-1.16936235E23)
            goto L_0x1072
        L_0x07c4:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x07d3
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x07d3:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x07e1
            r2 = 2010851918(0x77db2a4e, float:8.890399E33)
            java.lang.String r0 = "com.instagram.wonderwall.ui.fragment.AggregatedWallFeedFragment.onCreateView.<anonymous> (AggregatedWallFeedFragment.kt:46)"
            X.0fL.A01(r2, r0)
        L_0x07e1:
            r3 = 838640470(0x31fca356, float:7.3527344E-9)
            java.lang.Object r2 = r4.A01
            r0 = 22
            X.JFy r0 = A00(r2, r0)
            boolean r0 = X.C51975G9x.A1T(r1, r0, r3)
            if (r0 == 0) goto L_0x10c0
            r0 = 1542267689(0x5bed2329, float:1.33496457E17)
            goto L_0x1072
        L_0x07f7:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0806
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0806:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0814
            r2 = -1831373166(0xffffffff92d77692, float:-1.3597637E-27)
            java.lang.String r0 = "com.instagram.wonderwall.ui.fragment.AggregatedWallFeedFragment.onCreateView.<anonymous>.<anonymous> (AggregatedWallFeedFragment.kt:46)"
            X.0fL.A01(r2, r0)
        L_0x0814:
            java.lang.Object r0 = r4.A01
            X.K4n r0 = (X.C61369K4n) r0
            X.0eM r0 = r0.A00
            java.lang.Object r2 = r0.getValue()
            X.Ghe r2 = (X.C53046Ghe) r2
            r0 = 0
            X.C56644I5z.A03(r1, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10c0
            r0 = -1464324029(0xffffffffa8b83043, float:-2.0449034E-14)
            goto L_0x1072
        L_0x082f:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x083e
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x083e:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x084c
            r2 = 589564335(0x232409af, float:8.892508E-18)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.screens.WallPostComposerScreen.<anonymous>.<anonymous>.<anonymous> (WallPostComposerScreen.kt:49)"
            X.0fL.A01(r2, r0)
        L_0x084c:
            java.lang.Object r2 = r4.A01
            X.GhK r2 = (X.C53029GhK) r2
            r0 = 0
            X.I5B.A03(r1, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10c0
            r0 = 1582389257(0x5e515809, float:3.77120421E18)
            goto L_0x1072
        L_0x085f:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x086e
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x086e:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x087c
            r2 = -674769267(0xffffffffd7c7d68d, float:-4.39448605E14)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.screens.WallPostComposerScreen.<anonymous>.<anonymous>.<anonymous> (WallPostComposerScreen.kt:43)"
            X.0fL.A01(r2, r0)
        L_0x087c:
            java.lang.Object r2 = r4.A01
            X.4gU r2 = (X.C270284gU) r2
            java.lang.Object r0 = r2.getValue()
            X.Gm7 r0 = (X.C53321Gm7) r0
            com.instagram.user.model.User r0 = r0.A01
            java.lang.String r5 = r0.getId()
            java.lang.Object r0 = r2.getValue()
            X.Gm7 r0 = (X.C53321Gm7) r0
            com.instagram.user.model.User r0 = r0.A01
            java.lang.String r6 = r0.getUsername()
            java.lang.Object r0 = r2.getValue()
            X.Gm7 r0 = (X.C53321Gm7) r0
            com.instagram.user.model.User r0 = r0.A01
            com.instagram.common.typedurl.ImageUrl r2 = r0.Bh3()
            X.HLg r4 = X.C54623HLg.PostComposer
            r3 = 0
            r11 = 0
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 240(0xf0, float:3.36E-43)
            r7 = r3
            r8 = r3
            X.C55196Hdm.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10c0
            r0 = 1291242902(0x4cf6cd96, float:1.29395888E8)
            goto L_0x1072
        L_0x08bc:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x08cb
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x08cb:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x08d9
            r2 = -370445603(0xffffffffe9eb72dd, float:-3.558E25)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.AddToWallPostCard.<anonymous> (AddToWallCard.kt:38)"
            X.0fL.A01(r2, r0)
        L_0x08d9:
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r6 = 1098907648(0x41800000, float:16.0)
            r2 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A09(r0, r2, r6)
            X.5Zp r2 = X.C287215Zl.A04
            java.lang.Object r9 = r4.A01
            com.instagram.wonderwall.model.WallInfo r9 = (com.instagram.wonderwall.model.WallInfo) r9
            X.5RD r3 = X.C51965G9l.A0Q(r1, r2)
            r5 = 0
            int r8 = X.C287425a7.A00(r1)
            r7 = r1
            X.5Wx r7 = (X.C286565Wx) r7
            X.5RM r2 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r1, r10)
            X.C51973G9u.A0y(r1, r7)
            X.C51971G9r.A12(r1, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r7.A0K
            if (r2 != 0) goto L_0x090f
            boolean r2 = X.C51972G9s.A1Q(r1, r8)
            if (r2 != 0) goto L_0x0912
        L_0x090f:
            X.C51971G9r.A13(r1, r3, r8)
        L_0x0912:
            X.C51965G9l.A18(r1, r4)
            X.6FX r8 = X.AnonymousClass6FX.A00
            com.instagram.user.model.User r2 = r9.A00
            java.lang.String r7 = r2.getUsername()
            com.instagram.common.typedurl.ImageUrl r3 = r2.Bh3()
            r2 = 1107296256(0x42000000, float:32.0)
            r4 = 384(0x180, float:5.38E-43)
            X.C55200Hdq.A00(r1, r3, r7, r2, r4)
            r2 = 1090519040(0x41000000, float:8.0)
            X.C51967G9n.A13(r1, r0, r2)
            r2 = 2131952389(0x7f130305, float:1.954122E38)
            java.lang.String r7 = X.C304346Dc.A00(r1, r2)
            r14 = 0
            r10 = 0
            X.5Z4 r16 = X.C51965G9l.A0S(r1)
            long r2 = X.C51966G9m.A0M(r1)
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            long r19 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r2 & 63)], X.AnonymousClass5RW.A03(r2), X.AnonymousClass5RW.A02(r2), X.AnonymousClass5RW.A01(r2), r9)
            r18 = 15728638(0xeffffe, float:2.2040516E-38)
            r21 = r14
            r17 = r5
            X.5Z4 r2 = X.AnonymousClass5Z4.A01((X.AnonymousClass5Z2) null, r16, (X.C268454dQ) null, (X.C291715hl) null, (X.AnonymousClass5ZD) null, r17, 0, r18, r19, r21, 0)
            X.AnonymousClass5ZZ.A0h(r1, r2, r7)
            androidx.compose.ui.Modifier r2 = r8.A00(r0)
            X.C289585dr.A00(r1, r2)
            androidx.compose.ui.Modifier r8 = X.C287205Zk.A0C(r0, r6)
            r2 = 2131237845(0x7f081bd5, float:1.8091952E38)
            X.2DO r9 = X.C287975bA.A00(r1, r2, r5)
            r2 = 2131952258(0x7f130282, float:1.9540954E38)
            java.lang.String r11 = X.C304346Dc.A00(r1, r2)
            r13 = 24
            r12 = r4
            r7 = r1
            X.C288165bT.A06(r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 1082130432(0x40800000, float:4.0)
            X.C51967G9n.A13(r1, r0, r2)
            boolean r0 = X.C51967G9n.A1R(r1)
            if (r0 == 0) goto L_0x10c0
            r0 = -637416805(0xffffffffda01ca9b, float:-9.1332598E15)
            goto L_0x1072
        L_0x0984:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0993
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0993:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x09a1
            r2 = 1305089510(0x4dca15e6, float:4.23804096E8)
            java.lang.String r0 = "com.instagram.wonderwall.ui.bottomsheet.WallNuxBottomSheetFragment.onCreateView.<anonymous> (WallNuxBottomSheetFragment.kt:60)"
            X.0fL.A01(r2, r0)
        L_0x09a1:
            java.lang.Object r6 = r4.A01
            X.H1Y r6 = (X.H1Y) r6
            X.0eM r9 = r6.A00
            boolean r2 = X.AnonymousClass7TF.A1Z(r9)
            r0 = -1706579676(0xffffffff9a47a924, float:-4.1288866E-23)
            boolean r0 = X.C51967G9n.A1W(r1, r0, r2)
            java.lang.Object r4 = r1.ECw()
            if (r0 != 0) goto L_0x09bc
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x0a16
        L_0x09bc:
            boolean r0 = X.AnonymousClass7TF.A1Z(r9)
            r7 = 2131976759(0x7f136237, float:1.9590648E38)
            if (r0 == 0) goto L_0x09c8
            r7 = 2131976787(0x7f136253, float:1.9590704E38)
        L_0x09c8:
            r2 = 2131238538(0x7f081e8a, float:1.8093358E38)
            r0 = 2131976741(0x7f136225, float:1.9590611E38)
            X.HlN r8 = new X.HlN
            r8.<init>(r2, r0)
            r3 = 2131237850(0x7f081bda, float:1.8091962E38)
            boolean r2 = X.AnonymousClass7TF.A1Z(r9)
            r0 = 2131976757(0x7f136235, float:1.9590644E38)
            if (r2 == 0) goto L_0x09e2
            r0 = 2131976785(0x7f136251, float:1.95907E38)
        L_0x09e2:
            X.HlN r5 = new X.HlN
            r5.<init>(r3, r0)
            r2 = 2131238367(0x7f081ddf, float:1.809301E38)
            r0 = 2131976742(0x7f136226, float:1.9590613E38)
            X.HlN r4 = new X.HlN
            r4.<init>(r2, r0)
            r3 = 2131238274(0x7f081d82, float:1.8092822E38)
            boolean r0 = X.AnonymousClass7TF.A1Z(r9)
            r2 = 2131976758(0x7f136236, float:1.9590646E38)
            if (r0 == 0) goto L_0x0a01
            r2 = 2131976786(0x7f136252, float:1.9590702E38)
        L_0x0a01:
            X.HlN r0 = new X.HlN
            r0.<init>(r3, r2)
            X.HlN[] r0 = new X.C55664HlN[]{r8, r5, r4, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            X.HlM r4 = new X.HlM
            r4.<init>(r0, r7)
            r1.FLL(r4)
        L_0x0a16:
            X.C51965G9l.A1V(r1)
            r3 = -1802100362(0xffffffff94962176, float:-1.5159327E-26)
            r2 = 3
            X.JG0 r0 = new X.JG0
            r0.<init>(r2, r4, r6)
            boolean r0 = X.C51975G9x.A1T(r1, r0, r3)
            if (r0 == 0) goto L_0x10c0
            r0 = -1422839018(0xffffffffab313316, float:-6.295393E-13)
            goto L_0x1072
        L_0x0a2d:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0a3c
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0a3c:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a4a
            r2 = -978450773(0xffffffffc5ae06ab, float:-5568.8335)
            java.lang.String r0 = "com.instagram.wonderwall.ui.bottomsheet.WallMenuBottomSheetFragment.onCreateView.<anonymous> (WallMenuBottomSheetFragment.kt:40)"
            X.0fL.A01(r2, r0)
        L_0x0a4a:
            r3 = -847528024(0xffffffffcd7bbfa8, float:-2.639776E8)
            java.lang.Object r2 = r4.A01
            r0 = 16
            X.JFy r0 = A00(r2, r0)
            boolean r0 = X.C51975G9x.A1T(r1, r0, r3)
            if (r0 == 0) goto L_0x10c0
            r0 = 621040608(0x250453e0, float:1.1477593E-16)
            goto L_0x1072
        L_0x0a60:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0a6f
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0a6f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a7d
            r2 = -1599486309(0xffffffffa0a9c69b, float:-2.876114E-19)
            java.lang.String r0 = "com.instagram.wonderwall.ui.bottomsheet.WallMenuBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (WallMenuBottomSheetFragment.kt:41)"
            X.0fL.A01(r2, r0)
        L_0x0a7d:
            java.lang.Object r4 = r4.A01
            X.GzS r4 = (X.C54097GzS) r4
            X.0eM r0 = r4.A00
            java.lang.Object r3 = r0.getValue()
            com.instagram.wonderwall.model.WallMenuConfig r3 = (com.instagram.wonderwall.model.WallMenuConfig) r3
            r0 = -1651662580(0xffffffff9d8da10c, float:-3.7488908E-21)
            boolean r0 = X.C51967G9n.A1Z(r1, r4, r0)
            java.lang.Object r2 = r1.ECw()
            if (r0 != 0) goto L_0x0a9a
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x0aa4
        L_0x0a9a:
            r0 = 40
            X.MPC r2 = new X.MPC
            r2.<init>(r4, r0)
            r1.FLL(r2)
        L_0x0aa4:
            X.0sP r2 = (X.0sP) r2
            X.C51965G9l.A1V(r1)
            r0 = 8
            X.C56354Hx5.A00(r1, r3, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10c0
            r0 = 1270859395(0x4bbfc683, float:2.513639E7)
            goto L_0x1072
        L_0x0ab9:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0ac8
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0ac8:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0ad6
            r2 = 1084793709(0x40a8a36d, float:5.2699494)
            java.lang.String r0 = "com.instagram.wellbeing.respectfulcommentnudge.impl.PendingReviewMediaNudgeFragment.onCreateView.<anonymous> (PendingReviewMediaNudgeFragment.kt:57)"
            X.0fL.A01(r2, r0)
        L_0x0ad6:
            java.lang.Object r3 = r4.A01
            X.GzT r3 = (X.C54098GzT) r3
            X.HlJ r0 = r3.A00
            if (r0 == 0) goto L_0x0ae3
            X.7dV r0 = r0.A01
            r0.Cys()
        L_0x0ae3:
            X.HlJ r0 = r3.A00
            if (r0 == 0) goto L_0x0af8
            X.0eM r0 = r3.A01
            java.lang.Object r2 = r0.getValue()
            X.0wc r2 = (X.0wc) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.1Yp.A02(r2, r0)
        L_0x0af8:
            X.5Zr r2 = X.C287215Zl.A00
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            X.5Zx r0 = X.C287275Zs.A07
            X.5RD r5 = X.C291495hO.A00(r0, r1, r2)
            r0 = 0
            int r7 = X.C287425a7.A00(r1)
            r2 = r1
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r4 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r1, r6)
            X.C51973G9u.A0y(r1, r2)
            X.C51971G9r.A12(r1, r5, r4)
            X.0sL r5 = X.C287485aD.A02
            boolean r4 = r2.A0K
            if (r4 != 0) goto L_0x0b24
            boolean r4 = X.C51972G9s.A1Q(r1, r7)
            if (r4 != 0) goto L_0x0b27
        L_0x0b24:
            X.C51971G9r.A13(r1, r5, r7)
        L_0x0b27:
            X.C51965G9l.A18(r1, r6)
            r5 = 1119879168(0x42c00000, float:96.0)
            r10 = 0
            r4 = 2131237708(0x7f081b4c, float:1.8091674E38)
            X.Gpi r7 = new X.Gpi
            r7.<init>(r4, r5)
            r4 = 2131972294(0x7f1350c6, float:1.9581592E38)
            java.lang.String r6 = X.C304346Dc.A00(r1, r4)
            r4 = 2131969311(0x7f13451f, float:1.9575541E38)
            java.lang.String r5 = X.C304346Dc.A00(r1, r4)
            r25 = 0
            r4 = 4066(0xfe2, float:5.698E-42)
            X.I7M.A07(r1, r7, r5, r6, r4)
            r4 = 913906445(0x36791b0d, float:3.7119637E-6)
            java.lang.Object r5 = X.C51967G9n.A0m(r1, r4)
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r5 != r4) goto L_0x0b5d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = X.G9t.A0o(r1, r5)
        L_0x0b5d:
            X.5Oz r7 = X.C51965G9l.A0J(r2, r5, r0)
            r5 = 2131969312(0x7f134520, float:1.9575543E38)
            java.lang.String r12 = X.C304346Dc.A00(r1, r5)
            r5 = 913912133(0x36793145, float:3.713257E-6)
            boolean r6 = X.C51967G9n.A1Z(r1, r3, r5)
            java.lang.Object r5 = r1.ECw()
            if (r6 != 0) goto L_0x0b77
            if (r5 != r4) goto L_0x0b81
        L_0x0b77:
            r6 = 29
            X.Inf r5 = new X.Inf
            r5.<init>(r3, r6)
            r1.FLL(r5)
        L_0x0b81:
            X.0sa r14 = X.C51965G9l.A0y(r2, r5, r0)
            r5 = 2131969314(0x7f134522, float:1.9575547E38)
            java.lang.String r13 = X.C304346Dc.A00(r1, r5)
            r5 = 913920323(0x36795143, float:3.7151192E-6)
            boolean r6 = X.C51967G9n.A1Z(r1, r3, r5)
            java.lang.Object r5 = r1.ECw()
            if (r6 != 0) goto L_0x0b9b
            if (r5 != r4) goto L_0x0ba5
        L_0x0b9b:
            r6 = 30
            X.Inf r5 = new X.Inf
            r5.<init>(r3, r6)
            r1.FLL(r5)
        L_0x0ba5:
            X.0sa r15 = X.C51965G9l.A0y(r2, r5, r0)
            r5 = 1909777594(0x71d4e4ba, float:2.1083947E30)
            boolean r5 = X.C51967G9n.A1U(r1, r5)
            if (r5 == 0) goto L_0x0bba
            r6 = 2004432647(0x77793707, float:5.0546797E33)
            java.lang.String r5 = "com.instagram.wellbeing.respectfulcommentnudge.impl.PendingReviewMediaNudgeFragment.buildAnnotatedFooter (PendingReviewMediaNudgeFragment.kt:91)"
            X.0fL.A01(r6, r5)
        L_0x0bba:
            r5 = 2131969315(0x7f134523, float:1.957555E38)
            java.lang.String r8 = X.C304346Dc.A00(r1, r5)
            r5 = 2131969313(0x7f134521, float:1.9575545E38)
            java.lang.String r6 = X.G9w.A0h(r1, r8, r5)
            int r5 = X.DbX.A05(r8)
            X.6Bd r6 = X.C51972G9s.A0L(r6)
            long r23 = X.C51966G9m.A0D(r1)
            X.5ZD r20 = X.AnonymousClass5ZD.A03
            r22 = 65530(0xfffa, float:9.1827E-41)
            X.5ZB r8 = new X.5ZB
            r16 = r8
            r17 = r10
            r18 = r10
            r19 = r10
            r21 = r10
            r27 = r25
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r27)
            r6.A06(r8, r0, r5)
            java.lang.String r9 = "link"
            java.lang.String r8 = "Clickable link"
            X.5Tq r11 = X.C51967G9n.A0K(r6, r9, r8, r0, r5)
            X.C51967G9n.A15(r7, r5)
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x0c04
            r5 = -625830648(0xffffffffdab29508, float:-2.51332037E16)
            X.0fL.A00(r5)
        L_0x0c04:
            X.C286565Wx.A0L(r2, r0)
            r5 = 913929518(0x3679752e, float:3.71721E-6)
            boolean r6 = X.C51967G9n.A1Z(r1, r3, r5)
            java.lang.Object r5 = r1.ECw()
            if (r6 != 0) goto L_0x0c16
            if (r5 != r4) goto L_0x0c20
        L_0x0c16:
            r4 = 21
            X.J6T r5 = new X.J6T
            r5.<init>((int) r4, (java.lang.Object) r7, (java.lang.Object) r3)
            r1.FLL(r5)
        L_0x0c20:
            X.0sP r16 = X.C51965G9l.A0z(r2, r5)
            r19 = 29596(0x739c, float:4.1473E-41)
            r17 = r0
            r18 = r0
            r20 = r0
            r21 = r0
            r22 = r0
            r23 = r0
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r0
            r9 = r1
            X.I7L.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = X.C51967G9n.A1R(r1)
            if (r0 == 0) goto L_0x10c0
            r0 = -1690981790(0xffffffff9b35aa62, float:-1.5027023E-22)
            goto L_0x1072
        L_0x0c49:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0c58
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0c58:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0c66
            r2 = 44131015(0x2a162c7, float:2.371352E-37)
            java.lang.String r0 = "com.instagram.wellbeing.respectfulcommentnudge.impl.EmpathyNudgeFragment.onCreateView.<anonymous> (EmpathyNudgeFragment.kt:74)"
            X.0fL.A01(r2, r0)
        L_0x0c66:
            java.lang.Object r3 = r4.A01
            X.H0B r3 = (X.H0B) r3
            X.Hnw r0 = r3.A00
            if (r0 == 0) goto L_0x0da2
            X.1Xj r0 = r0.A01
            com.instagram.user.model.User r6 = X.C51966G9m.A11(r0)
            if (r6 == 0) goto L_0x0da2
            X.0eE r2 = X.AnonymousClass0t1.A01
            X.0eM r0 = r3.A02
            com.instagram.user.model.User r15 = X.DbX.A0l(r2, r0)
            X.5Zr r5 = X.C287215Zl.A00
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            X.5Zx r2 = X.C287275Zs.A07
            r16 = 48
            r0 = r16
            X.5RD r8 = X.C291495hO.A02(r2, r1, r5, r0)
            r14 = 0
            int r7 = X.C287425a7.A00(r1)
            r2 = r1
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r0 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r1, r4)
            X.0sa r13 = X.C287485aD.A00
            X.C51973G9u.A0z(r1, r2, r13)
            X.0sL r12 = X.C287485aD.A03
            X.0sL r11 = X.C51969G9p.A0w(r1, r8, r0, r12)
            X.0sL r10 = X.C287485aD.A02
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x0cb3
            boolean r0 = X.C51972G9s.A1Q(r1, r7)
            if (r0 != 0) goto L_0x0cb6
        L_0x0cb3:
            X.C51971G9r.A13(r1, r10, r7)
        L_0x0cb6:
            X.0sL r9 = X.C51966G9m.A1K(r1, r5)
            r19 = 0
            r7 = 1108344832(0x42100000, float:36.0)
            r5 = 1099956224(0x41900000, float:18.0)
            r0 = 0
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A0B(r4, r0, r7, r0, r5)
            X.5RD r8 = X.C51968G9o.A0V(r1)
            int r7 = X.C287425a7.A00(r1)
            X.5RM r5 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r0 = X.C287435a8.A01(r1, r0)
            X.C51973G9u.A0z(r1, r2, r13)
            X.C287595aO.A00(r1, r8, r12)
            boolean r5 = X.C51965G9l.A1Y(r1, r2, r5, r11)
            if (r5 != 0) goto L_0x0ce7
            boolean r5 = X.C51972G9s.A1Q(r1, r7)
            if (r5 != 0) goto L_0x0cea
        L_0x0ce7:
            X.C51971G9r.A13(r1, r10, r7)
        L_0x0cea:
            X.C287595aO.A00(r1, r0, r9)
            r0 = -448844491(0xffffffffe53f2d35, float:-5.642537E22)
            r1.ExS(r0)
            com.instagram.user.model.User[] r0 = new com.instagram.user.model.User[]{r15, r6}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0d03:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0d1e
            com.instagram.user.model.User r0 = X.DbT.A0k(r7)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            X.2DN r5 = X.1zC.A00(r1, r0)
            X.H8o r0 = new X.H8o
            r0.<init>(r5)
            r8.add(r0)
            goto L_0x0d03
        L_0x0d1e:
            X.C286565Wx.A0L(r2, r14)
            X.C56264HvY.A01(r1, r8, r14)
            r1.ASN()
            X.6Fk r5 = r3.A01
            androidx.compose.ui.Modifier r8 = X.C287195Zj.A00(r5, r4)
            android.content.Context r0 = r3.getContext()
            int r0 = X.2Yu.A07(r0)
            long r11 = X.C289505di.A00(r1, r0)
            r0 = 2131961605(0x7f132705, float:1.9559912E38)
            java.lang.String r10 = X.C304346Dc.A00(r1, r0)
            X.5Z4 r9 = X.C51966G9m.A0e(r1)
            r7 = r1
            X.AnonymousClass5ZZ.A0X(r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A00(r5, r4)
            android.content.Context r0 = r3.getContext()
            int r0 = X.2Yu.A08(r0)
            long r10 = X.C289505di.A00(r1, r0)
            r5 = 2131961604(0x7f132704, float:1.955991E38)
            java.lang.String r0 = r6.getUsername()
            java.lang.String r9 = X.G9w.A0h(r1, r0, r5)
            X.5Z4 r8 = X.C51966G9m.A0c(r1)
            r6 = r1
            X.AnonymousClass5ZZ.A0X(r6, r7, r8, r9, r10)
            androidx.compose.ui.Modifier r17 = X.C51966G9m.A0T(r4)
            r0 = 985413215(0x3abc365f, float:0.0014359466)
            boolean r4 = X.C51967G9n.A1Z(r1, r3, r0)
            java.lang.Object r0 = r1.ECw()
            if (r4 != 0) goto L_0x0d80
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r0 != r4) goto L_0x0d8a
        L_0x0d80:
            r4 = 34
            X.MPC r0 = new X.MPC
            r0.<init>(r3, r4)
            r1.FLL(r0)
        L_0x0d8a:
            X.0sP r18 = X.C51965G9l.A0z(r2, r0)
            r21 = 4
            r20 = r16
            r16 = r1
            X.I63.A02(r16, r17, r18, r19, r20, r21)
            boolean r0 = X.C51967G9n.A1R(r1)
            if (r0 == 0) goto L_0x10c0
            r0 = -825052405(0xffffffffced2b30b, float:-1.76747456E9)
            goto L_0x1072
        L_0x0da2:
            X.H0B.A00(r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10c0
            r0 = -469568926(0xffffffffe402f262, float:-9.662169E21)
            goto L_0x1072
        L_0x0db0:
            X.Xss r1 = (X.C22018Xss) r1
            X.L8d r0 = (X.C63822L8d) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r2 = r4.A01
            X.AhF r2 = (X.C40695AhF) r2
            r2.A01 = r1
            r2.A02 = r0
            goto L_0x10c0
        L_0x0dc1:
            java.lang.String r1 = (java.lang.String) r1
            long r5 = X.AnonymousClass7TE.A0R(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r4.A01
            X.K6W r0 = (X.K6W) r0
            X.Kcz r0 = r0.stateView
            if (r0 != 0) goto L_0x0ddd
            java.lang.String r0 = "stateView"
        L_0x0dd5:
            X.0qQ.A0F(r0)
        L_0x0dd8:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0ddd:
            X.Jig r2 = r0.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.A01(r1, r0)
            goto L_0x10c0
        L_0x0dea:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0C(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0df9
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0df9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0e07
            r2 = -1097033854(0xffffffffbe9c9782, float:-0.3058434)
            java.lang.String r0 = "com.instagram.user.userlist.ui.LikesListComposeFragment.onCreateView.<anonymous> (LikesListComposeFragment.kt:157)"
            X.0fL.A01(r2, r0)
        L_0x0e07:
            r3 = 1796267905(0x6b10df81, float:1.7514079E26)
            java.lang.Object r2 = r4.A01
            r0 = 10
            X.JFy r0 = A00(r2, r0)
            boolean r0 = X.C51975G9x.A1T(r1, r0, r3)
            if (r0 == 0) goto L_0x10c0
            r0 = -2138501499(0xffffffff80890e85, float:-1.2586672E-38)
            goto L_0x1072
        L_0x0e1d:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0C(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0e2c
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0e2c:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0e3a
            r2 = 396843299(0x17a75923, float:1.0814623E-24)
            java.lang.String r0 = "com.instagram.user.userlist.ui.LikesListComposeFragment.onCreateView.<anonymous>.<anonymous> (LikesListComposeFragment.kt:158)"
            X.0fL.A01(r2, r0)
        L_0x0e3a:
            java.lang.Object r10 = r4.A01
            X.E6D r10 = (X.E6D) r10
            X.0eM r0 = r10.A07
            java.lang.Object r0 = r0.getValue()
            X.DkI r0 = (X.C46729DkI) r0
            X.0Ud r0 = r0.A05
            r4 = 0
            r3 = 8
            X.4gU r5 = X.AnonymousClass6FW.A02(r1, r0, r3)
            java.lang.Object r0 = r5.getValue()
            X.Drt r0 = (X.C47178Drt) r0
            com.instagram.api.schemas.GraphGuardianContent r2 = r0.A02
            java.lang.Object r0 = r5.getValue()
            X.Drt r0 = (X.C47178Drt) r0
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0e76
            r0 = 1088052804(0x40da5e44, float:6.824007)
            r1.ExS(r0)
            r0 = 0
            X.C56670I6z.A00(r1, r0)
        L_0x0e6b:
            boolean r0 = X.C51970G9q.A1Z(r1)
            if (r0 == 0) goto L_0x10c0
            r0 = 846479644(0x3274411c, float:1.4217473E-8)
            goto L_0x1072
        L_0x0e76:
            java.lang.Object r0 = r5.getValue()
            X.Drt r0 = (X.C47178Drt) r0
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0e93
            r0 = 1088054231(0x40da63d7, float:6.8246875)
            r1.ExS(r0)
            X.0gF r3 = X.C60340gF.A00
            r2 = 40
            X.MFx r0 = new X.MFx
            r0.<init>(r10, r4, r2)
            X.C286645Xf.A04(r1, r3, r0)
            goto L_0x0e6b
        L_0x0e93:
            if (r2 == 0) goto L_0x0e9f
            r0 = 1088056563(0x40da6cf3, float:6.8257995)
            r1.ExS(r0)
            X.C56670I6z.A03(r1, r2, r3)
            goto L_0x0e6b
        L_0x0e9f:
            r0 = -629887883(0xffffffffda74ac75, float:-1.72173782E16)
            r1.ExS(r0)
            X.0gF r3 = X.C60340gF.A00
            r2 = 41
            X.MFx r0 = new X.MFx
            r0.<init>(r10, r4, r2)
            X.C286645Xf.A04(r1, r3, r0)
            java.lang.Object r9 = r5.getValue()
            X.Drt r9 = (X.C47178Drt) r9
            r0 = 33
            X.MP8 r8 = new X.MP8
            r8.<init>(r10, r0)
            r0 = 27
            X.FyG r7 = new X.FyG
            r7.<init>(r10, r0)
            r0 = 21
            X.FyJ r6 = new X.FyJ
            r6.<init>(r10, r0)
            r0 = 28
            X.FyG r5 = new X.FyG
            r5.<init>(r10, r0)
            r0 = 46
            X.Imz r4 = new X.Imz
            r4.<init>(r10, r0)
            r0 = 48
            X.G2f r3 = new X.G2f
            r3.<init>(r10, r0)
            r2 = 34
            X.MP8 r0 = new X.MP8
            r0.<init>(r10, r2)
            r17 = 0
            r10 = r4
            r11 = r3
            r12 = r8
            r13 = r7
            r14 = r5
            r15 = r0
            r16 = r6
            r8 = r1
            X.C56670I6z.A06(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0e6b
        L_0x0ef8:
            X.3uv r0 = (X.C255913uv) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            int r3 = r0.A04
            java.lang.Object r2 = r4.A01
            X.4KG r2 = (X.AnonymousClass4KG) r2
            java.lang.Integer r1 = r2.A06
            if (r1 == 0) goto L_0x0f0f
            int r1 = r1.intValue()
            r0.setInactiveColor(r1)
        L_0x0f0f:
            r1 = 31
            goto L_0x0f2b
        L_0x0f12:
            X.3uv r0 = (X.C255913uv) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            int r3 = r0.A03
            java.lang.Object r2 = r4.A01
            X.4KG r2 = (X.AnonymousClass4KG) r2
            java.lang.Integer r1 = r2.A05
            if (r1 == 0) goto L_0x0f29
            int r1 = r1.intValue()
            r0.setActiveColor(r1)
        L_0x0f29:
            r1 = 30
        L_0x0f2b:
            X.GL8 r4 = new X.GL8
            r4.<init>(r3, r1, r2, r0)
            goto L_0x0f83
        L_0x0f31:
            X.3uv r0 = (X.C255913uv) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r3 = r4.A01
            X.4KG r3 = (X.AnonymousClass4KG) r3
            int r2 = r3.A01
            int r1 = r3.A00
            r0.A01(r2, r1)
            X.2V5 r1 = r3.A02
            int r1 = X.C51970G9q.A09(r1)
            r0.setCurrentPage(r1)
            r1 = 21
            goto L_0x0f61
        L_0x0f4e:
            X.3uv r0 = (X.C255913uv) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            X.4KG r1 = (X.AnonymousClass4KG) r1
            int r2 = r1.A01
            int r1 = r1.A00
            r0.A01(r2, r1)
            r1 = 20
        L_0x0f61:
            X.WxU r4 = new X.WxU
            r4.<init>((java.lang.Object) r0, (int) r1)
            goto L_0x0f83
        L_0x0f67:
            X.3uv r0 = (X.C255913uv) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r3 = r4.A01
            X.4KG r3 = (X.AnonymousClass4KG) r3
            X.4uf r2 = r3.A04
            if (r2 == 0) goto L_0x0f7c
            X.54P r1 = new X.54P
            r1.<init>(r0, r2)
            r0.A08 = r1
        L_0x0f7c:
            r1 = 22
            X.Wvv r4 = new X.Wvv
            r4.<init>(r1, r0, r3)
        L_0x0f83:
            X.3eI r0 = X.C51965G9l.A0f(r4)
            return r0
        L_0x0f88:
            java.lang.String r1 = (java.lang.String) r1
            X.LR6 r0 = (X.LR6) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r2 = r4.A01
            X.LOJ r2 = (X.LOJ) r2
            r2.A01(r0, r1)
            goto L_0x10c0
        L_0x0f98:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r1
            X.1Xj r0 = (X.1Xj) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r2 = r4.A01
            X.Uef r2 = (X.C15551Uef) r2
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment r3 = r2.A03
            X.Vkr r2 = r3.A09
            r2.A00(r0)
            X.Vkr r0 = r3.A09
            r0.A01(r1)
            goto L_0x10c0
        L_0x0fb1:
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r0 = r4.A01
            X.JaK r0 = (X.C59844JaK) r0
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r3 = X.C59844JaK.A00(r0)
            X.6oS r5 = X.C318116oQ.A00(r3)
            r2 = 0
            r0 = 33
            X.MGf r4 = new X.MGf
            r4.<init>((java.lang.Object) r1, (java.lang.Object) r3, (X.AnonymousClass4D7) r2, (int) r0)
            goto L_0x10bd
        L_0x0fca:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0fd9
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x1076
        L_0x0fd9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0fe7
            r2 = -295778860(0xffffffffee5ec5d4, float:-1.7236208E28)
            java.lang.String r0 = "com.instagram.settings2.core.view.SettingsScreenConfirmBottomSheetFragment.onCreateView.<anonymous> (SettingsScreenConfirmBottomSheetFragment.kt:47)"
            X.0fL.A01(r2, r0)
        L_0x0fe7:
            java.lang.Object r7 = r4.A01
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            X.5Zx r2 = X.C287275Zs.A07
            X.5Zr r0 = X.C287215Zl.A02
            r6 = 0
            X.5RD r2 = X.C291495hO.A02(r2, r1, r0, r6)
            int r4 = X.C287425a7.A00(r1)
            r5 = r1
            X.5Wx r5 = (X.C286565Wx) r5
            X.5RM r0 = X.C286565Wx.A04(r5)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r1, r3)
            X.C51973G9u.A0y(r1, r5)
            X.C51971G9r.A12(r1, r2, r0)
            X.0sL r2 = X.C287485aD.A02
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x1017
            boolean r0 = X.C51972G9s.A1Q(r1, r4)
            if (r0 != 0) goto L_0x101a
        L_0x1017:
            X.C51971G9r.A13(r1, r2, r4)
        L_0x101a:
            X.C51965G9l.A18(r1, r3)
            r0 = -1175414643(0xffffffffb9f0988d, float:-4.5890026E-4)
            r1.ExS(r0)
            if (r7 == 0) goto L_0x1069
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x102d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x1069
            java.lang.Object r2 = r7.next()
            com.instagram.settings2.core.view.SettingsScreenConfirmBottomSheetFragment$Item r2 = (com.instagram.settings2.core.view.SettingsScreenConfirmBottomSheetFragment$Item) r2
            java.lang.Integer r3 = r2.A00
            if (r3 != 0) goto L_0x1054
            r0 = 473657500(0x1c3b709c, float:6.2018654E-22)
            r1.ExS(r0)
            java.lang.String r3 = r2.A01
            r2 = 0
            r0 = 32766(0x7ffe, float:4.5915E-41)
            X.AnonymousClass5ZZ.A0a(r1, r2, r3, r0)
        L_0x104b:
            X.C286565Wx.A0L(r5, r6)
            X.0gF r0 = X.C60340gF.A00
            r4.add(r0)
            goto L_0x102d
        L_0x1054:
            r0 = 473714974(0x1c3c511e, float:6.2308824E-22)
            r1.ExS(r0)
            java.lang.String r0 = r2.A01
            X.Gpe r2 = new X.Gpe
            r2.<init>(r0, r6)
            int r0 = r3.intValue()
            X.C56649I6e.A05(r1, r2, r0)
            goto L_0x104b
        L_0x1069:
            boolean r0 = X.C51971G9r.A1S(r1, r5, r6)
            if (r0 == 0) goto L_0x10c0
            r0 = -1067111931(0xffffffffc0652a05, float:-3.5806897)
        L_0x1072:
            X.0fL.A00(r0)
            goto L_0x10c0
        L_0x1076:
            r1.Evl()
            goto L_0x10c0
        L_0x107a:
            r7 = 1
            X.0qQ.A0B(r0, r7)
            java.lang.Object r2 = r4.A01
            X.JaK r2 = (X.C59844JaK) r2
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r6 = X.C59844JaK.A00(r2)
            if (r40 == 0) goto L_0x10ae
            X.0eM r2 = r6.A0D
            java.lang.Object r5 = r2.getValue()
            X.LFr r5 = (X.LFr) r5
            java.lang.String r2 = r1.toString()
            java.lang.String r3 = X.AnonymousClass7TF.A0j(r2)
            r2 = 2552(0x9f8, float:3.576E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r4 = X.002.A0R(r3, r2)
            java.lang.String r3 = r6.A0C
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r5.A01(r4, r2, r3)
            X.05G r2 = r6.A0I
            X.AnonymousClass7TF.A1O(r2, r7)
        L_0x10ae:
            X.6oS r5 = X.C318116oQ.A00(r6)
            r10 = 0
            r11 = 5
            X.JaL r4 = new X.JaL
            r8 = r0
            r9 = r6
            r6 = r4
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x10bd:
            X.AnonymousClass7TE.A1Z(r4, r5)
        L_0x10c0:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59346JFy.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
