package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.5nn  reason: invalid class name and case insensitive filesystem */
public enum C295225nn {
    ;
    
    public final Rect A00;

    /* access modifiers changed from: public */
    static {
        C295225nn[] r0;
        A01 = 0oU.A00(r0);
    }

    public final void A00(Drawable drawable, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Rect rect = this.A00;
        if (i == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (this instanceof C295255nq) {
            0qQ.A0B(rect, 0);
            rect.set(i3 - i, 0, i3, i2);
        } else if (this instanceof C295245np) {
            0qQ.A0B(rect, 0);
            rect.set((i3 - i) - 14, 14, i3 - 14, i2 + 14);
        } else if (this instanceof C295265nr) {
            0qQ.A0B(rect, 0);
            rect.set(0, 0, i, i2);
        } else {
            if (this instanceof C295235no) {
                0qQ.A0B(rect, 0);
                i5 = (i3 - i) / 2;
                i6 = (i4 - i2) / 2;
                i7 = i + i5;
                i8 = i2 + i6;
            } else {
                0qQ.A0B(rect, 0);
                i5 = (i3 - i) - 14;
                i6 = (i4 - i2) - 14;
                i7 = i3 - 14;
                i8 = i4 - 14;
            }
            rect.set(i5, i6, i7, i8);
        }
        drawable.setBounds(rect);
    }
}
