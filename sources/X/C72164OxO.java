package X;

import android.content.Context;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OxO  reason: case insensitive filesystem */
public final class C72164OxO implements AnonymousClass67Q {
    public final /* synthetic */ C70711OHg A00;
    public final /* synthetic */ AuthData A01;
    public final /* synthetic */ MessagingUser A02;
    public final /* synthetic */ C68928Nb7 A03;
    public final /* synthetic */ OFH A04;
    public final /* synthetic */ MsysThreadId A05;
    public final /* synthetic */ Integer A06;

    public C72164OxO(C70711OHg oHg, AuthData authData, MessagingUser messagingUser, C68928Nb7 nb7, OFH ofh, MsysThreadId msysThreadId, Integer num) {
        this.A00 = oHg;
        this.A04 = ofh;
        this.A03 = nb7;
        this.A05 = msysThreadId;
        this.A02 = messagingUser;
        this.A01 = authData;
        this.A06 = num;
    }

    public final void Eyr(AnonymousClass67Z r15) {
        17i r11;
        Object A002;
        C70711OHg oHg = this.A00;
        if (oHg == null) {
            A002 = new C72606PCl(this.A04);
        } else {
            C68928Nb7 nb7 = this.A03;
            Context context = nb7.A00;
            UserSession userSession = nb7.A01;
            AnonymousClass9HC r7 = nb7.A03;
            AnonymousClass7UL r6 = nb7.A02;
            C51974G9v.A1P(context, userSession, r7, r6);
            if (AnonymousClass7TF.A1Z(2HM.A00(userSession).A1W)) {
                r11 = 17h.A00(userSession);
            } else {
                r11 = null;
            }
            MsysThreadId msysThreadId = this.A05;
            MessagingUser messagingUser = this.A02;
            A002 = C70092Nx8.A00(context, oHg, (C61084JwM) null, this.A01, userSession, r6, r7, messagingUser, this.A04, msysThreadId, r11, this.A06, true);
        }
        r15.A02(A002);
        r15.A00();
    }
}
