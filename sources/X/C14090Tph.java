package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* renamed from: X.Tph  reason: case insensitive filesystem */
public final class C14090Tph extends C14001To3 {
    public float A00 = Float.MAX_VALUE;
    public C14002To4 A01 = null;
    public boolean A02 = false;

    public final void A02() {
        C14002To4 to4 = this.A01;
        if (to4 != null) {
            double d = (double) ((float) to4.A02);
            if (d > ((double) this.A00)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d >= ((double) this.A01)) {
                double abs = Math.abs((double) (this.A02 * 0.75f));
                to4.A06 = abs;
                to4.A07 = abs * 62.5d;
                super.A02();
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public final void A08() {
        if (this.A01.A01 <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.A06) {
            this.A02 = true;
        }
    }

    public final void A09(float f) {
        if (this.A06) {
            this.A00 = f;
            return;
        }
        C14002To4 to4 = this.A01;
        if (to4 == null) {
            to4 = new C14002To4(f);
            this.A01 = to4;
        }
        to4.A02 = (double) f;
        A02();
    }

    public C14090Tph(V4M v4m, Object obj, float f) {
        super(v4m, obj);
        this.A01 = new C14002To4(f);
    }

    public final void A01() {
        super.A01();
        float f = this.A00;
        if (f != Float.MAX_VALUE) {
            C14002To4 to4 = this.A01;
            if (to4 == null) {
                this.A01 = new C14002To4(f);
            } else {
                to4.A02 = (double) f;
            }
            this.A00 = Float.MAX_VALUE;
        }
    }

    public C14090Tph(V4M v4m, Object obj) {
        super(v4m, obj);
    }
}
