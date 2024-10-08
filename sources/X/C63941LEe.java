package X;

/* renamed from: X.LEe  reason: case insensitive filesystem */
public final class C63941LEe {
    public final String A00;

    public C63941LEe(String str, Integer num) {
        0qQ.A0B(num, 2);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj)) {
            return false;
        }
        C63941LEe lEe = (C63941LEe) obj;
        String str = this.A00;
        if (str != null) {
            return str.equals(lEe.A00);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
