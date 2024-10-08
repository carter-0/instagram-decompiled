package X;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

public abstract class AE6 {
    public static final void A02(Canvas canvas, Paint paint, Font font, float[] fArr, int[] iArr, int i, int i2, int i3) {
        int[] iArr2 = iArr;
        int i4 = i;
        canvas.drawGlyphs(iArr2, i4, fArr, i2, i3, font, paint);
    }

    public static final void A00(Canvas canvas, NinePatch ninePatch, Paint paint, Rect rect) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static final void A01(Canvas canvas, NinePatch ninePatch, Paint paint, RectF rectF) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
