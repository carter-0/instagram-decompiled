package X;

import java.util.Arrays;

/* renamed from: X.480  reason: invalid class name */
public final class AnonymousClass480 implements AnonymousClass481 {
    public int A00;
    public char[] A01;

    public static final void A00(AnonymousClass480 r2, int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = r2.A01;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] copyOf = Arrays.copyOf(cArr, i3);
            0qQ.A07(copyOf);
            r2.A01 = copyOf;
        }
    }

    public final void FNf(String str) {
        0qQ.A0B(str, 0);
        int length = str.length();
        if (length != 0) {
            A00(this, this.A00, length);
            str.getChars(0, length, this.A01, this.A00);
            this.A00 += length;
        }
    }

    public final void A01() {
        AnonymousClass482 r3 = AnonymousClass482.A02;
        char[] cArr = this.A01;
        0qQ.A0B(cArr, 0);
        synchronized (r3) {
            int length = r3.A00 + cArr.length;
            if (length < AnonymousClass48D.A00) {
                r3.A00 = length;
                r3.A01.addLast(cArr);
            }
        }
    }

    public final String toString() {
        return new String(this.A01, 0, this.A00);
    }

    public AnonymousClass480() {
        char[] cArr;
        AnonymousClass482 r4 = AnonymousClass482.A02;
        synchronized (r4) {
            cArr = (char[]) r4.A01.A0T();
            if (cArr != null) {
                r4.A00 -= cArr.length;
            } else {
                cArr = null;
            }
        }
        this.A01 = cArr == null ? new char[128] : cArr;
    }
}
