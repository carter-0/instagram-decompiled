package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Owx  reason: case insensitive filesystem */
public final class C72138Owx implements AnonymousClass67Q {
    public final /* synthetic */ AnonymousClass7Z9 A00;
    public final /* synthetic */ C254793t3 A01;
    public final /* synthetic */ List A02;

    public C72138Owx(AnonymousClass7Z9 r1, C254793t3 r2, List list) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
    }

    public final void Eyr(AnonymousClass67Z r8) {
        0qQ.A0B(r8, 0);
        UserSession userSession = this.A00.A00;
        String A0x = C66580MXl.A0x(this.A01);
        List<MessagingUser> list = this.A02;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (MessagingUser messagingUser : list) {
            A0r.add(messagingUser.A03);
        }
        PE5 pe5 = new PE5(r8);
        0qQ.A0B(A0x, 1);
        if (DbT.A1b(A0r)) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0K("direct_v2/threads/%s/remove_users/", new Object[]{A0x});
            OXI.A01(A0a, userSession, pe5, A0r);
        }
    }
}
