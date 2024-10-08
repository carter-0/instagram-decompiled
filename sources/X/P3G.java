package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Set;

public final class P3G implements C74469PvP {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C72208OyY A01;
    public final /* synthetic */ AnonymousClass7BY A02;
    public final /* synthetic */ OJj A03;
    public final /* synthetic */ C331127Pr A04;
    public final /* synthetic */ DirectShareTarget A05;

    public final void DEp(String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        C331157Pu r3 = this.A03.A00;
        if (r3 != null) {
            1Yy A012 = FC8.A01();
            UserSession userSession = this.A00;
            Set set = C49280EsP.A00;
            A012.A06(userSession, r3, this.A04, str2, "inbox_search");
        }
    }

    public P3G(UserSession userSession, C72208OyY oyY, AnonymousClass7BY r3, OJj oJj, C331127Pr r5, DirectShareTarget directShareTarget) {
        this.A05 = directShareTarget;
        this.A01 = oyY;
        this.A02 = r3;
        this.A03 = oJj;
        this.A00 = userSession;
        this.A04 = r5;
    }

    public final void Cye(boolean z) {
        AnonymousClass7BY r1;
        if (z && (r1 = this.A02) != null) {
            r1.A02(this.A05);
        }
    }

    public final void DIJ() {
        DirectShareTarget directShareTarget = this.A05;
        DiscoverableThreadInfo discoverableThreadInfo = directShareTarget.A06;
        if (discoverableThreadInfo != null) {
            discoverableThreadInfo.A03 = true;
            C72208OyY oyY = this.A01;
            if (oyY != null) {
                oyY.A07(C69495Nmd.JOIN_SOCIAL_CHANNEL);
            }
        }
        AnonymousClass7BY r0 = this.A02;
        if (r0 != null) {
            r0.A02(directShareTarget);
        }
    }

    public final void DTc() {
        C72208OyY oyY = this.A01;
        if (oyY != null) {
            oyY.A09(this.A05);
        }
    }
}
