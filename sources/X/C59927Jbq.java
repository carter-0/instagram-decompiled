package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Jbq  reason: case insensitive filesystem */
public final class C59927Jbq extends Drawable implements Drawable.Callback {
    public boolean A00;
    public Drawable A01;
    public boolean A02;
    public final float A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final float A07;
    public final float A08;
    public final Path A09 = C51965G9l.A0C();
    public final RectF A0A = AnonymousClass7TE.A0Y();
    public final RectF A0B = AnonymousClass7TE.A0Y();

    public final void draw(Canvas canvas) {
        RectF rectF;
        0qQ.A0B(canvas, 0);
        Path path = this.A09;
        path.reset();
        if (this.A02) {
            rectF = this.A0A;
        } else {
            rectF = this.A0B;
        }
        float f = this.A07;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawRect(this.A0B, (Paint) this.A04.getValue());
        boolean z = this.A02;
        Drawable drawable = this.A01;
        if (z) {
            drawable.draw(canvas);
            RectF rectF2 = new RectF(this.A0A);
            float f2 = this.A08;
            rectF2.inset(f2, f2);
            canvas.drawRoundRect(rectF2, f, f, (Paint) this.A06.getValue());
            float f3 = this.A03;
            rectF2.inset(f3, f3);
            canvas.drawRoundRect(rectF2, f, f, (Paint) this.A05.getValue());
            return;
        }
        drawable.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean onStateChange(int[] iArr) {
        0qQ.A0B(iArr, 0);
        boolean z = this.A02;
        boolean z2 = false;
        this.A02 = false;
        boolean z3 = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (iArr[i] == 16842913) {
                this.A02 = true;
                z3 = true;
                break;
            } else {
                i++;
            }
        }
        if (z != z3) {
            z2 = true;
        }
        if (this.A00 && z2) {
            A00();
        }
        return z2;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private final void A00() {
        RectF rectF;
        if (this.A02) {
            rectF = this.A0B;
        } else {
            rectF = this.A0A;
        }
        Rect A0W = AnonymousClass7TE.A0W();
        rectF.roundOut(A0W);
        Drawable drawable = this.A01;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth == -1) {
            intrinsicWidth = A0W.width();
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight == -1) {
            intrinsicHeight = A0W.height();
        }
        int i = intrinsicWidth / 2;
        int i2 = intrinsicHeight / 2;
        drawable.setBounds(Math.max(0, A0W.centerX() - i), Math.max(0, A0W.centerY() - i2), Math.min(A0W.right, A0W.centerX() + i), Math.min(A0W.bottom, A0W.centerY() + i2));
    }

    public C59927Jbq(Context context, Drawable drawable, boolean z) {
        this.A01 = drawable;
        this.A07 = JTR.A02(context);
        this.A08 = context.getResources().getDimension(R.dimen.account_recs_header_image_margin);
        this.A03 = context.getResources().getDimension(R.dimen.afi_indicator_arrow_margin_top);
        this.A04 = AnonymousClass0eN.A01(new GA1(25, context, z));
        this.A06 = AnonymousClass0eN.A01(new GL3(8, context, this, z));
        this.A05 = AnonymousClass0eN.A01(new GL3(7, context, this, z));
        this.A01.setCallback(this);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        RectF rectF = this.A0A;
        rectF.set((float) i, (float) i2, (float) i3, (float) i4);
        RectF rectF2 = this.A0B;
        rectF2.set(rectF);
        if (this.A00) {
            float f = (this.A03 * 2.0f) + this.A08;
            rectF2.inset(f, f);
        }
        A00();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
