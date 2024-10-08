package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.5pk  reason: invalid class name and case insensitive filesystem */
public enum C296245pk {
    SMALL(0),
    LARGE(1),
    X_SMALL(2),
    HORIZONTAL_LARGE(3),
    MEDIUM(4),
    MEDIUM_LARGE(5);
    
    public final int A00;

    /* access modifiers changed from: public */
    static {
        C296245pk[] r0;
        A01 = 0oU.A00(r0);
    }

    public final float A00(Context context) {
        int i = this.A00;
        int i2 = 2;
        if (i != 2) {
            if (i == 0) {
                i2 = 8;
            } else {
                if (i != 4) {
                    if (i == 3) {
                        i2 = 10;
                    } else if (i == 5) {
                        i2 = 12;
                    }
                }
                return 0nA.A04(context, 14);
            }
        }
        return 0nA.A04(context, i2);
    }

    public final float A01(Context context, Drawable drawable) {
        float f;
        int i;
        float A04;
        int i2;
        float A042;
        if (drawable != null) {
            int i3 = this.A00;
            if (i3 == 2) {
                A042 = 0nA.A04(context, 8);
            } else {
                if (i3 == 0) {
                    i2 = 16;
                } else {
                    i2 = 24;
                    if (i3 == 4) {
                        i2 = 20;
                    }
                }
                A042 = 0nA.A04(context, i2);
            }
            f = (A042 - ((float) drawable.getIntrinsicWidth())) / 2.0f;
        } else {
            f = 0.0f;
        }
        int i4 = this.A00;
        if (i4 == 2) {
            i = 6;
        } else if (i4 == 0) {
            A04 = 0nA.A04(context, 8);
            return A04 + f;
        } else {
            i = 10;
            if (i4 == 4) {
                i = 12;
            }
        }
        A04 = 0nA.A04(context, i);
        return A04 + f;
    }

    /* access modifiers changed from: public */
    C296245pk(int i) {
        this.A00 = i;
    }
}
