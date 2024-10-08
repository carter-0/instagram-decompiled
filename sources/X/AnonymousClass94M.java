package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.94M  reason: invalid class name */
public final class AnonymousClass94M implements 0lm {
    public static final AnonymousClass94M $redex_init_class = null;
    public final C3733094v A00;
    public final UserSession A01;
    public final List A02;
    public final List A03;
    public final AnonymousClass0eM A04;
    public final Context A05;
    public final C258733zY A06;
    public final AnonymousClass94R A07;
    public final AnonymousClass94N A08;
    public final AnonymousClass94O A09;
    public final AnonymousClass94Q A0A;
    public final AnonymousClass94P A0B;

    static {
        AnonymousClass94M.class.getCanonicalName();
    }

    public AnonymousClass94M(Context context, UserSession userSession) {
        this.A05 = context;
        this.A01 = userSession;
        C258733zY r3 = new C258733zY(userSession);
        this.A06 = r3;
        AnonymousClass94N r4 = new AnonymousClass94N(userSession);
        this.A08 = r4;
        AnonymousClass94O r5 = new AnonymousClass94O(userSession);
        this.A09 = r5;
        AnonymousClass94P r7 = new AnonymousClass94P(userSession);
        this.A0B = r7;
        AnonymousClass94Q r8 = new AnonymousClass94Q(userSession);
        this.A0A = r8;
        AnonymousClass94R r9 = new AnonymousClass94R(userSession);
        this.A07 = r9;
        this.A03 = 0sr.A1P(new C258743zZ[]{r3, r4, r5, r3, r7, r8, r9});
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        this.A02 = 0sr.A1P(new AnonymousClass94T[]{(AnonymousClass94T) userSession.A01(AnonymousClass94S.class, new TTP(11, context, userSession)), (AnonymousClass94T) userSession.A01(AnonymousClass94Z.class, new TTP(20, context, userSession)), (AnonymousClass94T) userSession.A01(C3732194m.class, new MJ7(28, context, userSession)), (AnonymousClass94T) userSession.A01(C3732394o.class, new MJ7(34, context, userSession)), (AnonymousClass94T) userSession.A01(C3732594q.class, new C41562AwU(userSession, 44)), (AnonymousClass94T) userSession.A01(C3732794s.class, new MJ7(32, context, userSession)), (AnonymousClass94T) userSession.A01(C3732994u.class, new TTP(17, context, userSession))});
        0t0 A012 = AnonymousClass0eN.A01(new C377179Kv(this, 32));
        this.A04 = A012;
        this.A00 = new C3733094v((C60400gq) A012.getValue());
    }

    public final void onUserSessionWillEnd(boolean z) {
    }
}
