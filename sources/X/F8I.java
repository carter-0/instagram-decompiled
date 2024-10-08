package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.recommended.FollowListData;

public abstract class F8I {
    public static final C309516Yo A00(FragmentActivity fragmentActivity, UserSession userSession, FollowListData followListData, boolean z) {
        Integer num;
        Bundle A0a = AnonymousClass7TE.A0a();
        if (followListData.A00 == C46443Df5.FOLLOWING) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        A0a.putInt("FollowListFragment.EntryType", num.intValue());
        A0a.putParcelable("FollowListFragment.FollowListData", followListData);
        A0a.putBoolean("FollowListFragment.DisplayOnlyMutual", z);
        if (fragmentActivity != null) {
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
            C46339Dch.A00();
            C46430Der der = new C46430Der();
            der.setArguments(A0a);
            A0Q.A0D(der);
            return A0Q;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C309516Yo A01(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        Bundle A0A = DbY.A0A(userSession);
        A0A.putString("LikesListFragment.MEDIA_ID", str);
        A0A.putInt(AnonymousClass000.A00(975), 2131968487);
        if (fragmentActivity != null) {
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
            A0Q.A0D(C46339Dch.A01().CrB(A0A, userSession));
            return A0Q;
        }
        throw AnonymousClass7TE.A0y();
    }
}
