package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.KJk  reason: case insensitive filesystem */
public final class C61719KJk extends C59974Jcj {
    public int A00 = -1;
    public final Paint A01;
    public final Path A02;
    public final Rect A03 = AnonymousClass7TE.A0W();
    public final RectF A04 = AnonymousClass7TE.A0Y();
    public final String A05;

    public final void draw(Canvas canvas) {
        String str = this.A05;
        int i = 255;
        if (str != null) {
            i = 128;
        }
        setAlpha(i);
        super.draw(canvas);
        Drawable drawable = this.A00;
        Paint paint = this.A01;
        if (drawable != null) {
            paint.setColor(-16777216);
            canvas.drawPath(this.A02, paint);
        } else {
            paint.setColor(-16777216);
            canvas.drawRect(this.A04, paint);
        }
        if (str != null) {
            paint.setColor(this.A00);
            paint.setFakeBoldText(true);
            paint.setTextSize(((float) JTP.A06(this)) * 0.18f);
            int length = str.length();
            Rect rect = this.A03;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawText(str, (float) getBounds().centerX(), ((float) (getBounds().top + (JTP.A06(this) / 2))) + ((float) (rect.height() / 2)), paint);
        }
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
        RectF rectF = this.A04;
        rectF.set(rect);
        Path path = this.A02;
        path.reset();
        path.addRect(rectF, Path.Direction.CW);
        path.addRect(rectF, Path.Direction.CCW);
    }

    public C61719KJk(Drawable drawable, String str) {
        super(drawable);
        Paint A0D = JTP.A0D();
        this.A01 = A0D;
        Path A0C = C51965G9l.A0C();
        this.A02 = A0C;
        A0C.setFillType(Path.FillType.EVEN_ODD);
        this.A05 = str;
        A0D.setTextAlign(Paint.Align.CENTER);
        A0D.setStrokeWidth(1.0f);
    }
}
