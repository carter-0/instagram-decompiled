package X;

/* renamed from: X.WoH  reason: case insensitive filesystem */
public final class C20266WoH implements Runnable {
    public final /* synthetic */ C19882WhB A00;
    public final /* synthetic */ 02R A01;
    public final /* synthetic */ Object A02;

    public C20266WoH(C19882WhB whB, 02R r2, Object obj) {
        this.A00 = whB;
        this.A01 = r2;
        this.A02 = obj;
    }

    public final void run() {
        this.A01.accept(this.A02);
    }
}
