package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.LxA  reason: case insensitive filesystem */
public final class C65633LxA implements C358118aO {
    public final /* synthetic */ C63768L6a A00;
    public final /* synthetic */ ReelDashboardFragment A01;

    public C65633LxA(C63768L6a l6a, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = l6a;
        this.A01 = reelDashboardFragment;
    }

    public final void Dk9() {
        this.A00.A00 = true;
        C14625TzX tzX = this.A01.mListAdapter;
        if (tzX != null) {
            tzX.A07();
        }
    }
}
