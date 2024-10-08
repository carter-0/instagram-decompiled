package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

public final class QJU extends C18983WFk {
    public final /* synthetic */ C13919TlL A00;
    public final /* synthetic */ SHK A01;

    public QJU(C13919TlL tlL, SHK shk) {
        this.A01 = shk;
        this.A00 = tlL;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
        if (liveLocationSession == null) {
            this.A00.onSuccess();
            return;
        }
        SHK shk = this.A01;
        shk.A01.A00(new C12039Sl0(0, this.A00, shk, liveLocationSession), liveLocationSession);
    }

    public final void onError(Throwable th) {
        throw AnonymousClass00P.createAndThrow();
    }
}
