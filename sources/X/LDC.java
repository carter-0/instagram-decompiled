package X;

public final class LDC {
    public final String A00;
    public final String A01;
    public final String A02;

    public LDC(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final String A00(String str) {
        StringBuilder A0n = AnonymousClass7TF.A0n(str);
        A0n.append(':');
        A0n.append(this.A01);
        A0n.append(',');
        A0n.append(this.A02);
        A0n.append(',');
        return AnonymousClass7TF.A0l(this.A00, A0n);
    }
}
