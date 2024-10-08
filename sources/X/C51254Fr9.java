package X;

/* renamed from: X.Fr9  reason: case insensitive filesystem */
public final class C51254Fr9 implements Runnable {
    public final /* synthetic */ E38 A00;

    public C51254Fr9(E38 e38) {
        this.A00 = e38;
    }

    public final void run() {
        E38 e38 = this.A00;
        if (e38.isResumed()) {
            if (e38.requireParentFragment().getChildFragmentManager().A0M() > 0) {
                e38.requireParentFragment().getChildFragmentManager().A0c();
            } else {
                DbT.A1J(e38);
            }
            Dba.A0m(e38.getActivity(), 2dZ.A0t);
        }
    }
}
