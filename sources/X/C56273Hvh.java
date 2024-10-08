package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.Hvh  reason: case insensitive filesystem */
public abstract class C56273Hvh {
    public static final void A00(C286575Wy r16, int i) {
        C286575Wy r12 = r16;
        r12.ExV(-1697142363);
        int i2 = i;
        if (i != 0 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(611466562, "com.instagram.creation.genai.contextualbackground.ui.ContextualBackgroundNux (ContextualBackgroundNuxBottomsheet.kt:81)");
            }
            C287265Zr r2 = C287215Zl.A00;
            C285245Qk r1 = Modifier.A00;
            AnonymousClass5RD A00 = C291495hO.A00(C287275Zs.A07, r12, r2);
            int A002 = C287425a7.A00(r12);
            C286565Wx r9 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r12, r1);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r12, r9, r8);
            0sL r6 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r12, A00, A04, r6);
            0sL r4 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r4, A002);
            }
            0sL A1K = C51966G9m.A1K(r12, A01);
            AnonymousClass6G3.A05(r12, C287205Zk.A0C(r1, 70.0f), C287975bA.A00(r12, R.drawable.ig_illustrations_illo_gen_ai_refresh, 0));
            String A003 = C288035bG.A00(r12, 2131952613);
            long A0H = C51966G9m.A0H(r12);
            AnonymousClass5ZZ.A0X(r12, C287195Zj.A09(r1, 0.0f, C287645aX.A00(r12)), AnonymousClass5aQ.A01(r12).A04, A003, A0H);
            C56649I6e.A05(r12, C53508Gpe.A00(r12, 2131952608), R.drawable.instagram_backdrop_gen_ai_pano_outline_24);
            C56649I6e.A05(r12, C53508Gpe.A00(r12, 2131952609), R.drawable.instagram_gen_ai_pano_outline_24);
            Modifier A07 = C287195Zj.A07(r1, C287645aX.A00(r12));
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A004 = C287425a7.A00(r12);
            AnonymousClass5RM A042 = C286565Wx.A04(r9);
            Modifier A012 = C287435a8.A01(r12, A07);
            C51973G9u.A0z(r12, r9, r8);
            C287595aO.A00(r12, A0a, r6);
            if (C51965G9l.A1Y(r12, r9, A042, A0w) || !C51972G9s.A1Q(r12, A004)) {
                C51971G9r.A13(r12, r4, A004);
            }
            C287595aO.A00(r12, A012, A1K);
            A01(r12, 0);
            if (C51971G9r.A1R(r12)) {
                0fL.A00(957196584);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i2, 22);
        }
    }

    public static final void A01(C286575Wy r24, int i) {
        C286575Wy r2 = r24;
        r2.ExV(1432403048);
        int i2 = i;
        if (i != 0 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-436972138, "com.instagram.creation.genai.contextualbackground.ui.MetaAiTermsDisclaimer (ContextualBackgroundNuxBottomsheet.kt:118)");
            }
            Context A0I = C51968G9o.A0I(r2);
            Object A0r = C51965G9l.A0r(r2);
            C286025Tq A00 = HY7.A00(AnonymousClass7TF.A0A(A0I), new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A01, (C291795ht) null, 65530, C51966G9m.A0D(r2), 0, 0), new C53380GnA[]{new C53380GnA(2131952612, "meta_ai_terms", "", 2), new C53380GnA(2131952611, "meta_ai_info", "", 2)}, 2131952610);
            long A0M = C51966G9m.A0M(r2);
            AnonymousClass5Z4 A0b = C51966G9m.A0b(r2);
            boolean A1U = C51966G9m.A1U(r2, A0r, G9t.A1Y(r2, A00, A0I, -2010989613));
            Object ECw = r2.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = new J6W(26, A0I, A00, A0r);
                r2.FLL(ECw);
            }
            C51965G9l.A1X(r2, false);
            IgClickableTextKt.A02(r2, (Modifier) null, A00, A0b, (0sP) ECw, 3, 0, 0, 112570, A0M);
            if (0fL.A02()) {
                0fL.A00(1479456605);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i2, 23);
        }
    }
}
