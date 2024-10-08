package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.Vmx  reason: case insensitive filesystem */
public abstract class C18183Vmx {
    public static final float A00(Context context, float f) {
        return TypedValue.applyDimension(1, f, AnonymousClass7TF.A0E(context));
    }

    public static final float A01(Context context, float f) {
        DisplayMetrics A0E = AnonymousClass7TF.A0E(context);
        0qQ.A07(A0E);
        return f / A0E.density;
    }
}
