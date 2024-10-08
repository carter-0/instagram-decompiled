package X;

import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;

public final class ECT extends 1P0 {
    public final /* synthetic */ C320106rm A00;
    public final /* synthetic */ C3250870z A01;

    public ECT(C320106rm r1, C3250870z r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(1527111376);
        C3250870z r2 = this.A01;
        C3250870z.A01(r2, 16919810);
        C320106rm r1 = this.A00;
        r1.A0E("fetch_request_fail");
        r1.A00.A01();
        r2.A08.A0L(C322496vv.Closed);
        AnonymousClass0fD.A0A(1084435617, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1092335292);
        this.A01.A08.A0L(C322496vv.Loading);
        AnonymousClass0fD.A0A(-2141398808, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(480300233);
        C334247ax r9 = (C334247ax) obj;
        int A0D = AnonymousClass7TG.A0D(r9, 1428634583);
        C3250870z r6 = this.A01;
        C3250870z.A01(r6, 16919918);
        C320106rm r1 = this.A00;
        r1.A0E("fetch_request_end");
        C46329Dbx.A00(r1);
        UserDetailTabController userDetailTabController = r6.A08;
        User user = userDetailTabController.A0P.A0J;
        if (user != null) {
            Boolean CaR = r9.FH3().CaR();
            boolean A14 = C41845B3m.A14(CaR);
            user.A03.EYk(CaR);
            if (A14) {
                user.A03.Ehr(r9.getItems());
            } else {
                user.A0w(r9.getItems());
                user.A03.ERM(r9.FH3().Amb());
            }
            r6.A07.A0t();
            userDetailTabController.A0L(C322496vv.Open);
            AnonymousClass0fD.A0A(-33740739, A0D);
            AnonymousClass0fD.A0A(-1121011953, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(920605892, A0D);
        throw A0y;
    }
}
