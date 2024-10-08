package X;

/* renamed from: X.Qxs  reason: case insensitive filesystem */
public final class C8610Qxs extends RPW {
    public final String A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof RPW) && this.A00.equals(((C8610Qxs) ((RPW) obj)).A00));
    }

    public final int hashCode() {
        return (this.A00.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IntegrityTokenRequest{nonce=");
        A1A.append(str);
        A1A.append(", cloudProjectNumber=");
        return C66582MXn.A0v((Object) null, A1A);
    }

    public /* synthetic */ C8610Qxs(String str) {
        this.A00 = str;
    }
}
