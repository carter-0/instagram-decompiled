package X;

/* renamed from: X.QDy  reason: case insensitive filesystem */
public final class C7459QDy extends C11705Sf2 {
    public final /* synthetic */ C13511Tbc A00;
    public final /* synthetic */ C11702Sez A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7459QDy(C13511Tbc tbc, C13511Tbc tbc2, C11702Sez sez) {
        super(tbc);
        this.A01 = sez;
        this.A00 = tbc2;
    }

    public final S5O Br9(long j) {
        S5O Br9 = this.A00.Br9(j);
        SJ4 sj4 = Br9.A00;
        long j2 = sj4.A01;
        long j3 = sj4.A00;
        long j4 = this.A01.A00;
        SJ4 sj42 = new SJ4(j2, j3 + j4);
        SJ4 sj43 = Br9.A01;
        return new S5O(sj42, new SJ4(sj43.A01, sj43.A00 + j4));
    }
}
