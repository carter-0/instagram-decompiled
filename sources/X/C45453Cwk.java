package X;

/* renamed from: X.Cwk  reason: case insensitive filesystem */
public final class C45453Cwk {
    public final int A00;
    public final String A01;
    public final String A02;

    public C45453Cwk(String str, int i, String str2) {
        0qQ.A0B(str2, 3);
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C45453Cwk) || !0qQ.A0K(this.A01, ((C45453Cwk) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
