package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class Fb1 implements C74469PvP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public final void Cye(boolean z) {
    }

    public Fb1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void DEp(String str) {
        C331127Pr A0f;
        1Yy A012;
        UserSession A0l;
        String str2;
        C331157Pu r3;
        String str3 = str;
        if (this.A00 != 0) {
            1pE r0 = ((EDN) this.A01).A00;
            r3 = r0.A08;
            if (r3 != null) {
                A012 = FC8.A01();
                A0l = r0.A16;
                Set set = C49280EsP.A00;
                str2 = "invite_link_preview_broadcast_chat";
                A0f = (C331127Pr) this.A02;
            } else {
                return;
            }
        } else {
            0qQ.A0B(str, 0);
            AnonymousClass0eM r02 = ((E12) this.A02).A01;
            A0f = DbX.A0f(r02);
            A012 = FC8.A01();
            A0l = AnonymousClass7TE.A0l(r02);
            Set set2 = C49280EsP.A00;
            str2 = "profile_subscriber_channel_click";
            r3 = (C331157Pu) this.A01;
        }
        A012.A06(A0l, r3, A0f, str3, str2);
    }

    public final void DIJ() {
    }

    public final void DTc() {
    }
}
