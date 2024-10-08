package X;

/* renamed from: X.OuD  reason: case insensitive filesystem */
public final class C71981OuD implements C232262tL {
    public boolean A00;
    public final String A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C71981OuD ouD = (C71981OuD) obj;
        0qQ.A0B(ouD, 0);
        return 0qQ.A0K(this.A02, ouD.A02);
    }

    public C71981OuD(String str, boolean z) {
        this.A02 = 002.A0R("header:", str);
        this.A01 = str;
        this.A00 = z;
    }

    public C71981OuD(String str) {
        this.A02 = 002.A0R("header:", str);
        this.A01 = str;
    }
}
