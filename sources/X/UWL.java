package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public final class UWL extends C309336Xw {
    public float A00;
    public float A01;
    public float A02;

    public static void A00(Canvas canvas, Paint paint, RectF rectF, float f, float f2, float f3, boolean z) {
        Canvas canvas2 = canvas;
        canvas.save();
        canvas.translate(f3, 0.0f);
        if (!z) {
            canvas.rotate(180.0f);
        }
        float f4 = ((-f) / 2.0f) + f2;
        float f5 = (f / 2.0f) - f2;
        Paint paint2 = paint;
        canvas2.drawRect(-f2, f4, 0.0f, f5, paint2);
        canvas2.save();
        canvas2.translate(0.0f, f4);
        Canvas canvas3 = canvas2;
        Paint paint3 = paint2;
        canvas3.drawArc(rectF, 180.0f, 90.0f, true, paint3);
        canvas2.restore();
        canvas2.translate(0.0f, f5);
        canvas3.drawArc(rectF, 180.0f, -90.0f, true, paint3);
        canvas2.restore();
    }

    public final int A02() {
        return -1;
    }

    public final int A01() {
        return this.A00.A04;
    }

    public final void A04(Canvas canvas, Paint paint) {
        int A012 = C18108Vlc.A01(this.A00.A02, this.A01.A01);
        float f = ((-this.A00) / 2.0f) + this.A01;
        float f2 = -f;
        Paint paint2 = paint;
        AnonymousClass7TE.A1Q(paint2);
        paint2.setAntiAlias(true);
        paint2.setColor(A012);
        float f3 = this.A02;
        Canvas canvas2 = canvas;
        canvas2.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint2);
        float f4 = this.A01;
        float f5 = -f4;
        RectF rectF = new RectF(f5, f5, f4, f4);
        A00(canvas2, paint2, rectF, this.A02, this.A01, f, true);
        A00(canvas2, paint2, rectF, this.A02, this.A01, f2, false);
    }

    public final void A05(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            float f3 = this.A00;
            float f4 = this.A01;
            float f5 = ((-f3) / 2.0f) + f4;
            float f6 = f3 - (f4 * 2.0f);
            float f7 = f5 + (f6 * f);
            float f8 = f5 + (f6 * f2);
            Paint paint2 = paint;
            AnonymousClass7TE.A1Q(paint2);
            paint2.setAntiAlias(true);
            paint2.setColor(i);
            float f9 = this.A02;
            Canvas canvas2 = canvas;
            canvas2.drawRect(f7, (-f9) / 2.0f, f8, f9 / 2.0f, paint2);
            float f10 = this.A01;
            float f11 = -f10;
            RectF rectF = new RectF(f11, f11, f10, f10);
            A00(canvas2, paint2, rectF, this.A02, this.A01, f7, true);
            A00(canvas2, paint2, rectF, this.A02, this.A01, f8, false);
        }
    }

    public final void A03(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.A00 = (float) clipBounds.width();
        C309276Xq r3 = this.A00;
        float f2 = (float) r3.A04;
        canvas.translate(((float) clipBounds.left) + (((float) clipBounds.width()) / 2.0f), ((float) clipBounds.top) + (((float) clipBounds.height()) / 2.0f) + Math.max(0.0f, ((float) (clipBounds.height() - r3.A04)) / 2.0f));
        if (((UWK) r3).A02) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.A01.A02() && r3.A01 == 1) || (this.A01.A01() && r3.A00 == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.A01.A02() || this.A01.A01()) {
            canvas.translate(0.0f, (((float) r3.A04) * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.A00;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.A02 = ((float) r3.A04) * f;
        this.A01 = ((float) r3.A03) * f;
    }
}
