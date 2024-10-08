package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Oww  reason: case insensitive filesystem */
public final class C72137Oww implements AnonymousClass67Q {
    public final /* synthetic */ AnonymousClass7Z9 A00;
    public final /* synthetic */ C254793t3 A01;
    public final /* synthetic */ List A02;

    public C72137Oww(AnonymousClass7Z9 r1, C254793t3 r2, List list) {
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
        NMI nmi = new NMI((Object) r8, 22);
        if (A0x != null) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            C66583MXo.A1F(A0a, "direct_v2/demote_moderators_from_channel/", A0x);
            DbX.A1M(A0a, "demoted_moderator_igids", OXI.A00(A0r));
            1OC A0M = A0a.A0M();
            A0M.A00 = new C68422NHh(nmi, userSession, 3);
            1ES.A03(A0M);
        }
    }
}
