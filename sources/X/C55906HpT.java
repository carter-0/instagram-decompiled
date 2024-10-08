package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.HpT  reason: case insensitive filesystem */
public final class C55906HpT {
    public final float A00(Context context, boolean z) {
        Context context2 = context;
        Resources resources = context.getResources();
        Typeface typeface = Typeface.SANS_SERIF;
        float A01 = (float) 0mq.A01(context2, typeface, resources.getText(2131952361), 1.28f, resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material), 0nA.A09(context) - (resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2));
        Resources resources2 = context.getResources();
        float A012 = (float) 0mq.A01(context2, typeface, resources2.getText(2131952366), 1.07f, (int) TypedValue.applyDimension(2, 26.0f, AnonymousClass7TF.A0E(context)), 0nA.A09(context) - (resources2.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 4));
        float A08 = (float) 0nA.A08(context);
        float f = A01 + A012;
        float f2 = 0.38f;
        if (z) {
            f2 = 0.54f;
        }
        return Math.min(f + (f2 * A08), A08);
    }
}
