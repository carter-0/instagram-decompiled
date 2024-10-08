package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6u5  reason: invalid class name and case insensitive filesystem */
public final class C321396u5 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass70J A02;
    public final /* synthetic */ User A03;

    public C321396u5(AnonymousClass0iw r1, UserSession userSession, AnonymousClass70J r3, User user) {
        this.A02 = r3;
        this.A03 = user;
        this.A00 = r1;
        this.A01 = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1940796811);
        AnonymousClass70J r0 = this.A02;
        User user = this.A03;
        AnonymousClass0iw r3 = this.A00;
        C49965FGy.A00.A08(r0.A01, r3, r0.A03, user);
        UserSession userSession = this.A01;
        if (C319886rO.A06(userSession) && 182.A06(0Tu.A05, userSession, 36318887704074860L)) {
            user.A04 = 0;
        }
        AnonymousClass0fD.A0C(1195280302, A05);
    }
}
