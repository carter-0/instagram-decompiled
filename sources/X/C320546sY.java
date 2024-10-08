package X;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import com.instagram.android.R;

/* renamed from: X.6sY  reason: invalid class name and case insensitive filesystem */
public abstract class C320546sY {
    public static final int A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        int i2 = dimensionPixelSize * 2;
        int A01 = AnonymousClass0nB.A01(context);
        if (context instanceof Activity) {
            A01 -= AnonymousClass72t.A00((Activity) context);
        }
        return (A01 - i2) / 3;
    }

    public static final Size A01(Context context, float f) {
        0qQ.A0B(context, 0);
        return new Size(A00(context), AnonymousClass1GB.A01(((float) A00(context)) / f));
    }
}
