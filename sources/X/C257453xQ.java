package X;

/* renamed from: X.3xQ  reason: invalid class name and case insensitive filesystem */
public final class C257453xQ extends C257443xP {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C257453xQ) {
            return this.A00.equals(((C257453xQ) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pxd.A00(159));
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public C257453xQ(Object obj) {
        this.A00 = obj;
    }
}
