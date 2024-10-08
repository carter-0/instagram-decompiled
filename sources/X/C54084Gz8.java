package X;

/* renamed from: X.Gz8  reason: case insensitive filesystem */
public final class C54084Gz8 extends ILG {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54084Gz8) {
                C54084Gz8 gz8 = (C54084Gz8) obj;
                if (this.A00 != gz8.A00 || !0qQ.A0K(this.A02, gz8.A02) || !0qQ.A0K(this.A01, gz8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A02, this.A00 * 31));
    }

    public C54084Gz8(int i, String str, String str2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
