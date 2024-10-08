package X;

/* renamed from: X.6RK  reason: invalid class name */
public final class AnonymousClass6RK {
    public final Object A00;
    public final Runnable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6RK) {
                AnonymousClass6RK r5 = (AnonymousClass6RK) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscribeResult(snapshot=");
        sb.append(this.A00);
        sb.append(", cancelToken=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass6RK(Runnable runnable, Object obj) {
        this.A00 = obj;
        this.A01 = runnable;
    }
}
