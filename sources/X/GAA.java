package X;

import com.instagram.common.session.UserSession;

public final /* synthetic */ class GAA implements C61910qF, AnonymousClass3Y1 {
    public final /* synthetic */ AnonymousClass335 A00;

    public GAA(AnonymousClass335 r1) {
        this.A00 = r1;
    }

    public final C246663ey AXQ(UserSession userSession, AnonymousClass3W1 r3, String str, boolean z) {
        DbZ.A0t(0, str, userSession, r3);
        return this.A00.A00(userSession, r3, str, z);
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(4, this.A00, AnonymousClass335.class, C273654mx.A00(717), C273654mx.A00(718), 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3Y1) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }
}
