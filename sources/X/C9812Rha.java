package X;

import java.util.Map;

/* renamed from: X.Rha  reason: case insensitive filesystem */
public abstract class C9812Rha {
    public static C276544tV A00(C307786Rm r7, C307896Rx r8, C276544tV r9) {
        C307786Rm r3 = r7;
        C307446Qd A02 = C307476Qg.A02(r7);
        C307456Qe r4 = r8.A04;
        if (r4 == null) {
            C245983dn.A02("Tree resources can only be read from the UI Thread");
            r4 = A02.A04.A07((Map) null, A02.A08);
        }
        AnonymousClass6SE A00 = AnonymousClass6S9.A00(r3, r4, (AnonymousClass6SE) null, r9, r7.A02.AgE().AgJ(), C307436Qc.A00);
        if (!A00.A04.isEmpty()) {
            1Kn.A02("BloksBind", "Undefined Behavior: BloksBind::evaluate() returned controller binding operations");
        }
        return A00.A01;
    }
}
