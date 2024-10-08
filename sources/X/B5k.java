package X;

import com.instagram.feed.media.ImmutablePandoMediaDict;

public final class B5k extends 17P implements C276024sM {
    public 1Xj A00;

    public final 1Xj BPf() {
        1Xj r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'media' field.");
    }

    public final C276024sM E7A(1E9 r3) {
        1Xv r0 = 1Xj.A0h;
        this.A00 = 1Xv.A00(r3, (ImmutablePandoMediaDict) A04(103772132, ImmutablePandoMediaDict.class));
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5k] */
    public final Integer CAf() {
        return getOptionalIntValueByHashCode(3575610);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.17P, X.B5k] */
    public final C276014sL F1W(1E9 r4) {
        return new C276014sL(r4.A00(C41848B3p.A18(r4, this, 103772132)), getOptionalIntValueByHashCode(3575610));
    }
}
