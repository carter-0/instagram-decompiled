package X;

/* renamed from: X.N8l  reason: case insensitive filesystem */
public final class C68274N8l extends AnonymousClass0T0 implements C74255Prj {
    public final int A00;
    public final String A01;

    public C68274N8l(String str, int i) {
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
        if (!(obj instanceof C68274N8l)) {
            return false;
        }
        C68274N8l n8l = (C68274N8l) obj;
        if (n8l.A00 != i || !0qQ.A0K(this.A01, n8l.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
