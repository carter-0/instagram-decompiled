package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ows  reason: case insensitive filesystem */
public final class C72133Ows implements AnonymousClass67Q {
    public final /* synthetic */ AnonymousClass7Z9 A00;
    public final /* synthetic */ C254793t3 A01;
    public final /* synthetic */ List A02;

    public C72133Ows(AnonymousClass7Z9 r1, C254793t3 r2, List list) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
    }

    public final void Eyr(AnonymousClass67Z r8) {
        UserSession userSession = this.A00.A00;
        String A0x = C66580MXl.A0x(this.A01);
        List<MessagingUser> list = this.A02;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (MessagingUser messagingUser : list) {
            A0r.add(messagingUser.A03);
        }
        PE6 pe6 = new PE6(r8, 3);
        0qQ.A0B(A0x, 1);
        if (DbT.A1b(A0r)) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            C66583MXo.A1F(A0a, "direct_v2/remove_invites_from_channel/", A0x);
            A0a.A9m("invitee_ids", OXI.A00(A0r));
            1OC A0S = DbU.A0S(A0a, AnonymousClass74W.class, AnonymousClass74X.class);
            A0S.A00 = new C47371Dwh(userSession, pe6, 4);
            1ES.A03(A0S);
        }
    }
}
