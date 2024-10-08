package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Vhf  reason: case insensitive filesystem */
public final class C17888Vhf {
    public final Context A00;
    public final C358248ab A01;
    public final C62320sa A02;
    public final boolean A03;
    public final boolean A04;

    public C17888Vhf(Context context, UserSession userSession, UpcomingEvent upcomingEvent) {
        boolean A012 = new C310296al(userSession).A01(upcomingEvent);
        boolean A013 = AnonymousClass0oH.A01(context);
        C20698WxU wxU = new C20698WxU((Object) context, 33);
        this.A00 = context;
        this.A04 = A012;
        this.A03 = A013;
        this.A02 = wxU;
        C358248ab r3 = new C358248ab(context);
        r3.A09(2131976018);
        r3.A08(2131976017);
        r3.A0c(new W5U(this, 49), AnonymousClass7TE.A16(context, 2131976019));
        r3.A0a(W5N.A00, AnonymousClass7TE.A16(context, 2131968513));
        this.A01 = r3;
    }

    public final void A00(C62320sa r3) {
        if (this.A04 || this.A03) {
            r3.invoke();
            return;
        }
        C358248ab r1 = this.A01;
        W5b.A00(r1, r3, 6);
        DbT.A1V(r1);
    }
}
