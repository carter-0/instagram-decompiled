package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.instagram.android.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.VqY  reason: case insensitive filesystem */
public abstract class C18372VqY {
    public static final long A00 = TimeUnit.MILLISECONDS.toNanos(45);

    public static final WVS A00(Resources resources, Bitmap bitmap, AnonymousClass7EF r9) {
        return new WVS(bitmap, r9, (float) resources.getDimensionPixelSize(R.dimen.abc_control_corner_material), (float) resources.getDimensionPixelSize(R.dimen.shh_min_gravity), (float) resources.getDimensionPixelSize(R.dimen.shh_max_gravity), (float) AnonymousClass7TE.A0E(resources), (float) resources.getDimensionPixelSize(R.dimen.shh_max_pos_y_delta));
    }
}
