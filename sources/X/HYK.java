package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

public abstract class HYK {
    public static final void A00(C286575Wy r11, MagicModPostCaptureTransform magicModPostCaptureTransform, 0sL r13, int i) {
        0qQ.A0B(r13, 1);
        if (C51967G9n.A1T(r11, 1904811584)) {
            0fL.A01(1022789424, "com.instagram.creation.genai.magicmod.common.ui.MagicModTransformationContainer (MagicModTransformationContainer.kt:18)");
        }
        C285245Qk r1 = Modifier.A00;
        Modifier A0U = C51966G9m.A0U(r1);
        Alignment alignment = C287215Zl.A09;
        AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
        int A002 = C287425a7.A00(r11);
        C286565Wx r9 = (C286565Wx) r11;
        AnonymousClass5RM A04 = C286565Wx.A04(r9);
        Modifier A01 = C287435a8.A01(r11, A0U);
        C62320sa r8 = C287485aD.A00;
        C51973G9u.A0z(r11, r9, r8);
        0sL r7 = C287485aD.A03;
        0sL A0w = C51969G9p.A0w(r11, A00, A04, r7);
        0sL r5 = C287485aD.A02;
        if (r9.A0K || !C51972G9s.A1Q(r11, A002)) {
            C51971G9r.A13(r11, r5, A002);
        }
        0sL A1K = C51966G9m.A1K(r11, A01);
        Modifier A0X = C51970G9q.A0X(C54739HQw.A00(r1, 0.5625f, false), new MP4(magicModPostCaptureTransform, 20));
        AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
        int A004 = C287425a7.A00(r11);
        AnonymousClass5RM A042 = C286565Wx.A04(r9);
        Modifier A012 = C287435a8.A01(r11, A0X);
        C51973G9u.A0z(r11, r9, r8);
        C287595aO.A00(r11, A003, r7);
        if (C51965G9l.A1Y(r11, r9, A042, A0w) || !C51972G9s.A1Q(r11, A004)) {
            C51971G9r.A13(r11, r5, A004);
        }
        C287595aO.A00(r11, A012, A1K);
        C51972G9s.A11(r11, r13, i >> 3);
        if (C51967G9n.A1R(r11)) {
            0fL.A00(-2120874888);
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, magicModPostCaptureTransform, r13, i, 42);
        }
    }
}
