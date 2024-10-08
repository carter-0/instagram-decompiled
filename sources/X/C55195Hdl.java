package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Hdl  reason: case insensitive filesystem */
public abstract class C55195Hdl {
    public static final void A00(C286575Wy r12, GifUrlImpl gifUrlImpl, String str, int i) {
        int i2;
        GifUrlImpl gifUrlImpl2 = gifUrlImpl;
        String str2 = str;
        AnonymousClass7TF.A1H(str, gifUrlImpl);
        C286575Wy r5 = r12;
        r12.ExV(318165240);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r12, gifUrlImpl2);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-29492650, "com.instagram.wonderwall.ui.compose.components.GifAttachmentPreview (WallGifAttachment.kt:17)");
            }
            r12.ExS(-1322574566);
            int i3 = i2 & 112;
            boolean A1S = AnonymousClass7TF.A1S(i3, 32);
            Object ECw = r12.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = Float.valueOf(C69826Nsn.A00(gifUrlImpl2));
                r12.FLL(ECw);
            }
            float A04 = AnonymousClass7TE.A04(ECw);
            C51965G9l.A1X(r12, false);
            HXW.A00(r5, C51968G9o.A0P(C54739HQw.A00(C51969G9p.A0U(), A04, false), 12.0f), gifUrlImpl2, str2, (String) null, A04, 0, (i2 & 14) | 3072 | i3, 32);
            if (0fL.A02()) {
                0fL.A00(-547031991);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, gifUrlImpl2, str, i, 15);
        }
    }
}
