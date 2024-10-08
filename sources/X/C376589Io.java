package X;

/* renamed from: X.9Io  reason: invalid class name and case insensitive filesystem */
public final class C376589Io extends AnonymousClass0T0 implements C334127ai {
    public final int A00;
    public final String A01;

    public C376589Io(String str, int i) {
        this.A00 = i;
        this.A01 = str;
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
        if (!(obj instanceof C376589Io)) {
            return false;
        }
        C376589Io r3 = (C376589Io) obj;
        if (r3.A00 != i || !0qQ.A0K(this.A01, r3.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
