package X;

public abstract class HRZ {
    public static final int A00(C292215ia r5, C267964cX r6) {
        C267964cX A0O = r6.A0O();
        if (A0O == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Child of ");
            A1A.append(r6);
            I2E.A01(AnonymousClass7TF.A0l(" cannot be null when calculating alignment line", A1A));
            throw AnonymousClass00P.createAndThrow();
        } else if (r6.A0N().Aam().containsKey(r5)) {
            return C51967G9n.A04(C51966G9m.A14(r5, r6.A0N().Aam()), AnonymousClass972.MUTABLE_FLAG_MASK);
        } else {
            int AWx = A0O.AWx(r5);
            if (AWx == Integer.MIN_VALUE) {
                return AnonymousClass972.MUTABLE_FLAG_MASK;
            }
            A0O.A03 = true;
            r6.A02 = true;
            r6.A0Q();
            A0O.A03 = false;
            r6.A02 = false;
            return AWx + ((int) C51975G9x.A07(r5 instanceof C292205iZ ? 1 : 0, A0O.A0L()));
        }
    }
}
