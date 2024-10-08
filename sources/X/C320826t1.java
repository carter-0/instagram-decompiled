package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.6t1  reason: invalid class name and case insensitive filesystem */
public abstract class C320826t1 {
    public static final C320836t2 A00(Context context, int i, boolean z) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i2 = dimensionPixelSize % 3;
        if (i2 != 0) {
            dimensionPixelSize += 3 - i2;
        }
        return new C320836t2(dimensionPixelSize, z, i);
    }
}
