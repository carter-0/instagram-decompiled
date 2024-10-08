package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* renamed from: X.JfZ  reason: case insensitive filesystem */
public final class C60093JfZ extends C361478gI {
    public final UserSession A00;
    public final C273004lm A01;
    public final FanClubApi A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60093JfZ(Application application, UserSession userSession) {
        super(application);
        FanClubApi fanClubApi = new FanClubApi(userSession);
        boolean A1Y = DbW.A1Y(userSession);
        this.A00 = userSession;
        this.A02 = fanClubApi;
        this.A01 = C272994ll.A00(userSession);
        0sn r0 = 0sn.A00;
        02z A012 = 106.A01(r0);
        this.A05 = A012;
        02z A013 = 106.A01(r0);
        this.A04 = A013;
        Boolean valueOf = Boolean.valueOf(A1Y);
        02z A10 = DbS.A10(valueOf);
        this.A07 = A10;
        02z A102 = DbS.A10(valueOf);
        this.A06 = A102;
        this.A03 = MCA.A00(this, new AnonymousClass0r6[]{A012, A013, A102, A10}, 45);
    }
}
