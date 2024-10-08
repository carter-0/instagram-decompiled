package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.WHg  reason: case insensitive filesystem */
public final /* synthetic */ class C19029WHg implements 2Kw {
    public final /* synthetic */ ReelDashboardFragment A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C19029WHg(ReelDashboardFragment reelDashboardFragment, String str) {
        this.A00 = reelDashboardFragment;
        this.A01 = str;
    }

    public final void invoke(Throwable th) {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        String str = this.A01;
        C14625TzX tzX = reelDashboardFragment.mListAdapter;
        if (tzX != null) {
            tzX.A0A(str, false);
        }
    }
}
