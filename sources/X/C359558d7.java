package X;

/* renamed from: X.8d7  reason: invalid class name and case insensitive filesystem */
public final class C359558d7 implements 1wn {
    public final /* synthetic */ C3503184e A00;
    public final /* synthetic */ C357648Za A01;

    public C359558d7(C3503184e r1, C357648Za r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1399575593);
        C359568d8 r8 = (C359568d8) obj;
        int A032 = AnonymousClass0fD.A03(-970871784);
        0qQ.A0B(r8, 0);
        C357648Za r5 = this.A01;
        if (0qQ.A0K(r5.A02, r8.A01)) {
            C69344Njj njj = r8.A00;
            int ordinal = njj.ordinal();
            if (ordinal == 1) {
                r5.A03(true);
            } else if (ordinal == 2) {
                r5.A03(false);
            } else if (ordinal != 3) {
                0wb.A03("FlmConsentController", "Invalid FLM consent outcome");
                r5.A02 = null;
                r5.A00 = null;
                r5.A01 = null;
                i = -182892577;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(1644163826, A03);
            }
            this.A00.AJL(njj);
        }
        i = 360931537;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(1644163826, A03);
    }
}
