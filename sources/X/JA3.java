package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

public final class JA3 extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JA3(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(2);
        this.A00 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A07 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
        this.A06 = obj6;
        this.A01 = obj7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        C286575Wy r10 = (C286575Wy) obj;
        if (this.A00 != 0) {
            if (C51968G9o.A0B(obj2) != 2 || !r10.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(-1992283142, "com.instagram.schools.management.ui.OnboardingBaseContent.<anonymous> (SchoolOnboardingCommonComponents.kt:53)");
                }
                C285245Qk r18 = Modifier.A00;
                Modifier A0U = C51966G9m.A0U(r18);
                HMD hmd = (HMD) this.A07;
                ImmutableList immutableList = (ImmutableList) this.A06;
                C62320sa r11 = (C62320sa) this.A02;
                C62320sa r9 = (C62320sa) this.A03;
                C62320sa r8 = (C62320sa) this.A04;
                C62320sa r7 = (C62320sa) this.A01;
                0sK r13 = (0sK) this.A05;
                AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A07, r10, C287215Zl.A02, 0);
                int A002 = C287425a7.A00(r10);
                C286565Wx r5 = (C286565Wx) r10;
                AnonymousClass5RM A042 = C286565Wx.A04(r5);
                Modifier A012 = C287435a8.A01(r10, A0U);
                C62320sa r4 = C287485aD.A00;
                C51973G9u.A0z(r10, r5, r4);
                0sL r3 = C287485aD.A03;
                0sL A0w = C51969G9p.A0w(r10, A022, A042, r3);
                0sL r2 = C287485aD.A02;
                if (r5.A0K || !C51972G9s.A1Q(r10, A002)) {
                    C51971G9r.A13(r10, r2, A002);
                }
                0sL A1K = C51966G9m.A1K(r10, A012);
                C304676Et r1 = C304676Et.A00;
                Modifier A0T = C51966G9m.A0T(r18);
                I58.A01(r10, A0T, immutableList, hmd, 384, 0);
                Modifier A003 = r1.A00(r18, true);
                AnonymousClass5RD A004 = C287675aa.A00(C287215Zl.A0C, false);
                int A005 = C287425a7.A00(r10);
                AnonymousClass5RM A043 = C286565Wx.A04(r5);
                Modifier A013 = C287435a8.A01(r10, A003);
                C51973G9u.A0z(r10, r5, r4);
                C287595aO.A00(r10, A004, r3);
                if (C51965G9l.A1Y(r10, r5, A043, A0w) || !C51972G9s.A1Q(r10, A005)) {
                    C51971G9r.A13(r10, r2, A005);
                }
                C287595aO.A00(r10, A013, A1K);
                C51967G9n.A1M(C289515dj.A00, r10, r13, 6);
                r10.ASN();
                C286575Wy r182 = r10;
                I58.A02(r182, A0T, hmd, r11, r9, r8, r7, 196608, 0);
                if (C51967G9n.A1R(r10)) {
                    i = -2030746234;
                }
                return C60340gF.A00;
            }
            r10.Evl();
            return C60340gF.A00;
        }
        if (C51968G9o.A0C(obj2) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(227950757, "com.instagram.creation.genai.themes.ui.MainContent.<anonymous>.<anonymous> (AiThemesScreen.kt:144)");
            }
            C53032GhN ghN = (C53032GhN) this.A07;
            C59102J6k j6k = new C59102J6k(28, (Object) ghN, this.A06);
            C53368Gms gms = (C53368Gms) C51966G9m.A18(this.A03);
            C53390GnN gnN = (C53390GnN) this.A05;
            C55891HpC hpC = (C55891HpC) this.A02;
            C62320sa r14 = (C62320sa) this.A04;
            C54920HYc.A00(r10, gms, gnN, hpC, r14, j6k, 262216, ghN.A07, C51971G9r.A1X((C270284gU) this.A01));
            if (0fL.A02()) {
                i = -1528441025;
            }
            return C60340gF.A00;
        }
        r10.Evl();
        return C60340gF.A00;
        0fL.A00(i);
        return C60340gF.A00;
    }
}
