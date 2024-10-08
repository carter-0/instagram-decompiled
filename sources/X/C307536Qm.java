package X;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Qm  reason: invalid class name and case insensitive filesystem */
public final class C307536Qm implements AnonymousClass0lh {
    public AnonymousClass6RB A00;

    public final void onSessionWillEnd() {
        List A0a;
        AnonymousClass6RB r4 = this.A00;
        AnonymousClass6Q4 r2 = r4.A04;
        AnonymousClass6RQ r1 = r4.A05;
        0qQ.A0B(r1, 0);
        r2.A00.remove(r1);
        AnonymousClass6R6 r12 = r4.A07.A02;
        Set singleton = Collections.singleton(REH.MEMORY);
        0qQ.A07(singleton);
        r12.A02(singleton);
        synchronized (r4.A0A) {
            AnonymousClass6R0 r0 = r4.A08;
            synchronized (r0.A00) {
                A0a = 00k.A0a(r0.A01);
            }
            for (AnonymousClass6RI r13 : 00k.A0a(A0a)) {
                r13.A00.invoke(r13);
                r13.A01 = null;
            }
            r4.A0B.run();
        }
        synchronized (r4.A09) {
            r4.A0C.clear();
        }
    }
}
