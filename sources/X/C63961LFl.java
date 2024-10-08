package X;

/* renamed from: X.LFl  reason: case insensitive filesystem */
public final class C63961LFl {
    public final Integer A00;
    public final String A01;

    public C63961LFl(Integer num, String str) {
        0qQ.A0B(str, 2);
        this.A00 = num;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63961LFl) {
                C63961LFl lFl = (C63961LFl) obj;
                if (this.A00 != lFl.A00 || !0qQ.A0K(this.A01, lFl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return C41845B3m.A01(this.A01, C51971G9r.A0D(num, C62968KpK.A00(num)) * 31);
    }

    public final String toString() {
        return 002.A0v("StickerID(idType=", C62968KpK.A00(this.A00), ", rawTypeaheadId=", this.A01, ')');
    }
}
