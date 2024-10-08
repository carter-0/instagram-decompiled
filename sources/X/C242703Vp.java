package X;

import android.util.Pair;

/* renamed from: X.3Vp  reason: invalid class name and case insensitive filesystem */
public class C242703Vp implements C242713Vq {
    public final Pair A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C242703Vp)) {
            return false;
        }
        return ((C242703Vp) obj).A00.equals(this.A00);
    }

    public int hashCode() {
        return 527 + this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C242703Vp(Pair pair, Integer num) {
        this.A00 = pair;
        this.A01 = num;
    }
}
