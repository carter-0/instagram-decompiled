package X;

/* renamed from: X.Iwo  reason: case insensitive filesystem */
public final class C58741Iwo extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass2DO A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58741Iwo(AnonymousClass2DO r2, float f, long j, long j2) {
        super(1);
        this.A02 = j;
        this.A00 = f;
        this.A01 = j2;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C288185bV A0R;
        AnonymousClass6GH r10 = (AnonymousClass6GH) obj;
        0qQ.A0B(r10, 0);
        long j = this.A02;
        if (j == AnonymousClass5RW.A08) {
            A0R = null;
        } else {
            A0R = C51968G9o.A0R(j);
        }
        float f = this.A00;
        long j2 = this.A01;
        return r10.A00(new C58796Ixh(this.A03, A0R, 1.0f, f, (f / 2.0f) + 1.0f, 0, j2));
    }
}
