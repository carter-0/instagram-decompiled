package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import com.instagram.android.R;

/* renamed from: X.3JS  reason: invalid class name */
public final class AnonymousClass3JS extends Drawable implements Drawable.Callback {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public Drawable A05;
    public boolean A06;
    public long A07;
    public Paint A08;
    public boolean A09;
    public final Context A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Rect A0E;
    public final RectF A0F;
    public final Drawable A0G;
    public final 2cs A0H;

    public final void A02(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Context context = this.A0A;
        int round = Math.round(0nA.A04(context, 8));
        shapeDrawable.setIntrinsicWidth(round);
        shapeDrawable.setIntrinsicHeight(round);
        shapeDrawable.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, i))));
        this.A01 = Math.round(0nA.A04(context, i2));
        invalidateSelf();
        this.A02 = Math.round(0nA.A04(context, 0));
        invalidateSelf();
        this.A00 = 0nA.A04(context, 8);
        invalidateSelf();
        if (shapeDrawable != this.A05) {
            this.A05 = shapeDrawable;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        String obj;
        float f;
        int height;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        2cs r9 = this.A0H;
        float f2 = (float) r9.A09.A00;
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        float exactCenterX = bounds.exactCenterX() + ((float) bounds.left);
        float exactCenterY = bounds.exactCenterY() + ((float) bounds.top);
        float f3 = 1.0f - 0.0f;
        float f4 = 0.7f - 1.0f;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f2 - 0.0f) / f3;
        }
        float f6 = (f5 * f4) + 1.0f;
        int A022 = (int) 0mi.A02(f2, 0.0f, 1.0f, 255.0f, 0.0f);
        if (A022 > 0) {
            canvas2.save();
            canvas2.scale(f6, f6, exactCenterX, exactCenterY);
            Drawable drawable = this.A0G;
            canvas2.translate(exactCenterX - (((float) drawable.getBounds().width()) / 2.0f), exactCenterY - (((float) drawable.getBounds().height()) / 2.0f));
            drawable.setAlpha(A022);
            drawable.draw(canvas2);
            canvas2.restore();
        }
        float max = Math.max(f2, 0.0f);
        int A023 = (int) 0mi.A02(f2, 0.0f, 1.0f, 0.0f, 255.0f);
        if (A023 > 0) {
            canvas2.save();
            canvas2.scale(max, max, exactCenterX, exactCenterY);
            Drawable drawable2 = this.A0G;
            canvas2.translate(exactCenterX - (((float) drawable2.getBounds().width()) / 2.0f), exactCenterY - (((float) drawable2.getBounds().height()) / 2.0f));
            drawable2.setAlpha(A023);
            drawable2.draw(canvas2);
            canvas2.restore();
        }
        int level = getLevel();
        if (level < 1) {
            obj = "";
        } else {
            int i = this.A03;
            if (level <= i) {
                obj = String.valueOf(level);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('+');
                obj = sb.toString();
            }
        }
        if (!(this.A05 == null && obj == null)) {
            Paint paint = this.A08;
            0qQ.A0A(paint);
            int length = obj.length();
            Rect rect = this.A0E;
            paint.getTextBounds(obj, 0, length, rect);
            Drawable drawable3 = this.A05;
            if (drawable3 != null) {
                if (drawable3.getBounds().width() == 0) {
                    Drawable drawable4 = this.A05;
                    0qQ.A0A(drawable4);
                    Drawable drawable5 = this.A05;
                    0qQ.A0A(drawable5);
                    int intrinsicWidth = drawable5.getIntrinsicWidth();
                    Drawable drawable6 = this.A05;
                    0qQ.A0A(drawable6);
                    drawable4.setBounds(0, 0, intrinsicWidth, drawable6.getIntrinsicHeight());
                }
                Drawable drawable7 = this.A05;
                0qQ.A0A(drawable7);
                rect.set(drawable7.getBounds());
            } else {
                int i2 = -this.A0D;
                rect.inset(i2, i2);
                if (rect.height() > rect.width()) {
                    rect.inset((rect.height() - rect.width()) / -2, 0);
                }
            }
            float f7 = this.A00;
            if (((float) rect.height()) != f7) {
                rect.inset(0, (int) Math.ceil((double) ((-(f7 - ((float) rect.height()))) / 2.0f)));
            }
            float f8 = this.A00;
            if (((float) rect.width()) < f8) {
                rect.inset((int) Math.ceil((double) ((-(f8 - ((float) rect.width()))) / 2.0f)), 0);
            }
            canvas2.save();
            canvas2.scale(max, max, exactCenterX, exactCenterY);
            boolean z = this.A06;
            float width = (((float) bounds.right) - (((float) rect.width()) / 2.0f)) + ((float) this.A01);
            if (z) {
                f = (float) bounds.top;
                height = bounds.height();
            } else {
                f = (float) bounds.top;
                height = rect.height();
            }
            canvas2.translate(width, (f + (((float) height) / 2.0f)) - ((float) this.A02));
            RectF rectF = this.A0F;
            rectF.set(((float) rect.width()) / -2.0f, ((float) rect.height()) / -2.0f, ((float) rect.width()) / 2.0f, ((float) rect.height()) / 2.0f);
            Paint paint2 = this.A04;
            0qQ.A0A(paint2);
            canvas2.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
            if (this.A09) {
                Paint paint3 = this.A08;
                0qQ.A0A(paint3);
                paint3.setStyle(Paint.Style.STROKE);
                Paint paint4 = this.A08;
                0qQ.A0A(paint4);
                canvas2.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
                Paint paint5 = this.A08;
                0qQ.A0A(paint5);
                paint5.setStyle(Paint.Style.FILL);
            }
            if (this.A05 != null) {
                canvas2.save();
                Drawable drawable8 = this.A05;
                0qQ.A0A(drawable8);
                Rect bounds2 = drawable8.getBounds();
                0qQ.A07(bounds2);
                canvas2.translate(((float) (-bounds2.width())) / 2.0f, ((float) (-bounds2.height())) / 2.0f);
                Drawable drawable9 = this.A05;
                0qQ.A0A(drawable9);
                drawable9.draw(canvas2);
                canvas2.restore();
            } else {
                Paint paint6 = this.A08;
                0qQ.A0A(paint6);
                float descent = paint6.descent();
                Paint paint7 = this.A08;
                0qQ.A0A(paint7);
                Paint paint8 = this.A08;
                0qQ.A0A(paint8);
                float ascent = ((descent - paint7.ascent()) / 2.0f) - paint8.descent();
                Paint paint9 = this.A08;
                0qQ.A0A(paint9);
                canvas2.drawText(obj, 0.0f, ascent, paint9);
            }
            canvas2.restore();
        }
        if (!r9.A0C()) {
            invalidateSelf();
        }
        if (this.A07 == 0) {
            this.A07 = System.currentTimeMillis();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean onStateChange(int[] iArr) {
        0qQ.A0B(iArr, 0);
        int[] state = getState();
        0qQ.A07(state);
        int length = state.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (state[i2] == 16843518) {
                i = 1;
                break;
            } else {
                i2++;
            }
        }
        super.onStateChange(iArr);
        int[] state2 = getState();
        0qQ.A07(state2);
        int length2 = state2.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            } else if (state2[i4] == 16843518) {
                i3 = 1;
                break;
            } else {
                i4++;
            }
        }
        float f = (float) i3;
        long j = this.A07;
        if (j == 0 || System.currentTimeMillis() - j < 100) {
            this.A0H.A08((double) f, true);
        } else {
            this.A0H.A06((double) f);
        }
        invalidateSelf();
        if (i != i3) {
            return true;
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private final void A00(int i) {
        Context context = this.A0A;
        float A042 = 0nA.A04(context, 12);
        TextPaint textPaint = new TextPaint(1);
        this.A08 = textPaint;
        textPaint.setStrokeWidth((float) this.A0B);
        Paint paint = this.A08;
        0qQ.A0A(paint);
        paint.setColor(context.getColor(i));
        Paint paint2 = this.A08;
        0qQ.A0A(paint2);
        paint2.setTypeface(AnonymousClass0qo.A00(context).A02(0qm.A11));
        Paint paint3 = this.A08;
        0qQ.A0A(paint3);
        paint3.setTextSize(A042);
        Paint paint4 = this.A08;
        0qQ.A0A(paint4);
        paint4.setTextAlign(Paint.Align.CENTER);
    }

    public final void A01() {
        Context context = this.A0A;
        int A0H2 = 2Yu.A0H(context, R.attr.igds_color_primary_background);
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A04;
        0qQ.A0A(paint2);
        paint2.setColor(context.getColor(A0H2));
        A00(2Yu.A0H(context, R.attr.igds_color_primary_text));
        this.A09 = true;
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A0C;
    }

    public final int getIntrinsicWidth() {
        return this.A0C;
    }

    public final void setAlpha(int i) {
        this.A0G.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0G.setColorFilter(colorFilter);
    }

    public AnonymousClass3JS(Context context, Drawable drawable, int i) {
        this.A0A = context;
        this.A0G = drawable;
        drawable.setCallback(this);
        this.A0C = Math.round(0nA.A04(context, i));
        this.A00 = 0nA.A04(context, 18);
        this.A0D = Math.round(0nA.A04(context, 5));
        this.A01 = Math.round(0nA.A04(context, 8));
        this.A02 = Math.round(0nA.A04(context, 8));
        this.A0B = Math.round(0nA.A00(context, 2.0f));
        int A0H2 = 2Yu.A0H(context, R.attr.igds_color_icon_badge);
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A04;
        0qQ.A0A(paint2);
        paint2.setColor(this.A0A.getColor(A0H2));
        this.A0E = new Rect();
        this.A0F = new RectF();
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.A0H = C61340me.A00().A02();
        A00(2Yu.A0H(context, R.attr.igds_color_text_on_color));
        this.A03 = 99;
    }

    public final boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3JS(android.content.Context r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r1 = X.2Yu.A0H(r3, r0)
            android.graphics.Paint r0 = X.AnonymousClass3JT.A00
            int r0 = r3.getColor(r1)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3JT.A05(r3, r4, r0)
            r0 = 24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3JS.<init>(android.content.Context, int):void");
    }
}
