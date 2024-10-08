package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.VlM  reason: case insensitive filesystem */
public abstract class C18092VlM {
    public static final int A00(Context context, float f) {
        float f2;
        0qQ.A0B(context, 0);
        float A03 = f * C13989Tnp.A03(context);
        if (A03 >= 0.0f) {
            f2 = A03 + 0.5f;
        } else {
            f2 = A03 - 0.5f;
        }
        return (int) f2;
    }

    public static final int A01(Resources resources, float f) {
        float f2;
        float f3 = f * resources.getDisplayMetrics().density;
        if (f3 >= 0.0f) {
            f2 = f3 + 0.5f;
        } else {
            f2 = f3 - 0.5f;
        }
        return (int) f2;
    }
}
