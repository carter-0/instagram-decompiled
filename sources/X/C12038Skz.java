package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.Skz  reason: case insensitive filesystem */
public final class C12038Skz implements C13919TlL {
    public final /* synthetic */ LiveLocationSession A00;
    public final /* synthetic */ C12040Sl1 A01;

    public C12038Skz(LiveLocationSession liveLocationSession, C12040Sl1 sl1) {
        this.A01 = sl1;
        this.A00 = liveLocationSession;
    }

    public final void onSuccess() {
        ((C13920TlM) this.A01.A02).onSuccess(this.A00);
    }

    public final void onError(Throwable th) {
        throw AnonymousClass00P.createAndThrow();
    }
}
