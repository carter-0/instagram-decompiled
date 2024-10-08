package X;

/* renamed from: X.Ifm  reason: case insensitive filesystem */
public final class C57745Ifm implements Runnable {
    public final /* synthetic */ H10 A00;

    public C57745Ifm(H10 h10) {
        this.A00 = h10;
    }

    public final void run() {
        H10 h10 = this.A00;
        if (h10.isResumed()) {
            0hq r0 = h10.mFragmentManager;
            if (r0 == null || r0.A0R("DELETE_COLLECTION_BACK_STACK_NAME") == null) {
                DbT.A1K(h10);
                return;
            }
            0hq r1 = h10.mFragmentManager;
            if (r1 != null) {
                r1.A19("DELETE_COLLECTION_BACK_STACK_NAME", 1);
            }
        }
    }
}
