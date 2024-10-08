package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4Wb  reason: invalid class name and case insensitive filesystem */
public final class C265734Wb implements C249693kD {
    public final 1Xj A00;

    public C265734Wb(1Xj r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final String ByO(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return this.A00.A2v();
    }

    public final boolean CWu() {
        return true;
    }

    public final float AcY(UserSession userSession) {
        C246623eu A1S = this.A00.A1S();
        if (A1S != null) {
            return ((float) A1S.A01) / ((float) A1S.A00);
        }
        return 0.0f;
    }

    public final 1Xj BPf() {
        return this.A00;
    }

    public final List Bkd(AnonymousClass3WT r2) {
        return this.A00.A3o(r2);
    }

    public final /* bridge */ /* synthetic */ User CCd() {
        return this.A00.A0C.CCd();
    }

    public final String CFY() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean CUz() {
        return this.A00.CUz();
    }

    public final boolean CYg() {
        return this.A00.CYg();
    }

    public final boolean CcK() {
        return this.A00.CcK();
    }

    public final String getId() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
