package X;

import java.util.Map;

/* renamed from: X.HRh  reason: case insensitive filesystem */
public abstract class C54749HRh {
    public static final void A00(AnonymousClass5SX r7, 0sP r8, int i) {
        C285045Pl r4 = new C285045Pl(new AnonymousClass5SX[16]);
        while (true) {
            r4.A05(r4.A00, r7.A08(false, false));
            while (true) {
                int i2 = r4.A00;
                if (i2 != 0) {
                    r7 = (AnonymousClass5SX) r4.A00(i2 - 1);
                    C268054cg A05 = r7.A05();
                    if (A05 == null || !A05.A0p()) {
                        AnonymousClass5SV r6 = r7.A05;
                        C285635Sb r0 = AnonymousClass5SZ.A0B;
                        Map map = r6.A02;
                        if (!map.containsKey(r0) && !map.containsKey(AnonymousClass5SZ.A03)) {
                            C268054cg A052 = r7.A05();
                            if (A052 != null) {
                                C56558I1m A00 = C54760HRs.A00(C289425dZ.A01(A052));
                                if (A00.A01 < A00.A02 && A00.A03 < A00.A00) {
                                    Object A002 = C285765So.A00(r6, C290125en.A0K);
                                    AnonymousClass6IQ r02 = (AnonymousClass6IQ) C285765So.A00(r6, AnonymousClass5SZ.A0W);
                                    if (A002 != null && r02 != null && AnonymousClass7TE.A04(r02.A00.invoke()) > 0.0f) {
                                        int i3 = i + 1;
                                        r8.invoke(new C55960HqR(A052, r7, A00, i3));
                                        A00(r7, r8, i3);
                                    }
                                }
                            } else {
                                I2E.A02("Expected semantics node to have a coordinator.");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
