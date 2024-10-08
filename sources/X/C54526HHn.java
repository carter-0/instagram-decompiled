package X;

/* renamed from: X.HHn  reason: case insensitive filesystem */
public final class C54526HHn extends HQ1 {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C54526HHn) && this.A00 == ((C54526HHn) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return C51971G9r.A0D(num, LKT.A01(num));
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            str = LKT.A01(num);
        } else {
            str = "null";
        }
        return G9w.A0k("GeneratedVisible(imagineType=", str);
    }

    public C54526HHn(Integer num) {
        this.A00 = num;
    }
}
