package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;

public final class U0t extends Drawable {
    public float A00 = 4.0f;
    public float A01 = 1.5f;
    public final Paint A02;
    public final Paint A03;
    public final StaticLayout A04;

    public final void draw(Canvas canvas) {
        int i = 0;
        0qQ.A0B(canvas, 0);
        Rect A0X = AnonymousClass7TE.A0X(this);
        int height = A0X.height();
        int width = A0X.width();
        int i2 = height / 2;
        StaticLayout staticLayout = this.A04;
        if (staticLayout != null) {
            i = staticLayout.getHeight();
        }
        int i3 = (height - i) / 2;
        int A022 = (width - AnonymousClass6M0.A02(staticLayout)) / 2;
        Resources system = Resources.getSystem();
        0qQ.A07(system);
        int A002 = AnonymousClass2eF.A00(system, 3.0f);
        float f = (float) i2;
        canvas.drawRoundRect(new RectF((float) A0X.left, (float) A0X.top, (float) A0X.right, (float) A0X.bottom), f, f, this.A02);
        canvas.drawRoundRect(new RectF((float) (A0X.left + A002), (float) (A0X.top + A002), (float) (A0X.right - A002), (float) (A0X.bottom - A002)), f, f, this.A03);
        canvas.save();
        canvas.translate((float) (A0X.left + A022), (float) (A0X.top + i3));
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getMinimumHeight() {
        int i;
        Resources system = Resources.getSystem();
        0qQ.A07(system);
        int A002 = AnonymousClass2eF.A00(system, 3.0f);
        float f = this.A01;
        Resources system2 = Resources.getSystem();
        0qQ.A07(system2);
        int A003 = AnonymousClass2eF.A00(system2, f) * 2;
        StaticLayout staticLayout = this.A04;
        if (staticLayout != null) {
            i = staticLayout.getHeight();
        } else {
            i = 0;
        }
        return A003 + i + (A002 * 2);
    }

    public final int getMinimumWidth() {
        Resources system = Resources.getSystem();
        0qQ.A07(system);
        int A002 = AnonymousClass2eF.A00(system, 3.0f);
        float f = this.A00;
        Resources system2 = Resources.getSystem();
        0qQ.A07(system2);
        return (AnonymousClass2eF.A00(system2, f) * 2) + AnonymousClass6M0.A02(this.A04) + (A002 * 2);
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int minimumWidth = getMinimumWidth();
        if (minimumWidth > i5) {
            int i6 = (minimumWidth - i5) / 2;
            i -= i6;
            i3 += i6;
        }
        super.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public U0t(String str, int i, int i2, int i3) {
        Paint paint = new Paint();
        this.A03 = paint;
        Paint paint2 = new Paint();
        this.A02 = paint2;
        paint.setAntiAlias(true);
        paint.setColor(i2);
        paint2.setAntiAlias(true);
        paint2.setColor(i3);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        Resources system = Resources.getSystem();
        0qQ.A07(system);
        textPaint.setTextSize((float) ((int) Math.ceil((double) TypedValue.applyDimension(2, 8.0f, system.getDisplayMetrics()))));
        textPaint.setTypeface(Typeface.create("roboto-medium", 1));
        textPaint.setColor(i);
        this.A04 = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }
}
