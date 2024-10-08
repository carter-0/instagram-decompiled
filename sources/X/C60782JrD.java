package X;

/* renamed from: X.JrD  reason: case insensitive filesystem */
public final class C60782JrD extends C62695Kkv {
    public final Integer A00;
    public final String A01;

    public C60782JrD(String str, Integer num) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60782JrD) {
                C60782JrD jrD = (C60782JrD) obj;
                if (!0qQ.A0K(this.A01, jrD.A01) || this.A00 != jrD.A00) {
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
        return A0O + C51971G9r.A0D(num, C62966KpI.A00(num));
    }

    public final String toString() {
        String str;
        String str2 = this.A01;
        Integer num = this.A00;
        if (num != null) {
            str = C62966KpI.A00(num);
        } else {
            str = "null";
        }
        return 002.A0v("ExpressoError(message=", str2, ", error=", str, ')');
    }
}
