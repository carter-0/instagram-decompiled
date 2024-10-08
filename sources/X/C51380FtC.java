package X;

/* renamed from: X.FtC  reason: case insensitive filesystem */
public final class C51380FtC implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public C51380FtC(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final void run() {
        C310336ap A0a = DbS.A0a();
        A0a.A0D = this.A01;
        A0a.A0I = this.A00;
        A0a.A06();
        DbY.A1N(A0a);
    }
}
