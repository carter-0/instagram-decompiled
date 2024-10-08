package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.Jcp  reason: case insensitive filesystem */
public final class C59980Jcp extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final GradientDrawable A04;

    public C59980Jcp(Context context, Integer num, int i, int i2, int i3) {
        Drawable drawable;
        this.A02 = i2;
        this.A01 = i3;
        if (num == null) {
            drawable = context.getDrawable(i);
            if (drawable == null) {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            drawable = AnonymousClass3JT.A06(context, i, num.intValue());
        }
        this.A03 = drawable;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, AnonymousClass6LW.A07);
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(((float) i2) / 2.0f);
        this.A04 = gradientDrawable;
        this.A00 = i2 + i3;
        int A042 = JTR.A04(context);
        drawable.setBounds(0, 0, Math.min(A042, drawable.getIntrinsicWidth()), Math.min(A042, drawable.getIntrinsicHeight()));
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A03;
        float A06 = (float) AnonymousClass7TF.A06(drawable);
        float A062 = (float) JTP.A06(drawable);
        GradientDrawable gradientDrawable = this.A04;
        int i = this.A01;
        int i2 = i / 2;
        int i3 = this.A02;
        gradientDrawable.setBounds(i2, i2, i2 + i3, i3 + (i / 2));
        gradientDrawable.draw(canvas);
        float f = (float) this.A00;
        float f2 = (f - A06) / 2.0f;
        float f3 = (f - A062) / 2.0f;
        drawable.setBounds((int) f2, (int) f3, (int) (f2 + A06), (int) (f3 + A062));
        drawable.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }
}
