package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;

/* renamed from: X.8Q9  reason: invalid class name */
public final class AnonymousClass8Q9 {
    public final Context A00;
    public final CameraToolMenuItem A01;

    public AnonymousClass8Q9(CameraToolMenuItem cameraToolMenuItem) {
        CameraToolMenuItem cameraToolMenuItem2 = cameraToolMenuItem;
        0qQ.A0B(cameraToolMenuItem2, 1);
        this.A01 = cameraToolMenuItem2;
        this.A00 = cameraToolMenuItem2.getContext();
        Drawable drawable = cameraToolMenuItem2.A05;
        drawable = drawable == null ? cameraToolMenuItem2.A04 : drawable;
        0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -16777216});
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(0);
        layerDrawable.setDrawableByLayerId(R.id.fill, gradientDrawable);
        Context context = this.A00;
        float A04 = 0nA.A04(context, 34);
        float A042 = 0nA.A04(context, 2);
        float A043 = 0nA.A04(context, 2);
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.shadow);
        0qQ.A0C(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) findDrawableByLayerId).setGradientRadius((A04 + (2.0f * A043)) / 2.0f);
        int i = (int) A043;
        layerDrawable.setLayerInset(1, i, i, i, i);
        int i2 = (int) (A043 + A042);
        layerDrawable.setLayerInset(2, i2, i2, i2, i2);
        layerDrawable.invalidateSelf();
    }
}
