package X;

/* renamed from: X.M2e  reason: case insensitive filesystem */
public final class C65863M2e implements Runnable {
    public final /* synthetic */ C64724Lh1 A00;

    public C65863M2e(C64724Lh1 lh1) {
        this.A00 = lh1;
    }

    public final void run() {
        C347017w8 r0;
        UOC A002;
        C64724Lh1 lh1 = this.A00;
        if (lh1.A00 == null) {
            C64724Lh1.A01(lh1);
        }
        C64724Lh1.A06(lh1);
        C64724Lh1.A05(lh1);
        C66540MVu mVu = lh1.A06;
        if (mVu != null) {
            mVu.FHa(lh1.A0F);
        }
        if (!lh1.A0B && (r0 = lh1.A04) != null && (A002 = C63153KsM.A00(r0)) != null) {
            lh1.A0N.A1L(A002);
        }
    }
}
