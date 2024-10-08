package X;

import com.instagram.common.session.UserSession;

public final class H8Z extends C230372pW {
    public final int A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public H8Z(AnonymousClass0iw r4, UserSession userSession, int i) {
        super(1Bk.A03.A01(new AnonymousClass2z0(userSession, "ig_threads_in_stories_unit")));
        this.A02 = userSession;
        this.A01 = r4;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C255773uh r5 = (C255773uh) obj;
        0qQ.A0B(r5, 0);
        C56336Hwn.A00(this.A01, this.A02, r5, this.A00, false);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C255773uh r5 = (C255773uh) obj;
        0qQ.A0B(r5, 0);
        C56336Hwn.A00(this.A01, this.A02, r5, this.A00, true);
    }
}
