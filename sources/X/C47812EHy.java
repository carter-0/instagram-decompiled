package X;

/* renamed from: X.EHy  reason: case insensitive filesystem */
public final class C47812EHy extends 0ng {
    public final /* synthetic */ 2E8 A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47812EHy(2E8 r4, String str) {
        super(299650754, 4, false, false);
        this.A00 = r4;
        this.A01 = str;
    }

    public final void run() {
        2E8 r3 = this.A00;
        Boolean hasDbCreatedFlag = r3.hasDbCreatedFlag();
        if (hasDbCreatedFlag != null && !hasDbCreatedFlag.booleanValue()) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r3.A00), "ig_direct_db_drop_detected");
            if (A0e.isSampled()) {
                A0e.AAJ("db_name", this.A01);
                A0e.Cgf();
            }
            0KC.A0C("DatabaseDropDetectionCallback", "Database drop was detected.");
            r3.saveConfigToDatabase();
        }
    }
}
