package X;

/* renamed from: X.7xT  reason: invalid class name and case insensitive filesystem */
public final class C347847xT extends 0ng {
    public final /* synthetic */ 1NA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C347847xT(1NA r4) {
        super(408, 4, false, false);
        this.A00 = r4;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.7xU, java.lang.Object] */
    public final void run() {
        1NA r5 = this.A00;
        ? obj = new Object();
        1NL r3 = r5.A00;
        obj.A00 = r3;
        synchronized (r3) {
            if (!r5.A00.A00.isEmpty()) {
                r5.A02.A05(002.A0R("pending_reel_tray_seen_state_", r5.A03.A06), obj);
            }
        }
    }
}
