package X;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: X.5TV  reason: invalid class name */
public final class AnonymousClass5TV implements AnonymousClass5RG {
    public final ViewConfiguration A00;

    public final long Ayi() {
        return 40;
    }

    public final float BAO() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C63974LGk.A00(this.A00);
        }
        return 16.0f;
    }

    public final float BAP() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C63974LGk.A01(this.A00);
        }
        return 2.0f;
    }

    public final float BPY() {
        return (float) this.A00.getScaledMaximumFlingVelocity();
    }

    public final /* synthetic */ long BTR() {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(48.0f);
        return (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
    }

    public final float C8x() {
        return (float) this.A00.getScaledTouchSlop();
    }

    public AnonymousClass5TV(ViewConfiguration viewConfiguration) {
        this.A00 = viewConfiguration;
    }

    public final long Ayj() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public final long BOW() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }
}
