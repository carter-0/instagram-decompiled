package X;

/* renamed from: X.7aM  reason: invalid class name and case insensitive filesystem */
public final class C333917aM implements AnonymousClass0lh {
    public AnonymousClass3Q2 A00;
    public AnonymousClass3Q2 A01;
    public final 1ua A02;

    public final void onSessionWillEnd() {
        A00((AnonymousClass0iw) null);
        this.A00 = null;
        this.A01 = null;
    }

    public final void A00(AnonymousClass0iw r10) {
        AnonymousClass3Q2 r1 = this.A00;
        if (r1 != null) {
            AnonymousClass0iw r3 = r10;
            if (r1.A0u()) {
                for (AnonymousClass3Q2 r0 : r1.A0L()) {
                    this.A02.A06(r3, r0.A35, "cancel_upload", false, true, true);
                }
            } else {
                this.A02.A06(r3, r1.A35, "cancel_upload", false, true, true);
            }
        }
        this.A00 = null;
    }

    public C333917aM(1ua r1) {
        this.A02 = r1;
    }
}
