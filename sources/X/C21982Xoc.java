package X;

import java.util.Locale;

/* renamed from: X.Xoc  reason: case insensitive filesystem */
public final class C21982Xoc {
    public static final C21982Xoc A03 = new C21982Xoc();
    public final float A00 = 1.0f;
    public final float A01 = 1.0f;
    public final int A02 = Math.round(1.0f * 1000.0f);

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    public final int hashCode() {
        int floatToRawIntBits = Float.floatToRawIntBits(1.0f);
        return C66583MXo.A01(floatToRawIntBits) + floatToRawIntBits;
    }

    public final String toString() {
        Float valueOf = Float.valueOf(1.0f);
        Object[] objArr = {valueOf, valueOf};
        return String.format(Locale.US, AnonymousClass000.A00(2411), objArr);
    }
}
