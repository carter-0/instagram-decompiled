package X;

/* renamed from: X.IxU  reason: case insensitive filesystem */
public final class C58783IxU extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58783IxU(C270284gU r2, int i, long j, long j2, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A04 = z;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = z2;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        long j2;
        Object obj2 = obj;
        if (this.A00 != 0) {
            AnonymousClass6GH r4 = (AnonymousClass6GH) obj2;
            0qQ.A0B(r4, 0);
            boolean z = this.A04;
            return r4.A00(new C58783IxU((C270284gU) this.A03, 0, this.A02, this.A01, z, this.A05));
        }
        AnonymousClass5Q4 r42 = (AnonymousClass5Q4) obj2;
        C51970G9q.A15(r42);
        if (this.A04) {
            j = this.A02;
        } else {
            j = this.A01;
        }
        if (this.A05) {
            j2 = C289325dP.A00(C51969G9p.A00(r42) * (1.0f - (C51971G9r.A03((C270284gU) this.A03) / 100.0f)), 0.0f);
        } else {
            j2 = 0;
        }
        r42.AQs((C288195bW) null, C289635dw.A00, 1.0f, 4, j, j2, C288015bE.A00(C51969G9p.A00(r42) * (C51971G9r.A03((C270284gU) this.A03) / 100.0f), C51969G9p.A01(r42)));
        return C60340gF.A00;
    }
}
