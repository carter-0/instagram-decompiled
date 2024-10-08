package X;

import com.instagram.common.session.UserSession;

public final class IUE implements AnonymousClass3Y1, C61910qF {
    public final int A00;
    public final Object A01;

    public final C246663ey AXQ(UserSession userSession, AnonymousClass3W1 r3, String str, boolean z) {
        DbZ.A0t(0, str, userSession, r3);
        return ((AnonymousClass335) this.A01).A00(userSession, r3, str, z);
    }

    public IUE(AnonymousClass335 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final boolean equals(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
                if (!(obj instanceof AnonymousClass3Y1) || !(obj instanceof C61910qF)) {
                    return false;
                }
                return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
            default:
                return super.equals(obj);
        }
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(4, this.A01, AnonymousClass335.class, C273654mx.A00(717), C273654mx.A00(718), 0);
    }

    public final int hashCode() {
        switch (this.A00) {
            case 0:
            case 1:
                return getFunctionDelegate().hashCode();
            default:
                return super.hashCode();
        }
    }
}
