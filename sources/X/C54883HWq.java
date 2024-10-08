package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.HWq  reason: case insensitive filesystem */
public abstract class C54883HWq {
    public static final void A00(C286575Wy r40, ImageUrl imageUrl, String str, C62320sa r43, int i) {
        int i2;
        String str2 = str;
        boolean A1U = AnonymousClass7TF.A1U(0, imageUrl, str2);
        C62320sa r14 = r43;
        0qQ.A0B(r14, 2);
        C286575Wy r0 = r40;
        r0.ExV(618753787);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r0, imageUrl) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r0, str2);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r0, r14);
        }
        if ((i2 & 731) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(289192907, "com.instagram.comments.mvvm.view.compose.InlineComposerButton (InlineComposerButton.kt:32)");
            }
            boolean z = true;
            String A14 = C51968G9o.A14(r0, str2, 2131972167);
            int A08 = 00l.A08(C288035bG.A00(r0, 2131972167), "%1$s", 0, false);
            Object A0m = C51967G9n.A0m(r0, 1262849266);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                C303876Bd A0L = C51972G9s.A0L(A14);
                A0L.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A01, (C291795ht) null, 65531, 0, 0, 0), A08, C51966G9m.A05(str2, A08));
                A0m = A0L.A02();
                r0.FLL(A0m);
            }
            C286025Tq r4 = (C286025Tq) A0m;
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C285245Qk r13 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r13, 0.0f, C287645aX.A01(r0, R.dimen.account_discovery_bottom_gap), C287645aX.A01(r0, R.dimen.account_discovery_bottom_gap), C287645aX.A01(r0, R.dimen.account_discovery_bottom_gap));
            r0.ExS(1262867309);
            if ((i2 & 896) != 256) {
                z = false;
            }
            Object ECw = r0.ECw();
            if (z || ECw == obj) {
                ECw = C58680Ivp.A00(r0, r14, 10);
            }
            Modifier A05 = C287635aW.A05(A0B, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw, false), A1U);
            AnonymousClass5RD A0V = C51968G9o.A0V(r0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, A05);
            C51973G9u.A0y(r0, A0H);
            C51971G9r.A12(r0, A0V, A04);
            0sL r9 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r9, A00);
            }
            C51965G9l.A18(r0, A01);
            AnonymousClass6FX r12 = AnonymousClass6FX.A00;
            AnonymousClass2DN A012 = 1zC.A01(r0, imageUrl, i2 & 14);
            Modifier A0B2 = C287195Zj.A0B(r13, 0.0f, 0.0f, C287645aX.A01(r0, R.dimen.abc_edit_text_inset_top_material), 0.0f);
            float A013 = C287645aX.A01(r0, R.dimen.add_account_icon_circle_radius);
            GRY.A02(r0, A0B2, A012, new GS6(A013, A013, 2.0f, 1.0f), 8);
            boolean z2 = A1U;
            C286575Wy r18 = r0;
            C286025Tq r20 = r4;
            IgClickableTextKt.A01(r18, r12.AB1(C287215Zl.A04, C287205Zk.A00(C287215Zl.A00, r13)), r20, C51966G9m.A0c(r0), (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, J1V.A00, (0sP) null, (C304516Dt) null, 5, 0, z2 ? 1 : 0, 2, 805306374, 24582, 111032, C51966G9m.A0M(r0), 0, false, false);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(446260160);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(r14, imageUrl, str2, i3, 2);
        }
    }
}
