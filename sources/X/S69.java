package X;

public final class S69 {
    public final int A00;
    public final Class A01;
    public final C268894eF[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                S69 s69 = (S69) obj;
                if (this.A00 == s69.A00 && this.A01 == s69.A01) {
                    C268894eF[] r5 = s69.A02;
                    C268894eF[] r4 = this.A02;
                    int length = r4.length;
                    if (length == r5.length) {
                        int i = 0;
                        while (i < length) {
                            if (r4[i].equals(r5[i])) {
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0R(this.A01.getName(), "<>");
    }

    public S69(Class cls, C268894eF[] r2, int i) {
        this.A01 = cls;
        this.A02 = r2;
        this.A00 = i;
    }
}
