package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.followrequests.data.FollowRequestsActionDataSource;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;

public final class EFW extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C61960qR A02;
    public final C49490EwV A03;
    public final C47289DuI A04;
    public final C333967aR A05;
    public final C49714F2z A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final /* bridge */ /* synthetic */ 2YL create() {
        boolean z;
        UserSession userSession = this.A01;
        C47289DuI duI = this.A04;
        boolean z2 = this.A0B;
        FollowRequestsRepository followRequestsRepository = new FollowRequestsRepository(userSession, duI, z2);
        AnonymousClass0iw r7 = this.A00;
        F2F f2f = new F2F(r7, userSession);
        C333987aU r8 = new C333987aU();
        AnonymousClass0iw r15 = r7;
        UserSession userSession2 = userSession;
        FollowRequestsActionDataSource followRequestsActionDataSource = new FollowRequestsActionDataSource(r15, userSession2, this.A02, C49017Ent.A00(userSession), this.A05);
        C334007aW r3 = new C334007aW(userSession, followRequestsActionDataSource, r8);
        UserSession userSession3 = userSession;
        C47538E7b e7b = new C47538E7b(userSession3, this.A03, followRequestsActionDataSource, followRequestsRepository, r3, this.A06);
        C47537E7a e7a = new C47537E7a(userSession3, followRequestsRepository, r3, new C230012om(r7, userSession), this.A0A);
        E7Z e7z = new E7Z(followRequestsRepository);
        boolean A062 = 182.A06(0Tu.A05, userSession, 36329741082444080L);
        Boolean A0K = AnonymousClass7TF.A0Q(userSession).A0K();
        if (A0K != null) {
            z = A0K.booleanValue();
        } else {
            z = false;
        }
        boolean z3 = this.A07;
        boolean z4 = this.A08;
        boolean z5 = this.A0C;
        return new C47539E7c(followRequestsRepository, e7b, e7z, e7a, f2f, z3, z4, z5, this.A0D, z2, A062, this.A09, z);
    }

    public EFW(Application application, AnonymousClass0iw r3, UserSession userSession, C49490EwV ewV, C47289DuI duI, C333967aR r7, C49714F2z f2z, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AnonymousClass7TG.A1U(userSession, r3, ewV);
        DbW.A1O(duI, 4, f2z);
        this.A01 = userSession;
        this.A00 = r3;
        this.A03 = ewV;
        this.A04 = duI;
        this.A05 = r7;
        this.A06 = f2z;
        this.A07 = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A0D = z5;
        this.A0B = z6;
        this.A09 = z7;
        this.A02 = new C61960qR(application);
    }
}
