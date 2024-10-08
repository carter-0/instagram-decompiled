package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.E7p  reason: case insensitive filesystem */
public final class C47552E7p extends C361158fl {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ FZ1 A01;

    public final void A04(C268654dm r1) {
    }

    public C47552E7p(FragmentActivity fragmentActivity, FZ1 fz1) {
        this.A01 = fz1;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 di0 = (C46620Di0) obj;
        FZ1 fz1 = this.A01;
        fz1.A02 = false;
        if (fz1.A03 && !fz1.A04) {
            0lg r3 = fz1.A06;
            if (!r3.hasEnded()) {
                fz1.A04 = true;
                fz1.A05 = false;
                C229382nI A0N = DbT.A0N(this.A00, new C50226FUi(this), r3);
                A0N.A00 = true;
                C48382Edd.A00(A0N, di0);
            }
        }
    }
}
