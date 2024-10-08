package X;

/* renamed from: X.T9z  reason: case insensitive filesystem */
public final class C12843T9z implements Cloneable {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C12843T9z t9z = (C12843T9z) obj;
            if (!(this.A00 == t9z.A00 && this.A01 == t9z.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * true;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "DEFAULT";
        } else {
            str = "BGRA";
        }
        return i + str.hashCode() + intValue;
    }

    public final C12843T9z A00() {
        try {
            return (C12843T9z) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
