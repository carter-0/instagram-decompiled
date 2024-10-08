package X;

/* renamed from: X.4dr  reason: invalid class name and case insensitive filesystem */
public final class C268704dr {
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;

    public C268704dr(String str, String str2, String str3, long j, long j2, long j3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    public final String A00() {
        String A0S = 002.A0S("nid=", this.A04, ';');
        StringBuilder sb = new StringBuilder();
        sb.append(A0S);
        sb.append("nc=");
        sb.append(this.A02);
        sb.append(';');
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("fc=");
        sb2.append(this.A01);
        sb2.append(';');
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append("bc=");
        sb3.append(this.A00);
        sb3.append(';');
        return sb3.toString();
    }
}
