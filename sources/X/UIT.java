package X;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.io.Closeable;

public abstract class UIT extends UIU implements Closeable, C226742hm, Drawable.Callback, AnonymousClass764, C226842hw, AnonymousClass765 {
    public static final 2HY A02 = new 2HY(0, 3);
    public Rect A00;
    public C279744zE A01;

    public UIT() {
        super(new Drawable[4], 1);
    }

    public final void A06(float f) {
        Animatable animatable;
        Animatable animatable2;
        Drawable A022 = A02(2);
        if (A022 != null) {
            boolean z = A022 instanceof Animatable;
            if (f >= 0.999f) {
                if (z && (animatable2 = (Animatable) A022) != null) {
                    animatable2.stop();
                }
            } else if (z && (animatable = (Animatable) A022) != null) {
                animatable.start();
            }
            A022.setLevel(AnonymousClass7TE.A05(f, 10000.0f));
        }
    }

    public final boolean CJu() {
        return A02(1) != null;
    }

    public void close() {
        Animatable animatable;
        Drawable A022 = A02(0);
        if ((A022 instanceof Animatable) && (animatable = (Animatable) A022) != null) {
            animatable.stop();
        }
        2HY r0 = A02;
        int i = r0.A00;
        int i2 = r0.A01;
        if (i <= i2) {
            while (true) {
                A03((Drawable) null, i);
                if (i != i2) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A05() {
        this.A02++;
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        int[] iArr = this.A08;
        iArr[0] = 0;
        invalidateSelf();
        zArr[2] = false;
        iArr[2] = 0;
        invalidateSelf();
        A04(1);
        this.A02--;
        invalidateSelf();
    }

    public final void A07(int i) {
        this.A01 = i;
        if (this.A03 == 1) {
            this.A03 = 0;
        }
        this.A02++;
        this.A03 = 0;
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        invalidateSelf();
        this.A03 = 0;
        zArr[2] = false;
        invalidateSelf();
        this.A03 = 0;
        zArr[1] = true;
        invalidateSelf();
        this.A02--;
        invalidateSelf();
    }

    public final void Eqj(C279744zE r1) {
        this.A01 = r1;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        C279744zE r0 = this.A01;
        if (r0 != null) {
            r0.DzX(z);
        }
        return super.setVisible(z, z2);
    }
}
