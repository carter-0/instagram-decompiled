package X;

import android.view.View;

/* renamed from: X.7hC  reason: invalid class name and case insensitive filesystem */
public abstract class C337967hC {
    public static final int A00(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = AnonymousClass972.MUTABLE_FLAG_MASK;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return AnonymousClass3XX.A00;
            }
            i3 = SN3.MAX_SIGNED_POWER_OF_TWO;
            if (mode != 1073741824) {
                throw new IllegalStateException(002.A0O("Invalid spec mode: ", mode));
            }
        }
        int max = Math.max(0, size - i2);
        int i4 = AnonymousClass3XX.A00;
        return View.MeasureSpec.makeMeasureSpec(max, i3);
    }
}
