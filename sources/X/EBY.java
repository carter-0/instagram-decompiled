package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.NuxConnectResponse;

public final class EBY extends 1P0 {
    public final /* synthetic */ EEL A00;

    public EBY(EEL eel) {
        this.A00 = eel;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-734357807);
        UserSession userSession = this.A00.A01;
        CallerContext callerContext = 1KM.A00;
        0qQ.A0B(userSession, 0);
        1KM.A02(userSession, false);
        AnonymousClass0fD.A0A(-514913723, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(829676338);
        NuxConnectResponse nuxConnectResponse = (NuxConnectResponse) obj;
        int A0D = AnonymousClass7TG.A0D(nuxConnectResponse, -1538894992);
        if (!0mp.A0B(nuxConnectResponse.A00) && !0mp.A0B(nuxConnectResponse.A02)) {
            this.A00.A04.A00((EXN) null);
        }
        AnonymousClass0fD.A0A(1367394199, A0D);
        AnonymousClass0fD.A0A(-436190604, A03);
    }
}
