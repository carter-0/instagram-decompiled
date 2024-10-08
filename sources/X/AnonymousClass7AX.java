package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.7AX  reason: invalid class name */
public final class AnonymousClass7AX {
    public final Context A00;
    public final C327297Af A01;
    public final 1Ng A02;
    public final 1wn A03;
    public final UserSession A04;
    public final C327327Ai A05;
    public final AnonymousClass7UW A06;
    public final C327307Ag A07;
    public final String A08;
    public final C333517Zg A09;
    public final Executor A0A = AnonymousClass7AY.A00;

    public static final void A00(AnonymousClass7AX r2, String str, boolean z) {
        if (0qQ.A0K(str, r2.A08)) {
            r2.A09.BCh().DNv(z);
            r2.A0A.execute(new C41071Ant(r2, z));
        }
    }

    public AnonymousClass7AX(Context context, UserSession userSession, AnonymousClass7UW r8, C333517Zg r9, String str) {
        this.A00 = context;
        this.A04 = userSession;
        this.A06 = r8;
        this.A08 = str;
        this.A09 = r9;
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        this.A02 = A002;
        this.A01 = new AnonymousClass7AZ(context, userSession).A00();
        C327307Ag r3 = (C327307Ag) userSession.A01(C327307Ag.class, new C73918Ply(userSession, 7));
        this.A07 = r3;
        C327327Ai r2 = new C327327Ai(this);
        this.A05 = r2;
        C327347Ak r1 = new C327347Ak(this);
        this.A03 = r1;
        A002.A01(r1, AnonymousClass7MN.class);
        r3.A01.add(r2);
    }
}
