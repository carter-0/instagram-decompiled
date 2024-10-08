package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UjO  reason: case insensitive filesystem */
public final class C15838UjO extends C268694dq {
    public static final Interpolator A08 = new DecelerateInterpolator();
    public long A00;
    public Integer A01;
    public Integer A02;
    public boolean A03;
    public final int A04;
    public final Drawable A05;
    public final Drawable A06;
    public final List A07;

    private void A00(Canvas canvas, Integer num, float f) {
        Drawable drawable;
        if (num == AnonymousClass05K.A00) {
            drawable = this.A06;
        } else {
            drawable = this.A05;
        }
        canvas.save();
        canvas.scale(f, f, C66581MXm.A01(drawable), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    public final List A07() {
        return this.A07;
    }

    public C15838UjO(Drawable drawable, Drawable drawable2, int i) {
        ArrayList arrayList = new ArrayList();
        this.A07 = arrayList;
        this.A06 = drawable;
        this.A05 = drawable2;
        Collections.addAll(arrayList, new Drawable[]{drawable, drawable2});
        this.A04 = i;
        drawable.setCallback(this);
    }

    public final void draw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.A03) {
            long j = this.A00;
            int i = this.A04;
            if (currentTimeMillis < ((long) i) + j) {
                float interpolation = A08.getInterpolation(0mi.A01((float) (currentTimeMillis - j), 0.0f, (float) i, 0.0f, 1.0f));
                Integer num = this.A02;
                if (num != null) {
                    A00(canvas, num, 1.0f - interpolation);
                }
                Integer num2 = this.A01;
                if (num2 != null) {
                    A00(canvas, num2, interpolation);
                }
                invalidateSelf();
                return;
            }
        }
        Integer num3 = this.A01;
        if (num3 != null) {
            A00(canvas, num3, 1.0f);
        }
        this.A03 = false;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A06.setBounds(i, i2, i3, i4);
        this.A05.setBounds(i, i2, i3, i4);
    }
}
