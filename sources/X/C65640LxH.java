package X;

/* renamed from: X.LxH  reason: case insensitive filesystem */
public final class C65640LxH implements MUE {
    public final /* synthetic */ KYZ A00;

    public C65640LxH(KYZ kyz) {
        this.A00 = kyz;
    }

    public final void D0c() {
        KYZ kyz = this.A00;
        C66461MSp mSp = kyz.A06;
        if (mSp != null) {
            mSp.afterSelection(false);
        }
        kyz.A0B = true;
    }

    public final void D5Z() {
        KYZ kyz = this.A00;
        kyz.A02();
        C66461MSp mSp = kyz.A06;
        if (mSp != null) {
            mSp.afterSelection(true);
        }
        kyz.A0B = true;
    }
}
