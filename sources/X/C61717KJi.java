package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.KJi  reason: case insensitive filesystem */
public final class C61717KJi extends C59974Jcj {
    public final int A00;
    public final Paint A01;
    public final RectF A02 = AnonymousClass7TE.A0Y();

    public final void draw(Canvas canvas) {
        RectF rectF = this.A02;
        float f = (float) this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A01);
        super.draw(canvas);
    }

    public C61717KJi(Resources resources, Drawable drawable) {
        super(drawable);
        Paint A0D = JTP.A0D();
        this.A01 = A0D;
        this.A00 = JTP.A03(resources);
        A0D.setColor(-16777216);
        AnonymousClass7TE.A1Q(A0D);
        drawable.getClass();
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A02.set(rect);
    }
}
