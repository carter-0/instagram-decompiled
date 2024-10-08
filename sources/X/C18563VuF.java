package X;

/* renamed from: X.VuF  reason: case insensitive filesystem */
public final class C18563VuF {
    public static final C18563VuF A04;
    public static final C18563VuF A05;
    public final C18554Vu6 A00;
    public final C18554Vu6 A01;
    public final C18554Vu6 A02;
    public final C18554Vu6 A03;

    static {
        C18554Vu6 vu6 = C18554Vu6.A03;
        A05 = new C18563VuF(vu6, vu6, vu6, vu6);
        C18554Vu6 vu62 = C18554Vu6.A02;
        A04 = new C18563VuF(vu6, vu62, vu6, vu62);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{left=");
        sb.append(this.A01);
        sb.append(", top=");
        sb.append(this.A03);
        sb.append(", right=");
        sb.append(this.A02);
        sb.append(", bottom=");
        return Pxg.A0p(this.A00, sb);
    }

    public C18563VuF(C18554Vu6 vu6, C18554Vu6 vu62, C18554Vu6 vu63, C18554Vu6 vu64) {
        this.A01 = vu6;
        this.A03 = vu62;
        this.A02 = vu63;
        this.A00 = vu64;
    }
}
