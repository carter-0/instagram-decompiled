package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.android.R;

/* renamed from: X.5aX  reason: invalid class name and case insensitive filesystem */
public abstract class C287645aX {
    public static final float A00(C286575Wy r1) {
        return A01(r1, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static final float A01(C286575Wy r4, int i) {
        if (0fL.A02()) {
            0fL.A01(-1605918876, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        C286565Wx r42 = (C286565Wx) r4;
        float dimension = ((Context) C286615Xc.A01(AndroidCompositionLocals_androidKt.A01, C286565Wx.A04(r42))).getResources().getDimension(i) / ((C268024cd) C286615Xc.A01(AnonymousClass5YA.A01, C286565Wx.A04(r42))).AwL();
        if (0fL.A02()) {
            0fL.A00(-1586844585);
        }
        return dimension;
    }
}
