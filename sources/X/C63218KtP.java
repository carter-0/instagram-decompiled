package X;

import android.graphics.Rect;

/* renamed from: X.KtP  reason: case insensitive filesystem */
public abstract class C63218KtP {
    public static Rect A00(Rect rect, int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return new Rect(rect);
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float max = Math.max(((float) i) / f, ((float) i2) / f2);
        Rect A0W = AnonymousClass7TE.A0W();
        A0W.left = (int) ((((float) rect.left) * max) + 0.5f);
        int i5 = (int) ((((float) rect.right) * max) + 0.5f);
        A0W.right = i5;
        A0W.top = (int) ((((float) rect.top) * max) + 0.5f);
        int i6 = (int) ((((float) rect.bottom) * max) + 0.5f);
        A0W.bottom = i6;
        A0W.right = (int) Math.min((float) i5, (f * max) + 0.5f);
        A0W.bottom = (int) Math.min((float) i6, (f2 * max) + 0.5f);
        return A0W;
    }
}
