package X;

/* renamed from: X.6Ic  reason: invalid class name */
public final class AnonymousClass6Ic {
    public final C62320sa A00;
    public final 1IX A01;

    public final String toString() {
        1IX r3 = this.A01;
        r3.getContext().get(C13279TSu.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("Request@");
        String num = Integer.toString(hashCode(), 16);
        0qQ.A07(num);
        sb.append(num);
        sb.append("(");
        sb.append("currentBounds()=");
        sb.append(this.A00.invoke());
        sb.append(", continuation=");
        sb.append(r3);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass6Ic(C62320sa r1, 1IX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
