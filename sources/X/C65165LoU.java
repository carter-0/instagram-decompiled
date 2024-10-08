package X;

/* renamed from: X.LoU  reason: case insensitive filesystem */
public final class C65165LoU implements MSC {
    public final /* synthetic */ C64940Lkf A00;

    public C65165LoU(C64940Lkf lkf) {
        this.A00 = lkf;
    }

    public final void Drn(int i) {
        C64940Lkf lkf = this.A00;
        C64940Lkf.A01(lkf, i);
        C64940Lkf.A00(lkf);
        if (!lkf.A0M && JTQ.A1P(C63523KyY.A00, 2)) {
            C353998Kg r0 = lkf.A0F;
            if (r0 != null) {
                r0.EEp();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
