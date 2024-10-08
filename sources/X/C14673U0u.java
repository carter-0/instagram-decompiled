package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;

/* renamed from: X.U0u  reason: case insensitive filesystem */
public final class C14673U0u extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Context A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Rect A0C;
    public final RectF A0D;
    public final Drawable A0E;
    public final TextPaint A0F;
    public final Integer A0G;
    public final boolean A0H;

    public C14673U0u(Context context, Integer num) {
        this.A09 = context;
        this.A0G = num;
        this.A06 = 0nA.A00(context, 24.0f);
        this.A07 = 0nA.A00(context, 6.0f);
        this.A01 = 0nA.A00(context, 14.0f);
        this.A00 = 0nA.A00(context, 18.0f);
        this.A02 = 0nA.A00(context, 5.0f);
        this.A03 = 0nA.A00(context, 100.0f);
        float A002 = 0nA.A00(context, 1.5f);
        this.A04 = A002;
        this.A05 = 0nA.A00(context, 10.0f);
        Drawable drawable = context.getDrawable(R.drawable.instagram_shopping_cart_pano_outline_24);
        if (drawable != null) {
            DbX.A11(context, drawable, 2Yu.A0B(context));
        } else {
            drawable = null;
        }
        this.A0E = drawable;
        boolean z = true;
        Paint paint = new Paint(1);
        JTO.A1N(paint);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0B(context));
        paint.setStrokeWidth(A002);
        this.A0A = paint;
        TextPaint textPaint = new TextPaint(1);
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A0B(context));
        textPaint.setTextSize(0nA.A00(context, 14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
        this.A0F = textPaint;
        Paint paint2 = new Paint(1);
        AnonymousClass7TE.A1Q(paint2);
        AnonymousClass7TE.A1N(context, paint2, 2Yu.A0C(context));
        this.A0B = paint2;
        this.A0D = new RectF();
        Rect rect = new Rect();
        this.A0C = rect;
        this.A08 = 0nA.A00(context, 8.0f);
        z = (num == null || num.intValue() <= 0) ? false : z;
        this.A0H = z;
        if (z) {
            textPaint.getTextBounds(String.valueOf(num), 0, String.valueOf(num).length(), rect);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        Drawable drawable = this.A0E;
        if (drawable != null) {
            int i = rect.left;
            int centerY = rect.centerY() - (drawable.getIntrinsicHeight() / 2);
            drawable.setBounds(i, centerY, rect.right - ((int) this.A06), drawable.getIntrinsicHeight() + centerY);
            if (this.A0H) {
                RectF rectF = this.A0D;
                C13988Tno.A0v(rectF, drawable);
                float f = rectF.top - (((float) ((int) this.A07)) + (this.A04 / 2.0f));
                rectF.top = f;
                float f2 = rectF.left + this.A01;
                rectF.left = f2;
                rectF.bottom = f + this.A00;
                float f3 = f2 + (this.A02 * 2.0f);
                float width = (float) this.A0C.width();
                float f4 = this.A08;
                if (width < f4) {
                    width = f4;
                }
                rectF.right = f3 + width;
            }
        }
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A0E;
        if (drawable != null) {
            return (int) (((float) drawable.getIntrinsicHeight()) + (this.A05 * 2.0f));
        }
        return 0;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.A0E;
        if (drawable != null) {
            return (int) (((float) drawable.getIntrinsicWidth()) + this.A06);
        }
        return 0;
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.A0B.setAlpha(i);
        this.A0A.setAlpha(i);
        this.A0F.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.A0F.setColorFilter(colorFilter);
        this.A0A.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (this.A0H) {
            RectF rectF = this.A0D;
            float f = this.A03;
            canvas.drawRoundRect(rectF, f, f, this.A0B);
            canvas.drawRoundRect(rectF, f, f, this.A0A);
            canvas.drawText(String.valueOf(this.A0G), rectF.centerX(), rectF.centerY() + C13988Tno.A01(this.A0C.height()), this.A0F);
        }
        canvas.restore();
    }
}
