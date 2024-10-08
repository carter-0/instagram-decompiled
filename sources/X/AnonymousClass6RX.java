package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6RX  reason: invalid class name */
public final class AnonymousClass6RX implements C64351Ki {
    public final /* synthetic */ 0lg A00;

    public AnonymousClass6RX(0lg r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        UserSession userSession = this.A00;
        0qQ.A0C(userSession, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        1vy r1 = 1vm.A01(userSession).A01;
        Object value = r1.A03.getValue();
        if (value == null) {
            return r1.A04.getValue();
        }
        return value;
    }
}
