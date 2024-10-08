package X;

/* renamed from: X.3Pt  reason: invalid class name and case insensitive filesystem */
public final class C241583Pt extends AnonymousClass1Ws {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C241583Pt) || !0qQ.A0K(this.A00, ((C241583Pt) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Throwable th = this.A00;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Closed(");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C241583Pt(Throwable th) {
        this.A00 = th;
    }
}
