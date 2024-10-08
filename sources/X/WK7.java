package X;

import android.graphics.Canvas;
import android.graphics.Paint;

public final class WK7 implements C300985yH {
    public final Paint A00;
    public final Paint A01;
    public final C17607Vaz A02;
    public final C17607Vaz A03;

    public WK7(C17607Vaz vaz, C17607Vaz vaz2) {
        int i;
        this.A02 = vaz;
        this.A03 = vaz2;
        Paint paint = new Paint();
        int i2 = 0;
        if (vaz != null) {
            i = vaz.A03;
        } else {
            i = 0;
        }
        paint.setColor(i);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.A00 = paint;
        Paint paint2 = new Paint();
        paint2.setColor(vaz2 != null ? vaz2.A03 : i2);
        paint2.setStyle(style);
        this.A01 = paint2;
    }

    public static final void A00(Canvas canvas, Paint paint, C17607Vaz vaz) {
        int i;
        int i2;
        int width = canvas.getWidth();
        String str = vaz.A04;
        if (0qQ.A0K(str, "start")) {
            i = 0;
        } else if (0qQ.A0K(str, "end")) {
            i = width;
        } else {
            i = width / 2;
        }
        float min = Math.min(Math.max(0.0f, ((float) i) + vaz.A00), (float) width);
        int height = canvas.getHeight();
        String str2 = vaz.A06;
        if (0qQ.A0K(str2, "start")) {
            i2 = 0;
        } else if (0qQ.A0K(str2, "end")) {
            i2 = height;
        } else {
            i2 = height / 2;
        }
        float min2 = Math.min(Math.max(0.0f, ((float) i2) + vaz.A02), (float) height);
        if (0qQ.A0K(vaz.A05, "circle")) {
            canvas.drawCircle(min, min2, vaz.A01, paint);
        }
    }
}
