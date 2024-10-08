package X;

/* renamed from: X.Dbr  reason: case insensitive filesystem */
public final class C46323Dbr extends AnonymousClass0T0 implements G5K {
    public final String A00;

    public C46323Dbr(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46323Dbr) && 0qQ.A0K(this.A00, ((C46323Dbr) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0S("UserId(id=", this.A00, ')');
    }
}
