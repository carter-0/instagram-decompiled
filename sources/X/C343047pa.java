package X;

/* renamed from: X.7pa  reason: invalid class name and case insensitive filesystem */
public final class C343047pa {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C343047pa)) {
            return false;
        }
        C343047pa r4 = (C343047pa) obj;
        return this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public static long A00(C343047pa r4) {
        return ((long) r4.A02) * ((long) r4.A01);
    }

    public static C343047pa A01(String str) {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf >= 0 || (indexOf = str.indexOf(120)) >= 0) {
                try {
                    return new C343047pa(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw new NumberFormatException(002.A0g("Invalid Size: \"", str, "\""));
                }
            } else {
                throw new NumberFormatException(002.A0g("Invalid Size: \"", str, "\""));
            }
        } else {
            throw new NullPointerException("string must not be null");
        }
    }

    public final int hashCode() {
        int i = this.A01;
        int i2 = this.A02;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return 002.A0P("x", this.A02, this.A01);
    }

    public C343047pa(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i * i2;
    }
}
