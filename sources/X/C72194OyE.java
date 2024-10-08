package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.OyE  reason: case insensitive filesystem */
public final class C72194OyE implements AnonymousClass0lh {
    public final 0wc A00;
    public final UserSession A01;
    public final String A02 = AnonymousClass7TG.A0j();

    public static final void A00(C72194OyE oyE, String str, String str2, String str3, String str4, Map map) {
        1Ln A0F = 1Ln.A0F(oyE.A00);
        if (DbT.A1Y(A0F)) {
            Dbb.A1G(A0F, oyE.A01);
            A0F.A0l(str);
            A0F.A0k(str2);
            A0F.A0p(str3);
            Dba.A1E(A0F, "thread_view");
            A0F.A0s(str4);
            A0F.A0v(oyE.A02);
            A0F.A0w(map);
            A0F.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C72194OyE.class);
    }

    public C72194OyE(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = DbY.A0M(userSession).A00();
    }
}
