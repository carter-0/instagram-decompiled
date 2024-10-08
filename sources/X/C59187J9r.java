package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.J9r  reason: case insensitive filesystem */
public final class C59187J9r extends 0Yg implements 0sL {
    public final /* synthetic */ GZF A00;
    public final /* synthetic */ C15050ULg A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 0sL A03;
    public final /* synthetic */ AnonymousClass62P A04;
    public final /* synthetic */ AnonymousClass62P A05;
    public final /* synthetic */ C262224Cq A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59187J9r(GZF gzf, C15050ULg uLg, C62320sa r4, 0sL r5, AnonymousClass62P r6, AnonymousClass62P r7, C262224Cq r8, boolean z) {
        super(2);
        this.A04 = r6;
        this.A00 = gzf;
        this.A05 = r7;
        this.A06 = r8;
        this.A03 = r5;
        this.A01 = uLg;
        this.A07 = z;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r1 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-709031485, "com.instagram.schools.tab.ui.SchoolRootComponent.<anonymous> (SchoolRootComposeComponents.kt:43)");
            }
            AnonymousClass62P r10 = this.A04;
            GZF gzf = this.A00;
            AnonymousClass62P r7 = this.A05;
            C262224Cq r12 = this.A06;
            0sL r9 = this.A03;
            C15050ULg uLg = this.A01;
            boolean z = this.A07;
            C62320sa r3 = this.A02;
            C285245Qk r6 = Modifier.A00;
            AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A07, r1, C287215Zl.A02, 0);
            int A002 = C287425a7.A00(r1);
            C286565Wx r2 = (C286565Wx) r1;
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r1, r6);
            C51973G9u.A0y(r1, r2);
            C51971G9r.A12(r1, A022, A042);
            0sL r11 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r1, A002)) {
                C51971G9r.A13(r1, r11, A002);
            }
            C51965G9l.A18(r1, A012);
            r1.ExS(1125722);
            if (r10.size() > 1) {
                int A032 = gzf.A03();
                boolean A1X = G9t.A1X(r1, r12, gzf, 1130893);
                Object ECw = r1.ECw();
                if (A1X || ECw == AnonymousClass5XT.A00) {
                    ECw = C59104J6m.A00(r1, gzf, r7, r12, 27);
                }
                C56262HvW.A00(r1, (Modifier) null, (C54610HKt) null, C51965G9l.A0z(r2, ECw), r7, A032, 48, 56, 0);
                C56618I4t.A00(r1);
            }
            C286565Wx.A0L(r2, false);
            C286575Wy r17 = r1;
            C52617GZq.A01((C304836Fk) null, gzf, (JNT) null, r17, C287215Zl.A05, C51966G9m.A0U(r6), (0sP) null, AnonymousClass5PI.A01(r1, new C59432JJh(1, r3, uLg, r9, r10, z), -927925287), 102236208, 7868);
            if (C51967G9n.A1R(r1)) {
                0fL.A00(1284394820);
            }
        } else {
            r1.Evl();
        }
        return C60340gF.A00;
    }
}
