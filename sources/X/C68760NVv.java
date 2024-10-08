package X;

/* renamed from: X.NVv  reason: case insensitive filesystem */
public final class C68760NVv extends C69587NoV {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68760NVv) {
                C68760NVv nVv = (C68760NVv) obj;
                if (!0qQ.A0K(this.A00, nVv.A00) || this.A01 != nVv.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }

    public C68760NVv(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
