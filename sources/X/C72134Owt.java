package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Owt  reason: case insensitive filesystem */
public final class C72134Owt implements AnonymousClass67Q {
    public final /* synthetic */ AnonymousClass7Z9 A00;
    public final /* synthetic */ C254793t3 A01;
    public final /* synthetic */ User A02;

    public C72134Owt(AnonymousClass7Z9 r1, C254793t3 r2, User user) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = user;
    }

    public final void Eyr(AnonymousClass67Z r7) {
        UserSession userSession = this.A00.A00;
        String A0x = C66580MXl.A0x(this.A01);
        List A1I = AnonymousClass7TE.A1I(this.A02.getId());
        0qQ.A0A(r7);
        PE5 pe5 = new PE5(r7);
        0qQ.A0B(A0x, 1);
        if (AnonymousClass7TE.A1b(A1I)) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0K("direct_v2/threads/%s/remove_admins/", new Object[]{A0x});
            OXI.A01(A0a, userSession, pe5, A1I);
        }
    }
}
