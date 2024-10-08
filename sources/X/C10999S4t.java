package X;

/* renamed from: X.S4t  reason: case insensitive filesystem */
public final class C10999S4t {
    public final int A00;
    public final C11171SDo A01;
    public final String A02;
    public final String A03;
    public final String A04 = "main.jsbundle";
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C10999S4t s4t = (C10999S4t) obj;
            if (this.A00 != s4t.A00 || !2PP.A00(this.A03, s4t.A03)) {
                return false;
            }
        }
        return true;
    }

    public C10999S4t(C11171SDo sDo, String str, String str2, int i) {
        this.A03 = str2;
        this.A00 = i;
        this.A02 = str;
        this.A01 = sDo;
        StringBuilder A0n = AnonymousClass7TF.A0n("main.jsbundle");
        A0n.append(":");
        A0n.append(str2);
        this.A05 = Pxg.A0t(":", A0n, i);
    }

    public final int hashCode() {
        return Pxf.A0B("main.jsbundle", this.A03, Integer.valueOf(this.A00));
    }
}
