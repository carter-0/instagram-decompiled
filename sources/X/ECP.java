package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;

public final class ECP extends 1P0 {
    public final /* synthetic */ E6P A00;

    public ECP(E6P e6p) {
        this.A00 = e6p;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(-498184937);
        E6P e6p = this.A00;
        C320106rm r2 = e6p.A02;
        if (r2 != null) {
            r2.A0E("fetch_request_fail");
            C320106rm r0 = e6p.A02;
            if (r0 != null) {
                r0.A00.A01();
                0f9 A002 = 0wj.A00(e6p.getClass().getSimpleName(), 16924191, true);
                A002.ABQ("su_check_timeout_event", "Checking whether there is a cache timeout event.");
                A002.report();
                e6p.A05 = true;
                e6p.A07 = false;
                E6P.A02(e6p);
                FragmentActivity activity = e6p.getActivity();
                if (activity == null || activity.isFinishing()) {
                    0wb.A03(AnonymousClass000.A00(873), AnonymousClass000.A00(1059));
                } else {
                    C59689JTv.A01(e6p.getActivity(), "tabbed_explore_people_fail", 2131974929, 0);
                }
                AnonymousClass0fD.A0A(-1595678329, A03);
                return;
            }
        }
        0qQ.A0F("latencyPerfLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1899301922);
        E6P e6p = this.A00;
        e6p.A07 = true;
        e6p.A06 = false;
        E6P.A02(e6p);
        AnonymousClass0fD.A0A(-301782162, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2072413653);
        DvT dvT = (DvT) obj;
        int A032 = AnonymousClass0fD.A03(694023365);
        0qQ.A0B(dvT, 0);
        E6P e6p = this.A00;
        C320106rm r2 = e6p.A02;
        if (r2 != null) {
            r2.A0E("fetch_request_end");
            C320106rm r0 = e6p.A02;
            if (r0 != null) {
                C46329Dbx.A00(r0);
                Dbc.A10(e6p, 16923641);
                e6p.A05 = false;
                List<AnonymousClass3UL> list = dvT.A00;
                if (list != null) {
                    for (AnonymousClass3UL r1 : list) {
                        1NK.A00().A0O(DbT.A0X(e6p.A0C), r1.A03.Bh3(), "see_all_suggested_user_fragment");
                    }
                    e6p.A07 = false;
                    if (AnonymousClass7TE.A1b(list)) {
                        e6p.A0c().A0C(list);
                        0fE.A00(e6p.A0c(), 1665263086);
                    } else {
                        E6P.A02(e6p);
                    }
                }
                AnonymousClass0fD.A0A(-1171343092, A032);
                AnonymousClass0fD.A0A(124200683, A03);
                return;
            }
        }
        0qQ.A0F("latencyPerfLogger");
        throw AnonymousClass00P.createAndThrow();
    }
}
