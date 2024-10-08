package X;

import android.app.Activity;

/* renamed from: X.AdG  reason: case insensitive filesystem */
public final /* synthetic */ class C40507AdG implements C46199DQb {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 2Er A01;
    public final /* synthetic */ C329067Hl A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C40507AdG(Activity activity, 2Er r2, C329067Hl r3, String str) {
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = str;
        this.A01 = r2;
    }

    public final void DOY(C257443xP r6) {
        C329067Hl r4 = this.A02;
        Activity activity = this.A00;
        String str = this.A03;
        2Er r1 = this.A01;
        if (r6.A06()) {
            r4.A0v = (N3L) r6.A03();
        }
        activity.runOnUiThread(new C3268978o(activity, r1, r4, str));
    }
}
