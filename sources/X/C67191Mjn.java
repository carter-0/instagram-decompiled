package X;

import java.util.List;

/* renamed from: X.Mjn  reason: case insensitive filesystem */
public final class C67191Mjn implements C337237fw {
    public boolean A00;
    public final C66633Ma2 A01;

    public C67191Mjn(C66633Ma2 ma2) {
        0qQ.A0B(ma2, 1);
        this.A01 = ma2;
    }

    public final void Dam(C337257fy r8) {
        0qQ.A0B(r8, 0);
        this.A00 = r8.isLoading();
        List list = ((C67335MmB) r8.Bo1()).A01;
        if (!list.isEmpty()) {
            C66633Ma2 ma2 = this.A01;
            if (182.A06(0Tu.A06, ma2.A0p(), 36322224890521620L)) {
                ma2.A0y = list;
            } else {
                C66736Mbh A0U = C66581MXm.A0U(ma2);
                A0U.A0A(list, 0, A0U.A0L, false);
            }
            ma2.A0u().A0E("suggested_threads_fetch_succeeded");
            return;
        }
        C66736Mbh.A03(C66581MXm.A0U(this.A01));
    }
}
