package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3S6  reason: invalid class name */
public final class AnonymousClass3S6 implements AnonymousClass11X {
    public 1Wr A00;
    public final /* synthetic */ C227522jT A01;

    public final String getName() {
        return "LocationPlugin";
    }

    public final int getRunnableId() {
        return 593;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public AnonymousClass3S6(C227522jT r1) {
        this.A01 = r1;
    }

    public final void onFinish() {
        1Wr r2 = this.A00;
        r2.getClass();
        UserSession userSession = this.A01.A00;
        r2.setupPlaceSignatureCollection(userSession);
        this.A00.setupForegroundCollection(userSession);
    }

    public final void run() {
        this.A00 = 1Wr.A00;
    }
}
