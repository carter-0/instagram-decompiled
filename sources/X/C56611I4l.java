package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.I4l  reason: case insensitive filesystem */
public abstract class C56611I4l {
    public static final float A00(C59535JNh jNh, Integer num) {
        0qQ.A0B(num, 1);
        C361838gt A03 = A03(jNh);
        0qQ.A0B(A03, 0);
        return C21115XFf.A00(A03).EwD(num);
    }

    public static JRA A02(C59535JNh jNh) {
        C361838gt A03 = A03(jNh);
        0qQ.A0B(A03, 0);
        return C21115XFf.A00(A03);
    }

    public static final C361838gt A03(C59535JNh jNh) {
        C53402Gnu gnu;
        C361838gt r0;
        0qQ.A0B(jNh, 0);
        if (!(jNh instanceof C53402Gnu) || (gnu = (C53402Gnu) jNh) == null || (r0 = gnu.A00) == null) {
            return C361838gt.DEFAULT;
        }
        return r0;
    }

    public static final int A01(C21255XRa xRa, C59535JNh jNh) {
        AnonymousClass7TG.A1N(jNh, xRa);
        C361838gt A03 = A03(jNh);
        0qQ.A0B(A03, 0);
        ColorData AIK = C21115XFf.A00(A03).AIK(xRa);
        if (AIK == null) {
            return -1;
        }
        if (jNh.CRB()) {
            return AIK.A00;
        }
        return AIK.A01;
    }
}
