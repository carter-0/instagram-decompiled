package X;

public final class UMu extends AnonymousClass0T0 implements C21011X9n {
    public final String A00;
    public final String A01;

    public UMu(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UMu) {
                UMu uMu = (UMu) obj;
                if (!0qQ.A0K(this.A00, uMu.A00) || !0qQ.A0K(this.A01, uMu.A01)) {
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
