package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Hvp  reason: case insensitive filesystem */
public abstract class C56281Hvp {
    public static final void A01(C286575Wy r15, Modifier modifier, String str, C62320sa r18, int i) {
        int i2;
        Modifier modifier2 = modifier;
        String str2 = str;
        C62320sa r12 = r18;
        C51973G9u.A1E(modifier2, str2, r12);
        C286575Wy r6 = r15;
        r15.ExV(84737011);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r6, modifier2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r6, str2);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r6, r12);
        }
        if ((i2 & 731) != 146 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(213420506, "com.instagram.creation.genai.themes.ui.ThemePreviewThumbnailImage (AiThemesImagePickerHScrollSelector.kt:87)");
            }
            C285245Qk r4 = Modifier.A00;
            String A00 = C288035bG.A00(r6, 2131975249);
            boolean A1P = C51973G9u.A1P(r6, 498352147, i2);
            Object ECw = r6.ECw();
            if (A1P || ECw == AnonymousClass5XT.A00) {
                ECw = C58672Ivh.A00(r6, r12, 46);
            }
            C51965G9l.A1X(r6, false);
            AnonymousClass6G3.A0A(r6, C54739HQw.A00(C287205Zk.A08(C51968G9o.A0P(C51967G9n.A0G(C288235ba.A03(r6, r4, A00, (C62320sa) ECw), 4.0f).Ezh(modifier2), 4.0f), 60.0f), 0.5625f, false), C51975G9x.A0W(r6, str2), C288075bK.A00, C288035bG.A00(r6, 2131975248), 24584);
            if (0fL.A02()) {
                0fL.A00(-364544436);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(r12, modifier2, str2, i3, 9);
        }
    }

    public static final void A00(C286575Wy r16, Modifier modifier, ImmutableList immutableList, 0sP r19, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        Modifier modifier2 = modifier;
        ImmutableList immutableList2 = immutableList;
        0sP r2 = r19;
        int A03 = DbW.A03(2, immutableList2, r2);
        C286575Wy r14 = r16;
        r14.ExV(141043265);
        int i6 = i3;
        int i7 = i3 & 1;
        int i8 = i2;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = G9t.A0O(r14, modifier2) | i2;
        } else {
            i4 = i8;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= G9t.A06(r14, i5);
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i8 & 896) == 0) {
            i4 |= G9t.A0Q(r14, immutableList2);
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i4 |= G9t.A0H(r14, r2);
        }
        if ((i4 & 5851) != 1170 || !r14.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i9 != 0) {
                i5 = 0;
            }
            if (0fL.A02()) {
                0fL.A01(-1268403392, "com.instagram.creation.genai.themes.ui.AiThemesImagePickerHScrollSelector (AiThemesImagePickerHScrollSelector.kt:42)");
            }
            LazyListState A00 = C305066Gi.A00(r14, 0, 0, 0, A03);
            r14.ExS(1393397321);
            if (immutableList2.size() > 0) {
                Integer valueOf = Integer.valueOf(i5);
                boolean A1L = C51972G9s.A1L(i4) | C51967G9n.A1Y(r14, A00, 1393399456);
                Object ECw = r14.ECw();
                if (A1L || ECw == AnonymousClass5XT.A00) {
                    ECw = new C66164MGb(A00, (AnonymousClass4D7) null, i5, 14);
                    r14.FLL(ECw);
                }
                C51972G9s.A0z(r14, ECw, valueOf);
            }
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            AnonymousClass5RD A002 = C287675aa.A00(C287215Zl.A06, false);
            int A003 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r14, modifier2);
            C51973G9u.A0y(r14, A0H);
            C51971G9r.A12(r14, A002, A04);
            0sL r6 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r14, A003)) {
                C51971G9r.A13(r14, r6, A003);
            }
            C51965G9l.A18(r14, A01);
            C287355a0 r11 = C287275Zs.A02;
            C287245Zp r15 = C287215Zl.A04;
            C304826Fj r12 = new C304826Fj(12.0f, 0.0f, 12.0f, 0.0f);
            Modifier A09 = C287195Zj.A09(C287195Zj.A0B(C51969G9p.A0U(), 0.0f, 10.0f, 0.0f, 16.0f), 8.0f, 0.0f);
            boolean A1Z = C51974G9v.A1Z(r14, 404949427, i4) | C51973G9u.A1H(i4) | C51973G9u.A1J(i4);
            Object ECw2 = r14.ECw();
            if (A1Z || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new J6V(i5, 4, (Object) immutableList2, (Object) r2);
                r14.FLL(ECw2);
            }
            AnonymousClass6HY.A02(r11, r12, A00, r14, r15, A09, C51965G9l.A0z(A0H, ECw2), 12804480, 72);
            if (C51967G9n.A1R(r14)) {
                0fL.A00(49854278);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9D(modifier2, immutableList2, r2, i5, i8, i6, 0);
        }
    }
}
