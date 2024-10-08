package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.4b2  reason: invalid class name and case insensitive filesystem */
public final class C267144b2 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C267064at A02;
    public final /* synthetic */ FollowStatus A03;
    public final /* synthetic */ User A04;

    public C267144b2(AnonymousClass0iw r1, UserSession userSession, C267064at r3, FollowStatus followStatus, User user) {
        this.A02 = r3;
        this.A04 = user;
        this.A01 = userSession;
        this.A00 = r1;
        this.A03 = followStatus;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1320354648);
        C267064at r0 = this.A02;
        FollowButtonBase followButtonBase = r0.A0R;
        followButtonBase.setEnabled(false);
        User user = this.A04;
        if (user.CPV()) {
            UserSession userSession = this.A01;
            String str = r0.A0I;
            if (str == null) {
                str = this.A00.getModuleName();
            }
            FH6.A02((Activity) null, userSession, followButtonBase, r0.A09, user, str);
        } else {
            if (r0.A0M) {
                UserSession userSession2 = this.A01;
                EWA ewa = EWA.UserActionFollow;
                Integer num = AnonymousClass05K.A0N;
                String str2 = r0.A0H;
                1Xj r12 = r0.A04;
                AnonymousClass0iw r8 = this.A00;
                String moduleName = r8.getModuleName();
                User user2 = user;
                C294695ms.A01((0xF) null, userSession2, r12, (UserDetailEntryInfo) null, (SearchContext) null, r0.A0C, ewa, user2, (Double) null, num, r0.A0F, str2, (String) null, (String) null, moduleName, (String) null, r0.A0G);
                C243873aF r6 = r0.A08;
                if (r6 != null && r6.EsG()) {
                    C267064at.A00(r8, userSession2, r0, this.A03, user);
                }
                C243873aF r02 = r0.A08;
                if (r02 != null) {
                    r02.DVJ();
                }
            } else if (r0.A0O) {
                UserSession userSession3 = this.A01;
                EWA ewa2 = EWA.UserActionFollow;
                Integer num2 = AnonymousClass05K.A0N;
                String str3 = r0.A0H;
                1Xj r10 = r0.A04;
                String moduleName2 = this.A00.getModuleName();
                User user3 = user;
                C294695ms.A01((0xF) null, userSession3, r10, (UserDetailEntryInfo) null, (SearchContext) null, r0.A0C, ewa2, user3, (Double) null, num2, r0.A0F, str3, (String) null, (String) null, moduleName2, (String) null, r0.A0G);
                C243893aH r03 = r0.A0B;
                if (r03 != null) {
                    r03.DVP();
                }
            } else if (r0.A0N) {
                UserSession userSession4 = this.A01;
                EWA ewa3 = EWA.UserActionFollow;
                Integer num3 = AnonymousClass05K.A0N;
                String str4 = r0.A0H;
                User user4 = user;
                C294695ms.A01((0xF) null, userSession4, r0.A04, (UserDetailEntryInfo) null, (SearchContext) null, r0.A0C, ewa3, user4, (Double) null, num3, (Long) null, str4, (String) null, (String) null, this.A00.getModuleName(), (String) null, (String) null);
                C243913aJ r04 = r0.A0A;
                if (r04 != null) {
                    r04.DVN();
                }
            } else {
                C267064at.A00(this.A00, this.A01, r0, this.A03, user);
            }
            followButtonBase.setEnabled(true);
        }
        AnonymousClass0fD.A0C(-1242158427, A05);
    }
}
