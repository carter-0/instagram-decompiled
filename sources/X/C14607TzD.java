package X;

/* renamed from: X.TzD  reason: case insensitive filesystem */
public final class C14607TzD implements Runnable {
    public final /* synthetic */ C14560TyP A00;
    public final /* synthetic */ C14554TyJ A01;

    public C14607TzD(C14560TyP tyP, C14554TyJ tyJ) {
        this.A00 = tyP;
        this.A01 = tyJ;
    }

    public final void run() {
        C14560TyP tyP = this.A00;
        tyP.post(new C20121Wlh(tyP, this.A01));
    }
}
