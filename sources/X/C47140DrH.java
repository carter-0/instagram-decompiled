package X;

/* renamed from: X.DrH  reason: case insensitive filesystem */
public final class C47140DrH extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;

    public C47140DrH(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47140DrH) {
                C47140DrH drH = (C47140DrH) obj;
                if (!0qQ.A0K(this.A00, drH.A00) || !0qQ.A0K(this.A01, drH.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
