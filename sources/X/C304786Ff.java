package X;

import android.graphics.Shader;

/* renamed from: X.6Ff  reason: invalid class name and case insensitive filesystem */
public abstract class C304786Ff {
    public static final C304796Fg A00 = new Object();

    public final void A00(AnonymousClass5S9 r8, float f, long j) {
        long A04;
        if (this instanceof C298605tj) {
            C298605tj r4 = (C298605tj) this;
            Shader shader = r4.A01;
            if (shader == null || r4.A00 != j) {
                if (C288025bF.A04(j)) {
                    r4.A01 = null;
                    r4.A00 = 9205357640488583168L;
                    shader = null;
                } else {
                    shader = r4.A01(j);
                    r4.A01 = shader;
                    r4.A00 = j;
                }
            }
            AnonymousClass5S8 r6 = (AnonymousClass5S8) r8;
            long j2 = AnonymousClass5RW.A01;
            if ((((long) r6.A01.getColor()) << 32) != j2) {
                r8.ESE(j2);
            }
            if (!0qQ.A0K(r6.A02, shader)) {
                r6.A02 = shader;
                r6.A01.setShader(shader);
            }
            if (((float) r6.A01.getAlpha()) / 255.0f != f) {
                r8.EOX(f);
                return;
            }
            return;
        }
        C304776Fe r1 = (C304776Fe) this;
        r8.EOX(1.0f);
        if (f == 1.0f) {
            A04 = r1.A00;
        } else {
            long j3 = r1.A00;
            A04 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j3 & 63)], AnonymousClass5RW.A03(j3), AnonymousClass5RW.A02(j3), AnonymousClass5RW.A01(j3), AnonymousClass5RW.A00(j3) * f);
        }
        r8.ESE(A04);
        AnonymousClass5S8 r82 = (AnonymousClass5S8) r8;
        if (r82.A02 != null) {
            r82.A02 = null;
            r82.A01.setShader((Shader) null);
        }
    }
}
