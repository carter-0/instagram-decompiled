package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.Iterator;

/* renamed from: X.HSv  reason: case insensitive filesystem */
public abstract class C54788HSv {
    public static final void A00(C62320sa r26, C286575Wy r27, int i) {
        int i2;
        C62320sa r15 = r26;
        0qQ.A0B(r15, 0);
        C286575Wy r4 = r27;
        r4.ExV(527062864);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1678040200, "com.instagram.aistudio.editor.UpdatePublicAiConfirmationScreen (AiUpdatePublicStatusConfirmationScreen.kt:26)");
            }
            C285245Qk r7 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r7);
            Modifier A02 = I28.A02(r4, A0T);
            C287265Zr r1 = C287215Zl.A02;
            C287325Zx r9 = C287275Zs.A07;
            AnonymousClass5RD A022 = C291495hO.A02(r9, r4, r1, 48);
            int A00 = C287425a7.A00(r4);
            C286565Wx r2 = (C286565Wx) r4;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r4, A02);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r4, r2, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A022, A04, r13);
            0sL r11 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r11, A00);
            }
            0sL A1K = C51966G9m.A1K(r4, A01);
            C304676Et r16 = C304676Et.A00;
            C287265Zr r6 = C287215Zl.A00;
            AnonymousClass5RD A023 = C291495hO.A02(r9, r4, r6, 48);
            int A002 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r4, A0T);
            C51973G9u.A0z(r4, r2, r14);
            C287595aO.A00(r4, A023, r13);
            if (C51965G9l.A1Y(r4, r2, A042, A0w) || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r11, A002);
            }
            C287595aO.A00(r4, A012, A1K);
            AnonymousClass5ZZ.A0u(r4, C51966G9m.A0d(r4), C288035bG.A00(r4, 2131952820), C51966G9m.A0H(r4));
            String A003 = C288035bG.A00(r4, 2131952819);
            C286575Wy r8 = r4;
            AnonymousClass5ZZ.A0S(r8, C287195Zj.A09(r7, 30.0f, 16.0f), C51966G9m.A0c(r4), A003, C51966G9m.A0H(r4));
            r4.ASN();
            Iterator A17 = C51968G9o.A17(r4, 0sr.A1P(new Integer[]{2131952815, 2131952816, 2131952817}), -728604819);
            while (A17.hasNext()) {
                C56649I6e.A02(r4, C287975bA.A00(r4, R.drawable.primary_text_bullet_point, 0), C53508Gpe.A00(r4, AnonymousClass7TG.A0F(A17)));
            }
            C286565Wx.A0L(r2, false);
            C286575Wy r18 = r4;
            I7L.A02(r18, r16.AB0(r6, r7), C288035bG.A00(r4, 2131952818), C288035bG.A00(r4, 2131956481), (String) null, r15, (C62320sa) null, (i2 << 3) & 112, 23544, false, true);
            Object AJO = r4.AJO(AnonymousClass5YA.A0A);
            C60340gF r62 = C60340gF.A00;
            boolean A1Y = C51967G9n.A1Y(r4, AJO, -728581550);
            Object ECw = r4.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new C59712JUv(AJO, (AnonymousClass4D7) null, 44);
                r4.FLL(ECw);
            }
            C51968G9o.A1E(r4, r2, ECw, r62);
            if (C51967G9n.A1R(r4)) {
                0fL.A00(-421875842);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r15, i3, 13);
        }
    }
}
