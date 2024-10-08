package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TtN  reason: case insensitive filesystem */
public final class C14289TtN extends Drawable {
    public float A00;
    public ValueAnimator A01;
    public C18599Vuq A02;
    public C18599Vuq A03;
    public Integer A04;
    public final long A05;
    public final Context A06;
    public final Paint A07;
    public final Paint A08;
    public final RectF A09;
    public final Paint A0A;
    public final Rect A0B;
    public final Rect A0C;
    public final RectF A0D = new RectF();
    public final RectF A0E;
    public final TextPaint A0F;
    public final AnonymousClass0eM A0G;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static void A00(C14289TtN ttN) {
        ValueAnimator valueAnimator = ttN.A01;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            ttN.A01.removeAllListeners();
            ttN.A01.cancel();
            ttN.A01 = null;
        }
    }

    public final void A01() {
        C18599Vuq vuq = C18599Vuq.A01;
        if (this.A02 == null) {
            A00(this);
            this.A02 = vuq;
            this.A03 = null;
        } else if (this.A03 == null) {
            A00(this);
            if (!vuq.equals(this.A02)) {
                this.A03 = vuq;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat.setDuration(this.A05);
                ofFloat.addUpdateListener(new C71170Oej(this, 2));
                ofFloat.addListener(new C69202Nh0(this, 2));
                this.A01 = ofFloat;
                ofFloat.start();
                return;
            }
        } else {
            this.A03 = vuq;
            return;
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float f;
        C18599Vuq vuq = this.A02;
        if (vuq != null) {
            boolean A1W = AnonymousClass7TF.A1W(vuq.A00, C16493Uvp.STATUS);
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                f = 1.0f;
            } else {
                f = C13989Tnp.A02(this.A01);
            }
            Integer num = this.A04;
            int intValue = num.intValue();
            switch (num.intValue()) {
                case 2:
                case 3:
                case 6:
                    break;
                default:
                    canvas.drawOval(this.A0D, this.A07);
                    break;
            }
            if (A1W) {
                String str = null;
                str.getClass();
                TextPaint textPaint = this.A0F;
                textPaint.setTextSize(((float) JTP.A06(this)) * 0.175f * f);
                int length = str.length();
                Rect rect = this.A0C;
                textPaint.getTextBounds(str, 0, length, rect);
                RectF rectF = this.A0D;
                canvas.drawText(str, rectF.centerX(), rectF.centerY() - ((float) rect.centerY()), textPaint);
                return;
            }
            RectF rectF2 = new RectF(this.A0E);
            float f2 = 1.0f - f;
            rectF2.inset((rectF2.height() / 2.0f) * f2, (rectF2.height() / 2.0f) * f2);
            canvas.drawOval(rectF2, this.A0A);
        }
    }

    public final void onBoundsChange(Rect rect) {
        float f;
        RectF rectF;
        RectF rectF2;
        float f2;
        Rect rect2 = rect;
        super.onBoundsChange(rect2);
        float height = (float) rect2.height();
        Integer num = this.A04;
        switch (num.intValue()) {
            case 2:
                f = 1.8f;
                break;
            case 3:
            case 6:
                f = 1.0f;
                break;
            case 7:
                f = 3.0f;
                break;
            default:
                f = 0.45f;
                break;
        }
        float f3 = f * height;
        float f4 = (float) rect2.right;
        float f5 = f4 - f3;
        if (f5 <= 0.0f) {
            float abs = Math.abs(f5) / 2.0f;
            rectF = this.A0D;
            rectF.set((float) (Math.round((((float) rect2.left) - abs) / 2.0f) * 2), (float) (Math.round((((float) rect2.top) - abs) / 2.0f) * 2), (float) (Math.round((f4 + abs) / 2.0f) * 2), (float) (Math.round((((float) rect2.bottom) + abs) / 2.0f) * 2));
            rectF2 = this.A0E;
            rectF2.set((float) (Math.round((((float) rect2.left) - abs) / 2.0f) * 2), (float) (Math.round((((float) rect2.top) - abs) / 2.0f) * 2), (float) (Math.round((((float) rect2.right) + abs) / 2.0f) * 2), (float) (Math.round((((float) rect2.bottom) + abs) / 2.0f) * 2));
        } else {
            rectF = this.A0D;
            float f6 = (float) rect2.bottom;
            rectF.set(f5, f6 - f3, f4, f6);
            rectF2 = this.A0E;
            float f7 = (float) rect2.right;
            float f8 = (float) rect2.bottom;
            rectF2.set(f7 - f3, f8 - f3, f7, f8);
        }
        RectF rectF3 = this.A09;
        rectF3.set(rectF);
        if (rectF3.width() > 0.0f) {
            Paint paint = this.A08;
            paint.setShader(new RadialGradient(rectF3.centerX(), rectF3.centerY(), rectF3.width() / 2.0f, new int[]{paint.getColor(), 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        float f9 = 0.05f * height;
        rectF.inset(f9, f9);
        switch (num.intValue()) {
            case 2:
            case 3:
                f2 = 0.1f;
                break;
            default:
                f2 = 0.125f;
                break;
        }
        float f10 = f2 * height;
        rectF2.inset(f10, f10);
        float f11 = rectF2.left;
        float f12 = this.A00;
        rectF2.left = f11 + f12;
        rectF2.right += f12;
        Rect rect3 = this.A0B;
        rectF.round(rect3);
        rect3.inset((int) (((float) rect3.width()) * 0.275f), (int) (((float) rect3.height()) * 0.275f));
    }

    public final boolean setVisible(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            if (!z) {
                valueAnimator.pause();
            } else {
                valueAnimator.resume();
            }
        }
        return super.setVisible(z, z2);
    }

    public C14289TtN(Context context, Integer num, TimeUnit timeUnit) {
        this.A06 = context;
        Paint paint = new Paint();
        this.A07 = paint;
        paint.setColor(context.getColor(R.color.design_dark_default_color_on_background));
        paint.setAntiAlias(true);
        this.A0E = new RectF();
        this.A00 = 0.0f;
        Paint paint2 = new Paint();
        this.A0A = paint2;
        paint2.setColor(context.getColor(R.color.presence_indicator_color));
        paint2.setAntiAlias(true);
        this.A0C = new Rect();
        TextPaint textPaint = new TextPaint();
        this.A0F = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.A0B = new Rect();
        this.A09 = new RectF();
        Paint paint3 = new Paint();
        this.A08 = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.A05 = timeUnit.toMillis(300);
        this.A0G = AnonymousClass0eN.A01(new C20405Wqp(this, 3));
        if (this.A04 != num) {
            this.A04 = num;
            onBoundsChange(getBounds());
            invalidateSelf();
        }
    }
}
