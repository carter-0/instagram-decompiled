package X;

/* renamed from: X.NSk  reason: case insensitive filesystem */
public final class C68678NSk extends 0vM {
    public final /* synthetic */ C72939PPx A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68678NSk(C72939PPx pPx) {
        super("MultiInstancesMaybeCompleteForForegroundUser", 726478904, 3, false, false);
        this.A00 = pPx;
    }

    public final void loggedRun() {
        C72939PPx pPx = this.A00;
        02m r1 = pPx.A02;
        if (r1 != null) {
            r1.markerPoint(20131727, "bg_account_mailbox_teardown_start");
        }
        0Jv r12 = pPx.A05;
        if (r12 != null) {
            r12.AId((Object) null);
            02m r13 = pPx.A02;
            if (r13 != null) {
                r13.markerPoint(20131727, "bg_account_mailbox_teardown_end");
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
