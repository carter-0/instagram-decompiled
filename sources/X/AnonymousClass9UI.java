package X;

/* renamed from: X.9UI  reason: invalid class name */
public final class AnonymousClass9UI extends 2Cn {
    public final /* synthetic */ AnonymousClass8XA A00;
    public final /* synthetic */ C362058hH A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        AnonymousClass8XA r3 = this.A00;
        C362048hG r0 = r3.A02;
        if (r0 != null) {
            r0.CLL(false);
        }
        C59689JTv.A01(r3.A08, "failed_to_load_photo", 2131961945, 0);
        if (this.A02) {
            C3494680m.A00(C365918nt.A00(r3.A0F), r3, "Photo could not be loaded. ", exc);
        }
    }

    public AnonymousClass9UI(AnonymousClass8XA r1, C362058hH r2, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C352218Cl r4 = (C352218Cl) obj;
        0qQ.A0B(r4, 0);
        AnonymousClass8XA.A04(this.A00, this.A01, r4, this.A03);
    }
}
