package X;

public final class N8Y extends AnonymousClass0T0 implements C74249Prd {
    public final int A00;
    public final String A01;

    public N8Y(String str, int i) {
        this.A00 = i;
        0qQ.A0B(str, 1);
        this.A01 = str;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof N8Y) || ((N8Y) obj).A00 != i) {
            return false;
        }
        return true;
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
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((N8Y) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
