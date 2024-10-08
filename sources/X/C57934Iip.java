package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iip  reason: case insensitive filesystem */
public final class C57934Iip implements Runnable {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass6Z5 A01;
    public final /* synthetic */ boolean A02;

    public C57934Iip(1Xj r1, AnonymousClass6Z5 r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void run() {
        UserSession userSession = this.A01.A09;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass1Nd.A00(userSession).A00(new AnonymousClass3DU(this.A00, this.A02));
        }
    }
}
