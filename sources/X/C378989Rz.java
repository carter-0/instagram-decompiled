package X;

import android.graphics.Point;

/* renamed from: X.9Rz  reason: invalid class name and case insensitive filesystem */
public final class C378989Rz {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C378989Rz) && this.A00 == ((C378989Rz) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("LimitHeight(limitHeight=", ')', this.A00);
    }

    public final Point A00(Point point) {
        int i = point.y;
        if (i == 0) {
            return point;
        }
        int i2 = this.A00;
        return new Point((point.x * i2) / i, i2);
    }

    public C378989Rz(int i) {
        this.A00 = i;
    }
}
