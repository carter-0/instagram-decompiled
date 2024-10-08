package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import java.util.List;

/* renamed from: X.9qU  reason: invalid class name and case insensitive filesystem */
public final class C389949qU extends AnonymousClass91Q implements AnonymousClass6MR {
    public final RectF A00 = AnonymousClass7TE.A0Y();
    public final int[] A01;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.X6W, X.WUe] */
    public final X6W By4() {
        int[] iArr = this.A01;
        Integer num = this.A00;
        0qQ.A0B(iArr, 1);
        ? obj = new Object();
        obj.A01 = AnonymousClass7TE.A1C();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            List list = obj.A01;
            if (list != null) {
                list.add(Integer.valueOf(i2));
                i++;
            } else {
                0qQ.A0F("gradientColorsList");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        obj.A00 = num;
        return obj;
    }

    public C389949qU(Integer num, int[] iArr) {
        this.A01 = iArr;
        this.A00 = num;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        AnonymousClass7TG.A1N(canvas, paint);
        0qQ.A0B(charSequence, 7);
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        float f = (float) (i5 - i3);
        float f2 = 0.05f * f;
        RectF rectF = this.A00;
        float f3 = this.A01;
        float f4 = ((float) i4) + (f * 0.075f);
        rectF.set(f3, f4, f3 + this.A02, f4 + f2);
        TextPaint textPaint = this.A06;
        float f5 = this.A01;
        textPaint.setShader(new LinearGradient(f5, 0.0f, f5 + this.A02, 0.0f, this.A01, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRoundRect(rectF, f2, f2, textPaint);
    }
}
