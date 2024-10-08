package X;

/* renamed from: X.8oz  reason: invalid class name and case insensitive filesystem */
public final class C366478oz implements C344737sL, C344747sM {
    public C344567s4 A00;
    public final C344407ro A01;
    public final C361218fr A02;

    public final void ACn(C345897uG r1) {
    }

    public final int AlC() {
        return 0;
    }

    public final boolean CKm() {
        return true;
    }

    public final /* synthetic */ C345137sz EEw(C345137sz r1, C345097sv r2, C344697sH r3, Long l) {
        return r1;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Av8, java.lang.RuntimeException] */
    public final /* synthetic */ void EEx(C344697sH r5, Long l) {
        try {
            ((C344687sG) r5).A07.A01((C345137sz) r5.BHP(0), (C345097sv) null);
        } catch (Throwable th) {
            ((C344687sG) r5).A05.A05(new RuntimeException("MediaGraph.render() failed.", th));
        }
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
    }

    public final void FMh(int i, Object obj) {
    }

    public final void detach() {
    }

    public final void release() {
    }

    public final /* synthetic */ int Avq() {
        return 0;
    }

    public final void CMa(C344567s4 r2) {
        this.A00 = r2;
        r2.A03(this.A02);
    }

    public final /* synthetic */ boolean Cag() {
        return false;
    }

    public C366478oz(C344407ro r2) {
        r2 = r2 == null ? C344407ro.A01 : r2;
        this.A01 = r2;
        this.A02 = new C361218fr(r2);
    }

    public C366478oz() {
        C344407ro r1 = C344407ro.A01;
        this.A01 = r1;
        this.A02 = new C361218fr(r1);
    }
}
