package X;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9yi  reason: invalid class name and case insensitive filesystem */
public abstract class C394799yi {
    public static final C362938ik A00(C362938ik r12, float f, float f2, float f3, float f4) {
        C381609c2 r3 = null;
        if (r12 == null) {
            return null;
        }
        float f5 = r12.A00 * f4;
        C381609c2 r0 = r12.A08;
        if (r0 != null) {
            List list = r0.A00;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                float A04 = AnonymousClass7TE.A04(next);
                int i3 = i % 3;
                if (i3 == 0) {
                    A04 = (A04 + f) * f2;
                } else if (i3 == 1) {
                    A04 = (A04 + 1.0f) * f3;
                }
                A0r.add(Float.valueOf(A04));
                i = i2;
            }
            r3 = new C381609c2(A0r);
        }
        C306396Lz r2 = r12.A07;
        float f6 = r12.A02;
        float f7 = r12.A04;
        float f8 = r12.A03;
        float f9 = r12.A01;
        int i4 = r12.A05;
        boolean z = r12.A0A;
        List list2 = r12.A09;
        Typeface typeface = r12.A06;
        0qQ.A0B(r2, 0);
        return new C362938ik(typeface, r2, r3, list2, f6, f7, f8, f5, f9, i4, z);
    }
}
