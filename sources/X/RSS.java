package X;

import android.content.Context;
import java.util.Map;

public abstract class RSS {
    public static final Object A00(C307896Rx r18, AnonymousClass6Tm r19) {
        Context context;
        Map map;
        C13690Tf8 A04;
        Integer num;
        C307896Rx r11 = r18;
        C307786Rm r6 = r11.A03;
        if (r6 != null) {
            context = r6.A00;
        } else {
            context = null;
        }
        if (context != null) {
            AnonymousClass6Tm r1 = r19;
            Object A01 = r1.A01();
            0qQ.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            C276544tV r7 = (C276544tV) A01;
            C276544tV r9 = (C276544tV) DbT.A0q(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel", 1);
            boolean A1W = JTQ.A1W(r1.A00());
            Object A00 = C276544tV.A00(r7, 38);
            0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Map map2 = (Map) A00;
            C277014uI A0A = r7.A0A(40);
            if (A0A != null) {
                Object A002 = C299275ur.A00(r11, AnonymousClass6Tm.A01, A0A);
                0qQ.A0C(A002, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                map = (Map) A002;
            } else {
                map = null;
            }
            int i = r9.A04;
            if (i == 16542 || i == 16696 || i == 16793) {
                A04 = C250563lf.A04(r9, i);
            } else {
                A04 = null;
            }
            C276544tV A07 = r7.A07(51);
            if (A07 != null) {
                num = Integer.valueOf(A07.A04);
            } else {
                num = null;
            }
            C18972WEz wEz = new C18972WEz(A04, C11117SAw.A00(context, num), Boolean.valueOf(r7.A0R(43, true)), r7.A0I(), map2, map);
            if (r6 != null) {
                C229392nJ r12 = r6.A02;
                0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.common.bloks.Host");
                C250563lf.A0O(context, wEz, new C307506Qj(r12.AMV()), i, A1W);
                return null;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
