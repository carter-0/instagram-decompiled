package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.3OH  reason: invalid class name */
public final class AnonymousClass3OH extends AnonymousClass3OI {
    public final float A00;
    public final float A01;
    public final float A02;
    public final Boolean A03;

    public final void A00(Canvas canvas, Paint paint) {
        0qQ.A0B(paint, 1);
        Boolean bool = this.A03;
        if (bool != null) {
            boolean isAntiAlias = paint.isAntiAlias();
            paint.setAntiAlias(bool.booleanValue());
            canvas.drawCircle(this.A00, this.A01, this.A02, paint);
            paint.setAntiAlias(isAntiAlias);
            return;
        }
        canvas.drawCircle(this.A00, this.A01, this.A02, paint);
    }

    public AnonymousClass3OH(Boolean bool, float f, float f2, float f3) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = bool;
    }
}
