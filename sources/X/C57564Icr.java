package X;

/* renamed from: X.Icr  reason: case insensitive filesystem */
public final class C57564Icr implements JMQ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57564Icr) {
                C57564Icr icr = (C57564Icr) obj;
                if (!0qQ.A0K(this.A02, icr.A02) || !0qQ.A0K(this.A03, icr.A03) || !0qQ.A0K(this.A00, icr.A00) || !0qQ.A0K(this.A01, icr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A17("MetaAIReelsData(reelsUrl=", this.A02, ", thumbnailUrl=", this.A03, ", author=", this.A00, AnonymousClass000.A00(401), this.A01, ')');
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public C57564Icr(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }
}
