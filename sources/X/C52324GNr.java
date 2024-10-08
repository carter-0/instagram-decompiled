package X;

/* renamed from: X.GNr  reason: case insensitive filesystem */
public final class C52324GNr extends AnonymousClass0T0 {
    public final Integer A00;
    public final Long A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52324GNr) {
                C52324GNr gNr = (C52324GNr) obj;
                if (!0qQ.A0K(this.A02, gNr.A02) || !0qQ.A0K(this.A01, gNr.A01) || !0qQ.A0K(this.A00, gNr.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C52324GNr(Integer num, Long l, String str) {
        this.A02 = str;
        this.A01 = l;
        this.A00 = num;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipsItemCacheData(id=");
        A1A.append(this.A02);
        A1A.append(", rankedAtSecond=");
        A1A.append(this.A01);
        A1A.append(", type=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
