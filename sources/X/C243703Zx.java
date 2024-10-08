package X;

import java.util.Arrays;

/* renamed from: X.3Zx  reason: invalid class name and case insensitive filesystem */
public final class C243703Zx {
    public final Object[] A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C243703Zx) || !C245173cR.A02(this.A00, ((C243703Zx) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C243703Zx(Object[] objArr) {
        this.A00 = objArr;
    }
}
