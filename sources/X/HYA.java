package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

public abstract class HYA {
    public static final void A00(C286575Wy r26, C3018260f r27, C3018260f r28, C3018260f r29, HPM hpm, MagicModPostCaptureTransform magicModPostCaptureTransform, C55638Hkx hkx, 0sP r33, int i, int i2, boolean z, boolean z2, boolean z3) {
        HPM hpm2 = hpm;
        C3018260f r10 = r29;
        C3018260f r6 = r27;
        0qQ.A0B(r6, 0);
        C286575Wy r1 = r26;
        r1.ExV(-1831176547);
        int i3 = i2;
        if ((i2 & 64) != 0) {
            r10 = null;
        }
        if ((i3 & 128) != 0) {
            hpm2 = null;
        }
        if (0fL.A02()) {
            0fL.A01(1255951520, "com.instagram.creation.genai.magicmod.common.ui.MagicModBackdropSegmentedImage (MagicModBackdropSegmentedImage.kt:48)");
        }
        Bitmap bitmap = ((C3018360g) r6).A00;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C304786Ff A00 = C56276Hvk.A00(C298615tk.A00(r6), r1);
        Alignment alignment = C287215Zl.A09;
        Modifier modifier = Modifier.A00;
        Modifier A002 = C54739HQw.A00(modifier, 0.5625f, false);
        r1.ExS(-1737661465);
        boolean z4 = z;
        if (!z) {
            modifier = C304766Fd.A00(modifier, A00, HYI.A00(r1));
        }
        C286565Wx r5 = (C286565Wx) r1;
        Modifier Ezh = AnonymousClass6FZ.A01(C51967G9n.A0B(r5, A002, modifier), HYI.A00(r1)).Ezh(C287205Zk.A01);
        AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
        int A004 = C287425a7.A00(r1);
        AnonymousClass5RM A04 = C286565Wx.A04(r5);
        Modifier A01 = C287435a8.A01(r1, Ezh);
        C51973G9u.A0y(r1, r5);
        C51971G9r.A12(r1, A003, A04);
        0sL r2 = C287485aD.A02;
        if (r5.A0K || !C51972G9s.A1Q(r1, A004)) {
            C51971G9r.A13(r1, r2, A004);
        }
        C51965G9l.A18(r1, A01);
        C3018260f r7 = r28;
        MagicModPostCaptureTransform magicModPostCaptureTransform2 = magicModPostCaptureTransform;
        C55638Hkx hkx2 = hkx;
        0sP r9 = r33;
        boolean z5 = z3;
        int i4 = i;
        C56574I2e.A02(r1, hpm2, AnonymousClass5PI.A01(r1, new JBC(magicModPostCaptureTransform2, r9, r6, r7, hkx2, width, height, 1, z4, z5), 915476601), ((i >> 21) & 14) | 48, 0);
        if (C51967G9n.A1R(r1)) {
            0fL.A00(237318674);
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JCK(r6, r7, hkx2, r9, r10, hpm2, magicModPostCaptureTransform2, i4, i3, 0, z4, z2, z5);
        }
    }
}
