package X;

import java.util.ArrayList;

public final class IF3 implements JNR {
    public IF3() {
        if (Float.compare(82.0f, 0.0f) <= 0) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Provided size ");
            A1A.append(C289095d0.A00(82.0f));
            throw AnonymousClass7TE.A0w(AnonymousClass7TF.A0l(" should be larger than zero.", A1A));
        }
    }

    public final ArrayList AEu(C268024cd r4, int i, int i2) {
        int EJS = r4.EJS(82.0f);
        int i3 = EJS + i2;
        int i4 = i2 + i;
        if (i3 < i4) {
            int i5 = i4 / i3;
            ArrayList A0v = DbS.A0v(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                AnonymousClass7TF.A1M(A0v, EJS);
            }
            return A0v;
        }
        ArrayList A0v2 = DbS.A0v(1);
        AnonymousClass7TF.A1M(A0v2, i);
        return A0v2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IF3) || !C289095d0.A01(82.0f, 82.0f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(82.0f);
    }
}
