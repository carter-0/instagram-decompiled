package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Gxg  reason: case insensitive filesystem */
public final class C53998Gxg extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A00 = 0;
    @Prop(optional = true, resType = C54606HKp.A06)
    @Comparable(type = 13)
    public Drawable A01;

    public final boolean A0N() {
        return true;
    }

    public final boolean A0P() {
        return true;
    }

    public final void A0n(2V1 r2) {
        Drawable A002 = HSN.A00(r2, 0);
        if (A002 != null) {
            this.A01 = A002;
        }
    }

    public final boolean A18(C251263mp r5, boolean z) {
        if (this != r5) {
            if (r5 != null && getClass() == r5.getClass()) {
                C53998Gxg gxg = (C53998Gxg) r5;
                if (this.A00 == gxg.A00) {
                    Drawable drawable = this.A01;
                    Drawable drawable2 = gxg.A01;
                    if (drawable != null) {
                        if (!drawable.equals(drawable2)) {
                            return false;
                        }
                    } else if (drawable2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C53998Gxg() {
        super("Progress");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A0C;
    }

    public final Object A0H(Context context) {
        return new ProgressBar(context);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.57n] */
    public final /* bridge */ /* synthetic */ C2814157n A0e() {
        return new Object();
    }

    public final void A0o(2V1 r3) {
        Drawable drawable = this.A01;
        if (drawable == null) {
            drawable = HSN.A00(r3, 16842871);
        }
        2Vz r1 = r3.A05;
        r1.getClass();
        ((IIP) r1.A05).A00 = drawable;
    }

    public final void A0t(2V1 r4, C70672Tq r5, Object obj) {
        ProgressBar progressBar = (ProgressBar) obj;
        int i = this.A00;
        2Vz r0 = r4.A05;
        r0.getClass();
        Drawable drawable = ((IIP) r0.A05).A00;
        if (drawable != null) {
            progressBar.setIndeterminateDrawable(drawable);
        }
        if (i != 0 && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().mutate().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void A0v(2V1 r3, C70672Tq r4, Object obj) {
        ProgressBar progressBar = (ProgressBar) obj;
        int i = this.A00;
        r3.A05.getClass();
        if (!(i == 0 || progressBar.getIndeterminateDrawable() == null)) {
            progressBar.getIndeterminateDrawable().mutate().clearColorFilter();
        }
        progressBar.setIndeterminateDrawable((Drawable) null);
    }

    public final void A0y(C2814157n r2, C2814157n r3) {
        ((IIP) r2).A00 = ((IIP) r3).A00;
    }

    public final void A0q(2V1 r7, C70672Tq r8, AnonymousClass2T3 r9, 2Tc r10, int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
            size = 50;
        } else {
            0qQ.A0B(r9, 2);
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 0) {
                if (mode2 == 0) {
                    size = 0;
                }
            } else if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    r9.A01 = size;
                    if (mode2 == Integer.MIN_VALUE) {
                        size = Math.min(size, size2);
                    } else if (mode2 != 0) {
                        if (mode2 == 1073741824) {
                            r9.A00 = size2;
                            return;
                        }
                    }
                    r9.A00 = size;
                }
            } else if (mode2 == Integer.MIN_VALUE) {
                size = Math.min(size, size2);
            } else if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    r9.A00 = size2;
                    r9.A01 = Math.min(size, size2);
                    return;
                }
            }
            r9.A00 = size2;
            r9.A01 = size2;
            return;
        }
        r9.A01 = size;
        r9.A00 = size;
    }
}
