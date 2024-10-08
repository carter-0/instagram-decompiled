package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

/* renamed from: X.Hvk  reason: case insensitive filesystem */
public abstract class C56276Hvk {
    public static final void A01(C286575Wy r15, HPM hpm, I12 i12, MagicModPostCaptureTransform magicModPostCaptureTransform, 0sP r19, 0sK r20, int i, int i2) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        0sP r8 = r19;
        0sK r11 = r20;
        HPM hpm2 = hpm;
        MagicModPostCaptureTransform magicModPostCaptureTransform2 = magicModPostCaptureTransform;
        C286575Wy r3 = r15;
        r15.ExV(-279273166);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            magicModPostCaptureTransform2 = null;
        }
        if ((i2 & 4) != 0) {
            hpm2 = null;
        }
        if ((i2 & 8) != 0) {
            r11 = C45183Crl.A00;
        }
        if ((i2 & 16) != 0) {
            r8 = J2A.A00;
        }
        if (0fL.A02()) {
            0fL.A01(1817875679, "com.instagram.creation.genai.magicmod.common.ui.MagicModImage (MagicModImage.kt:39)");
        }
        I12 i122 = i12;
        if (i12 != null) {
            bitmap = i122.A00;
        } else {
            bitmap = null;
        }
        C304786Ff A00 = A00(bitmap, r3);
        if (i12 != null) {
            bitmap2 = i122.A00;
        } else {
            bitmap2 = null;
        }
        boolean A1Y = C51967G9n.A1Y(r3, bitmap2, 1800577398);
        Object ECw = r3.ECw();
        if (A1Y || ECw == AnonymousClass5XT.A00) {
            if (i12 == null || (bitmap3 = i122.A00) == null) {
                ECw = null;
            } else {
                ECw = new C3018360g(bitmap3);
            }
            r3.FLL(ECw);
        }
        C286565Wx r7 = (C286565Wx) r3;
        C286565Wx.A0L(r7, false);
        C286645Xf.A04(r3, i122, new MGX(i122, r8, (AnonymousClass4D7) null, 7));
        int i4 = i;
        if (ECw != null) {
            Alignment alignment = C287215Zl.A09;
            Modifier A002 = C304766Fd.A00(AnonymousClass6FZ.A01(C54739HQw.A00(Modifier.A00, 0.5625f, false), HYI.A00(r3)), A00, HYI.A00(r3));
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r3);
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r3, A002);
            C51973G9u.A0y(r3, r7);
            C51971G9r.A12(r3, A003, A04);
            0sL r1 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r3, A004)) {
                C51971G9r.A13(r3, r1, A004);
            }
            C51965G9l.A18(r3, A01);
            C56574I2e.A02(r3, hpm2, AnonymousClass5PI.A01(r3, new J8X(1, r11, C289515dj.A00, i122, magicModPostCaptureTransform2, ECw), 119686897), ((i4 >> 6) & 14) | 48, 0);
            r3.ASN();
        }
        if (0fL.A02()) {
            0fL.A00(2101790434);
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59195J9z(r8, magicModPostCaptureTransform2, i122, r11, hpm2, i4, i3, 8);
        }
    }

    public static final C304786Ff A00(Bitmap bitmap, C286575Wy r6) {
        C52924Gey A00;
        if (C51967G9n.A1U(r6, -32844941)) {
            0fL.A01(757658907, "com.instagram.creation.genai.magicmod.common.ui.rememberBitmapGradientBackgroundBrush (MagicModImage.kt:76)");
        }
        if (bitmap != null) {
            BackgroundGradientColors A01 = 0oT.A01(bitmap, AnonymousClass05K.A00);
            A00 = C304786Ff.A00.A03(G9t.A1D(C51967G9n.A0I((long) A01.A01), ((long) A01.A00) << 32));
        } else {
            A00 = C304796Fg.A00(AnonymousClass7TE.A1I(C51965G9l.A0N(AnonymousClass5aQ.A00(r6).A11)), C289325dP.A00(0.0f, 0.0f), C289325dP.A00(Float.POSITIVE_INFINITY, 0.0f));
        }
        if (0fL.A02()) {
            0fL.A00(-504676036);
        }
        C51965G9l.A1V(r6);
        return A00;
    }
}
