package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.LHs  reason: case insensitive filesystem */
public abstract class C63994LHs {
    public static final int A01(Context context, boolean z) {
        0qQ.A0B(context, 0);
        int A00 = A00(context, C62592KiP.FILTER);
        if (z) {
            A00 /= 3;
        }
        return A00 - (context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material) * 2);
    }

    public static final int A00(Context context, C62592KiP kiP) {
        AnonymousClass7TG.A1N(context, kiP);
        float f = kiP.A00;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        Resources resources = context.getResources();
        if (i <= 0) {
            return resources.getDimensionPixelOffset(R.dimen.album_preview_add_item_circle_size);
        }
        return (int) (Math.ceil((double) ((((float) (AnonymousClass0nB.A01(context) - resources.getDimensionPixelOffset(R.dimen.afi_margin_top))) / f) / 4.0f)) * 4.0d);
    }
}
