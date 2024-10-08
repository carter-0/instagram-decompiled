package X;

public final class WKB implements C20882X2k {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ boolean A02;

    public WKB(C307896Rx r1, C277014uI r2, boolean z) {
        this.A02 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DWn(AnonymousClass4OB r4, Integer num) {
        if (this.A02 && r4 == AnonymousClass4OB.NEVER_ASK_AGAIN) {
            r4 = AnonymousClass4OB.DENIED;
        }
        C277014uI r2 = this.A01;
        C308276Tl r1 = new C308276Tl();
        r1.A01(r4.A00);
        C299275ur.A00(this.A00, r1.A00(), r2);
    }
}
