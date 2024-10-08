package X;

/* renamed from: X.Jyv  reason: case insensitive filesystem */
public final class C61202Jyv extends AnonymousClass0T0 implements MQX {
    public final int A00;
    public final String A01;
    public final String A02;

    public C61202Jyv(String str, String str2, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C61202Jyv)) {
            return false;
        }
        C61202Jyv jyv = (C61202Jyv) obj;
        if (jyv.A00 != i || !0qQ.A0K(this.A02, jyv.A02) || !0qQ.A0K(this.A01, jyv.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A01);
    }
}
