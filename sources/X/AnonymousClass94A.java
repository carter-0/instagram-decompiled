package X;

/* renamed from: X.94A  reason: invalid class name */
public final class AnonymousClass94A {
    public final int A00;
    public final Exception A01;
    public final Integer A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("resultCode ");
        sb.append(this.A00);
        Integer num = this.A02;
        if (num != null) {
            sb.append(" | errorCode ");
            sb.append(num);
        }
        Exception exc = this.A01;
        if (exc != null) {
            sb.append(" | exception ");
            sb.append(exc.toString());
        }
        return sb.toString();
    }

    public AnonymousClass94A(Exception exc, Integer num, int i) {
        this.A00 = i;
        this.A01 = exc;
        this.A02 = num;
    }
}
