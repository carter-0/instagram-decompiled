package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

public abstract class HYL {
    public static final void A00(C286575Wy r14, Modifier modifier, C3018260f r16, C3018260f r17, C288095bM r18, String str, int i, int i2) {
        C3018260f r13 = r16;
        C3018260f r12 = r17;
        C288095bM r7 = r18;
        Modifier modifier2 = modifier;
        AnonymousClass7TG.A1N(r13, r12);
        C286575Wy r2 = r14;
        r14.ExV(-1187510709);
        int i3 = i2;
        if ((i2 & 8) != 0) {
            modifier2 = Modifier.A00;
        }
        if ((i2 & 16) != 0) {
            r7 = C288075bK.A04;
        }
        if (0fL.A02()) {
            0fL.A01(-1687156645, "com.instagram.creation.genai.magicmod.common.ui.MaskedImage (MaskedImage.kt:25)");
        }
        int i4 = i;
        AnonymousClass6G3.A00(r2, (Alignment) null, modifier2, (C288195bW) null, new C52927Gf1(r13, r12), r7, (String) null, 0.99f, 196664 | ((i >> 3) & 896) | (57344 & i), 72);
        if (0fL.A02()) {
            0fL.A00(-871476317);
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA8(r7, modifier2, r12, r13, str, i4, i3, 6);
        }
    }
}
