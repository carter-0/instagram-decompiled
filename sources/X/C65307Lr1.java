package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lr1  reason: case insensitive filesystem */
public final class C65307Lr1 implements C66487MTq {
    public final /* synthetic */ AnonymousClass630 A00;

    public C65307Lr1(AnonymousClass630 r1) {
        this.A00 = r1;
    }

    public final void onFailure() {
    }

    public final void onSuccess() {
        UserSession userSession = this.A00.A01;
        new LNv(userSession).A00(C273654mx.A00(2857));
        1Au.A00(userSession).A1e(true);
        C70888OQg.A00(2, "DEFAULT_ON_BY_META");
    }
}
