package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.Djq  reason: case insensitive filesystem */
public abstract class C46719Djq extends FrameLayout {
    public static final C71392co A06 = C71392co.A04(60.0d, 5.0d);
    public static final C71392co A07 = C71392co.A04(250.0d, 16.0d);
    public static final C71392co A08 = C71392co.A04(40.0d, 9.0d);
    public int A00;
    public int A01 = AnonymousClass7TG.A03(getContext());
    public Drawable A02;
    public 2cs A03;
    public 2cs A04;
    public boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46719Djq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        2cp A002 = C61340me.A00();
        2cs A022 = A002.A02();
        A022.A00 = 0.01d;
        A022.A0A(new C47275Du3(this));
        this.A04 = A022;
        2cs A023 = A002.A02();
        A023.A06 = true;
        A023.A09(A06);
        A023.A0A(new C47276Du4(this));
        this.A03 = A023;
        Drawable strokeDrawable = getStrokeDrawable();
        this.A02 = strokeDrawable;
        strokeDrawable.setAlpha(0);
    }

    public void dispatchDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public abstract Drawable getStrokeDrawable();

    public final int getDisabledAlpha() {
        return this.A00;
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.A01;
        setPadding(i3, i3, i3, i3);
        super.onMeasure(i, i2);
    }

    public void setSelected(boolean z) {
        2cs r2;
        double d;
        Drawable drawable = this.A02;
        if (z) {
            if (drawable != null) {
                drawable.setAlpha(255);
            }
            r2 = this.A03;
            if (r2 != null) {
                d = 255.0d;
            }
            invalidate();
            requestLayout();
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        r2 = this.A03;
        if (r2 != null) {
            d = 0.0d;
        }
        invalidate();
        requestLayout();
        r2.A06(d);
        r2.A05(d);
        invalidate();
        requestLayout();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-20356303);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        AnonymousClass0fD.A0D(130997185, A062);
    }

    public void setPressed(boolean z) {
        double d;
        super.setPressed(z);
        if (this.A05) {
            2cs r2 = this.A04;
            if (z) {
                if (r2 != null) {
                    r2.A09(A07);
                    d = 1.0d;
                } else {
                    return;
                }
            } else if (r2 != null) {
                r2.A09(A08);
                d = 0.0d;
            } else {
                return;
            }
            r2.A06(d);
        }
    }

    public final void setAnimatePress(boolean z) {
        this.A05 = z;
    }

    public final void setDisabledAlpha(int i) {
        this.A00 = i;
    }
}
