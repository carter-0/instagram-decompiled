package X;

/* renamed from: X.3DM  reason: invalid class name */
public abstract class AnonymousClass3DM {
    public static final Object A00(07U r5, AnonymousClass07V r6, AnonymousClass4D7 r7, 0sL r8) {
        Object A00;
        07U r3 = r5;
        if (r5 != 07U.A03) {
            AnonymousClass07V r2 = r6;
            if (r6.A07() == 07U.A02 || (A00 = 19E.A00(r7, new AnonymousClass9KM(r2, r3, r8, (AnonymousClass4D7) null, 3))) != 1Hj.A02) {
                return C60340gF.A00;
            }
            return A00;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object A02(AnonymousClass07Z r1, AnonymousClass4D7 r2, 0sL r3) {
        return A01(07U.A05, r1, r2, r3);
    }

    public static final Object A01(07U r1, AnonymousClass07Z r2, AnonymousClass4D7 r3, 0sL r4) {
        Object A00 = A00(r1, r2.getLifecycle(), r3, r4);
        if (A00 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A00;
    }
}
