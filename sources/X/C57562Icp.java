package X;

/* renamed from: X.Icp  reason: case insensitive filesystem */
public final class C57562Icp implements JMP {
    public final String A00;

    public C57562Icp(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C57562Icp) && 0qQ.A0K(this.A00, ((C57562Icp) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return G9w.A0k("ShowSearchLinkSources(sourcesUrl=", this.A00);
    }
}
