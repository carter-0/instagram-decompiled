package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.Iterator;

/* renamed from: X.HuQ  reason: case insensitive filesystem */
public abstract class C56197HuQ {
    public static final void A01(C286575Wy r8, 0sL r9, AnonymousClass62P r10, int i) {
        int i2;
        AnonymousClass7TF.A1H(r10, r9);
        r8.ExV(705353642);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r8, r10) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r8, r9);
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1026444266, "com.instagram.aistudio.editor.AiCrossAppDiscoverabilityScreen (AiCrossAppDiscoverabilityScreen.kt:24)");
            }
            C285245Qk r4 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r8, 0);
            int A00 = C287425a7.A00(r8);
            C286565Wx r3 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r8, r4);
            C51973G9u.A0y(r8, r3);
            C51971G9r.A12(r8, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r1, A00);
            }
            C51965G9l.A18(r8, A01);
            C52636GaA.A0M(r8, C287975bA.A00(r8, R.drawable.instagram_app_instagram_pano_outline_24, 0), new C52748Gc0(C288035bG.A00(r8, 2131952742), false), C288035bG.A00(r8, 2131952743));
            A00(r8, r9, r10, C51965G9l.A01(i2));
            C51975G9x.A13(r8, C287195Zj.A01(r4), C288035bG.A00(r8, 2131952744));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(1483043320);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r9, r10, i, 10);
        }
    }

    public static final void A00(C286575Wy r11, 0sL r12, AnonymousClass62P r13, int i) {
        int i2;
        int i3;
        r11.ExV(-1981665885);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, r13) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r12);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-650532145, "com.instagram.aistudio.editor.AddCrossAppsList (AiCrossAppDiscoverabilityScreen.kt:47)");
            }
            Iterator it = r13.iterator();
            while (it.hasNext()) {
                C61055Jvt jvt = (C61055Jvt) it.next();
                int ordinal = ((C62608Kif) jvt.A00).ordinal();
                if (ordinal != 2) {
                    i3 = R.drawable.instagram_app_whatsapp_pano_outline_24;
                    if (ordinal != 3) {
                        i3 = R.drawable.instagram_app_instagram_pano_outline_24;
                    }
                } else {
                    i3 = R.drawable.instagram_app_messenger_pano_outline_24;
                }
                AnonymousClass2DO A00 = C287975bA.A00(r11, i3, 0);
                String str = jvt.A01;
                String str2 = jvt.A02;
                boolean z = jvt.A03;
                boolean AGw = r11.AGw(jvt) | C51975G9x.A1S(r11, 779365025, i2);
                Object ECw = r11.ECw();
                if (AGw || ECw == AnonymousClass5XT.A00) {
                    ECw = C59103J6l.A00(r11, jvt, r12, 15);
                }
                C51965G9l.A1X(r11, false);
                C52636GaA.A0O(r11, A00, new C57125IPo((0sP) ECw, z, false), str, str2);
            }
            if (0fL.A02()) {
                0fL.A00(828819893);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r12, r13, i, 9);
        }
    }
}
