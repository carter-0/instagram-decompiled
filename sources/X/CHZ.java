package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDScheduledMessageMutationResponseImpl;
import com.instagram.realtimeclient.RealtimeConstants;

public final class CHZ extends C66675Mai {
    public final /* synthetic */ C74551Pwk A00;

    public final void A00(AnonymousClass3JD r7, UserSession userSession) {
        Object Bny;
        if (!(r7 == null || (Bny = r7.Bny()) == null)) {
            C250663lr r4 = (C250663lr) Bny;
            Class<IGDScheduledMessageMutationResponseImpl.XigIgdScheduledMessage> cls = IGDScheduledMessageMutationResponseImpl.XigIgdScheduledMessage.class;
            C254573sh r0 = C250663lr.Companion;
            if (r4.A03(cls, "xig_igd_scheduled_message(input:$input)", 2049528527) != null && r4.A03(cls, "xig_igd_scheduled_message(input:$input)", 2049528527).getCoercedBooleanField(0, RealtimeConstants.SEND_SUCCESS)) {
                this.A00.DTM((C270214gN) null, (String) null);
                return;
            }
        }
        this.A00.DTM(C270214gN.A0T, (String) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CHZ(UserSession userSession, C74551Pwk pwk) {
        super(userSession);
        this.A00 = pwk;
    }

    public final void A01(UserSession userSession, Throwable th) {
        this.A00.DTM(C71115Od8.A03(th), (String) null);
    }
}
