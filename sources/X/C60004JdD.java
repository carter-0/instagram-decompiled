package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.JdD  reason: case insensitive filesystem */
public final class C60004JdD extends Drawable implements C252203oj {
    public float A00;
    public String A01;
    public boolean A02;
    public final 2cs A03;
    public final Paint A04;
    public final Path A05;
    public final Rect A06 = AnonymousClass7TE.A0W();
    public final RectF A07 = AnonymousClass7TE.A0Y();
    public final TextPaint A08;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final int getOpacity() {
        return 1;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        if (this.A00 != 0.0f) {
            Canvas canvas2 = canvas;
            int width = canvas2.getWidth();
            float height = (float) canvas2.getHeight();
            float f = height / 2.0f;
            float min = (float) Math.min(Math.max(AnonymousClass37Q.A01((double) this.A00, 1.0d), 0.0d), 1.0d);
            TextPaint textPaint = this.A08;
            String str = this.A01;
            int length = str.length();
            Rect rect = this.A06;
            textPaint.getTextBounds(str, 0, length, rect);
            float f2 = (float) width;
            float f3 = f2 - height;
            this.A01 = TextUtils.ellipsize(this.A01, textPaint, f3, TextUtils.TruncateAt.END).toString();
            float f4 = f3 * min;
            float f5 = ((f2 - f4) / 2.0f) - f;
            float f6 = f2 / 2.0f;
            int A052 = AnonymousClass7TE.A05(min, 255.0f);
            boolean z = this.A02;
            Paint paint = this.A04;
            int i = 255;
            if (z) {
                i = 179;
            }
            paint.setAlpha(i);
            textPaint.setAlpha(i);
            Path path = this.A05;
            path.reset();
            RectF rectF = this.A07;
            rectF.set(0.0f, 0.0f, height, height);
            path.arcTo(rectF, 90.0f, 180.0f, false);
            path.moveTo(f, 0.0f);
            rectF.set(f4, 0.0f, f4 + height, height);
            path.arcTo(rectF, 270.0f, 180.0f, false);
            path.lineTo(f, height);
            path.offset(f5, 0.0f);
            Canvas canvas3 = canvas2;
            canvas3.drawPath(path, paint);
            canvas3.clipPath(path);
            textPaint.setAlpha(A052);
            canvas2.drawText(this.A01, f6, f - ((float) rect.centerY()), textPaint);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z = this.A02;
        this.A02 = false;
        boolean z2 = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 16842919 || i2 == 16842908) {
                this.A02 = true;
                z2 = true;
            } else {
                i++;
            }
        }
        if (z2 == z) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public C60004JdD(String str, float f, int i, int i2) {
        this.A01 = str;
        TextPaint textPaint = new TextPaint();
        this.A08 = textPaint;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        this.A05 = C51965G9l.A0C();
        Paint A0C = JTO.A0C();
        this.A04 = A0C;
        A0C.setColor(i2);
        A0C.setAntiAlias(true);
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(C71392co.A04(30.0d, 7.0d));
        A0J.A06 = true;
        A0J.A0A(this);
        this.A03 = A0J;
    }

    public final void DmE(2cs r2) {
        this.A00 = JTO.A03(r2);
        invalidateSelf();
    }
}
