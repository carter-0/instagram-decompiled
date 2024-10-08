package X;

public final class OJf {
    public final /* synthetic */ NIZ A00;

    public OJf(NIZ niz) {
        this.A00 = niz;
    }

    public final void A00() {
        0hq parentFragmentManager;
        NIZ niz = this.A00;
        AnonymousClass0eM r4 = niz.A02;
        0lg A0X = DbT.A0X(r4);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, A0X, 36311569076126302L) || 182.A06(r3, DbT.A0X(r4), 36311569077109357L)) {
            parentFragmentManager = niz.getParentFragmentManager();
        } else {
            parentFragmentManager = niz.requireActivity().getSupportFragmentManager();
            if (parentFragmentManager == null) {
                return;
            }
        }
        parentFragmentManager.A0c();
    }
}
