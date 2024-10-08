package X;

/* renamed from: X.WpZ  reason: case insensitive filesystem */
public final class C20336WpZ implements Runnable {
    public final /* synthetic */ C321356tz A00;
    public final /* synthetic */ C331897Sw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C20336WpZ(C321356tz r1, C331897Sw r2, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
        this.A04 = z;
    }

    public final void run() {
        C331897Sw.A02(this.A00, this.A01, this.A03, this.A02);
    }
}
