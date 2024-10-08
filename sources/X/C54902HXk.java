package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HXk  reason: case insensitive filesystem */
public abstract class C54902HXk {
    public static final void A00(Context context, Drawable drawable, C286575Wy r9, C3018260f r10, int i) {
        AnonymousClass2DO gf2;
        AnonymousClass7TF.A1B(drawable, 0, context);
        if (C51967G9n.A1T(r9, 1561993431)) {
            0fL.A01(-1302385833, "com.instagram.creation.capture.assetpicker.cutout.ui.CutoutVideoStickerStylizedImage (CutoutVideoStickerStylizedImage.kt:29)");
        }
        int A03 = AnonymousClass7TF.A03(2Yn.A01(context), R.attr.igds_color_secondary_background);
        if (r10 != null) {
            gf2 = new C52926Gf0(r10);
        } else {
            gf2 = new C52928Gf2(C51965G9l.A08((long) A03));
        }
        Alignment alignment = C287215Zl.A09;
        C285245Qk r6 = Modifier.A00;
        AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
        int A002 = C287425a7.A00(r9);
        C286565Wx r4 = (C286565Wx) r9;
        AnonymousClass5RM A04 = C286565Wx.A04(r4);
        Modifier A01 = C287435a8.A01(r9, r6);
        C51973G9u.A0y(r9, r4);
        C51971G9r.A12(r9, A00, A04);
        0sL r1 = C287485aD.A02;
        if (r4.A0K || !C51972G9s.A1Q(r9, A002)) {
            C51971G9r.A13(r9, r1, A002);
        }
        C51965G9l.A18(r9, A01);
        AnonymousClass6G3.A04(r9, C51968G9o.A0P(C51966G9m.A0U(r6), C287645aX.A01(r9, R.dimen.account_discovery_bottom_gap)), gf2);
        AnonymousClass6G3.A07(r9, (Modifier) null, C287995bC.A00(drawable, r9), 56, 124);
        if (C51967G9n.A1R(r9)) {
            0fL.A00(230918258);
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(drawable, r10, context, i, 21);
        }
    }
}
