package X;

/* renamed from: X.Hsf  reason: case insensitive filesystem */
public final class C56092Hsf {
    public final String A00;
    public final String A01;

    public C56092Hsf(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56092Hsf) {
                C56092Hsf hsf = (C56092Hsf) obj;
                if (!0qQ.A0K(this.A00, hsf.A00) || !0qQ.A0K(this.A01, hsf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A14("MetaAILoggingParams(bottomSheetSessionId=", this.A00, ", surfaceSessionId=", this.A01, ", appSessionId=", (String) null, ')');
    }

    public final int hashCode() {
        return (AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31;
    }
}
