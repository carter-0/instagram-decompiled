package X;

import java.util.Iterator;

/* renamed from: X.Wh1  reason: case insensitive filesystem */
public final class C19874Wh1 implements Comparable {
    public int A00;
    public final int[] A01 = new int[C17152VKe.A00];

    /* renamed from: A00 */
    public final int compareTo(C19874Wh1 wh1) {
        int i;
        int i2;
        0qQ.A0B(wh1, 0);
        Iterator it = C17152VKe.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = this.A00;
                i2 = wh1.A00;
                break;
            }
            int[] iArr = this.A01;
            int ordinal = ((C16520UwP) it.next()).ordinal();
            i = iArr[ordinal];
            i2 = wh1.A01[ordinal];
            if (i != i2) {
                break;
            }
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C19874Wh1) && this.A00 == ((C19874Wh1) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("SyncQuality(duration=", ')', this.A00);
    }

    public C19874Wh1(int i) {
        this.A00 = i;
        for (C16520UwP ordinal : C17152VKe.A01) {
            this.A01[ordinal.ordinal()] = 0;
        }
    }
}
