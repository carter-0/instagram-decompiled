package X;

/* renamed from: X.6IQ  reason: invalid class name */
public final class AnonymousClass6IQ {
    public final C62320sa A00;
    public final C62320sa A01;
    public final boolean A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScrollAxisRange(value=");
        sb.append(((Number) this.A01.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.A00.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass6IQ(C62320sa r1, C62320sa r2, boolean z) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = z;
    }
}
