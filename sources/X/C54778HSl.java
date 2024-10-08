package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HSl  reason: case insensitive filesystem */
public abstract class C54778HSl {
    public static final void A00(C286575Wy r33, C61011JvB jvB, C62320sa r35, C62320sa r36, C62320sa r37, int i) {
        int i2;
        C61011JvB jvB2 = jvB;
        0qQ.A0B(jvB2, 0);
        C62320sa r24 = r35;
        C62320sa r352 = r37;
        DbZ.A0t(1, r24, r36, r352);
        C286575Wy r2 = r33;
        r2.ExV(-583254398);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r2, jvB2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r2, r24);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r2, r36);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r2, r352);
        }
        if ((i2 & 1171) != 1170 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1394417659, "com.instagram.aistudio.editor.AiCreationConfigurationScreen (AiCreationConfigurationScreen.kt:32)");
            }
            C285245Qk r10 = Modifier.A00;
            C287325Zx r8 = C287275Zs.A07;
            C287265Zr r9 = C287215Zl.A02;
            AnonymousClass5RD A02 = C291495hO.A02(r8, r2, r9, 0);
            int A00 = C287425a7.A00(r2);
            C286565Wx r0 = (C286565Wx) r2;
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A01 = C287435a8.A01(r2, r10);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r2, r0, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r2, A02, A04, r13);
            0sL r12 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r2, A00)) {
                C51971G9r.A13(r2, r12, A00);
            }
            0sL A1K = C51966G9m.A1K(r2, A01);
            Modifier A002 = C304676Et.A00.A00(I28.A01(I28.A00(r2), r10), true);
            AnonymousClass5RD A022 = C291495hO.A02(r8, r2, r9, 0);
            int A003 = C287425a7.A00(r2);
            AnonymousClass5RM A042 = C286565Wx.A04(r0);
            Modifier A012 = C287435a8.A01(r2, A002);
            C51973G9u.A0z(r2, r0, r14);
            C287595aO.A00(r2, A022, r13);
            if (C51965G9l.A1Y(r2, r0, A042, A0w) || !C51972G9s.A1Q(r2, A003)) {
                C51971G9r.A13(r2, r12, A003);
            }
            C287595aO.A00(r2, A012, A1K);
            Modifier A0T = C51966G9m.A0T(r10);
            Modifier A0B = C287195Zj.A0B(A0T, 46.0f, 44.0f, 46.0f, 24.0f);
            AnonymousClass5RD A004 = C291495hO.A00(r8, r2, C287215Zl.A00);
            int A005 = C287425a7.A00(r2);
            AnonymousClass5RM A043 = C286565Wx.A04(r0);
            Modifier A013 = C287435a8.A01(r2, A0B);
            C51973G9u.A0z(r2, r0, r14);
            C287595aO.A00(r2, A004, r13);
            if (C51965G9l.A1Y(r2, r0, A043, A0w) || !C51972G9s.A1Q(r2, A005)) {
                C51971G9r.A13(r2, r12, A005);
            }
            C287595aO.A00(r2, A013, A1K);
            ImageUrl imageUrl = jvB2.A01;
            String str = jvB2.A05;
            C286575Wy r18 = r2;
            C54792HSz.A00(r18, imageUrl, str, jvB2.A04, jvB2.A07, (String) null, r24, 0.4f, ((i2 << 12) & 458752) | 1597440, 384, true, false);
            r2.ASN();
            boolean A1a = C51974G9v.A1a(r2, 1340345465, i2);
            Object ECw = r2.ECw();
            if (A1a || ECw == AnonymousClass5XT.A00) {
                ECw = new C66301MMk(r352, 47);
                r2.FLL(ECw);
            }
            C52636GaA.A03(r2, C287635aW.A05(r10, (C287625aV) null, (String) null, C51965G9l.A0y(r0, ECw, false), true), C287975bA.A00(r2, R.drawable.instagram_eye_pano_outline_24, 0), new C52748Gc0(jvB2.A06, true), C304346Dc.A00(r2, 2131952693));
            r2.ExS(1340357341);
            String str2 = jvB2.A03;
            if (str2.length() > 0) {
                C286575Wy r28 = r2;
                C56618I4t.A02(r28, C287205Zk.A08(C287195Zj.A06(A0T), 1.0f), 0.0f, 6, 4, C51966G9m.A0C(r2));
                C286575Wy r7 = r2;
                AnonymousClass5ZZ.A0Q(r7, C287195Zj.A0B(A0T, 16.0f, 6.0f, 16.0f, 6.0f), C51966G9m.A0b(r2), str2, C51966G9m.A0M(r2));
            }
            C286565Wx.A0L(r0, false);
            r2.ASN();
            C62320sa r02 = r36;
            I7L.A0A(r02, C288035bG.A00(r2, 2131952697), r2, (i2 >> 3) & 112);
            if (C51967G9n.A1R(r2)) {
                0fL.A00(1320347662);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(jvB2, r36, r352, r24, i3, 0);
        }
    }
}
