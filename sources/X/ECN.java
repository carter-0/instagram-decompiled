package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class ECN extends 1P0 {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1936163459);
        Dw1 dw1 = (Dw1) obj;
        int A032 = AnonymousClass0fD.A03(-1605783303);
        0qQ.A0B(dw1, 0);
        UserSession userSession = this.A00;
        double A002 = DbV.A00(userSession, 0);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "additional_phone_number_request_success");
        A0e.A8D("current_time", Double.valueOf(A002));
        A0e.A8D("elapsed_time", Double.valueOf(A002 - A003));
        A0e.A8D(TraceFieldType.StartTime, Double.valueOf(A003));
        A0e.AAJ("waterfall_id", 1Q0.A01());
        FH8.A04(A0e);
        A0e.AAJ("guid", FH8.A00());
        0qQ.A0B(userSession, 0);
        A0e.AAJ("source", DbZ.A0m(userSession));
        A0e.AAJ("containermodule", "waterfall_log_in");
        A0e.Cgf();
        String str = dw1.A02;
        String str2 = dw1.A01;
        if (!(str2 == null || str2.length() == 0 || str == null || str.length() == 0)) {
            userSession.A04(C49496Ewb.class, new C49496Ewb(str2, str));
            double A01 = DbS.A01();
            double A004 = DbS.A00();
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "additional_phone_number_present");
            A0e2.A8D("current_time", Double.valueOf(A01));
            A0e2.A8D("elapsed_time", Double.valueOf(A01 - A004));
            DbS.A1K(A0e2, "waterfall_log_in");
            A0e2.A8D(TraceFieldType.StartTime, Double.valueOf(A004));
            A0e2.AAJ("waterfall_id", 1Q0.A01());
            A0e2.AAJ("guid", FH8.A00());
            A0e2.AAJ("source", DbZ.A0m(userSession));
            A0e2.Cgf();
        }
        AnonymousClass0fD.A0A(1225971668, A032);
        AnonymousClass0fD.A0A(45051949, A03);
    }

    public ECN(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onFail(C268654dm r9) {
        int A03 = AnonymousClass0fD.A03(667995376);
        UserSession userSession = this.A00;
        double A002 = Dbb.A00(userSession);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "additional_phone_number_request_fail");
        DbZ.A1G(A0e, A002, A003);
        DbT.A1O(A0e);
        DbZ.A1F(A0e, A003);
        FH8.A08(A0e, userSession);
        AnonymousClass0fD.A0A(829905814, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1402138897);
        UserSession userSession = this.A00;
        double A002 = Dbb.A00(userSession);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "try_fetch_additional_phone_number");
        if (A0e.isSampled()) {
            DbZ.A1G(A0e, A002, A003);
            DbT.A1P(A0e);
            DbZ.A1F(A0e, A003);
            FH8.A08(A0e, userSession);
        }
        AnonymousClass0fD.A0A(996581839, A03);
    }
}
