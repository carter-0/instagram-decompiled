package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.instagram.android.R;

/* renamed from: X.7L1  reason: invalid class name */
public final class AnonymousClass7L1 {
    public final int A00;
    public final Context A01;
    public final AnonymousClass7I8 A02;

    public final Drawable A00(int[] iArr, int i) {
        Drawable drawable = this.A01.getDrawable(i);
        if (drawable != null) {
            int[] iArr2 = iArr;
            int length = iArr.length;
            if (length == 0) {
                drawable.setColorFilter(this.A00, PorterDuff.Mode.SRC_IN);
                return drawable;
            } else if (length != 1) {
                ShapeDrawable shapeDrawable = new ShapeDrawable();
                RectShape rectShape = new RectShape();
                int A002 = this.A02.A00();
                Paint.Style style = Paint.Style.FILL;
                C308486Ul.A01(C14045Tom.A00(drawable), Paint.Cap.BUTT, style, shapeDrawable, rectShape, iArr2, (float) A002, 0.0f).Eov(0);
                return shapeDrawable;
            } else {
                drawable.setColorFilter(iArr[0], PorterDuff.Mode.SRC_IN);
                return drawable;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AnonymousClass7L1(Context context) {
        this.A01 = context;
        this.A02 = new AnonymousClass7I8(context);
        this.A00 = 2Yu.A0F(context, R.attr.cyanBubbleBackground);
    }
}
