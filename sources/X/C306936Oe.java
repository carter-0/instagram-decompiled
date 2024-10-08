package X;

import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.6Oe  reason: invalid class name and case insensitive filesystem */
public abstract class C306936Oe {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        AnonymousClass6LP r4;
        Object A03 = r8.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Map map = (Map) r8.A00.get(2);
        C307786Rm r0 = r7.A03;
        if (!(r0 == null || (r4 = (AnonymousClass6LP) r0.A01.get(R.id.showreel_logger)) == null)) {
            0qQ.A0B(str, 0);
            AnonymousClass6LP.A01(r4, str);
            r4.A07.execute(new C306946Of(r4, str, map, r4.A04.currentMonotonicTimestampNanos()));
        }
        return null;
    }
}
