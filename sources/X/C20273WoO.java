package X;

/* renamed from: X.WoO  reason: case insensitive filesystem */
public final class C20273WoO implements Runnable {
    public final /* synthetic */ C13919TlL A00;
    public final /* synthetic */ C327297Af A01;
    public final /* synthetic */ String A02;

    public C20273WoO(C13919TlL tlL, C327297Af r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = tlL;
    }

    public final void run() {
        C327297Af r0 = this.A01;
        r0.A00.AOa(new C18978WFf(this.A00, r0.A01), this.A02);
    }
}
