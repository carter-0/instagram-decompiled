package X;

public final /* synthetic */ class Q4N implements Runnable {
    public final /* synthetic */ C307446Qd A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ Q4N(C307446Qd r1, Object obj, Object obj2, String str, String str2) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = obj;
        this.A04 = str2;
        this.A02 = obj2;
    }

    public final void run() {
        C307446Qd r5 = this.A00;
        String str = this.A03;
        r5.A0B(new Q4M(this.A01, this.A02, str, this.A04));
    }
}
