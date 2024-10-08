package X;

/* renamed from: X.9In  reason: invalid class name and case insensitive filesystem */
public final class C376579In extends AnonymousClass0T0 {
    public String A00;
    public final int A01;

    public C376579In(String str, int i) {
        this.A01 = i;
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 4:
                0qQ.A0B(str, 1);
                break;
        }
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
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
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C376579In)) {
            return false;
        }
        C376579In r3 = (C376579In) obj;
        if (r3.A01 != i || !0qQ.A0K(this.A00, r3.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A01;
        String str = this.A00;
        if (2 - i == 0 && str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C376579In() {
        this((String) null, 2);
        this.A01 = 2;
        this.A01 = 2;
    }
}
