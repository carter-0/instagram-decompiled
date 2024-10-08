package X;

import java.util.ArrayList;
import java.util.List;

public abstract class I4y {
    public static final List A03(AnonymousClass5RW[] r13) {
        ArrayList A0v = DbS.A0v(r8);
        for (AnonymousClass5RW r0 : r13) {
            long j = r0.A00;
            long j2 = AnonymousClass5RW.A09;
            A0v.add(C51965G9l.A0N(C285595Rx.A02(AnonymousClass5RX.A0G, (AnonymousClass5RW.A03(j2) * 0.19999999f) + (AnonymousClass5RW.A03(j) * 0.8f), (AnonymousClass5RW.A02(j2) * 0.19999999f) + (AnonymousClass5RW.A02(j) * 0.8f), (AnonymousClass5RW.A01(j2) * 0.19999999f) + (AnonymousClass5RW.A01(j) * 0.8f), 1.0f)));
        }
        return A0v;
    }

    public static List A00(long j, long j2) {
        return A03(new AnonymousClass5RW[]{new AnonymousClass5RW(j), new AnonymousClass5RW(j2)});
    }

    public static List A01(AnonymousClass5RW r1, long j) {
        return A03(new AnonymousClass5RW[]{r1, new AnonymousClass5RW(j)});
    }

    public static List A02(AnonymousClass5RW r1, AnonymousClass5RW r2, long j) {
        return A03(new AnonymousClass5RW[]{r1, r2, new AnonymousClass5RW(j)});
    }
}
