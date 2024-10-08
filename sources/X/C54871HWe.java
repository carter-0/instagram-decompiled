package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HWe  reason: case insensitive filesystem */
public abstract class C54871HWe {
    public static final void A00(C286575Wy r19, Modifier modifier, GSY gsy, C62320sa r22, int i, int i2) {
        int i3;
        AnonymousClass2DN A00;
        Modifier modifier2 = modifier;
        C62320sa r15 = r22;
        GSY gsy2 = gsy;
        AnonymousClass7TF.A1H(gsy2, r15);
        C286575Wy r9 = r19;
        r9.ExV(-411504457);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r9, gsy2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0F(r9, r15);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0Q(r9, modifier2);
        }
        if ((i3 & 731) != 146 || !r9.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1457084794, "com.instagram.comments.mvvm.view.compose.CTA (CTA.kt:18)");
            }
            Alignment alignment = C287215Zl.A06;
            C285245Qk r7 = Modifier.A00;
            AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
            int A003 = C287425a7.A00(r9);
            C286565Wx r6 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r9, r7);
            C51973G9u.A0y(r9, r6);
            C51971G9r.A12(r9, A002, A04);
            0sL r5 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r9, A003)) {
                C51971G9r.A13(r9, r5, A003);
            }
            C51965G9l.A18(r9, A01);
            String str = gsy2.A02;
            ImageUrl imageUrl = (ImageUrl) gsy2.A01;
            r9.ExS(773834505);
            AnonymousClass5RW r11 = null;
            if (imageUrl == null) {
                A00 = null;
            } else {
                A00 = 1zC.A00(r9, imageUrl);
            }
            C286565Wx.A0L(r6, false);
            String str2 = gsy2.A03;
            Number number = (Number) gsy2.A00;
            if (number != null) {
                r11 = C51967G9n.A0I((long) number.intValue());
            }
            C54893HXb.A00(r9, modifier2, r11, A00, str, str2, r15, (i3 & 112) | 4096 | (i3 & 896), 32, 0);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(-618511718);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 17, gsy2, r15, modifier2);
        }
    }
}
