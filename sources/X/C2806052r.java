package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.52r  reason: invalid class name and case insensitive filesystem */
public final class C2806052r extends Drawable {
    public float A00;
    public float A01;
    public ColorStateList A02;
    public boolean A03 = false;
    public boolean A04 = true;
    public ColorStateList A05;
    public PorterDuff.Mode A06 = PorterDuff.Mode.SRC_IN;
    public PorterDuffColorFilter A07;
    public final Paint A08;
    public final Rect A09;
    public final RectF A0A;

    public final int getOpacity() {
        return -3;
    }

    public static void A00(Rect rect, C2806052r r11) {
        if (rect == null) {
            rect = r11.getBounds();
        }
        RectF rectF = r11.A0A;
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        Rect rect2 = r11.A09;
        rect2.set(rect);
        if (r11.A03) {
            float f = r11.A00;
            float f2 = r11.A01;
            boolean z = r11.A04;
            double d = U0Y.A00;
            float f3 = f * 1.5f;
            if (z) {
                double d2 = (1.0d - U0Y.A00) * ((double) f2);
                f3 = (float) (((double) f3) + d2);
                f = (float) (((double) f) + d2);
            }
            rect2.inset((int) Math.ceil((double) f), (int) Math.ceil((double) f3));
            rectF.set(rect2);
        }
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.A08;
        if (this.A07 == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.A07);
            z = true;
        }
        RectF rectF = this.A0A;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.A09, this.A01);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A05;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.A02) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.A02;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.A08;
        boolean z = false;
        if (colorForState != paint.getColor()) {
            z = true;
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.A05;
        if (colorStateList2 == null || (mode = this.A06) == null) {
            return z;
        }
        this.A07 = new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode);
        return true;
    }

    public final void setAlpha(int i) {
        this.A08.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        PorterDuffColorFilter porterDuffColorFilter;
        this.A05 = colorStateList;
        PorterDuff.Mode mode = this.A06;
        if (colorStateList == null || mode == null) {
            porterDuffColorFilter = null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        this.A07 = porterDuffColorFilter;
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        this.A06 = mode;
        ColorStateList colorStateList = this.A05;
        if (colorStateList == null || mode == null) {
            porterDuffColorFilter = null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        this.A07 = porterDuffColorFilter;
        invalidateSelf();
    }

    public C2806052r(ColorStateList colorStateList, float f) {
        this.A01 = f;
        this.A08 = new Paint(5);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.A02 = colorStateList;
        this.A08.setColor(colorStateList.getColorForState(getState(), this.A02.getDefaultColor()));
        this.A0A = new RectF();
        this.A09 = new Rect();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00(rect, this);
    }
}
