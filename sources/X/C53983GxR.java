package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GxR  reason: case insensitive filesystem */
public final class C53983GxR extends C243963aQ {
    public static final 2WU A09 = C51971G9r.A0d(IJQ.A00, 5);
    public final int A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final User A03;
    public final String A04;
    public final 0sL A05;
    public final 0sL A06;
    public final 0sL A07;
    public final 0sL A08;

    public final C244523bK A0X(C244463bE r7) {
        0qQ.A0B(r7, 0);
        IKH ikh = new IKH(this.A02, this.A03, this.A04);
        AnonymousClass2WG A0f = C51969G9p.A0f(r7, A09, C58401IrK.A00, new J6H(this, 20));
        AnonymousClass3XV r0 = 2WX.A02;
        return C51965G9l.A0W(C51965G9l.A0X((2WX) null, new C244253at(AnonymousClass05K.A00, new J6H(this, 21), (String) null)).A00((2WX) null), ikh, A0f);
    }

    public C53983GxR(AnonymousClass0iw r2, UserSession userSession, User user, String str, 0sL r6, 0sL r7, 0sL r8, 0sL r9, int i) {
        AnonymousClass7TG.A1P(userSession, user);
        C51974G9v.A1N(r6, r7, r8);
        AnonymousClass7TF.A1G(r9, 8, r2);
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = user;
        this.A04 = str;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A05 = r9;
        this.A01 = r2;
    }
}
