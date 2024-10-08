package X;

import android.os.SystemClock;

/* renamed from: X.42e  reason: invalid class name and case insensitive filesystem */
public final class C2595642e extends 1Jp {
    public final boolean A00;
    public final float A01;

    public final String A00() {
        return "Scroll Stop";
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.A00) {
            str = "Vertical";
        } else {
            str = "Horizontal";
        }
        sb.append(str);
        sb.append(" scroll Animation Stopped on ");
        sb.append(this.A01);
        sb.append(" with ");
        sb.append(this.A01);
        sb.append(" dp scroll distance");
        return sb.toString();
    }

    public C2595642e(1Jm r7, String str, float f, boolean z) {
        super(r7, str, str, SystemClock.uptimeMillis());
        this.A01 = f;
        this.A00 = z;
    }
}
