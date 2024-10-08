package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hby  reason: case insensitive filesystem */
public abstract class C55089Hby {
    public static final void A00(C286575Wy r14, Modifier modifier, ImageUrl imageUrl, C62320sa r17, C62320sa r18, 0sP r19, int i, int i2) {
        int i3;
        C62320sa r8 = r18;
        C62320sa r10 = r17;
        Modifier modifier2 = modifier;
        0sP r7 = r19;
        AnonymousClass7TF.A1D(modifier, 0, r7);
        r14.ExV(-133241998);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r14, modifier) | i;
        } else {
            i3 = i5;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r14, imageUrl2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0G(r14, r10);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= G9t.A0H(r14, r8);
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= G9t.A0I(r14, r7);
        }
        if ((46811 & i3) != 9362 || !r14.Bwn()) {
            if (i6 != 0) {
                r10 = C58483Ise.A00;
            }
            if (i7 != 0) {
                r8 = C58484Isf.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1741712776, "com.instagram.profile.fragment.ProfileMyWeekNuxContent (ProfileMyWeekNuxContent.kt:33)");
            }
            AnonymousClass5RD A0D = C51976G9y.A0D(r14, i3);
            int A00 = C287425a7.A00(r14);
            C286565Wx r6 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r14, modifier);
            C51973G9u.A0y(r14, r6);
            C51971G9r.A12(r14, A0D, A04);
            0sL r3 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r3, A00);
            }
            C51965G9l.A18(r14, A01);
            C285245Qk r5 = Modifier.A00;
            FillElement fillElement = C287205Zk.A02;
            Modifier Ezh = r5.Ezh(fillElement);
            int i8 = i3 >> 9;
            HUI.A00(r14, Ezh, imageUrl, r7, ((i3 >> 3) & 14) | 3456 | (i8 & 112), 0, false);
            C289585dr.A00(r14, C51966G9m.A0X(C287205Zk.A08(r5, 1.0f).Ezh(fillElement), C51966G9m.A0K(r14)));
            C286575Wy r16 = r14;
            AnonymousClass6CE.A05(r16, C287195Zj.A0B(C287195Zj.A09(Ezh, 16.0f, 0.0f), 0.0f, 16.0f, 0.0f, 0.0f), C51965G9l.A0m(r14), C304346Dc.A00(r14, 2131967971), r10, ((i3 >> 6) & 14) | 1573248);
            AnonymousClass6CE.A05(r14, C287195Zj.A07(Ezh, 16.0f), AnonymousClass6CA.A00(r14), C304346Dc.A00(r14, 2131967970), r8, (i8 & 14) | 1573248);
            if (C51967G9n.A1R(r14)) {
                0fL.A00(-1610624456);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59195J9z(r7, r8, imageUrl2, r10, modifier2, i5, i4, 12);
        }
    }
}
