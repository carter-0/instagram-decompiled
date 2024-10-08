package X;

import android.app.Activity;

/* renamed from: X.APr  reason: case insensitive filesystem */
public final class C40061APr implements AnonymousClass2gO {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C353498Hw A01;

    public C40061APr(Activity activity, C353498Hw r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass6ST r0;
        C353498Hw r1 = this.A01;
        C39642A3g a3g = r1.A09;
        if (!(a3g == null || (r0 = a3g.A00) == null)) {
            r0.dismiss();
        }
        Activity activity = this.A00;
        C59689JTv.A0B(activity, "fetch_media_failed");
        C359338cd r12 = r1.A0A;
        if (r12 != null) {
            r12.A02 = true;
        }
        activity.finish();
    }
}
