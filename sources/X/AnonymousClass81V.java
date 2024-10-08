package X;

import android.graphics.Point;

/* renamed from: X.81V  reason: invalid class name */
public final class AnonymousClass81V implements AnonymousClass81W {
    public final int A00;
    public final int A01;

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }

    public AnonymousClass81V(int i, int i2) {
        int i3;
        if (((float) i) / ((float) i2) < 0.5625f) {
            i3 = i / 9;
        } else {
            i3 = i2 / 16;
        }
        i3 = i3 % 2 != 0 ? i3 - 1 : i3;
        int i4 = i3 * 9;
        int i5 = i3 * 16;
        if (((float) i4) / ((float) i5) == 0.5625f) {
            Point point = new Point(i4, i5);
            this.A01 = point.x;
            this.A00 = point.y;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
