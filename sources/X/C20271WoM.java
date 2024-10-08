package X;

/* renamed from: X.WoM  reason: case insensitive filesystem */
public final class C20271WoM implements Runnable {
    public final /* synthetic */ C18983WFk A00;
    public final /* synthetic */ C327297Af A01;
    public final /* synthetic */ String A02;

    public C20271WoM(C18983WFk wFk, C327297Af r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = wFk;
    }

    public final void run() {
        C327297Af r0 = this.A01;
        r0.A00.AYi(new UHO(this.A00, r0.A01), this.A02);
    }
}
