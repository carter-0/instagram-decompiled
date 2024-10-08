package X;

/* renamed from: X.5XR  reason: invalid class name */
public final class AnonymousClass5XR {
    public final 0vr A00;

    public final boolean equals(Object obj) {
        0vr r2 = this.A00;
        if (!(obj instanceof AnonymousClass5XR) || !0qQ.A0K(r2, ((AnonymousClass5XR) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        0vr r2 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("MutableScatterMultiMap(map=");
        sb.append(r2);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ AnonymousClass5XR(0vr r1) {
        this.A00 = r1;
    }
}
