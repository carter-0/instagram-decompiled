package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* renamed from: X.MlN  reason: case insensitive filesystem */
public final class C67288MlN extends Drawable {
    public final TextPaint A00;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Rect A0X = AnonymousClass7TE.A0X(this);
        canvas.save();
        canvas.rotate(25.0f);
        char[] chars = Character.toChars(127936);
        0qQ.A07(chars);
        canvas.drawText(new String(chars), (float) A0X.centerX(), (float) A0X.centerY(), this.A00);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C67288MlN() {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(36.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.A00 = textPaint;
    }
}
