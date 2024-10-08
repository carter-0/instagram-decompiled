package X;

/* renamed from: X.N8m  reason: case insensitive filesystem */
public final class C68275N8m extends AnonymousClass0T0 implements C74256Prk {
    public final int A00;
    public final String A01;

    public C68275N8m(String str, int i) {
        this.A00 = i;
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
        if (!(obj instanceof C68275N8m)) {
            return false;
        }
        C68275N8m n8m = (C68275N8m) obj;
        if (n8m.A00 != i || !0qQ.A0K(this.A01, n8m.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
