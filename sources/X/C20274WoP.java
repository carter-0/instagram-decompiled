package X;

/* renamed from: X.WoP  reason: case insensitive filesystem */
public final class C20274WoP implements Runnable {
    public final /* synthetic */ C13920TlM A00;
    public final /* synthetic */ WIM A01;
    public final /* synthetic */ String A02;

    public C20274WoP(C13920TlM tlM, WIM wim, String str) {
        this.A01 = wim;
        this.A02 = str;
        this.A00 = tlM;
    }

    public final void run() {
        WIM wim = this.A01;
        wim.A00.BtW(new C18984WFl(this.A00, wim.A01), this.A02);
    }
}
