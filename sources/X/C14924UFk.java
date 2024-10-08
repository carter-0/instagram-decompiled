package X;

/* renamed from: X.UFk  reason: case insensitive filesystem */
public final class C14924UFk extends V28 {
    public final Integer A00;
    public final String A01;

    public C14924UFk(String str, Integer num) {
        0qQ.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14924UFk) {
                C14924UFk uFk = (C14924UFk) obj;
                if (!0qQ.A0K(this.A01, uFk.A01) || this.A00 != uFk.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        Integer num = this.A00;
        return A0O + C51971G9r.A0D(num, C18090VlK.A01(num));
    }
}
