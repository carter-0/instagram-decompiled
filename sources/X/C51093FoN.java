package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FoN  reason: case insensitive filesystem */
public final class C51093FoN implements G83 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 0wc A01;
    public final /* synthetic */ C307896Rx A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ C277014uI A04;
    public final /* synthetic */ String A05;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public C51093FoN(FragmentActivity fragmentActivity, 0wc r2, C307896Rx r3, C277014uI r4, C277014uI r5, String str) {
        this.A01 = r2;
        this.A05 = str;
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public final void DEH(Integer num) {
        DbS.A1Q(this.A02, this.A03);
    }

    public final void onSuccess() {
        AnonymousClass73V.A0D(this.A01, this.A05);
        FragmentActivity fragmentActivity = this.A00;
        if (DbT.A0F(fragmentActivity).A0M() <= 1) {
            fragmentActivity.finish();
        }
        DbS.A1Q(this.A02, this.A04);
    }
}
