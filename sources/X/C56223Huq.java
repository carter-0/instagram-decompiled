package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Huq  reason: case insensitive filesystem */
public abstract class C56223Huq {
    public static final void A00(C286575Wy r35, Modifier modifier, C62320sa r37, AnonymousClass62P r38, int i, boolean z) {
        int i2;
        long A0L;
        long j;
        long j2;
        C62320sa r33 = r37;
        0qQ.A0B(r33, 0);
        Modifier modifier2 = modifier;
        AnonymousClass62P r32 = r38;
        AnonymousClass7TF.A1C(r32, 2, modifier2);
        C286575Wy r0 = r35;
        r0.ExV(441525349);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r0, r33) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r0, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r0, r32);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r0, modifier2);
        }
        if ((i2 & 1171) != 1170 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-679268644, "com.instagram.barcelona.common.ui.button.NewContentButton (NewContentAboveButton.kt:51)");
            }
            0lg A0j = C51969G9p.A0j(r0);
            Object A0m = C51967G9n.A0m(r0, 197009126);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r2 = (C284945Oz) C51974G9v.A0Z(r0, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C56606I4f A03 = I67.A03(r0, r2.getValue(), "expanded state", 48);
            JI6 ji6 = JI6.A00;
            C287805an r14 = C287765aj.A01;
            boolean A1a = AnonymousClass7TE.A1a(A03.A04());
            if (C51967G9n.A1U(r0, -1076856817)) {
                0fL.A01(-1237650629, "com.instagram.barcelona.common.ui.button.NewContentButton.<anonymous> (NewContentAboveButton.kt:57)");
            }
            float f = -40.0f;
            if (A1a) {
                f = -20.0f;
            }
            if (0fL.A02()) {
                0fL.A00(2026692123);
            }
            C286565Wx.A0L(A0H, false);
            C289095d0 A0T = C51965G9l.A0T(f);
            boolean A1Y = C51972G9s.A1Y(A03.A07);
            if (C51967G9n.A1U(r0, -1076856817)) {
                0fL.A01(-506003782, "com.instagram.barcelona.common.ui.button.NewContentButton.<anonymous> (NewContentAboveButton.kt:57)");
            }
            int i4 = -40;
            if (A1Y) {
                i4 = -20;
            }
            float f2 = (float) i4;
            if (0fL.A02()) {
                0fL.A00(1273169310);
            }
            C286565Wx.A0L(A0H, false);
            C56868IFp A01 = I67.A01((AnonymousClass5b8) ji6.invoke(A03.A03(), r0, 0), A03, r14, r0, A0T, C51965G9l.A0T(f2), 196608);
            String A00 = C288035bG.A00(r0, 2131953663);
            C60340gF r7 = C60340gF.A00;
            Object A0m2 = C51967G9n.A0m(r0, 197021516);
            if (A0m2 == obj) {
                A0m2 = new MFS(r2, (AnonymousClass4D7) null, 34);
                r0.FLL(A0m2);
            }
            C51968G9o.A1E(r0, A0H, A0m2, r7);
            0Tu r8 = 0Tu.A05;
            if (182.A06(r8, A0j, 36319523355565521L)) {
                A0L = C51967G9n.A0a(r0, 197027605).A0k;
            } else {
                A0L = C51970G9q.A0L(r0, 197029007);
            }
            C286565Wx.A0L(A0H, false);
            if (182.A06(r8, A0j, 36319523355565521L)) {
                j = C51970G9q.A0L(r0, 197033391);
            } else {
                j = C51967G9n.A0a(r0, 197034613).A0k;
            }
            C286565Wx.A0L(A0H, false);
            Modifier A012 = C52638GaC.A01(r0, modifier2, r33);
            AnonymousClass5aQ.A02(r0);
            AnonymousClass5ZQ r13 = AnonymousClass5ZM.A02;
            Modifier A013 = C56169Hty.A01(A012, r13, 6.0f, AnonymousClass5RV.A00, C289505di.A00(r0, R.color.igds_bottom_button_shadow), true);
            if (182.A06(r8, A0j, 36319523355565521L)) {
                j2 = C51970G9q.A0L(r0, 197053231);
            } else {
                j2 = C51967G9n.A0a(r0, 197054966).A0B;
            }
            C286565Wx.A0L(A0H, false);
            AnonymousClass5aQ.A02(r0);
            Modifier A014 = C304766Fd.A01(A013, r13, j2);
            boolean A1Y2 = C51967G9n.A1Y(r0, A00, 197059363);
            Object ECw = r0.ECw();
            if (A1Y2 || ECw == obj) {
                ECw = C51970G9q.A0x(r0, A00, 17);
            }
            Modifier A0G = C51975G9x.A0G(A0H, A014, ECw);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01(((C289095d0) A01.A09.getValue()).A00), r0, C287215Zl.A05, 0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A015 = C287435a8.A01(r0, A0G);
            C62320sa r132 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r132);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A02, A04, r12);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r10, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A015);
            r0.ExS(-71256060);
            if (AnonymousClass7TE.A1b(r32)) {
                A01(r0, (ImageUrl) r32.get(0), 0, j);
            }
            C286565Wx.A0L(A0H, false);
            r0.ExS(-71252800);
            if (r32.size() > 1) {
                A01(r0, (ImageUrl) r32.get(1), 0, j);
            }
            C286565Wx.A0L(A0H, false);
            r0.ExS(-71249664);
            if (r32.size() > 2) {
                A01(r0, (ImageUrl) r32.get(2), 0, j);
            }
            C286565Wx.A0L(A0H, false);
            C285245Qk r17 = Modifier.A00;
            Modifier A0C = C287205Zk.A0C(C287195Zj.A09(r17, 6.0f, 4.0f), 28.0f);
            AnonymousClass5ZQ r82 = AnonymousClass5ZN.A00;
            Modifier A016 = C304766Fd.A01(A0C, r82, j);
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A017 = C287435a8.A01(r0, A016);
            C51973G9u.A0z(r0, A0H, r132);
            C287595aO.A00(r0, A003, r12);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r10, A004);
            }
            C287595aO.A00(r0, A017, A1K);
            C289515dj r72 = C289515dj.A00;
            Modifier A018 = C304766Fd.A01(C287195Zj.A07(r72.CmS(r17), 2.0f), r82, A0L);
            AnonymousClass5RD A005 = C287675aa.A00(alignment, false);
            int A006 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A019 = C287435a8.A01(r0, A018);
            C51973G9u.A0z(r0, A0H, r132);
            C287595aO.A00(r0, A005, r12);
            if (C51965G9l.A1Y(r0, A0H, A043, A0w) || !C51972G9s.A1Q(r0, A006)) {
                C51971G9r.A13(r0, r10, A006);
            }
            C287595aO.A00(r0, A019, A1K);
            AnonymousClass2DO A007 = C287975bA.A00(r0, R.drawable.barcelona_outline_arrow_back_24, 0);
            String A008 = C288035bG.A00(r0, 2131953663);
            Modifier A044 = C287205Zk.A04(r17);
            float f3 = 270.0f;
            if (z) {
                f3 = 90.0f;
            }
            C288165bT.A08(r0, C304766Fd.A01(C51965G9l.A0L(r72, C287195Zj.A07(HRH.A00(A044, f3), 4.0f)), r82, A0L), A007, A008, j);
            r0.ASN();
            if (C51971G9r.A1R(r0)) {
                0fL.A00(-201281265);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8U(modifier2, r33, r32, i3, 2, z2);
        }
    }

    public static final void A01(C286575Wy r12, ImageUrl imageUrl, int i, long j) {
        int i2;
        r12.ExV(1843478542);
        int i3 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, imageUrl) | i;
        } else {
            i2 = i;
        }
        long j2 = j;
        if ((i & 48) == 0) {
            i2 |= G9t.A0C(r12, j2);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(39940075, "com.instagram.barcelona.common.ui.button.ProfileImage (NewContentAboveButton.kt:135)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A0C = C287205Zk.A0C(C287195Zj.A09(r6, 6.0f, 4.0f), 28.0f);
            AnonymousClass5ZQ r5 = AnonymousClass5ZN.A00;
            Modifier A01 = C304766Fd.A01(A0C, r5, j2);
            AnonymousClass5RD A0Y = C51970G9q.A0Y();
            int A00 = C287425a7.A00(r12);
            C286565Wx r3 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A012 = C287435a8.A01(r12, A01);
            C51973G9u.A0y(r12, r3);
            C51971G9r.A12(r12, A0Y, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r1, A00);
            }
            C51965G9l.A18(r12, A012);
            C304096Cd.A03(r12, C51965G9l.A0L(C289515dj.A00, AnonymousClass6FZ.A01(C287205Zk.A04(r6), r5)), imageUrl, (i2 & 14) | 48);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-1912234728);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7K(j2, imageUrl2, i3, 0);
        }
    }
}
