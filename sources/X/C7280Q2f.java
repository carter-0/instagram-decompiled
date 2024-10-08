package X;

import java.util.Comparator;

/* renamed from: X.Q2f  reason: case insensitive filesystem */
public abstract class C7280Q2f {
    public static final C7280Q2f A00 = new C7281Q2g();
    public static final C7280Q2f A01 = new C7279Q2e(1);
    public static final C7280Q2f A02 = new C7279Q2e(-1);

    public final int A00() {
        if (this instanceof C7279Q2e) {
            return ((C7279Q2e) this).A00;
        }
        return 0;
    }

    public final C7280Q2f A01(int i, int i2) {
        char A1W;
        if (!(this instanceof C7281Q2g)) {
            return this;
        }
        if (i < i2 || (A1W = C51970G9q.A1W(i, i2)) < 0) {
            return A02;
        }
        if (A1W > 0) {
            return A01;
        }
        return A00;
    }

    public final C7280Q2f A02(Object obj, Object obj2, Comparator comparator) {
        if (!(this instanceof C7281Q2g)) {
            return this;
        }
        int compare = comparator.compare(obj, obj2);
        if (compare < 0) {
            return A02;
        }
        if (compare > 0) {
            return A01;
        }
        return A00;
    }

    public final C7280Q2f A03(boolean z, boolean z2) {
        if (!(this instanceof C7281Q2g)) {
            return this;
        }
        if (z == z2) {
            return A00;
        }
        if (z) {
            return A01;
        }
        return A02;
    }

    public final C7280Q2f A04(boolean z, boolean z2) {
        if (this instanceof C7279Q2e) {
            return this;
        }
        if (z2 == z) {
            return A00;
        }
        if (z2) {
            return A01;
        }
        return A02;
    }
}
