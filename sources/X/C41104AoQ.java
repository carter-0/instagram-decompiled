package X;

/* renamed from: X.AoQ  reason: case insensitive filesystem */
public final class C41104AoQ implements Runnable {
    public final /* synthetic */ C391719tX A00;
    public final /* synthetic */ C341687nM A01;
    public final /* synthetic */ String A02;

    public C41104AoQ(C391719tX r1, C341687nM r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void run() {
        C341687nM r4 = this.A01;
        String str = this.A02;
        C391719tX r2 = this.A00;
        r4.DCg(new C391719tX(str, r2, r2.A01));
    }
}
