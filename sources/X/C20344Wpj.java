package X;

/* renamed from: X.Wpj  reason: case insensitive filesystem */
public final class C20344Wpj implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ W00 A01;
    public final /* synthetic */ C16529UwZ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C20344Wpj(W00 w00, C16529UwZ uwZ, String str, String str2, String str3, long j) {
        this.A01 = w00;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = uwZ;
        this.A00 = j;
    }

    public final void run() {
        W00.A01(this.A01, this.A02, this.A05, this.A04, this.A03, this.A00);
    }
}
