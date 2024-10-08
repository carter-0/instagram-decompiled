package X;

import android.graphics.Bitmap;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.common.ui.MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1;
import java.util.List;

/* renamed from: X.I2d  reason: case insensitive filesystem */
public abstract class C56573I2d {
    public static final void A00(C286575Wy r19, I12 i12, 0sP r21, int i, boolean z) {
        float f;
        float f2;
        float f3;
        I12 i122 = i12;
        0sP r10 = r21;
        AnonymousClass7TF.A1B(i122, 0, r10);
        C286575Wy r11 = r19;
        if (C51967G9n.A1T(r11, -1628043439)) {
            0fL.A01(-2069535389, "com.instagram.creation.genai.magicmod.common.ui.ImageOptionThumbnail (MagicModGenAIImageSelector.kt:110)");
        }
        Bitmap bitmap = i122.A00;
        boolean z2 = z;
        if (bitmap != null) {
            C3018360g r2 = new C3018360g(bitmap);
            C267314bM r7 = C286955Yl.A00;
            0lg r4 = (0lg) r11.AJO(r7);
            0Tu A0J = DbS.A0J(r4, 0);
            boolean A06 = 182.A06(A0J, r4, 36319918496882445L);
            r11.ExS(-2145912430);
            if (A06) {
                0lg r42 = (0lg) r11.AJO(r7);
                0qQ.A0B(r42, 0);
                f = (float) DbS.A04(A0J, r42, 36601393474048162L);
            } else {
                f = 44.0f;
            }
            C286565Wx A0H = C51965G9l.A0H(r11, false);
            r11.ExS(-2145906219);
            if (A06) {
                0lg r72 = (0lg) r11.AJO(r7);
                0qQ.A0B(r72, 0);
                f2 = (float) DbS.A04(A0J, r72, 36601393474113699L);
            } else {
                f2 = 4.0f;
            }
            C286565Wx.A0L(A0H, false);
            if (z) {
                f3 = 2.0f * 2.0f;
            } else {
                f3 = 0.0f;
            }
            float f4 = f + f3;
            AnonymousClass6GC r15 = new AnonymousClass6GC(r2);
            String A00 = C304346Dc.A00(r11, 2131969729);
            float A002 = C51970G9q.A00(z2 ? 1 : 0);
            C288095bM r16 = C288075bK.A00;
            Modifier modifier = Modifier.A00;
            Modifier A0G = C51967G9n.A0G(C288235ba.A03(r11, modifier, C304346Dc.A00(r11, 2131973036), new C58717IwQ(4, i122, r10)), 4.0f);
            r11.ExS(-2145878420);
            if (z) {
                modifier = C51968G9o.A0Q(modifier, f2, 2.0f, C51966G9m.A0E(r11));
            }
            AnonymousClass6G3.A00(r11, (Alignment) null, C51968G9o.A0P(C54739HQw.A00(C287205Zk.A08(C51967G9n.A0B(A0H, A0G, modifier), f4), 0.5625f, false), f2), (C288195bW) null, r15, r16, A00, A002, 24584, 72);
        }
        if (0fL.A02()) {
            0fL.A00(909310997);
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i, 7, r10, i122, z2);
        }
    }

    public static final void A01(C286575Wy r16, String str, List list, 0sP r19, int i) {
        C286625Xd ASQ;
        int i2;
        List list2 = list;
        0sP r1 = r19;
        AnonymousClass7TG.A1O(list2, r1);
        C286575Wy r11 = r16;
        if (C51967G9n.A1T(r11, 1494702248)) {
            0fL.A01(1540734307, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageOptionSelector (MagicModGenAIImageSelector.kt:53)");
        }
        if (list2.isEmpty()) {
            if (0fL.A02()) {
                0fL.A00(426237561);
            }
            ASQ = r11.ASQ();
            if (ASQ != null) {
                i2 = 5;
            } else {
                return;
            }
        } else {
            LazyListState A00 = C305066Gi.A00(r11, 0, 0, 0, 3);
            boolean A1Y = C51967G9n.A1Y(r11, list2, -18671417);
            Object ECw = r11.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = C51968G9o.A0t(list2);
                r11.FLL(ECw);
            }
            int A0M = AnonymousClass7TE.A0M(ECw);
            C286565Wx A0H = C51965G9l.A0H(r11, false);
            boolean A1Y2 = C51967G9n.A1Y(r11, list2, -18668589);
            Object ECw2 = r11.ECw();
            if (A1Y2 || ECw2 == AnonymousClass5XT.A00) {
                I12 i12 = (I12) 00k.A0L(list2);
                if (i12 != null) {
                    ECw2 = i12.A04;
                } else {
                    ECw2 = null;
                }
                r11.FLL(ECw2);
            }
            String str2 = (String) ECw2;
            C286565Wx.A0L(A0H, false);
            if (str2 == null) {
                if (0fL.A02()) {
                    0fL.A00(-480847508);
                }
                ASQ = r11.ASQ();
                if (ASQ != null) {
                    i2 = 7;
                } else {
                    return;
                }
            } else {
                Integer valueOf = Integer.valueOf(A0M);
                boolean A1Y3 = C51967G9n.A1Y(r11, A00, -18664963) | r11.AGs(A0M);
                Object ECw3 = r11.ECw();
                if (A1Y3 || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new C66164MGb(A00, (AnonymousClass4D7) null, A0M, 13);
                    r11.FLL(ECw3);
                }
                C51968G9o.A1E(r11, A0H, ECw3, valueOf);
                Alignment alignment = C287215Zl.A06;
                C285245Qk r7 = Modifier.A00;
                Modifier A09 = C287195Zj.A09(r7, 0.0f, 10.0f);
                AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
                int A003 = C287425a7.A00(r11);
                AnonymousClass5RM A04 = C286565Wx.A04(A0H);
                Modifier A01 = C287435a8.A01(r11, A09);
                C51973G9u.A0y(r11, A0H);
                C51971G9r.A12(r11, A002, A04);
                0sL r3 = C287485aD.A02;
                if (A0H.A0K || !C51972G9s.A1Q(r11, A003)) {
                    C51971G9r.A13(r11, r3, A003);
                }
                C51965G9l.A18(r11, A01);
                AnonymousClass6HY.A02(C287275Zs.A02, new C304826Fj(12.0f, 0.0f, 12.0f, 0.0f), A00, r11, C287215Zl.A04, C287195Zj.A0B(C51966G9m.A0T(r7), 0.0f, 0.0f, 0.0f, 12.0f), new C74192PqY((Object) r1, (Object) list2, str2, str, 22), 12804486, 72);
                if (C51967G9n.A1R(r11)) {
                    0fL.A00(2064297046);
                }
                ASQ = r11.ASQ();
                if (ASQ != null) {
                    i2 = 6;
                } else {
                    return;
                }
            }
        }
        ASQ.A06 = new C59141J7x(r1, list2, str, i, i2);
    }

    public static final void A02(C286575Wy r14, 0sL r15, float f, int i, boolean z) {
        int i2;
        r14.ExV(-1819177158);
        int i3 = i;
        boolean z2 = z;
        if ((i & 14) == 0) {
            i2 = G9t.A0Y(r14, z2) | i;
        } else {
            i2 = i3;
        }
        float f2 = f;
        if ((i & 112) == 0) {
            i2 |= G9t.A00(r14, f2);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r14, r15);
        }
        if ((i2 & 731) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1562316294, "com.instagram.creation.genai.magicmod.common.ui.LastItemAnimatingBox (MagicModGenAIImageSelector.kt:90)");
            }
            Object A0m = C51967G9n.A0m(r14, -270038416);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                float f3 = 0.0f;
                if (z) {
                    f3 = f2;
                }
                A0m = G9t.A0o(r14, C51965G9l.A0T(f3));
            }
            C284945Oz r9 = (C284945Oz) A0m;
            C286565Wx r6 = (C286565Wx) r14;
            C286565Wx.A0L(r6, false);
            Object A0m2 = C51967G9n.A0m(r14, -270035679);
            if (A0m2 == obj) {
                A0m2 = G9t.A0o(r14, Float.valueOf(C51970G9q.A01(z2 ? 1 : 0)));
            }
            C284945Oz r10 = (C284945Oz) A0m2;
            Boolean A0f = C51967G9n.A0f(r6, z2);
            boolean A1L = C51972G9s.A1L(i2) | C51973G9u.A1N(r14, -270032761, i2);
            Object ECw = r14.ECw();
            if (A1L || ECw == obj) {
                ECw = new MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1(r9, r10, (AnonymousClass4D7) null, f2, z2);
                r14.FLL(ECw);
            }
            C51968G9o.A1E(r14, r6, ECw, A0f);
            Modifier A00 = HRF.A00(C56164Htt.A00(Modifier.A00, ((C289095d0) r9.getValue()).A00, 0.0f), C51971G9r.A02(r10));
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r14, A00);
            C51973G9u.A0y(r14, r6);
            C51971G9r.A12(r14, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r14, A002)) {
                C51971G9r.A13(r14, r1, A002);
            }
            C51965G9l.A18(r14, A01);
            C51972G9s.A11(r14, r15, i2 >> 6);
            if (0fL.A02()) {
                0fL.A00(1579596047);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7D(r15, f2, i3, z2);
        }
    }
}
