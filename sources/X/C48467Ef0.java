package X;

/* renamed from: X.Ef0  reason: case insensitive filesystem */
public abstract class C48467Ef0 {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Object A03 = r7.A03(1);
        if (!(A03 instanceof String)) {
            A03 = null;
        }
        boolean A0K = 0qQ.A0K(A03, AnonymousClass000.A00(744));
        0hq parentFragmentManager = DbU.A0H(r6).getParentFragmentManager();
        if (A0K || 0qQ.A0K(A03, AnonymousClass000.A00(351))) {
            while (true) {
                if (parentFragmentManager.A0M() <= 0) {
                    break;
                }
                06p A0T = parentFragmentManager.A0T(parentFragmentManager.A0M() - 1);
                0qQ.A07(A0T);
                if (!0qQ.A0K(A0T.A09, "PromotePaymentsInterstitialFragment.BACK_STACK_NAME")) {
                    parentFragmentManager.A13();
                } else if (A0K) {
                    parentFragmentManager.A13();
                    return null;
                }
            }
        } else {
            FBt.A00(C308206Td.A04(r6), parentFragmentManager);
        }
        return null;
    }
}
