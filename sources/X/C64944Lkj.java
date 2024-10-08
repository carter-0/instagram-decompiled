package X;

/* renamed from: X.Lkj  reason: case insensitive filesystem */
public abstract class C64944Lkj implements C66568MWw {
    public final int A00;
    public final int A01;
    public final C66534MVo A02;
    public final String A03;

    public C64944Lkj(C66534MVo mVo, String str, int i, int i2) {
        0qQ.A0B(str, 2);
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = mVo;
    }

    public final C66534MVo ArI() {
        return this.A02;
    }

    public final int BEU() {
        return this.A01;
    }

    public final String getName() {
        return this.A03;
    }
}
