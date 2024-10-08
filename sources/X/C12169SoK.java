package X;

/* renamed from: X.SoK  reason: case insensitive filesystem */
public final class C12169SoK implements C13712Tfa {
    public final /* synthetic */ C7614QQe A00;

    public final void Ew0(String str, String str2) {
        0qQ.A0B(str2, 1);
        0fA r1 = this.A00.A01;
        if (r1 != null) {
            0f9 AEf = r1.AEf(str, 817899599);
            AEf.ERJ(new RKZ(str2));
            AEf.report();
        }
    }

    public C12169SoK(C7614QQe qQe) {
        this.A00 = qQe;
    }

    public final void Ew3(String str, Throwable th) {
        AnonymousClass7TG.A1N(str, th);
        0fA r1 = this.A00.A01;
        if (r1 != null) {
            0f9 AEf = r1.AEf(str, 817899599);
            AEf.ERJ(th);
            AEf.report();
        }
    }
}
