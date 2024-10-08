package X;

import java.util.Map;

/* renamed from: X.Lnm  reason: case insensitive filesystem */
public final class C65124Lnm implements C66479MTh {
    public final 1Av A00;
    public final C65123Lnl A01 = new C65123Lnl(this);
    public final Map A02 = 0Yt.A0E();

    public C65124Lnm(1Av r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final int Ay4(String str) {
        C66479MTh mTh = (C66479MTh) this.A02.get(str);
        if (mTh == null) {
            mTh = this.A01;
        }
        return mTh.Ay4(str);
    }

    public final void EJx(String str, int i) {
        C66479MTh mTh = (C66479MTh) this.A02.get(str);
        if (mTh == null) {
            mTh = this.A01;
        }
        mTh.EJx(str, i);
    }
}
