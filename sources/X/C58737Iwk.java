package X;

/* renamed from: X.Iwk  reason: case insensitive filesystem */
public final class C58737Iwk extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58737Iwk(long j, String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            AnonymousClass5Q4 r4 = (AnonymousClass5Q4) obj2;
            C51970G9q.A15(r4);
            String str = this.A02;
            if (str == null || str.length() == 0) {
                r4.AQv((C288195bW) null, C289635dw.A00, 1.0f, 3, this.A01, 0, C51968G9o.A0H(r4), AnonymousClass6GS.A00);
            }
            return C60340gF.A00;
        }
        0f9 r42 = (0f9) obj2;
        0qQ.A0B(r42, 0);
        r42.ABP("sizeInBytes", this.A01);
        r42.ABQ("fileExtension", this.A02);
        return r42;
    }
}
