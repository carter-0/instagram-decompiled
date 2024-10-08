package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.7BG  reason: invalid class name */
public abstract class AnonymousClass7BG {
    public static final void A01(FrameLayout frameLayout, ImageView imageView, AnonymousClass7L0 r8, int i, boolean z, boolean z2) {
        0qQ.A0B(imageView, 0);
        Context context = imageView.getContext();
        0qQ.A0A(context);
        imageView.setBackground(A00(context, frameLayout, r8, i, z, false, z2));
        if (imageView.getDrawable() != null && r8 != null && !z2) {
            imageView.getDrawable().setColorFilter(AnonymousClass37O.A00(r8.A05));
        }
    }

    public static final void A02(ImageView imageView, int i, boolean z) {
        0qQ.A0B(imageView, 0);
        Context context = imageView.getContext();
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            if (z) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_icon)), PorterDuff.Mode.SRC_IN));
            } else {
                drawable.setColorFilter(context.getColor(R.color.design_dark_default_color_on_background), PorterDuff.Mode.SRC_IN);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static final ShapeDrawable A00(Context context, FrameLayout frameLayout, AnonymousClass7L0 r13, int i, boolean z, boolean z2, boolean z3) {
        Shape ovalShape;
        AnonymousClass7I8 r0 = new AnonymousClass7I8(context);
        if (z2) {
            ovalShape = new AnonymousClass7BX(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        } else {
            ovalShape = new OvalShape();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        if (z3) {
            int color = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_background));
            C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, color);
        } else if (r13 != null) {
            int[] iArr = r13.A0K;
            int length = iArr.length;
            if (length == 0) {
                int A0F = 2Yu.A0F(context, R.attr.cyanBubbleBackground);
                C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, A0F);
                return shapeDrawable;
            } else if (length == 1) {
                int i2 = iArr[0];
                C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, i2);
                return shapeDrawable;
            } else {
                Shape shape = shapeDrawable.getShape();
                Paint.Style style = Paint.Style.FILL;
                AnonymousClass7OE A01 = C308486Ul.A01((Bitmap) null, Paint.Cap.BUTT, style, shapeDrawable, shape, iArr, (float) r0.A00(), 0.0f);
                if (!z) {
                    A01.Eov((r0.A00() - frameLayout.getHeight()) - i);
                    return shapeDrawable;
                }
            }
        }
        return shapeDrawable;
    }
}
