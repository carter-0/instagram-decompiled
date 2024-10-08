package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.71W  reason: invalid class name */
public final class AnonymousClass71W {
    public final UserSession A00;
    public final C322706wH A01;
    public final C229122ms A02;

    public final C320156rr A00(C294265mA r3) {
        C229122ms r1 = this.A02;
        if (r1.isLoading()) {
            return C320156rr.LOADING;
        }
        if (r1.CT5() && !C324376zB.A01(this.A00, this.A01.A02.A0P.A0J)) {
            return C320156rr.ERROR;
        }
        if (!((C322736wK) this.A01.A03.get(r3)).A01) {
            return C320156rr.NOT_LOADED;
        }
        return C320156rr.EMPTY;
    }

    public AnonymousClass71W(UserSession userSession, C322706wH r2, C229122ms r3) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }
}
