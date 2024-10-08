package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.compose.ui.capturable.CapturableModifierNodeElement;
import com.instagram.profilecard.domain.ProfileCardViewModel;

public final class JC9 extends 0Yg implements 0sL {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C270284gU A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ AnonymousClass2DO A04;
    public final /* synthetic */ L3W A05;
    public final /* synthetic */ C53397GnU A06;
    public final /* synthetic */ ProfileCardViewModel A07;
    public final /* synthetic */ AnonymousClass62P A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JC9(Bitmap bitmap, View view, C270284gU r4, Modifier modifier, AnonymousClass2DO r6, L3W l3w, C53397GnU gnU, ProfileCardViewModel profileCardViewModel, AnonymousClass62P r10, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = bitmap;
        this.A06 = gnU;
        this.A07 = profileCardViewModel;
        this.A09 = z;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = modifier;
        this.A0A = z2;
        this.A05 = l3w;
        this.A08 = r10;
        this.A01 = view;
        this.A0B = z3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass5S2 r7;
        AnonymousClass62O A002;
        int i;
        C286575Wy r25;
        Object ECw;
        C286575Wy r0 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1138228675, "com.instagram.profilecard.ui.ProfileCardContent.<anonymous> (ProfileCardContent.kt:181)");
            }
            r0.ExS(255128774);
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                C3018360g r6 = new C3018360g(BlurUtil.blur(bitmap, 0.3f, 25));
                C286575Wy r72 = r0;
                AnonymousClass6G3.A01(r72, C51968G9o.A0O(), new C288185bV(C285595Rx.A02(AnonymousClass5RX.A0K[(int) (C51966G9m.A0C(r0) & 63)], AnonymousClass5RW.A03(C51966G9m.A0C(r0)), AnonymousClass5RW.A02(C51966G9m.A0C(r0)), AnonymousClass5RW.A01(C51966G9m.A0C(r0)), 0.4f), 9), r6, C288075bK.A00, (String) null, 25008, 168);
            }
            C286565Wx r1 = (C286565Wx) r0;
            C286565Wx.A0L(r1, false);
            C285245Qk r62 = Modifier.A00;
            Modifier A003 = JJP.A00(r62, C287655aY.A00, 4);
            C53397GnU gnU = this.A06;
            ProfileCardViewModel profileCardViewModel = this.A07;
            boolean z = this.A09;
            AnonymousClass2DO r13 = this.A04;
            C270284gU r42 = this.A02;
            Modifier modifier = this.A03;
            boolean z2 = this.A0A;
            L3W l3w = this.A05;
            AnonymousClass62P r39 = this.A08;
            View view = this.A01;
            boolean z3 = this.A0B;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r0, A003);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r0, r1, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0Z, A042, r11);
            0sL r9 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r9, A004);
            }
            0sL A1K = C51966G9m.A1K(r0, A012);
            boolean z4 = gnU.A0L;
            boolean z5 = z4;
            if (z4) {
                r0.ExS(-1194079815);
                boolean A1Z = C51967G9n.A1Z(r0, profileCardViewModel, 792769187);
                Object ECw2 = r0.ECw();
                if (A1Z || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C51795G2e(profileCardViewModel, 35);
                    r0.FLL(ECw2);
                }
                C52738Gbq gbq = new C52738Gbq(C51965G9l.A0y(r1, ECw2, false), 3, 0);
                long A0J = C51966G9m.A0J(r0);
                r7 = AnonymousClass5S0.A00;
                Modifier A005 = HRF.A00(C304766Fd.A01(r62, r7, A0J), C51971G9r.A03(r42));
                String A006 = C288035bG.A00(r0, 2131960992);
                boolean A1Z2 = C51967G9n.A1Z(r0, profileCardViewModel, 792780539);
                Object ECw3 = r0.ECw();
                if (A1Z2 || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new C51795G2e(profileCardViewModel, 36);
                    r0.FLL(ECw3);
                }
                i = 24;
                r25 = r0;
                C52738Gbq gbq2 = gbq;
                C52739Gbr.A02(r25, A005, gbq2, (String) null, AnonymousClass62Q.A04(new C53514Gpk(A006, AnonymousClass05K.A01, C51965G9l.A0y(r1, ECw3, false))), 48, 24);
                C286565Wx.A0L(r1, false);
            } else {
                r0.ExS(-1193487250);
                C52738Gbq gbq3 = new C52738Gbq((C62320sa) null, 7, 1);
                long A0J2 = C51966G9m.A0J(r0);
                r7 = AnonymousClass5S0.A00;
                Modifier A007 = HRF.A00(C304766Fd.A01(r62, r7, A0J2), C51971G9r.A03(r42));
                r0.ExS(792792011);
                if (!z || !gnU.A0K) {
                    boolean A1Z3 = C51967G9n.A1Z(r0, profileCardViewModel, 792799835);
                    Object ECw4 = r0.ECw();
                    if (A1Z3 || ECw4 == AnonymousClass5XT.A00) {
                        ECw4 = new C51795G2e(profileCardViewModel, 37);
                        r0.FLL(ECw4);
                    }
                    A002 = C53515Gpl.A00(r1, r13, ECw4, (String) null);
                } else {
                    A002 = null;
                }
                C286565Wx.A0L(r1, false);
                i = 24;
                r25 = r0;
                C52739Gbr.A02(r25, A007, gbq3, (String) null, A002, 54, 24);
                C286565Wx.A0L(r1, false);
            }
            FillElement fillElement = C287205Zk.A01;
            Modifier A013 = C304766Fd.A01(r62.Ezh(fillElement), r7, C51966G9m.A0J(r0));
            Alignment alignment = C287215Zl.A09;
            AnonymousClass5RD A008 = C287675aa.A00(alignment, false);
            int A009 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r1);
            Modifier A014 = C287435a8.A01(r0, A013);
            C51973G9u.A0z(r0, r1, r12);
            C287595aO.A00(r0, A008, r11);
            if (C51965G9l.A1Y(r0, r1, A043, A0w) || !C51972G9s.A1Q(r0, A009)) {
                C51971G9r.A13(r0, r9, A009);
            }
            C287595aO.A00(r0, A014, A1K);
            C289515dj r73 = C289515dj.A00;
            Activity A0010 = C61270mF.A00(C51968G9o.A0I(r0));
            Modifier A0011 = HRF.A00(r73.AAz(C287215Zl.A0D, r62), C51971G9r.A03(r42));
            boolean z6 = gnU.A0H;
            long A0012 = C54759HRr.A00(10.0f, 0.0f);
            boolean A1S = C51973G9u.A1S(r0, profileCardViewModel, A0010, -1891399771);
            Object ECw5 = r0.ECw();
            if (A1S || ECw5 == AnonymousClass5XT.A00) {
                ECw5 = new MPB(49, (Object) A0010, (Object) profileCardViewModel);
                r0.FLL(ECw5);
            }
            0sP A0z = C51965G9l.A0z(r1, ECw5);
            boolean A1Z4 = C51967G9n.A1Z(r0, profileCardViewModel, -1891374500);
            Object ECw6 = r0.ECw();
            if (A1Z4 || ECw6 == AnonymousClass5XT.A00) {
                ECw6 = new C51795G2e(profileCardViewModel, 38);
                r0.FLL(ECw6);
            }
            C56261HvV.A00((C56838IEj) null, r25, A0011, (HL4) null, C51965G9l.A0y(r1, ECw6, false), A0z, new J7L(gnU, 1, z, z2), 196608, 208, A0012, z6, false);
            Modifier Ezh = modifier.Ezh(fillElement);
            C287355a0 r5 = C287275Zs.A04;
            C287265Zr r74 = C287215Zl.A00;
            AnonymousClass5RD A015 = C291495hO.A01(r5, r0, r74);
            int A0013 = C287425a7.A00(r0);
            AnonymousClass5RM A044 = C286565Wx.A04(r1);
            Modifier A016 = C287435a8.A01(r0, Ezh);
            C51973G9u.A0z(r0, r1, r12);
            C287595aO.A00(r0, A015, r11);
            if (C51965G9l.A1Y(r0, r1, A044, A0w) || !C51972G9s.A1Q(r0, A0013)) {
                C51971G9r.A13(r0, r9, A0013);
            }
            C287595aO.A00(r0, A016, A1K);
            C304676Et r132 = C304676Et.A00;
            FillElement fillElement2 = C287205Zk.A02;
            Modifier A0B2 = C287195Zj.A0B(r132.A00(modifier.Ezh(fillElement2), true), 16.0f, 0.0f, 16.0f, 0.0f);
            AnonymousClass5RD A017 = C291495hO.A01(C287275Zs.A02, r0, r74);
            int A0014 = C287425a7.A00(r0);
            AnonymousClass5RM A045 = C286565Wx.A04(r1);
            Modifier A018 = C287435a8.A01(r0, A0B2);
            C51973G9u.A0z(r0, r1, r12);
            C287595aO.A00(r0, A017, r11);
            if (C51965G9l.A1Y(r0, r1, A045, A0w) || !C51972G9s.A1Q(r0, A0014)) {
                C51971G9r.A13(r0, r9, A0014);
            }
            C287595aO.A00(r0, A018, A1K);
            Modifier Ezh2 = r62.Ezh(new CapturableModifierNodeElement(l3w));
            boolean z7 = gnU.A0G;
            0qQ.A0B(Ezh2, 0);
            Modifier A0015 = C304916Fs.A00(Ezh2, Boolean.valueOf(z7), new C59673JTe(z7, (Object) A0010, (AnonymousClass4D7) null, 26));
            boolean A1S2 = C51973G9u.A1S(r0, profileCardViewModel, A0010, 1835255847);
            Object ECw7 = r0.ECw();
            if (A1S2 || ECw7 == AnonymousClass5XT.A00) {
                ECw7 = new MJ4(48, A0010, profileCardViewModel);
                r0.FLL(ECw7);
            }
            C62320sa A0y = C51965G9l.A0y(r1, ECw7, false);
            boolean A1Z5 = C51967G9n.A1Z(r0, profileCardViewModel, 1835257935);
            Object ECw8 = r0.ECw();
            if (A1Z5 || ECw8 == AnonymousClass5XT.A00) {
                ECw8 = new C51654FyG(profileCardViewModel, i);
                r0.FLL(ECw8);
            }
            0sP A12 = C51965G9l.A12(r1, ECw8);
            boolean A1Z6 = C51967G9n.A1Z(r0, profileCardViewModel, 1835259281);
            Object ECw9 = r0.ECw();
            if (A1Z6 || ECw9 == AnonymousClass5XT.A00) {
                ECw9 = C51969G9p.A0y(r0, profileCardViewModel, 26);
            }
            C62320sa r75 = (C62320sa) C51965G9l.A12(r1, ECw9);
            boolean A1S3 = C51973G9u.A1S(r0, profileCardViewModel, A0010, 1835260812);
            Object ECw10 = r0.ECw();
            if (A1S3 || ECw10 == AnonymousClass5XT.A00) {
                ECw10 = new C74186PqS(0, (Object) profileCardViewModel, (Object) A0010);
                r0.FLL(ECw10);
            }
            0sP A0z2 = C51965G9l.A0z(r1, ECw10);
            boolean A1Z7 = C51967G9n.A1Z(r0, profileCardViewModel, 1835266034);
            Object ECw11 = r0.ECw();
            if (A1Z7 || ECw11 == AnonymousClass5XT.A00) {
                ECw11 = new C51654FyG(profileCardViewModel, 25);
                r0.FLL(ECw11);
            }
            I7V.A05(r0, A0015, gnU, A0y, r75, A12, A0z2, C51968G9o.A1A(r1, ECw11), 0, 0, z);
            r0.ASN();
            Modifier A082 = C287205Zk.A08(r62.Ezh(fillElement2), 120.0f);
            AnonymousClass5RD A0016 = C287675aa.A00(alignment, false);
            int A0017 = C287425a7.A00(r0);
            AnonymousClass5RM A046 = C286565Wx.A04(r1);
            Modifier A019 = C287435a8.A01(r0, A082);
            C51973G9u.A0z(r0, r1, r12);
            C287595aO.A00(r0, A0016, r11);
            if (C51965G9l.A1Y(r0, r1, A046, A0w) || !C51972G9s.A1Q(r0, A0017)) {
                C51971G9r.A13(r0, r9, A0017);
            }
            C287595aO.A00(r0, A019, A1K);
            if (!gnU.A0K) {
                if (!z5) {
                    r0.ExS(1058941970);
                    HZZ.A00(view, r0, HRF.A00(r62, C51971G9r.A03(r42)), r39, 3072, 0, true, z3);
                }
                r0.ExS(1059315675);
                C56532I0d i0d = gnU.A05;
                boolean A1Z8 = C51967G9n.A1Z(r0, profileCardViewModel, 1835288571);
                ECw = r0.ECw();
                if (A1Z8 || ECw == AnonymousClass5XT.A00) {
                    ECw = new G4S(profileCardViewModel, 35);
                    r0.FLL(ECw);
                }
                I7V.A0B(r0, i0d, C51965G9l.A0z(r1, ECw), 0);
            } else {
                if (!z5) {
                    r0.ExS(1059484811);
                }
                r0.ExS(1059315675);
                C56532I0d i0d2 = gnU.A05;
                boolean A1Z82 = C51967G9n.A1Z(r0, profileCardViewModel, 1835288571);
                ECw = r0.ECw();
                ECw = new G4S(profileCardViewModel, 35);
                r0.FLL(ECw);
                I7V.A0B(r0, i0d2, C51965G9l.A0z(r1, ECw), 0);
            }
            C51970G9q.A13(r0, r1);
            if (C51971G9r.A1R(r0)) {
                0fL.A00(-505958874);
            }
        } else {
            r0.Evl();
        }
        return C60340gF.A00;
    }
}
