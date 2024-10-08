package X;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.I2o  reason: case insensitive filesystem */
public abstract class C56584I2o {
    public static final void A02(C286575Wy r4, C74483Pvd pvd, int i) {
        int i2;
        0qQ.A0B(pvd, 0);
        r4.ExV(2041385986);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, pvd) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1227084388, "com.instagram.direct.securityalert.keyalertdetail.ui.KeyAlertDetailScreen (KeyAlertDetailView.kt:44)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r4, pvd.CB9(), 0);
            if (G9w.A1b(((N4R) A02.getValue()).A00)) {
                A01(r4, (C53313Glz) 00k.A0I((List) ((N4R) A02.getValue()).A00), pvd, ((i2 << 3) & 112) | 8);
            }
            if (0fL.A02()) {
                0fL.A00(207578480);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, pvd, i, 16);
        }
    }

    public static final C286025Tq A00(C286575Wy r27, int i, int i2) {
        C286575Wy r3 = r27;
        if (C51967G9n.A1U(r3, 1675549925)) {
            0fL.A01(636468491, "com.instagram.direct.securityalert.keyalertdetail.ui.buildClickAbleText (KeyAlertDetailView.kt:134)");
        }
        C303876Bd A0b = C51969G9p.A0b();
        String A00 = C304346Dc.A00(r3, i2);
        String A002 = C304346Dc.A00(r3, i);
        A0b.A09(A002);
        A0b.A09(" ");
        A0b.A09(A00);
        int A05 = DbX.A05(A002) + 1;
        int A052 = DbX.A05(A00) + A05;
        A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0M(r3), 0, 0), 0, A05);
        A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A03, (C291795ht) null, 65530, C51966G9m.A0D(r3), 0, 0), A05, A052);
        C286025Tq A0K = C51967G9n.A0K(A0b, "learn_more", "Clickable learn more link", A05, A052);
        if (0fL.A02()) {
            0fL.A00(-433797450);
        }
        C51965G9l.A1X(r3, false);
        return A0K;
    }

    public static final void A01(C286575Wy r22, C53313Glz glz, C74483Pvd pvd, int i) {
        int i2;
        boolean z;
        C286575Wy r15 = r22;
        r15.ExV(1302068217);
        int i3 = i;
        C53313Glz glz2 = glz;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r15, glz2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        C74483Pvd pvd2 = pvd;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, pvd2);
        }
        if ((i2 & 19) != 18 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1158651272, "com.instagram.direct.securityalert.keyalertdetail.ui.Success (KeyAlertDetailView.kt:53)");
            }
            Context A0I = C51968G9o.A0I(r15);
            C285245Qk r3 = Modifier.A00;
            Modifier A01 = I28.A01(I28.A00(r15), r3);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r15, 0);
            int A00 = C287425a7.A00(r15);
            C286565Wx r6 = (C286565Wx) r15;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A012 = C287435a8.A01(r15, A01);
            C51973G9u.A0y(r15, r6);
            C51971G9r.A12(r15, A0Z, A04);
            0sL r2 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r2, A00);
            }
            C51965G9l.A18(r15, A012);
            AnonymousClass5ZZ.A06(r15, C287195Zj.A0B(r3, C287645aX.A00(r15), 14.0f, C287645aX.A00(r15), 0.0f), AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51965G9l.A0S(r15), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 6291454, C51966G9m.A0H(r15), 0, 0, 0), C304346Dc.A00(r15, glz2.A04));
            Integer num = glz2.A09;
            if (num != null) {
                r15.ExS(1191002409);
                C286025Tq A002 = A00(r15, glz2.A05, num.intValue());
                Modifier A0q = G9t.A0q(r15, r3, 0.0f, 14.0f);
                boolean A1Z = C51967G9n.A1Z(r15, pvd2, 592624472);
                Object ECw = r15.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = new C73913Plo(pvd2, 26);
                    r15.FLL(ECw);
                }
                AnonymousClass5ZZ.A01(r15, C51969G9p.A0V(r6, A0q, ECw), A002, C51966G9m.A0c(r15), 24568, C51966G9m.A0M(r15));
            } else {
                r15.ExS(1191636824);
                C286575Wy r17 = r15;
                AnonymousClass5ZZ.A0Q(r17, G9t.A0q(r15, r3, 0.0f, 14.0f), C51966G9m.A0c(r15), C304346Dc.A00(r15, glz2.A05), C51966G9m.A0M(r15));
            }
            C286565Wx.A0L(r6, false);
            Modifier A08 = C287205Zk.A08(r3, 6.0f);
            FillElement fillElement = C287205Zk.A02;
            Modifier Ezh = A08.Ezh(fillElement);
            long A0A = C51965G9l.A0A(r15);
            AnonymousClass5S2 r13 = AnonymousClass5S0.A00;
            C289585dr.A00(r15, C304766Fd.A01(Ezh, r13, A0A));
            C52747Gbz.A04(r15, C304346Dc.A00(r15, 2131966731));
            C52636GaA.A07(r15, (Modifier) null, C287975bA.A00(r15, R.drawable.instagram_device_phone_pano_outline_24, 0), (C59489JLn) null, C304346Dc.A00(r15, 2131958439), C52409GRk.A01(r15, glz2.A08), 131022);
            C52636GaA.A07(r15, (Modifier) null, C287975bA.A00(r15, R.drawable.instagram_clock_pano_outline_24, 0), (C59489JLn) null, C304346Dc.A00(r15, 2131972952), C14240TsN.A00(A0I, glz2.A06), 131022);
            String A003 = C304346Dc.A00(r15, glz2.A01);
            String A013 = C52409GRk.A01(r15, glz2.A07);
            AnonymousClass2DO A004 = C287975bA.A00(r15, glz2.A00, 0);
            boolean A1S = C51973G9u.A1S(r15, pvd2, A0I, 592675105);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && r15.AGw(glz2))) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = A1S | z;
            Object ECw2 = r15.ECw();
            if (z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C58195Inz(18, glz2, pvd2, A0I);
                r15.FLL(ECw2);
            }
            C52636GaA.A07(r15, C51969G9p.A0V(r6, r3, ECw2), A004, (C59489JLn) null, A003, A013, 131020);
            C289585dr.A00(r15, C304766Fd.A01(C287205Zk.A08(r3, 6.0f).Ezh(fillElement), r13, C51965G9l.A0A(r15)));
            C52747Gbz.A04(r15, C304346Dc.A00(r15, 2131976851));
            C286025Tq A005 = A00(r15, glz2.A03, glz2.A02);
            Modifier A0B = C287195Zj.A0B(r3, C287645aX.A00(r15), 0.0f, C287645aX.A00(r15), 0.0f);
            boolean A1Z2 = C51967G9n.A1Z(r15, pvd2, 592697561);
            Object ECw3 = r15.ECw();
            if (A1Z2 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C73913Plo(pvd2, 27);
                r15.FLL(ECw3);
            }
            AnonymousClass5ZZ.A01(r15, C51969G9p.A0V(r6, A0B, ECw3), A005, (AnonymousClass5Z4) null, 32764, 0);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(1083757331);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, glz2, pvd2, i3, 17);
        }
    }
}
