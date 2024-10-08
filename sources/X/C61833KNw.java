package X;

/* renamed from: X.KNw  reason: case insensitive filesystem */
public final class C61833KNw extends C62779KmH {
    public final Integer A00;

    public C61833KNw(Integer num) {
        0qQ.A0B(num, 1);
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61833KNw) && this.A00 == ((C61833KNw) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return C51971G9r.A0D(num, C63210KtH.A00(num));
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            str = C63210KtH.A00(num);
        } else {
            str = "null";
        }
        return G9w.A0k("FeatureRowItem(rowItemEnum=", str);
    }
}
