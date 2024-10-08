package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ldx  reason: case insensitive filesystem */
public final class C64556Ldx implements C66538MVs {
    public final UserSession A00;
    public final 1Xj A01;

    public final String CCA() {
        return null;
    }

    public final String BPj() {
        AnonymousClass3QO A1t = this.A01.A1t();
        if (A1t != AnonymousClass3QO.DEFAULT) {
            return A1t.A00;
        }
        return null;
    }

    public final int BR9() {
        return this.A01.BR7().A00;
    }

    public final User CCd() {
        User A2A = this.A01.A2A(this.A00);
        if (A2A != null) {
            return A2A;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean CQD() {
        return this.A01.A5G();
    }

    public final boolean CWU() {
        return false;
    }

    public final boolean Cbn() {
        return false;
    }

    public final boolean Cce() {
        return this.A01.A5v();
    }

    public final boolean CeS() {
        return this.A01.CeS();
    }

    public final String getMediaId() {
        return this.A01.getId();
    }

    public C64556Ldx(UserSession userSession, 1Xj r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
