package X;

/* renamed from: X.KMo  reason: case insensitive filesystem */
public final class C61800KMo extends C62764Km2 {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61800KMo) && this.A00 == ((C61800KMo) obj).A00);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "RESUME";
                break;
            case 2:
                str = "RESTART";
                break;
            default:
                str = "PAUSE";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }

    public C61800KMo(Integer num) {
        this.A00 = num;
    }
}
