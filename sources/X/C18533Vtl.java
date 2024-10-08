package X;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import com.instagram.android.R;

/* renamed from: X.Vtl  reason: case insensitive filesystem */
public final class C18533Vtl {
    public static final C18533Vtl A00 = new Object();

    public final Size A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        int i2 = dimensionPixelSize * 2;
        int A01 = AnonymousClass0nB.A01(context);
        boolean z = context instanceof Activity;
        if (z) {
            A01 -= AnonymousClass72t.A00((Activity) context);
        }
        int i3 = (A01 - i2) / 3;
        int A02 = AnonymousClass7TF.A02(context, R.dimen.photo_grid_spacing);
        int i4 = A02 % 3;
        if (i4 != 0) {
            A02 += 3 - i4;
        }
        int i5 = A02 * 2;
        int A012 = AnonymousClass0nB.A01(context);
        if (z) {
            A012 -= AnonymousClass72t.A00((Activity) context);
        }
        return new Size(i3, JTO.A05((float) ((A012 - i5) / 3), 0.75f));
    }
}
