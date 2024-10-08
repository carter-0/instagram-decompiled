package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.HFu  reason: case insensitive filesystem */
public final class C54488HFu extends C2806552w {
    public final /* synthetic */ AnonymousClass70J A00;
    public final /* synthetic */ User A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54488HFu(AnonymousClass70J r2, User user, int i) {
        super(Integer.valueOf(i));
        this.A00 = r2;
        this.A01 = user;
    }

    public final void onClick(View view) {
        C50672FgX A02;
        AnonymousClass70J r0 = this.A00;
        if (r0 != null && (A02 = r0.A02()) != null) {
            User user = this.A01;
            UserSession userSession = A02.A02;
            AnonymousClass70U r4 = new AnonymousClass70U(userSession);
            UserDetailFragment userDetailFragment = A02.A04;
            if (userDetailFragment.getContext() != null) {
                String C9f = user.A03.C9f();
                if (C9f != null) {
                    String id = user.getId();
                    C8956RIv rIv = C8956RIv.PROFILE;
                    r4.A00(rIv, id, C9f, (String) null, true);
                    AnonymousClass3ZQ.A01(userDetailFragment.requireContext(), rIv, userSession, user.getId(), C9f);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
