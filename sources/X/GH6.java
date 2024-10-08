package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class GH6 implements AnonymousClass2WK {
    public final Drawable A00;
    public final ImageView.ScaleType A01;

    public GH6(Drawable drawable, ImageView.ScaleType scaleType) {
        0qQ.A0B(drawable, 1);
        this.A00 = drawable;
        this.A01 = scaleType;
    }

    public final 2WL Cfk(2WI r5, long j) {
        0qQ.A0B(r5, 0);
        ImageView imageView = (ImageView) GH5.A04.A00(r5.A00.A04);
        imageView.setImageDrawable(this.A00);
        ImageView.ScaleType scaleType = this.A01;
        if (scaleType != null) {
            imageView.setScaleType(scaleType);
        }
        imageView.measure(C245063cG.A01(j), C245063cG.A00(j));
        return new 2WL(C245133cN.A00(Math.max(C245073cH.A03(j), imageView.getMeasuredWidth()), Math.max(C245073cH.A02(j), imageView.getMeasuredHeight())), (Object) null);
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
