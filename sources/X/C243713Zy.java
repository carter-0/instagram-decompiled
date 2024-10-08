package X;

/* renamed from: X.3Zy  reason: invalid class name and case insensitive filesystem */
public final class C243713Zy {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C243713Zy) {
                C243713Zy r5 = (C243713Zy) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0l("CacheKey(globalKey=", this.A01, ", index=", ')', this.A00);
    }

    public C243713Zy(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
