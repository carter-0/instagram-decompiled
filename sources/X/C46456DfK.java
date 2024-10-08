package X;

/* renamed from: X.DfK  reason: case insensitive filesystem */
public final class C46456DfK extends AnonymousClass0T0 implements G5K {
    public final String A00;

    public C46456DfK(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46456DfK) && 0qQ.A0K(this.A00, ((C46456DfK) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0S("UserName(name=", this.A00, ')');
    }
}
