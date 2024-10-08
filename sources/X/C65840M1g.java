package X;

/* renamed from: X.M1g  reason: case insensitive filesystem */
public final class C65840M1g implements Runnable {
    public final /* synthetic */ K5E A00;

    public C65840M1g(K5E k5e) {
        this.A00 = k5e;
    }

    public final void run() {
        try {
            AnonymousClass37D A02 = AnonymousClass37D.A00.A02(this.A00.requireContext());
            if (A02 != null) {
                A02.A0V(true);
            }
        } catch (IllegalStateException e) {
            0wb.A06(K5E.__redex_internal_original_name, "Error When anchoring Bottom Sheet ", e);
        }
    }
}
