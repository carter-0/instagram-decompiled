package X;

/* renamed from: X.GQe  reason: case insensitive filesystem */
public final class C52379GQe extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C298575tg A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52379GQe(C298575tg r2, float f, long j, long j2, boolean z) {
        super(1);
        this.A00 = f;
        this.A04 = z;
        this.A02 = j;
        this.A03 = r2;
        this.A01 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Q3 A0T = C51968G9o.A0T(obj);
        float f = this.A00 * 360.0f;
        if (this.A04) {
            C52378GQd.A02(A0T, this.A03, 270.0f, 360.0f, this.A02);
        }
        AnonymousClass5Q3 r4 = A0T;
        C52378GQd.A02(r4, this.A03, 270.0f, f, this.A01);
        return C60340gF.A00;
    }
}
