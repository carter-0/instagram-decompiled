package X;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public abstract class HX0 {
    public static final void A00(AnonymousClass62P r15, 0sP r16, C286575Wy r17, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        0sP r2 = r16;
        AnonymousClass62P r3 = r15;
        AnonymousClass7TF.A1H(r15, r2);
        C286575Wy r12 = r17;
        r12.ExV(-1995734045);
        int i4 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r12, r15) | i;
        } else {
            i2 = i4;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r12, r2);
        }
        if ((i2 & 91) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-80212420, "com.instagram.comments.mvvm.view.compose.composer.ComposerEmojiBar (ComposerEmojiBar.kt:36)");
            }
            UserSession A0h = C51968G9o.A0h(r12);
            ArrayList A0m = C51970G9q.A0m(r15);
            int size = r15.size();
            for (int i5 = 0; i5 < size; i5++) {
                C317486nL A05 = C317486nL.A04.A05(A0h, AnonymousClass7TE.A19(r15, i5));
                if (A05 != null) {
                    String str = A05.A02;
                    A0m.add(new C53259Gl7(C336957fS.A00(A05.A01, str), str));
                }
            }
            List A0W = 00k.A0W(A0m);
            if (A0W.isEmpty()) {
                if (0fL.A02()) {
                    0fL.A00(187677324);
                }
                ASQ = r12.ASQ();
                if (ASQ != null) {
                    i3 = 30;
                    JGL.A01(ASQ, r2, r3, i4, i3);
                }
                return;
            }
            Modifier A0T = C51966G9m.A0T(Modifier.A00);
            Modifier Ezh = A0T.Ezh(new SizeElement(C287655aY.A00, Float.NaN, Float.NaN, Float.NaN, Float.POSITIVE_INFINITY, false));
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r12);
            C286565Wx r7 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r12, Ezh);
            C51973G9u.A0y(r12, r7);
            C51971G9r.A12(r12, A0a, A04);
            0sL r5 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r5, A00);
            }
            C51965G9l.A18(r12, A01);
            C54740HQx.A00(r12, (Alignment) null, A0T, JJU.A00(r12, A0W, r2, 25, -656441721), 3078, 6, false);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(1239473397);
            }
        } else {
            r12.Evl();
        }
        ASQ = r12.ASQ();
        if (ASQ != null) {
            i3 = 31;
            JGL.A01(ASQ, r2, r3, i4, i3);
        }
    }
}
