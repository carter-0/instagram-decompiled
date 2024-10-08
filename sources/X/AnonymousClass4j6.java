package X;

/* renamed from: X.4j6  reason: invalid class name */
public final class AnonymousClass4j6 extends AnonymousClass475 {
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4j6(String str, int i, String str2) {
        super(002.A0b(str, " failed with ", i));
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 3);
        this.A02 = str;
        this.A00 = i;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append(" failed with ");
        sb.append(this.A00);
        sb.append(' ');
        sb.append(this.A01);
        return sb.toString();
    }
}
