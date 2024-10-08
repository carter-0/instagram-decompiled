package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.5kr  reason: invalid class name and case insensitive filesystem */
public final class C293515kr {
    public final void A00(AnonymousClass6AW r9, UserSession userSession, 0sP r11, int i, long j) {
        AnonymousClass6AW r3 = r9;
        0qQ.A0B(r9, 0);
        0qQ.A0B(userSession, 3);
        int i2 = i;
        if (!182.A06(0Tu.A05, userSession, 36326206324487772L)) {
            C56939IIi iIi = new C56939IIi(r11);
            AnonymousClass68L ASa = r9.mMailboxApiHandleMetaProvider.ASa(2);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
            mailboxFutureImpl.Eiu(iIi);
            if (!ASa.EJd(new C71650OoV(r3, mailboxFutureImpl, i2, j))) {
                mailboxFutureImpl.cancel(false);
            }
        } else if (0eE.A00(userSession).A00().A00() < i) {
            1NY r32 = new 1NY(userSession, -2);
            r32.A08(AnonymousClass05K.A01);
            r32.A0A("direct_v2/set_e2ee_eligibility/");
            r32.A0O((15p) null, 1XP.class, 1XY.class, false);
            r32.A0C("e2ee_eligibility", i);
            1OC A0M = r32.A0M();
            A0M.A00 = new C68417NHc(r11, userSession);
            1ES.A03(A0M);
        } else {
            r11.invoke(true);
        }
    }
}
