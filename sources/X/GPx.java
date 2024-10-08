package X;

import java.util.List;

public abstract class GPx {
    public static float A00;
    public static final List A01;

    public static final 2WX A00(2WX r5, float f, float f2, float f3, float f4) {
        float f5 = f2 - f3;
        float A002 = C51967G9n.A00(f5, f);
        boolean z = true;
        boolean A1R = AnonymousClass7TF.A1R((f > f5 ? 1 : (f == f5 ? 0 : -1)));
        boolean A1T = C51970G9q.A1T((A002 > f4 ? 1 : (A002 == f4 ? 0 : -1)));
        if (f + f4 > f5) {
            z = false;
        }
        if (A1R) {
            f4 = 0.0f;
        } else if (!A1T || !z) {
            f4 = A002;
        }
        A00 = f4;
        return AnonymousClass9JR.A00(r5, AnonymousClass05K.A0N, 1, C51969G9p.A0G((int) f4));
    }

    static {
        0eP A0x = AnonymousClass7TF.A0x(318, 108);
        Integer A0k = C51967G9n.A0k();
        A01 = 0sr.A1P(new 0eP[]{A0x, AnonymousClass7TF.A0x(258, 80), AnonymousClass7TF.A0x(224, 72), AnonymousClass7TF.A0x(186, 40), AnonymousClass7TF.A0x(94, 28), new 0eP(24, 24), new 0eP(A0k, A0k)});
    }
}
