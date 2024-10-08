package X;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: X.SRv  reason: case insensitive filesystem */
public abstract class C11400SRv {
    public static final SNH A00 = SNH.A00("x", "y");

    public static float A00(C12828T8z t8z) {
        Integer A0E = t8z.A0E();
        int intValue = A0E.intValue();
        if (intValue == 6) {
            return Pxh.A02(t8z);
        }
        if (intValue == 0) {
            t8z.A0I();
            float A02 = Pxh.A02(t8z);
            while (t8z.A0Q()) {
                t8z.A0N();
            }
            t8z.A0K();
            return A02;
        }
        throw AnonymousClass7TF.A0W("Unknown value for token of type ", RSN.A00(A0E));
    }

    public static int A01(C12828T8z t8z) {
        t8z.A0I();
        int A0B = (int) (t8z.A0B() * 255.0d);
        int A0B2 = (int) (t8z.A0B() * 255.0d);
        int A0B3 = (int) (t8z.A0B() * 255.0d);
        while (t8z.A0Q()) {
            t8z.A0N();
        }
        t8z.A0K();
        return Color.argb(255, A0B, A0B2, A0B3);
    }

    public static PointF A02(C12828T8z t8z, float f) {
        float f2;
        float f3;
        int intValue = t8z.A0E().intValue();
        if (intValue == 6) {
            f2 = Pxh.A02(t8z);
            f3 = Pxh.A02(t8z);
            while (t8z.A0Q()) {
                t8z.A0N();
            }
        } else if (intValue == 0) {
            t8z.A0I();
            f2 = Pxh.A02(t8z);
            f3 = Pxh.A02(t8z);
            while (t8z.A0E() != AnonymousClass05K.A01) {
                t8z.A0N();
            }
            t8z.A0K();
        } else if (intValue == 2) {
            t8z.A0J();
            f2 = 0.0f;
            f3 = 0.0f;
            while (t8z.A0Q()) {
                int A0D = t8z.A0D(A00);
                if (A0D == 0) {
                    f2 = A00(t8z);
                } else if (A0D != 1) {
                    t8z.A0M();
                    t8z.A0N();
                } else {
                    f3 = A00(t8z);
                }
            }
            t8z.A0L();
        } else {
            throw AnonymousClass7TF.A0W("Unknown point starts with ", RSN.A00(t8z.A0E()));
        }
        return new PointF(f2 * f, f3 * f);
    }

    public static ArrayList A03(C12828T8z t8z, float f) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        t8z.A0I();
        while (t8z.A0E() == AnonymousClass05K.A00) {
            t8z.A0I();
            A1C.add(A02(t8z, f));
            t8z.A0K();
        }
        t8z.A0K();
        return A1C;
    }
}
