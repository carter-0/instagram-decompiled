package X;

/* renamed from: X.WfP  reason: case insensitive filesystem */
public final class C19782WfP implements C227182im {
    public final /* synthetic */ C14626TzY A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ String A03;

    public C19782WfP(C14626TzY tzY, C307786Rm r2, C276544tV r3, String str) {
        this.A00 = tzY;
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void DmH(int i, int i2) {
        if (!this.A03.equals("top")) {
            i = i2;
        }
        C276544tV r2 = this.A02;
        if (r2.A03(31, 0) != i) {
            C307446Qd A022 = C307476Qg.A02(this.A01);
            A022.A0E(new C15672Ugd(this, i), (long) r2.A03);
            A022.A08();
        }
    }
}
