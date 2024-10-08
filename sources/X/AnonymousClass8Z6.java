package X;

/* renamed from: X.8Z6  reason: invalid class name */
public abstract class AnonymousClass8Z6 {
    public static final void A00(AnonymousClass07V r2, 2YL r3, 08Y r4) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r2, 2);
        AnonymousClass8Z7 r1 = (AnonymousClass8Z7) r3.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (r1 != null && !r1.A00) {
            r1.A00(r2, r4);
            A01(r2, r4);
        }
    }

    public static final void A01(AnonymousClass07V r2, 08Y r3) {
        07U A07 = r2.A07();
        if (A07 == 07U.A03 || A07.compareTo(07U.A05) >= 0) {
            r3.A04(C40069APz.class);
        } else {
            r2.A09(new APW(r2, r3));
        }
    }
}
