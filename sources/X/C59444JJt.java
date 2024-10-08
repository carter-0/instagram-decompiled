package X;

/* renamed from: X.JJt  reason: case insensitive filesystem */
public final class C59444JJt extends 0Yg implements 0sJ {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ C284945Oz A02;
    public final /* synthetic */ C284945Oz A03;
    public final /* synthetic */ C284945Oz A04;
    public final /* synthetic */ C270284gU A05;
    public final /* synthetic */ C270284gU A06;
    public final /* synthetic */ C66920MfE A07;
    public final /* synthetic */ C52614GZn A08;
    public final /* synthetic */ I4B A09;
    public final /* synthetic */ C52969GgM A0A;
    public final /* synthetic */ AnonymousClass4DU A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ 0sI A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59444JJt(C284945Oz r2, C284945Oz r3, C284945Oz r4, C284945Oz r5, C284945Oz r6, C270284gU r7, C270284gU r8, C66920MfE mfE, C52614GZn gZn, I4B i4b, C52969GgM ggM, AnonymousClass4DU r13, String str, 0sI r15, boolean z) {
        super(4);
        this.A09 = i4b;
        this.A06 = r7;
        this.A0D = r15;
        this.A0B = r13;
        this.A0A = ggM;
        this.A05 = r8;
        this.A0C = str;
        this.A0E = z;
        this.A08 = gZn;
        this.A07 = mfE;
        this.A00 = r2;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        int A0M = AnonymousClass7TE.A0M(obj);
        JQB jqb = (JQB) obj2;
        C286575Wy r0 = (C286575Wy) obj3;
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        0qQ.A0B(jqb, 1);
        if ((A0M2 & 6) == 0) {
            i = A0M2 | G9t.A05(r0, A0M);
        } else {
            i = A0M2;
        }
        if ((A0M2 & 48) == 0) {
            i |= G9t.A0P(r0, jqb);
        }
        if ((i & 147) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(915414593, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:252)");
            }
            r0.ExS(-257920261);
            C52614GZn gZn = this.A08;
            Object ECw = r0.ECw();
            Object obj5 = AnonymousClass5XT.A00;
            if (ECw == obj5) {
                ECw = C51969G9p.A0R(r0, new MJ3(A0M, 11, gZn));
            }
            C270284gU r10 = (C270284gU) ECw;
            C286565Wx r3 = (C286565Wx) r0;
            C286565Wx.A0L(r3, false);
            int height = jqb.getHeight();
            if (height > 0) {
                f = ((float) jqb.getWidth()) / ((float) height);
            } else {
                f = 1.0f;
            }
            C51967G9n.A14(this.A00, f);
            if (C53472Gp4.A00(0, jqb)) {
                r0.ExS(594699360);
                I4B i4b = this.A09;
                C62320sa r9 = (C62320sa) this.A04.getValue();
                C53472Gp4 gp4 = (C53472Gp4) jqb;
                boolean A1X = C51971G9r.A1X(r10);
                C270284gU r8 = this.A06;
                r0.ExS(-257900923);
                C284945Oz r102 = this.A01;
                Object ECw2 = r0.ECw();
                if (ECw2 == obj5) {
                    ECw2 = C58713IwM.A00(r0, r102, 6);
                }
                C62320sa A0y = C51965G9l.A0y(r3, ECw2, false);
                r0.ExS(-257898537);
                C284945Oz r103 = this.A02;
                Object ECw3 = r0.ECw();
                if (ECw3 == obj5) {
                    ECw3 = C59099J6h.A01(r0, r103, 36);
                }
                0sP A0z = C51965G9l.A0z(r3, ECw3);
                r0.ExS(-257896749);
                C284945Oz r104 = this.A03;
                Object ECw4 = r0.ECw();
                if (ECw4 == obj5) {
                    ECw4 = C59099J6h.A01(r0, r104, 37);
                }
                0sP A0z2 = C51965G9l.A0z(r3, ECw4);
                r0.ExS(-257894907);
                0sI r11 = this.A0D;
                boolean AGu = r0.AGu(r11);
                AnonymousClass4DU r105 = this.A0B;
                boolean A1U = C51966G9m.A1U(r0, r105, AGu);
                C52969GgM ggM = this.A0A;
                boolean A1Z = C51965G9l.A1Z(r0, ggM, A1U);
                Object ECw5 = r0.ECw();
                if (A1Z || ECw5 == obj5) {
                    ECw5 = new C58751Iwy(49, r105, ggM, r11);
                    r0.FLL(ECw5);
                }
                C56228Huv.A01(r0, r8, gp4, i4b, r9, A0y, A0z, A0z2, C51965G9l.A0z(r3, ECw5), f, 115015680, A1X);
            } else if (C53472Gp4.A00(1, jqb)) {
                r0.ExS(595588843);
                C62320sa r112 = (C62320sa) this.A04.getValue();
                C53472Gp4 gp42 = (C53472Gp4) jqb;
                boolean A1X2 = C51971G9r.A1X(r10);
                boolean A1X3 = C51971G9r.A1X(this.A05);
                C284945Oz r106 = this.A03;
                boolean A1W = C51971G9r.A1W(r106);
                boolean A1X4 = C51971G9r.A1X(this.A06);
                I4B i4b2 = this.A09;
                String str = this.A0C;
                boolean z = this.A0E;
                C66920MfE mfE = this.A07;
                r0.ExS(-257863643);
                C284945Oz r92 = this.A01;
                Object ECw6 = r0.ECw();
                if (ECw6 == obj5) {
                    ECw6 = C58713IwM.A01(r0, r92, 8);
                }
                C62320sa A0y2 = C51965G9l.A0y(r3, ECw6, false);
                r0.ExS(-257861257);
                C284945Oz r93 = this.A02;
                Object ECw7 = r0.ECw();
                if (ECw7 == obj5) {
                    ECw7 = C59099J6h.A01(r0, r93, 38);
                }
                0sP A0z3 = C51965G9l.A0z(r3, ECw7);
                Object A0m = C51967G9n.A0m(r0, -257859469);
                if (A0m == obj5) {
                    A0m = C59099J6h.A01(r0, r106, 39);
                }
                0sP A0z4 = C51965G9l.A0z(r3, A0m);
                r0.ExS(-257857627);
                0sI r107 = this.A0D;
                boolean AGu2 = r0.AGu(r107);
                AnonymousClass4DU r94 = this.A0B;
                boolean A1U2 = C51966G9m.A1U(r0, r94, AGu2);
                C52969GgM ggM2 = this.A0A;
                boolean A1Z2 = C51965G9l.A1Z(r0, ggM2, A1U2);
                Object ECw8 = r0.ECw();
                if (A1Z2 || ECw8 == obj5) {
                    ECw8 = new J6W(0, r94, r107, ggM2);
                    r0.FLL(ECw8);
                }
                boolean z2 = z;
                String str2 = str;
                C62320sa r20 = r112;
                C53472Gp4 gp43 = gp42;
                C52614GZn gZn2 = gZn;
                C286575Wy r14 = r0;
                I2M.A02(r14, mfE, gp43, gZn2, i4b2, str2, r20, A0y2, A0z3, A0z4, C51965G9l.A0z(r3, ECw8), f, A0M, 0, (i & 14) | 224256, A1X2, A1X3, A1W, z2, A1X4);
            } else if (jqb instanceof C53471Gp3) {
                r0.ExS(596738850);
                r0.AJO(AnonymousClass6DE.A00);
                I4B i4b3 = this.A09;
                C62320sa r82 = (C62320sa) this.A04.getValue();
                boolean A1L = C51972G9s.A1L(i) | C51967G9n.A1Y(r0, (Object) null, -257838727);
                Object ECw9 = r0.ECw();
                if (A1L || ECw9 == obj5) {
                    ECw9 = C59103J6l.A00(r0, jqb, (Object) null, 40);
                }
                0sP A0z5 = C51965G9l.A0z(r3, ECw9);
                r0.ExS(-257833723);
                C284945Oz r108 = this.A01;
                Object ECw10 = r0.ECw();
                if (ECw10 == obj5) {
                    ECw10 = C58713IwM.A00(r0, r108, 7);
                }
                C62320sa A0y3 = C51965G9l.A0y(r3, ECw10, false);
                r0.ExS(-257831337);
                C284945Oz r109 = this.A02;
                Object ECw11 = r0.ECw();
                if (ECw11 == obj5) {
                    ECw11 = C59099J6h.A01(r0, r109, 34);
                }
                0sP A0z6 = C51965G9l.A0z(r3, ECw11);
                r0.ExS(-257829549);
                C284945Oz r7 = this.A03;
                Object ECw12 = r0.ECw();
                if (ECw12 == obj5) {
                    ECw12 = C59099J6h.A01(r0, r7, 35);
                }
                C286575Wy r1010 = r0;
                I4B i4b4 = i4b3;
                C62320sa r13 = r82;
                C54824HUf.A00(r1010, C51968G9o.A0O(), i4b4, r13, A0y3, A0z5, A0z6, C51965G9l.A0z(r3, ECw12), AnonymousClass5PI.A01(r0, new J72(jqb, f, 0), -574143855), 14380032);
            } else {
                throw C51972G9s.A0v(r0, r3, -257910703);
            }
            if (C51967G9n.A1b(r3, false)) {
                0fL.A00(1844854720);
            }
        } else {
            r0.Evl();
        }
        return C60340gF.A00;
    }
}
