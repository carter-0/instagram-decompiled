package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.instagram.android.R;

/* renamed from: X.8jN  reason: invalid class name and case insensitive filesystem */
public final class C363228jN {
    public boolean A00;
    public final LayerDrawable A01;

    public C363228jN(Context context, Integer num) {
        Drawable[] drawableArr;
        Drawable drawable = context.getResources().getDrawable(R.drawable.instagram_guideline_safe_zone, (Resources.Theme) null);
        if (drawable != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), 1MF.A0D(drawable));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
            int intValue = num.intValue();
            int i = 3;
            if (intValue == 0) {
                i = 80;
            } else if (intValue == 1) {
                i = 48;
            } else if (intValue == 2) {
                i = 5;
            }
            drawableArr = new Drawable[]{bitmapDrawable, new C363208jL(context, dimensionPixelSize, R.color.netego_su_background_gradient_end_4, i)};
        } else {
            drawableArr = new Drawable[0];
        }
        this.A01 = new LayerDrawable(drawableArr);
    }
}
