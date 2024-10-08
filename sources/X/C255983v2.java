package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import com.instagram.android.R;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.3v2  reason: invalid class name and case insensitive filesystem */
public final class C255983v2 {
    public static final C255983v2 A00 = new Object();

    public static final boolean A00(Context context) {
        0qQ.A0B(context, 0);
        if (((float) AnonymousClass0nB.A01(context)) / ((float) AnonymousClass0nB.A00(context)) <= 0.5625f || !2Y9.A00) {
            return false;
        }
        return true;
    }

    public final Size A01(Context context, ExtendedImageUrl extendedImageUrl, int i, int i2) {
        0qQ.A0B(context, 0);
        Resources resources = context.getResources();
        if (extendedImageUrl == null) {
            return null;
        }
        float A01 = (float) AnonymousClass0nB.A01(context);
        if (2Y9.A02(AnonymousClass2YH.A00(resources.getConfiguration().screenWidthDp))) {
            A01 -= (float) resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        }
        float f = A01 - ((float) i2);
        float A002 = ((float) AnonymousClass0nB.A00(context)) - ((float) i);
        float width = ((float) extendedImageUrl.getWidth()) / ((float) extendedImageUrl.getHeight());
        float f2 = A002 * width;
        if (f2 > f) {
            A002 = f / width;
        } else {
            f = f2;
        }
        return new Size((int) f, (int) A002);
    }
}
