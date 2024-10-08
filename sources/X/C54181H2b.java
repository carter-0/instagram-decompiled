package X;

/* renamed from: X.H2b  reason: case insensitive filesystem */
public final class C54181H2b extends AnonymousClass8ZF {
    public final C54430HDc A00;
    public final String A01;
    public final String A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.109, java.lang.Object] */
    public C54181H2b(C54430HDc hDc, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = hDc;
        02z A10 = DbS.A10(new C61046Jvk(20));
        this.A05 = A10;
        this.A06 = 10b.A03(A10);
        1HR r0 = new 1HR(0);
        this.A03 = r0;
        this.A04 = 10b.A01(C318116oQ.A00(this), 0u9.A04(r0), new Object(), 1);
        addCloseable(hDc);
    }
}
