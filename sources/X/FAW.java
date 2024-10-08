package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;

public final class FAW {
    public static final AnonymousClass0eM A05 = AnonymousClass0eN.A01(C46425Dem.A00);
    public boolean A00;
    public final C46415Dec A01;
    public final FZ5 A02;
    public final Dc6 A03;
    public final Dda A04;

    /* JADX WARNING: type inference failed for: r14v0, types: [X.Dec, java.lang.Object, X.4bt] */
    public FAW(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        UserSession userSession2 = userSession;
        UserDetailLaunchConfig userDetailLaunchConfig2 = userDetailLaunchConfig;
        Dc6 dc6 = new Dc6(userSession2, userDetailLaunchConfig2, new C46461DfP(userSession2));
        this.A03 = dc6;
        Dda dda = new Dda(userSession2, userDetailLaunchConfig2.A0A, userDetailLaunchConfig2.A0L, userDetailLaunchConfig2.A0Z);
        this.A04 = dda;
        ? obj = new Object();
        this.A01 = obj;
        AnonymousClass19S A022 = AnonymousClass1HX.A02(93492324, 3);
        0Tu r2 = 0Tu.A05;
        FZ5 fz5 = new FZ5(A022, DbS.A04(r2, userSession2, 36609691347326874L), 182.A06(r2, userSession2, 36328216370363476L));
        this.A02 = fz5;
        if (182.A06(r2, userSession2, 36328216369445963L)) {
            this.A00 = true;
            dc6.A08();
            dc6.A07(userSession2, fz5, new C46462DfQ(userSession2), obj, dda, new C323066wt((AnonymousClass4D6) null, false, dc6.A08(), false), userDetailLaunchConfig2.A0C, "profile", false);
        }
    }
}
