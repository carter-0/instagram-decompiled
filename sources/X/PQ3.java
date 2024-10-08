package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

public final class PQ3 implements C74431Pul {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void Cq3(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        0qQ.A0B(directMessageInteropReachabilityOptionsArr, 3);
        UserSession userSession = this.A01;
        ORB.A00((Bundle) null, this.A00, userSession, directMessagesInteropOptionsViewModel, num, str, directMessageInteropReachabilityOptionsArr, i, z);
    }

    public final void A00(String str) {
        boolean A1Z;
        boolean A1Z2;
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A01;
        16V A0J = r0.A01(userSession).A0J();
        0qQ.A0B(userSession, 0);
        if (!2Ek.A03(AnonymousClass7TF.A0Q(userSession))) {
            A1Z = false;
        } else {
            A1Z = DbY.A1Z(0Tu.A05, userSession, 36311955622855500L);
        }
        if (!2Ek.A03(AnonymousClass7TF.A0Q(userSession))) {
            A1Z2 = false;
        } else {
            A1Z2 = DbY.A1Z(0Tu.A05, userSession, 36311955622921037L);
        }
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = new DirectMessagesInteropOptionsViewModel((DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null);
        ORB.A01(directMessagesInteropOptionsViewModel, this, A0J, str, A1Z, A1Z2, C363388je.A02(C363388je.A00(userSession).A00(CallerContext.A01("DirectMessagesOptionsBloksBridgeNavigatorDelegate"))));
    }

    public final void CpJ() {
        C309516Yo A0Q = DbU.A0Q(this.A00, this.A01);
        A0Q.A0D(new C68451NIp());
        A0Q.A04();
    }

    public PQ3(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1O(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
