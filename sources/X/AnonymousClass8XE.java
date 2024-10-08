package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8XE  reason: invalid class name */
public abstract class AnonymousClass8XE {
    public static final Map A00 = new HashMap();

    public static final int A02(Context context) {
        0qQ.A0B(context, 0);
        return (AnonymousClass0nB.A01(context) - (context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) * 2)) / 3;
    }

    public static final String A04(Integer num) {
        0qQ.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue == 0) {
            return "W,1:1";
        }
        if (intValue == 1) {
            return "W,16:9";
        }
        throw new RuntimeException();
    }

    public static final Matrix A03(int i, int i2, int i3, int i4, int i5) {
        Rect rect;
        int i6 = i2;
        int i7 = i3;
        if (i % 180 == 90) {
            i6 = i3;
            i7 = i2;
        }
        float f = (((float) i6) * 1.0f) / ((float) i7);
        float f2 = (float) i4;
        float f3 = (float) i5;
        boolean z = true;
        boolean z2 = false;
        if (f2 / f3 <= f) {
            z2 = true;
        }
        boolean z3 = false;
        if (f > 0.75f) {
            z3 = true;
        }
        if (z2 != z3) {
            z = false;
        }
        if (z) {
            int i8 = (int) ((f2 / f) + 0.5f);
            int i9 = (int) (((float) (i5 - i8)) / 2.0f);
            rect = new Rect(0, i9, i4, i8 + i9);
        } else {
            int i10 = (int) ((f3 * f) + 0.5f);
            int i11 = (int) (((float) (i4 - i10)) / 2.0f);
            rect = new Rect(i11, 0, i10 + i11, i5);
        }
        Matrix matrix = new Matrix();
        RectF rectF = new RectF(0.0f, 0.0f, (float) i2, (float) i3);
        int i12 = i % 360;
        if (i12 != 0) {
            matrix.setRotate((float) i);
            matrix.mapRect(rectF);
        }
        matrix.setRectToRect(rectF, new RectF(rect), Matrix.ScaleToFit.CENTER);
        if (i12 != 0) {
            matrix.preRotate((float) i);
        }
        return matrix;
    }

    public static final int A00(Context context) {
        return AnonymousClass1GB.A01(((float) ((AnonymousClass8XF.A01(context) - (context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) * 2)) / 3)) / 0.5625f);
    }

    public static final int A01(Context context) {
        return (AnonymousClass8XF.A01(context) - (context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) * 2)) / 3;
    }

    public static final boolean A05(ImageView imageView, Medium medium) {
        if (imageView.getDrawable() instanceof BitmapDrawable) {
            Drawable drawable = imageView.getDrawable();
            0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            if (((BitmapDrawable) drawable).getBitmap() == null || !medium.isValid()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
