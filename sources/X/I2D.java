package X;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

public abstract class I2D {
    @Deprecated(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @ReplaceWith(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    public static final Rect A00(AnonymousClass5VN r5) {
        return new Rect((int) r5.A01, (int) r5.A03, (int) r5.A02, (int) r5.A00);
    }

    public static final RectF A01(AnonymousClass5VN r5) {
        return new RectF(r5.A01, r5.A03, r5.A02, r5.A00);
    }

    public static final AnonymousClass5VN A02(RectF rectF) {
        return new AnonymousClass5VN(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
