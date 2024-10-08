package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4Wj  reason: invalid class name */
public final class AnonymousClass4Wj {
    public final UserSession A00;

    public final AnonymousClass9JD A00(1Xj r7) {
        0qQ.A0B(r7, 0);
        String id = r7.getId();
        if (id != null) {
            return new AnonymousClass9JD(new AnonymousClass9IE((Object) new C377449Lw(19, r7, this), 26), id, C2606846q.A00(r7.A2L()), r7.A3o(AnonymousClass3WT.SLIDER));
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass4Wj(UserSession userSession) {
        this.A00 = userSession;
    }
}
