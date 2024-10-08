package X;

/* renamed from: X.2q0  reason: invalid class name and case insensitive filesystem */
public final class C230672q0 implements C230682q1 {
    public final AnonymousClass4DU A00;
    public final C229762nz A01;
    public final C228472lj A02;
    public final C62320sa A03;

    public C230672q0(AnonymousClass4DU r2, C229762nz r3, C228472lj r4, C62320sa r5) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final void DOM(String str) {
    }

    public final void DjS() {
        int intValue = ((Number) this.A03.invoke()).intValue();
        C229762nz r4 = this.A01;
        C228472lj r3 = this.A02;
        0xI A002 = 0xI.A00(this.A00, "main_feed_loading_more");
        A002.A08(Integer.valueOf(intValue), "position");
        Long A05 = r3.A0f.A05();
        if (A05 != null) {
            A002.A0B("last_feed_update_time", A05);
        }
        C60510iO.A00(r4.A00).EFq(A002);
    }
}
