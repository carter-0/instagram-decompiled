package X;

/* renamed from: X.Dtr  reason: case insensitive filesystem */
public final class C47263Dtr extends AnonymousClass0T0 implements G5E {
    public final int A00;
    public final String A01;

    public C47263Dtr(String str, int i) {
        this.A00 = i;
        0qQ.A0B(str, 1);
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C47263Dtr)) {
            return false;
        }
        C47263Dtr dtr = (C47263Dtr) obj;
        if (dtr.A00 != i || !0qQ.A0K(this.A01, dtr.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
