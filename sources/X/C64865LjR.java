package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.LjR  reason: case insensitive filesystem */
public final class C64865LjR implements C262424Dq {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Resources A01;
    public final /* synthetic */ View A02;

    public C64865LjR(Resources resources, View view, float f) {
        this.A01 = resources;
        this.A02 = view;
        this.A00 = f;
    }

    public final void CyE(Bitmap bitmap) {
        Resources resources = this.A01;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int A04 = JTP.A04(resources);
        View view = this.A02;
        gradientDrawable.setStroke(A04, view.getContext().getColor(R.color.igds_photo_border));
        gradientDrawable.setCornerRadius(this.A00);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, gradientDrawable});
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        view.setBackground(layerDrawable);
    }
}
