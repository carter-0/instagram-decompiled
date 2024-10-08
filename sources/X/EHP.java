package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

public final class EHP extends 2Cn {
    public final 1P0 A00;
    public final 1Fc A01;
    public final UserSession A02;
    public final String A03;

    public final void onFail(Exception exc) {
        String str;
        0qQ.A0B(exc, 0);
        UserSession userSession = this.A02;
        C322326ve A002 = C322316vd.A00(userSession);
        long j = A002.A01;
        if (j != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = A002.A0A;
            String message = exc.getMessage();
            if (message == null) {
                message = "Null upload error message";
            }
            userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.FailureReason, message);
            A002.A05 = true;
            userFlowLoggerImpl.flowMarkPoint(A002.A01, "profile_picture_upload_error");
        }
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "";
        }
        C49728F3s A003 = C49061Eof.A00(userSession);
        EWT ewt = EWT.EDIT_PROFILE_PIC_FLOW;
        if (str != null) {
            A003.A04(ewt, str);
            this.A00.onFail(new C268664dn(exc));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserSession userSession = this.A02;
        C49728F3s A002 = C49061Eof.A00(userSession);
        EWT ewt = EWT.EDIT_PROFILE_PIC_FLOW;
        A002.A00(ewt, AnonymousClass05K.A1I);
        C49061Eof.A00(userSession).A00(ewt, AnonymousClass05K.A02);
        C322316vd.A00(userSession).A05("profile_picture_upload_successful");
        String str = this.A03;
        1Fc r1 = this.A01;
        AnonymousClass7TG.A1T(userSession, str, r1);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/change_profile_picture/");
        A0a.A04 = new T09(r1, userSession, str);
        1OC A0S = DbU.A0S(A0a, C47328Duv.class, C49737F4c.class);
        A0S.A00 = this.A00;
        1ES.A03(A0S);
    }

    public EHP(1P0 r1, 1Fc r2, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }
}
