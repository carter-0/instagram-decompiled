package X;

/* renamed from: X.Wpb  reason: case insensitive filesystem */
public final class C20338Wpb implements Runnable {
    public final /* synthetic */ C321356tz A00;
    public final /* synthetic */ C331897Sw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C20338Wpb(C321356tz r1, C331897Sw r2, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }

    public final void run() {
        C331897Sw r2 = this.A01;
        C321356tz r1 = this.A00;
        String str = r1.A01;
        String str2 = this.A02;
        C331897Sw.A03(r2, str, str2);
        11Z.A02(new C20337Wpa(r1, r2, this.A03, str2, this.A04));
    }
}
