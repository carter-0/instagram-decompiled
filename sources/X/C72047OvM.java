package X;

import android.content.Context;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OvM  reason: case insensitive filesystem */
public final class C72047OvM implements AnonymousClass68Z {
    public final /* synthetic */ C61084JwM A00;
    public final /* synthetic */ AuthData A01;
    public final /* synthetic */ MessagingUser A02;
    public final /* synthetic */ C68929Nb8 A03;
    public final /* synthetic */ OFH A04;
    public final /* synthetic */ MsysThreadId A05;
    public final /* synthetic */ Integer A06;

    public C72047OvM(C61084JwM jwM, AuthData authData, MessagingUser messagingUser, C68929Nb8 nb8, OFH ofh, MsysThreadId msysThreadId, Integer num) {
        this.A03 = nb8;
        this.A05 = msysThreadId;
        this.A02 = messagingUser;
        this.A01 = authData;
        this.A06 = num;
        this.A04 = ofh;
        this.A00 = jwM;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        17i r16;
        C70711OHg oHg = (C70711OHg) obj;
        0qQ.A0B(oHg, 0);
        C68929Nb8 nb8 = this.A03;
        UserSession userSession = nb8.A01;
        if (182.A06(0Tu.A05, userSession, 36315146783558682L)) {
            C70171NyP.A00(userSession).A01.put(Long.valueOf(this.A05.A00), oHg);
        }
        Context context = nb8.A00;
        AnonymousClass9HC r12 = nb8.A03;
        AnonymousClass7UL r11 = nb8.A02;
        C51974G9v.A1P(context, userSession, r12, r11);
        if (AnonymousClass7TF.A1Z(2HM.A00(userSession).A1W)) {
            r16 = 17h.A00(userSession);
        } else {
            r16 = null;
        }
        MsysThreadId msysThreadId = this.A05;
        MessagingUser messagingUser = this.A02;
        AuthData authData = this.A01;
        Integer num = this.A06;
        return C70092Nx8.A00(context, oHg, this.A00, authData, userSession, r11, r12, messagingUser, this.A04, msysThreadId, r16, num, false);
    }
}
