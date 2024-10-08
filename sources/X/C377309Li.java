package X;

/* renamed from: X.9Li  reason: invalid class name and case insensitive filesystem */
public final class C377309Li extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377309Li(C249913kZ r2, int i, long j, long j2) {
        super(0);
        this.A00 = i;
        this.A03 = r2;
        if (i != 0) {
            this.A01 = j;
            this.A02 = j2;
        } else {
            this.A02 = j;
            this.A01 = j2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        C249913kZ r4 = (C249913kZ) this.A03;
        if (i != 0) {
            C377309Li.super.onUploadProgress(this.A01, this.A02);
        } else {
            C377309Li.super.onLastByteAcked(this.A02, this.A01);
        }
        return C60340gF.A00;
    }
}
