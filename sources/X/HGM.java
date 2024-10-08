package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class HGM extends C243843aC {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C55881Hp2 A04;
    public final /* synthetic */ User A05;

    public final void D2Y(FollowStatus followStatus, User user) {
        int i;
        0qQ.A0B(user, 0);
        UserSession userSession = this.A03;
        if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A06) {
            User user2 = this.A05;
            if (user2.A0N() != AnonymousClass05K.A01) {
                String moduleName = this.A02.getModuleName();
                C309516Yo A0M = DbS.A0M(this.A01, userSession);
                A0M.A06();
                A0M.A0B((Bundle) null, C46447Df9.A02().A02(userSession, C46474Dfc.A01(userSession, user2.getId(), AnonymousClass000.A00(3917), moduleName)));
                A0M.A04();
            }
            i = 2131975870;
        } else {
            i = 2131962617;
        }
        Context context = this.A00;
        String A0b = DbY.A0b(context, user, i);
        0qQ.A07(A0b);
        C59689JTv.A09(context, A0b);
    }

    public HGM(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C55881Hp2 hp2, User user) {
        this.A03 = userSession;
        this.A05 = user;
        this.A00 = context;
        this.A02 = r3;
        this.A04 = hp2;
        this.A01 = fragmentActivity;
    }
}
