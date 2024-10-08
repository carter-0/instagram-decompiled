package X;

/* renamed from: X.42b  reason: invalid class name and case insensitive filesystem */
public final class C2595342b extends 1Jm implements C2595242a {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public C2595342b(String str, float f, float f2, int i, int i2, long j) {
        super(str, j, j);
        this.A02 = i;
        this.A03 = i2;
        this.A00 = f;
        this.A01 = f2;
    }

    public final String A00() {
        return "touch down";
    }

    public final String toString() {
        String str;
        int i = this.A03;
        if (i > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.A02);
            sb.append('/');
            sb.append(i);
            sb.append(')');
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("touch down");
        sb2.append(str);
        sb2.append(" on ");
        sb2.append(this.A01);
        sb2.append(" at ");
        sb2.append(this.A00);
        sb2.append(", downtime at ");
        sb2.append(this.A00);
        return sb2.toString();
    }
}
