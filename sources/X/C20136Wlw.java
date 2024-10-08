package X;

/* renamed from: X.Wlw  reason: case insensitive filesystem */
public final class C20136Wlw implements Runnable {
    public final /* synthetic */ C18984WFl A00;
    public final /* synthetic */ Object A01;

    public C20136Wlw(C18984WFl wFl, Object obj) {
        this.A00 = wFl;
        this.A01 = obj;
    }

    public final void run() {
        this.A00.A00.onSuccess(this.A01);
    }
}
