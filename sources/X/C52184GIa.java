package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.GIa  reason: case insensitive filesystem */
public final class C52184GIa {
    public final GradientDrawable A01(GradientDrawable.Orientation orientation, int i) {
        return A00(orientation, ((int) ((((float) i) / 255.0f) * 255.0f)) << 24);
    }

    public static final GradientDrawable A00(GradientDrawable.Orientation orientation, int i) {
        return new GradientDrawable(orientation, new int[]{0nH.A06(i, 1.0f), 0nH.A06(i, 0.75f), 0nH.A06(i, 0.5f), 0nH.A06(i, 0.25f), 0nH.A06(i, 0.1f), 0nH.A06(i, 0.0f)});
    }
}
