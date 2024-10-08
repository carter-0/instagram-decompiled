package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LEt  reason: case insensitive filesystem */
public final class C63951LEt {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C13999To1(this, 36));

    public C63951LEt(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Context context, AnonymousClass07i r13, AnonymousClass0iw r14, String str, boolean z) {
        0qQ.A0B(r13, 2);
        AnonymousClass0eM r0 = this.A01;
        Object A0W = Dba.A0W(r0);
        boolean z2 = z;
        Boolean valueOf = Boolean.valueOf(z2);
        ((2Fk) r0.getValue()).A0B(valueOf);
        0eE r02 = AnonymousClass0t1.A01;
        UserSession userSession = this.A00;
        DbS.A0h(userSession, r02).EPM(valueOf);
        MJC mjc = new MJC(this, r14, str, 2, z2);
        C20614Wvv wvv = new C20614Wvv(7, A0W, this);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("commerce/shopping_auto_highlight/update/");
        A0a.A0H("enable_auto_highlight", z2);
        1OC A0S = DbU.A0S(A0a, 1XP.class, 1XY.class);
        C61499KAe.A00(A0S, wvv, mjc, 13);
        1ES.A00(context, r13, A0S);
    }

    public final void A01(Context context, AnonymousClass07i r17, C62320sa r18, 0sP r19) {
        AnonymousClass07i r4 = r17;
        0qQ.A0B(r4, 1);
        UserSession userSession = this.A00;
        C20785Wyw wyw = new C20785Wyw(r19, 19);
        Context context2 = context;
        1OC r2 = AnonymousClass738.A05(context2, userSession, (Boolean) null, (Boolean) null, (Boolean) null, AnonymousClass05K.A0Y, (Integer) null, userSession.A06, false).A00;
        r2.A00 = new KAR(7, r18, wyw, userSession);
        1ES.A00(context2, r4, r2);
    }
}
