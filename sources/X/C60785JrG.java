package X;

/* renamed from: X.JrG  reason: case insensitive filesystem */
public final class C60785JrG extends C62696Kkw {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60785JrG) {
                C60785JrG jrG = (C60785JrG) obj;
                if (!0qQ.A0K(this.A01, jrG.A01) || this.A00 != jrG.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        Integer num = this.A00;
        return A0O + C51971G9r.A0D(num, C62967KpJ.A00(num));
    }

    public final String toString() {
        String str;
        String str2 = this.A01;
        Integer num = this.A00;
        if (num != null) {
            str = C62967KpJ.A00(num);
        } else {
            str = "null";
        }
        return 002.A0v("ODRTemplateErrorEvent(errorMessage=", str2, ", errorType=", str, ')');
    }

    public C60785JrG(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }
}
