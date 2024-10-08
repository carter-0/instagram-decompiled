package X;

/* renamed from: X.NaO  reason: case insensitive filesystem */
public final class C68886NaO extends C69611Not {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68886NaO) {
                C68886NaO naO = (C68886NaO) obj;
                if (!0qQ.A0K(this.A01, naO.A01) || !0qQ.A0K(this.A00, naO.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A00);
    }

    public C68886NaO(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
