package X;

import java.util.Arrays;

/* renamed from: X.HsR  reason: case insensitive filesystem */
public final class C56078HsR {
    public final int A00;
    public final Object[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && 0qQ.A0K(getClass(), obj.getClass())) {
                C56078HsR hsR = (C56078HsR) obj;
                if (this.A00 != hsR.A00 || !Arrays.equals(this.A01, hsR.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public C56078HsR(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StringResWithArgs(stringRes=");
        A1A.append(this.A00);
        A1A.append(", formatArgs=");
        String arrays = Arrays.toString(this.A01);
        0qQ.A07(arrays);
        return C51975G9x.A0i(arrays, A1A);
    }
}
