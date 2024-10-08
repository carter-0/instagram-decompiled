package X;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalProfileData;

public final class JCE extends 0Yg implements 0sL {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ C270284gU A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ C62320sa A08;
    public final /* synthetic */ C62320sa A09;
    public final /* synthetic */ 0sP A0A;
    public final /* synthetic */ 0sP A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCE(Activity activity, C284945Oz r3, C270284gU r4, AnonymousClass0iw r5, UserSession userSession, C62320sa r7, C62320sa r8, C62320sa r9, C62320sa r10, C62320sa r11, 0sP r12, 0sP r13, boolean z) {
        super(2);
        this.A09 = r7;
        this.A04 = userSession;
        this.A03 = r5;
        this.A00 = activity;
        this.A06 = r8;
        this.A0B = r12;
        this.A0A = r13;
        this.A08 = r9;
        this.A05 = r10;
        this.A0C = z;
        this.A07 = r11;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r0 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(873379438, "com.instagram.opal.impl.ui.OpalEditContent.<anonymous> (OpalEditContent.kt:88)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A022 = I28.A02(r0, C51966G9m.A0U(r5));
            Activity activity = this.A00;
            C62320sa r41 = this.A06;
            UserSession userSession = this.A04;
            AnonymousClass0iw r11 = this.A03;
            0sP r40 = this.A0B;
            0sP r39 = this.A0A;
            C62320sa r38 = this.A08;
            C62320sa r37 = this.A05;
            boolean z = this.A0C;
            C62320sa r35 = this.A07;
            C270284gU r34 = this.A02;
            C284945Oz r36 = this.A01;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A002 = C287425a7.A00(r0);
            C286565Wx r1 = (C286565Wx) r0;
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r0, A022);
            C62320sa r21 = C287485aD.A00;
            C51973G9u.A0z(r0, r1, r21);
            0sL r20 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0Z, A042, r20);
            0sL r18 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r18, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A012);
            C304676Et r16 = C304676Et.A00;
            Modifier A0T = C51966G9m.A0T(r5);
            boolean A1Z = C51967G9n.A1Z(r0, activity, -1896016321);
            Object ECw = r0.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = G9w.A0s(r0, activity, 12);
            }
            Modifier A052 = C287635aW.A05(A0T, (C287625aV) null, (String) null, C51965G9l.A0y(r1, ECw, false), true);
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r1);
            Modifier A013 = C287435a8.A01(r0, A052);
            C51973G9u.A0z(r0, r1, r21);
            C287595aO.A00(r0, A003, r20);
            if (C51965G9l.A1Y(r0, r1, A043, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r18, A004);
            }
            C287595aO.A00(r0, A013, A1K);
            C289515dj r13 = C289515dj.A00;
            C286575Wy r24 = r0;
            GRY.A01(r24, C51965G9l.A0L(r13, C287195Zj.A0B(r5, 16.0f, 18.0f, 16.0f, 4.0f)), 1zC.A00(r0, ((OpalProfileData) ((C61084JwM) r34.getValue()).A01).A01()), (C288095bM) null, new GS6(96.0f, 96.0f, 2.0f, 1.0f), J4A.A00, 14155824, 6, 824, false);
            r0.ASN();
            String A005 = C304346Dc.A00(r0, 2131968844);
            AnonymousClass6CB A006 = AnonymousClass6CA.A00(r0);
            Modifier A0S = C51966G9m.A0S(r16, C287195Zj.A09(r5, 16.0f, 14.0f));
            AnonymousClass6CD r26 = AnonymousClass6CD.SMALL;
            boolean A1a = G9t.A1a(r0, userSession, r11, G9t.A1X(r0, activity, r41, -1895998222));
            Object ECw2 = r0.ECw();
            if (A1a || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C58699Iw8.A00(activity, r41, userSession, r11, 13);
                r0.FLL(ECw2);
            }
            AnonymousClass6CE.A01(r24, A0S, r26, A006, A005, C51965G9l.A0y(r1, ECw2, false), 1572864, 408, false);
            C56618I4t.A01(r0, A0T);
            boolean A1Y = C51967G9n.A1Y(r0, r40, -1895975406);
            Object ECw3 = r0.ECw();
            if (A1Y || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = C51970G9q.A0t(r0, r40, 36);
            }
            Modifier modifier = A0T;
            AnonymousClass0iw r262 = r11;
            C56640I5v.A01(r24, modifier, r262, HLJ.Name, ((OpalProfileData) ((C61084JwM) C51967G9n.A0o(r1, r34, false)).A01).A04, (0sP) ECw3, 24960, 32, false);
            boolean A1Y2 = C51967G9n.A1Y(r0, r39, -1895966223);
            Object ECw4 = r0.ECw();
            if (A1Y2 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = C51970G9q.A0t(r0, r39, 37);
            }
            C56640I5v.A01(r24, modifier, r262, HLJ.Bio, ((OpalProfileData) ((C61084JwM) C51967G9n.A0o(r1, r34, false)).A01).A02, (0sP) ECw4, 221568, 0, false);
            C56618I4t.A01(r0, A0T);
            C287625aV A0R = C51965G9l.A0R(0);
            boolean A1a2 = G9t.A1a(r0, userSession, r11, G9t.A1X(r0, activity, r38, -1895952052));
            Object ECw5 = r0.ECw();
            if (A1a2 || ECw5 == AnonymousClass5XT.A00) {
                ECw5 = C58699Iw8.A00(activity, r38, userSession, r11, 14);
                r0.FLL(ECw5);
            }
            Modifier A072 = C287195Zj.A07(C287635aW.A05(A0T, A0R, (String) null, C51965G9l.A0y(r1, ECw5, false), true), 16.0f);
            AnonymousClass5RD A007 = C287675aa.A00(alignment, false);
            int A008 = C287425a7.A00(r0);
            AnonymousClass5RM A044 = C286565Wx.A04(r1);
            Modifier A014 = C287435a8.A01(r0, A072);
            C51973G9u.A0z(r0, r1, r21);
            C287595aO.A00(r0, A007, r20);
            if (C51965G9l.A1Y(r0, r1, A044, A0w) || !C51972G9s.A1Q(r0, A008)) {
                C51971G9r.A13(r0, r18, A008);
            }
            C287595aO.A00(r0, A014, A1K);
            AnonymousClass5ZZ.A0r(r0, C51966G9m.A0g(r0), C304346Dc.A00(r0, 2131968867), C51966G9m.A0N(r0));
            r0.ASN();
            String A009 = C304346Dc.A00(r0, 2131968884);
            AnonymousClass5ZZ.A0W(r24, C287195Zj.A09(A0T, 16.0f, 12.0f), C51966G9m.A0g(r0), A009, C51966G9m.A0M(r0));
            int i = ((OpalProfileData) ((C61084JwM) r34.getValue()).A01).A00;
            boolean A1U = C51966G9m.A1U(r0, r11, G9t.A1Y(r0, r37, userSession, -1895917585));
            Object ECw6 = r0.ECw();
            if (A1U || ECw6 == AnonymousClass5XT.A00) {
                ECw6 = new C58695Iw4(40, (Object) r11, (Object) userSession, (Object) r37);
                r0.FLL(ECw6);
            }
            C56640I5v.A03(C287195Zj.A09(C287635aW.A05(A0T, (C287625aV) null, (String) null, C51965G9l.A0y(r1, ECw6, false), true), 16.0f, 12.0f), r0, i, 0);
            C287625aV A0R2 = C51965G9l.A0R(0);
            Object A0m = C51967G9n.A0m(r0, -1895901828);
            Object obj3 = AnonymousClass5XT.A00;
            if (A0m == obj3) {
                A0m = new C51794G2d(r36, 14);
                r0.FLL(A0m);
            }
            Modifier A092 = C287195Zj.A09(C287635aW.A05(A0T, A0R2, (String) null, C51965G9l.A0y(r1, A0m, false), true), 16.0f, 12.0f);
            AnonymousClass5RD A0010 = C287675aa.A00(alignment, false);
            int A0011 = C287425a7.A00(r0);
            AnonymousClass5RM A045 = C286565Wx.A04(r1);
            Modifier A015 = C287435a8.A01(r0, A092);
            C51973G9u.A0z(r0, r1, r21);
            C287595aO.A00(r0, A0010, r20);
            if (C51965G9l.A1Y(r0, r1, A045, A0w) || !C51972G9s.A1Q(r0, A0011)) {
                C51971G9r.A13(r0, r18, A0011);
            }
            C287595aO.A00(r0, A015, A1K);
            AnonymousClass5ZZ.A0r(r0, C51966G9m.A0g(r0), C304346Dc.A00(r0, 2131968889), C51966G9m.A09(r0));
            r0.ASN();
            String A0012 = C304346Dc.A00(r0, 2131968890);
            AnonymousClass5ZZ.A0Q(r24, C287195Zj.A0B(A0T, 16.0f, 12.0f, 16.0f, 16.0f), C51966G9m.A0b(r0), A0012, C51966G9m.A0M(r0));
            C56618I4t.A01(r0, A0T);
            r0.ExS(-1895879082);
            if (z) {
                boolean A1Y3 = C51967G9n.A1Y(r0, r35, -1895873101);
                Object ECw7 = r0.ECw();
                if (A1Y3 || ECw7 == obj3) {
                    ECw7 = G9w.A0s(r0, r35, 13);
                }
                C52636GaA.A02(r24, C287195Zj.A09(C287635aW.A05(A0T, (C287625aV) null, (String) null, C51965G9l.A0y(r1, ECw7, false), true), 0.0f, 14.0f), (AnonymousClass5RW) null, (AnonymousClass2DO) null, (C59489JLn) null, "Delete Flipside", "(Internal only)", 24582, 130028, C51966G9m.A09(r0), false);
                C56618I4t.A01(r0, A0T);
            }
            C286565Wx.A0L(r1, false);
            r0.ASN();
            if (C51971G9r.A1W(r36)) {
                Object A0m2 = C51967G9n.A0m(r0, -1694693218);
                if (A0m2 == obj3) {
                    A0m2 = new C51794G2d(r36, 15);
                    r0.FLL(A0m2);
                }
                C62320sa A0y = C51965G9l.A0y(r1, A0m2, false);
                String A0013 = C304346Dc.A00(r0, 2131968891);
                String A0014 = C304346Dc.A00(r0, 2131968890);
                Integer num = AnonymousClass05K.A0N;
                r0.ExS(-1694681117);
                C62320sa r6 = this.A09;
                boolean A1a3 = G9t.A1a(r0, userSession, r11, r0.AGu(r6));
                Object ECw8 = r0.ECw();
                if (A1a3 || ECw8 == obj3) {
                    ECw8 = new C58695Iw4(41, (Object) r11, (Object) userSession, (Object) r6);
                    r0.FLL(ECw8);
                }
                C56632I5m.A01((View) null, r0, HXM.A00(r0, num, C51965G9l.A0y(r1, ECw8, false), 2131971974, 12), HXM.A00(r0, (Integer) null, (C62320sa) null, 2131954722, 30), (C53398GnV) null, A0013, A0014, A0y, 100663302, 3808, true);
            }
            if (0fL.A02()) {
                0fL.A00(-2121298291);
            }
        } else {
            r0.Evl();
        }
        return C60340gF.A00;
    }
}
