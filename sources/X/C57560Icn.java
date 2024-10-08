package X;

/* renamed from: X.Icn  reason: case insensitive filesystem */
public final class C57560Icn implements JMP {
    public final String A00;

    public C57560Icn(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C57560Icn) && 0qQ.A0K(this.A00, ((C57560Icn) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return G9w.A0k("LaunchReel(reelUrl=", this.A00);
    }
}
