package X;

public final class TKW implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C12135Snf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public TKW(C12135Snf snf, String str, String str2, String str3, String str4, int i) {
        this.A01 = snf;
        this.A00 = i;
        this.A02 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    public final void run() {
        this.A01.A00.onError(this.A00, this.A02, this.A05, this.A04, this.A03);
    }
}
