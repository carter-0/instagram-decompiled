package X;

public final class E8W extends C48167Ea9 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8W) {
                E8W e8w = (E8W) obj;
                if (!0qQ.A0K(this.A01, e8w.A01) || !0qQ.A0K(this.A02, e8w.A02) || this.A00 != e8w.A00 || this.A03 != e8w.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A01) * 31;
        return DbS.A06(this.A03, (AnonymousClass7TF.A08(this.A02, A0E) + this.A00) * 31);
    }

    public E8W(String str, String str2, int i, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = z;
    }
}
