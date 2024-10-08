package X;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* renamed from: X.61V  reason: invalid class name */
public abstract class AnonymousClass61V {
    public static Shader A00(AnonymousClass6AD r11, AnonymousClass6B8 r12, AnonymousClass3JV r13, AnonymousClass6AF r14, float f, float f2, float f3, float f4) {
        float f5 = f4;
        AnonymousClass6AD A00 = AnonymousClass3JW.A00(r12.A01, r11, r12.A02, f, f5);
        float[] fArr = null;
        if (A00 != null) {
            AnonymousClass6AF A002 = AnonymousClass3JW.A00(r12.A08, r14, r12.A03, f, f5);
            AnonymousClass3JV A003 = AnonymousClass3JW.A00(r12.A07, r13, r12.A05, f, f5);
            if (A003 != null) {
                float f6 = A003.A00 * f2;
                float f7 = A003.A01 * f3;
                AnonymousClass3JV A004 = AnonymousClass3JW.A00(r12.A06, r13, r12.A04, f, f5);
                if (A004 != null) {
                    float f8 = A004.A00 * f2;
                    float f9 = A004.A01 * f3;
                    if (r12.A00 == 1) {
                        float max = Math.max((float) Math.hypot((double) (f8 - f6), (double) (f9 - f7)), 0.001f);
                        int[] A005 = A00.A00();
                        if (A002 != null) {
                            fArr = A002.A01;
                        }
                        return new RadialGradient(f6, f7, max, A005, fArr, Shader.TileMode.CLAMP);
                    }
                    int[] A006 = A00.A00();
                    if (A002 != null) {
                        fArr = A002.A01;
                    }
                    return new LinearGradient(f6, f7, f8, f9, A006, fArr, Shader.TileMode.CLAMP);
                }
            }
        }
        return null;
    }
}
