package X;

/* renamed from: X.3WX  reason: invalid class name */
public abstract class AnonymousClass3WX {
    public static final boolean A00(1Nv r1, AnonymousClass4DU r2) {
        0qQ.A0B(r1, 0);
        0qQ.A0B(r2, 1);
        if (A01(r1, r2) || A02(r1, r2) || r1.CUz()) {
            return true;
        }
        return false;
    }

    public static final boolean A01(1Nv r1, AnonymousClass4DU r2) {
        0qQ.A0B(r1, 0);
        0qQ.A0B(r2, 1);
        if (!r1.CYg() || !r2.isOrganicEligible()) {
            return false;
        }
        return true;
    }

    public static final boolean A02(1Nv r1, AnonymousClass4DU r2) {
        0qQ.A0B(r1, 0);
        0qQ.A0B(r2, 1);
        if (!r1.CcK() || !r2.isSponsoredEligible()) {
            return false;
        }
        return true;
    }
}
