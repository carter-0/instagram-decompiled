package X;

/* renamed from: X.PmL  reason: case insensitive filesystem */
public final class C73941PmL extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final long A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73941PmL(long j, long j2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        String str;
        int i = this.A00;
        C63010xe r6 = (C63010xe) obj;
        0qQ.A0B(r6, 0);
        long j2 = this.A01;
        C262294Dd r3 = r6.A00;
        if (i != 0) {
            r3.E5b("last_app_task_removal_timestamp", j2);
            j = this.A02;
            str = "last_app_task_removal_unixtime";
        } else {
            r3.E5b(AnonymousClass000.A00(1539), j2);
            j = this.A02;
            str = "last_app_background_unixtime";
        }
        r3.E5b(str, j);
        return C60340gF.A00;
    }
}
