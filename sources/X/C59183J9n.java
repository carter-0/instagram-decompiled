package X;

/* renamed from: X.J9n  reason: case insensitive filesystem */
public final class C59183J9n extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sL A06;
    public final /* synthetic */ AnonymousClass62P A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59183J9n(C284945Oz r2, C62320sa r3, 0sP r4, 0sP r5, 0sP r6, 0sL r7, AnonymousClass62P r8, float f) {
        super(2);
        this.A07 = r8;
        this.A00 = f;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r6;
        this.A06 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r4 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(627158494, "com.instagram.nux.reelstuning.ui.ReelsTuningCardStack.<anonymous>.<anonymous> (ReelsTuningCardStack.kt:291)");
            }
            AnonymousClass62P<C55812Hns> r12 = this.A07;
            for (C55812Hns hns : r12) {
                Object A0m = C51967G9n.A0m(r4, -47189026);
                Object obj3 = AnonymousClass5XT.A00;
                Object A0Z = C51974G9v.A0Z(r4, A0m, obj3, false);
                C286565Wx A0H = C51965G9l.A0H(r4, false);
                int size = (r12.size() - r12.indexOf(hns)) - 1;
                if (size > 2) {
                    size = 2;
                }
                AnonymousClass3WR r0 = hns.A03;
                AnonymousClass6D8 A002 = C56235Hv2.A00(r4, r0, 0);
                AnonymousClass6D9 A003 = HVC.A00(r4, A002, r0.A0G, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, 0, 252, false);
                boolean A1Y = C51967G9n.A1Y(r4, A003, -47171817);
                C284945Oz r11 = this.A01;
                Object ECw = r4.ECw();
                if (A1Y || ECw == obj3) {
                    ECw = C51970G9q.A0w(r4, r11, A003, 25);
                }
                C286565Wx.A0L(A0H, false);
                A003.A05.Epw((Object) null);
                A003.A07.Epw((Object) null);
                A003.A08.Epw(ECw);
                A003.A06.Epw((Object) null);
                int intValue = C56656I6l.A01[size].intValue();
                float f = this.A00;
                r4.ExS(-47160997);
                0sP r10 = this.A04;
                boolean A1T = C51971G9r.A1T(r4, r10, hns);
                Object ECw2 = r4.ECw();
                if (A1T || ECw2 == obj3) {
                    ECw2 = C51970G9q.A0w(r4, hns, r10, 26);
                }
                C62320sa A0y = C51965G9l.A0y(A0H, ECw2, false);
                r4.ExS(-47159012);
                0sP r102 = this.A05;
                boolean A1T2 = C51971G9r.A1T(r4, r102, hns);
                Object ECw3 = r4.ECw();
                if (A1T2 || ECw3 == obj3) {
                    ECw3 = C51970G9q.A0w(r4, hns, r102, 27);
                }
                C62320sa A0y2 = C51965G9l.A0y(A0H, ECw3, false);
                r4.ExS(-47156980);
                C62320sa r103 = this.A02;
                boolean AGu = r4.AGu(r103);
                Object ECw4 = r4.ECw();
                if (AGu || ECw4 == obj3) {
                    ECw4 = new C41562AwU(r103, 23);
                    r4.FLL(ECw4);
                }
                AnonymousClass6D9 r19 = A003;
                AnonymousClass62P r18 = r12;
                C55812Hns hns2 = hns;
                C286575Wy r25 = r4;
                C55812Hns hns3 = hns;
                C56656I6l.A04(r25, hns3, A0y, A0y2, C51965G9l.A0y(A0H, ECw4, false), AnonymousClass5PI.A01(r4, new JBG(hns2, r18, r19, A002, this.A03, this.A06, r11, A0Z, size, 4), -768906137), f, intValue, 1572872, 0);
                if (hns.equals(00k.A0K(r12))) {
                    A002.A00();
                }
            }
            if (0fL.A02()) {
                0fL.A00(-1856465243);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}
