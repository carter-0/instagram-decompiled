package X;

/* renamed from: X.EHp  reason: case insensitive filesystem */
public final class C47803EHp extends 0ng {
    public final /* synthetic */ 2E8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47803EHp(2E8 r4) {
        super(299650754, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        2E8 r2 = this.A00;
        if (r2.saveConfigToDatabase()) {
            DbW.A1L(r2.A01.AR4(), r2.A02);
        }
    }
}
