package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.WeakHashMap;

public final class OJ0 {
    public final C71090Oc5 A00(ImageView imageView) {
        ImageView imageView2 = imageView;
        0qQ.A0B(imageView2, 0);
        WeakHashMap weakHashMap = C71090Oc5.A0D;
        C71090Oc5 oc5 = (C71090Oc5) weakHashMap.get(imageView2.getDrawable());
        if (oc5 != null) {
            return oc5;
        }
        Context A0S = AnonymousClass7TE.A0S(imageView2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new C67652Mrf(0.0f));
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C67652Mrf(1.0f));
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new C67652Mrf(1.0f));
        int dimensionPixelSize = A0S.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        int A02 = AnonymousClass7TG.A02(A0S);
        float dimension = A0S.getResources().getDimension(R.dimen.afi_indicator_arrow_margin_top);
        int A08 = JTR.A08(A0S);
        int i = (dimensionPixelSize - A02) / 2;
        int A0F = 2Yu.A0F(A0S, R.attr.textColorPrimary);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(A0F, PorterDuff.Mode.SRC_IN);
        shapeDrawable2.setIntrinsicWidth(dimensionPixelSize);
        shapeDrawable2.setIntrinsicHeight(dimensionPixelSize);
        shapeDrawable3.setIntrinsicWidth(dimensionPixelSize);
        shapeDrawable3.setIntrinsicHeight(dimensionPixelSize);
        shapeDrawable3.setAlpha(0);
        Paint.Style style = Paint.Style.STROKE;
        Paint.Cap cap = Paint.Cap.ROUND;
        C308486Ul.A02(style, shapeDrawable2, shapeDrawable2.getShape(), dimension, A0F);
        ShapeDrawable shapeDrawable4 = shapeDrawable3;
        Paint.Style style2 = style;
        C308486Ul.A01((Bitmap) null, cap, style2, shapeDrawable4, shapeDrawable3.getShape(), new int[]{2Yu.A0F(A0S, R.attr.textColorTertiary), 2Yu.A0F(A0S, R.attr.textColorSecondary)}, (float) shapeDrawable3.getIntrinsicHeight(), dimension);
        Drawable drawable = A0S.getDrawable(R.drawable.instagram_play_filled_16);
        if (drawable != null) {
            Drawable drawable2 = A0S.getDrawable(R.drawable.instagram_pause_filled_16);
            if (drawable2 != null) {
                drawable2.mutate().setColorFilter(porterDuffColorFilter);
                drawable.mutate().setColorFilter(porterDuffColorFilter);
                drawable.mutate().setAlpha(255);
                drawable2.mutate().setAlpha(0);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable3, shapeDrawable, drawable2, drawable});
                layerDrawable.setPaddingMode(1);
                layerDrawable.setLayerInset(3, i, i, i, i);
                LayerDrawable layerDrawable2 = layerDrawable;
                layerDrawable2.setLayerInset(4, i + A08, i, i - A08, i);
                C71090Oc5 oc52 = new C71090Oc5(A0S, drawable, drawable2, shapeDrawable, shapeDrawable2, shapeDrawable3);
                imageView2.setImageDrawable(layerDrawable);
                weakHashMap.put(layerDrawable, oc52);
                return oc52;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
