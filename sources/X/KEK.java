package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;

public final class KEK extends C228042kh {
    public final int A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C357638Yz A04;

    public KEK(Context context, AnonymousClass0iw r3, UserSession userSession, C357638Yz r5, int i) {
        0qQ.A0B(r3, 2);
        this.A03 = userSession;
        this.A02 = r3;
        this.A01 = context;
        this.A00 = i;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        C357498Yd r0 = C357488Yc.A03;
        Context context = this.A01;
        UserSession userSession = this.A03;
        LEQ A012 = r0.A00(context, userSession).A01();
        MonetizationRepository A002 = AnonymousClass2o3.A00(userSession);
        C357638Yz r10 = this.A04;
        AnonymousClass0iw r8 = this.A02;
        User A0j = DbT.A0j(userSession);
        int i = this.A00;
        1pS A003 = C2601144i.A00();
        C339657jx A004 = C339637jv.A00(userSession);
        2cc A005 = C71342cb.A00(userSession);
        1Av A006 = 1Au.A00(userSession);
        17i A007 = 17h.A00(userSession);
        C273004lm A008 = C272994ll.A00(userSession);
        C339737k5 A009 = C339717k3.A00(userSession);
        boolean A042 = C347037wA.A04(userSession);
        boolean A022 = C278264wZ.A02(userSession);
        0Tu A0J = DbS.A0J(userSession, 0);
        boolean A06 = 182.A06(A0J, userSession, 36318221980211199L);
        boolean A0010 = C278264wZ.A00(userSession);
        0qQ.A0B(userSession, 0);
        return new C60312JjF(context, A005, r8, userSession, r10, A009, A008, A004, A002, A006, A0j, A007, A003, A012, i, A042, A022, A06, A0010, 182.A06(A0J, userSession, 36311255543382495L), 182.A06(A0J, userSession, 36322817595222475L), 182.A06(A0J, userSession, 36325347330896779L), 182.A06(A0J, userSession, 2342165826809113038L));
    }
}
