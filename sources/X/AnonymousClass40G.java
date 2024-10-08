package X;

/* renamed from: X.40G  reason: invalid class name */
public final class AnonymousClass40G extends AnonymousClass0T0 {
    public static final AnonymousClass40H Companion = new Object();
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OdinResult(result=");
        sb.append(this.A00);
        sb.append(", isSuccess=");
        sb.append(this.A02);
        sb.append(", error=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass40G(Object obj, String str, boolean z) {
        this.A00 = obj;
        this.A02 = z;
        this.A01 = str;
    }
}
