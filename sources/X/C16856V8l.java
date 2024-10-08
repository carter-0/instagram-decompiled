package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.android.R;

/* renamed from: X.V8l  reason: case insensitive filesystem */
public abstract class C16856V8l {
    public static final int A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int A02 = AnonymousClass7TF.A02(context, R.dimen.photo_grid_spacing);
        DisplayMetrics A0H = 0nA.A0H(context);
        0qQ.A0B(A0H, 0);
        return (int) ((((float) ((AnonymousClass0nB.A01(context) - (dimensionPixelSize * 2)) / 3)) / (((float) A0H.widthPixels) / ((float) A0H.heightPixels))) + ((float) A02));
    }
}
