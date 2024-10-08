package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.APe  reason: case insensitive filesystem */
public final class C40048APe implements AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;

    public C40048APe(C353498Hw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass6ST r0;
        C353498Hw r1 = this.A00;
        C39642A3g a3g = r1.A09;
        if (!(a3g == null || (r0 = a3g.A00) == null)) {
            r0.dismiss();
        }
        FragmentActivity fragmentActivity = r1.A15;
        C59689JTv.A0B(fragmentActivity, "fetch_media_failed");
        C359338cd r12 = r1.A0A;
        if (r12 != null) {
            r12.A00 = "";
            r12.A01 = true;
        }
        fragmentActivity.finish();
    }
}
