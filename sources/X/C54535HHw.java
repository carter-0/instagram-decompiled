package X;

/* renamed from: X.HHw  reason: case insensitive filesystem */
public final class C54535HHw extends HQ1 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54535HHw) {
                C54535HHw hHw = (C54535HHw) obj;
                if (!0qQ.A0K(this.A00, hHw.A00) || !0qQ.A0K(this.A01, hHw.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("SubmitPositiveFeedback(requestId=", this.A00, ", responseId=", this.A01, ')');
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C54535HHw(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
