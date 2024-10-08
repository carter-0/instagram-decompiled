package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.Hbt  reason: case insensitive filesystem */
public abstract class C55084Hbt {
    public static final void A00(C286575Wy r30, ImageUrl imageUrl, int i, int i2) {
        int i3;
        ImageUrl imageUrl2 = imageUrl;
        0qQ.A0B(imageUrl2, 0);
        C286575Wy r5 = r30;
        r5.ExV(2081974839);
        int i4 = i2;
        if ((i2 & 14) == 0) {
            i3 = G9t.A0O(r5, imageUrl2) | i2;
        } else {
            i3 = i4;
        }
        int i5 = i2 & 112;
        int i6 = i;
        if (i5 == 0) {
            i3 |= G9t.A06(r5, i6);
        }
        if ((i3 & 91) != 18 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1028234775, "com.instagram.potato.reply.PotatoReplySheetLikerCircle (PotatoReplySheetLikerCircle.kt:24)");
            }
            C285245Qk r7 = Modifier.A00;
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r5);
            C286565Wx r6 = (C286565Wx) r5;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r5, r7);
            C62320sa r4 = C287485aD.A00;
            C51973G9u.A0z(r5, r6, r4);
            0sL r3 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r5, A00, A04, r3);
            0sL r2 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r5, A002)) {
                C51971G9r.A13(r5, r2, A002);
            }
            0sL A1K = C51966G9m.A1K(r5, A01);
            C289515dj r16 = C289515dj.A00;
            GSL.A01(r5, (Modifier) null, 1zC.A00(r5, new SimpleImageUrl(imageUrl2)), (AnonymousClass2DO) null, (float) i6, 0.0f, 0.0f, 64, 1020, 0, 0, false, false);
            C289515dj r0 = r16;
            Modifier AAz = r0.AAz(C287215Zl.A07, C56164Htt.A00(r7, 3.0f, 3.0f));
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r5);
            AnonymousClass5RM A042 = C286565Wx.A04(r6);
            Modifier A012 = C287435a8.A01(r5, AAz);
            C51973G9u.A0z(r5, r6, r4);
            C287595aO.A00(r5, A003, r3);
            if (C51965G9l.A1Y(r5, r6, A042, A0w) || !C51972G9s.A1Q(r5, A004)) {
                C51971G9r.A13(r5, r2, A004);
            }
            C287595aO.A00(r5, A012, A1K);
            Modifier A013 = C304766Fd.A01(C287205Zk.A0C(r7, 2.0f + 8.0f), AnonymousClass5ZN.A00, C51966G9m.A0A(r5));
            AnonymousClass5RD A005 = C287675aa.A00(alignment, false);
            int A006 = C287425a7.A00(r5);
            AnonymousClass5RM A043 = C286565Wx.A04(r6);
            Modifier A014 = C287435a8.A01(r5, A013);
            C51973G9u.A0z(r5, r6, r4);
            C287595aO.A00(r5, A005, r3);
            if (C51965G9l.A1Y(r5, r6, A043, A0w) || !C51972G9s.A1Q(r5, A006)) {
                C51971G9r.A13(r5, r2, A006);
            }
            C287595aO.A00(r5, A014, A1K);
            C286575Wy r12 = r5;
            C288165bT.A01(r12, C51965G9l.A0L(r16, C287205Zk.A0C(r7, 8.0f)), C287975bA.A00(r5, R.drawable.instagram_heart_pano_filled_24, 0), 56, AnonymousClass5aQ.A00(r5).A0Q);
            r5.ASN();
            if (C51971G9r.A1R(r5)) {
                0fL.A00(-1078872762);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, imageUrl2, i6, i4, 20);
        }
    }
}
