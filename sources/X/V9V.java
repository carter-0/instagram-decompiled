package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Calendar;
import java.util.Date;

public abstract class V9V {
    /* JADX WARNING: type inference failed for: r19v1, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    public static final Object A00(C307896Rx r19, AnonymousClass6Tm r20) {
        C307896Rx r2 = r19;
        C307786Rm r0 = r2.A03;
        if (r0 != null) {
            FragmentActivity A03 = C308206Td.A03(r0);
            Object A032 = r20.A03(1);
            0qQ.A0C(A032, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            C276544tV r1 = (C276544tV) A032;
            ? obj = new Object();
            C277014uI A09 = r1.A09();
            ? obj2 = new Object();
            obj2.A00 = new OVW(A03, DbW.A0R(r2), new C19337WUt(r2, r1, A09, obj, obj2), AnonymousClass7TE.A16(A03, 2131970747), A03.getString(2131970746), false, true, false, false);
            Calendar instance = Calendar.getInstance();
            Date time = instance.getTime();
            instance.add(6, 60);
            Date time2 = instance.getTime();
            ((OVW) obj2.A00).A01(true, A03.getString(2131970747), C13989Tnp.A0t((long) r1.A03(36, 0)), time, time2, true);
        }
        return null;
    }
}
