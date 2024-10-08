package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.JcA  reason: case insensitive filesystem */
public final class C59944JcA {
    public final float A00;
    public final float A01;
    public final int A02;

    public C59944JcA(Context context, float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = DbS.A02(context, 1);
    }

    public static final C63808L7o A00(C59944JcA jcA, C347087wF r14) {
        int i = r14.A03;
        float f = (float) i;
        float f2 = jcA.A00 / f;
        float f3 = jcA.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i2 = 0;
        do {
            A1C.add(new C63809L7p(f3, f2, 0.0f, ((float) i2) * f2));
            i2++;
        } while (i2 < i);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        float f4 = 1.0f / f;
        int i3 = 1;
        do {
            C71492dQ r1 = new C71492dQ(0, jcA.A02);
            JTP.A16(r1);
            r1.A09 = ((float) i3) * f4;
            A1C2.add(r1);
            i3++;
        } while (i3 < i);
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        int i4 = (int) f2;
        int i5 = (int) f3;
        int i6 = i - 1;
        float f5 = 1.0f / ((float) i6);
        C71492dQ r0 = new C71492dQ(i5, i4);
        r0.A0u = 0;
        r0.A0F = -1;
        r0.A0s = 0;
        r0.A0M = 0;
        A1C3.add(r0);
        for (int i7 = 1; i7 < i6; i7++) {
            C71492dQ r12 = new C71492dQ(i5, i4);
            JTP.A16(r12);
            r12.A09 = ((float) i7) * f5;
            A1C3.add(r12);
        }
        C71492dQ A0B = JTQ.A0B(i5, i4, -1, 0);
        A0B.A0s = 0;
        A0B.A0M = 0;
        A1C3.add(A0B);
        return new C63808L7o(r14, A1C, A1C2, A1C3);
    }
}
