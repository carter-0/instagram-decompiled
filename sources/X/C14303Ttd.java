package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.Ttd  reason: case insensitive filesystem */
public final class C14303Ttd extends Drawable {
    public Bitmap A00;
    public String A01;
    public final float A02;
    public final Paint A03 = new Paint();
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new C73901Plc(this, 1));
    public final Rect A05 = new Rect();
    public final RectF A06 = new RectF();
    public final VWJ A07 = new VWJ();

    public final void A00(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            this.A00 = null;
        } else if (!str.equals(this.A01)) {
            try {
                VWJ vwj = this.A07;
                float f = this.A02;
                Paint paint = vwj.A01;
                paint.setTextSize(f);
                Rect rect = vwj.A02;
                paint.getTextBounds(str, 0, length, rect);
                Bitmap A0B = AnonymousClass7TF.A0B(rect.width(), rect.height());
                Canvas canvas = vwj.A00;
                canvas.setBitmap(A0B);
                canvas.drawText(str, -((float) rect.left), -((float) rect.top), paint);
                this.A00 = A0B;
            } catch (IllegalArgumentException e) {
                0wb.A04("EmojiDrawable_IllegalArgumentException", 002.A0v("emoji: ", str, " [", e.getMessage(), ']'), 1);
                ((Paint) this.A04.getValue()).getTextBounds(str, 0, length, this.A05);
            }
        }
        this.A01 = str;
    }

    public final void draw(Canvas canvas) {
        boolean quickReject;
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A06;
        if (Build.VERSION.SDK_INT >= 30) {
            quickReject = canvas.quickReject(rectF);
        } else {
            quickReject = canvas.quickReject(rectF, Canvas.EdgeType.BW);
        }
        if (!quickReject) {
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, C66581MXm.A01(this) - (((float) bitmap.getWidth()) / 2.0f), getBounds().exactCenterY() - (((float) bitmap.getHeight()) / 2.0f), this.A03);
                return;
            }
            String str = this.A01;
            if (str != null) {
                float A012 = C66581MXm.A01(this);
                Rect rect = this.A05;
                float exactCenterX = A012 - rect.exactCenterX();
                float exactCenterY = getBounds().exactCenterY() - rect.exactCenterY();
                AnonymousClass0eM r3 = this.A04;
                Paint paint = this.A03;
                ((Paint) r3.getValue()).setAlpha(paint.getAlpha());
                ((Paint) r3.getValue()).setColorFilter(paint.getColorFilter());
                canvas.drawText(str, exactCenterX, exactCenterY, (Paint) r3.getValue());
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }

    public final int getAlpha() {
        return this.A03.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.A03.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return this.A05.height();
    }

    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return this.A05.width();
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }

    public C14303Ttd(float f) {
        this.A02 = f;
    }
}
