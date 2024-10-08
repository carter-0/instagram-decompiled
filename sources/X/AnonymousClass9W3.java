package X;

/* renamed from: X.9W3  reason: invalid class name */
public final class AnonymousClass9W3 extends 0ng {
    public final /* synthetic */ 1NA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9W3(1NA r4) {
        super(406, 4, true, true);
        this.A00 = r4;
    }

    public final void run() {
        1NL r0;
        1NA r5 = this.A00;
        if (!r5.A01) {
            1NH r4 = r5.A02;
            String str = r5.A03.A06;
            C347857xU r02 = (C347857xU) r4.A02(002.A0R("pending_reel_tray_seen_state_", str), true);
            if (!(r02 == null || (r0 = r02.A00) == null)) {
                r5.A00 = r0;
                r4.A04(002.A0R("pending_reel_tray_seen_state_", str));
            }
            r5.A01 = true;
        }
    }
}
