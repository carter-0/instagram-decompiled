package X;

import android.text.TextUtils;

public final class SJ8 {
    public static final C13530Tc2 A04 = new C11860Shm();
    public final C13530Tc2 A00;
    public final Object A01;
    public final String A02;
    public volatile byte[] A03;

    public final boolean equals(Object obj) {
        if (obj instanceof SJ8) {
            return this.A02.equals(((SJ8) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public SJ8(C13530Tc2 tc2, Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A02 = str;
            this.A01 = obj;
            C9217RTu.A00(tc2);
            this.A00 = tc2;
            return;
        }
        throw AnonymousClass7TE.A0w("Must not be null or empty");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Option{key='");
        Pxf.A1P(A1A, this.A02);
        return Pxg.A0x(A1A);
    }
}
