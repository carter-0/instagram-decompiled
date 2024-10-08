package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Mfv  reason: case insensitive filesystem */
public final class C66962Mfv extends C69600Noi {
    public final UserSession A00;
    public final DirectThreadKey A01;
    public final C241473Pi A02;
    public final boolean A03;

    public C66962Mfv(UserSession userSession, DirectThreadKey directThreadKey, C241473Pi r4, boolean z) {
        0qQ.A0B(directThreadKey, 2);
        this.A00 = userSession;
        this.A01 = directThreadKey;
        this.A03 = z;
        this.A02 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (0qQ.A0K(getClass(), JTR.A0v(obj)) && (obj instanceof C66962Mfv)) {
                C66962Mfv mfv = (C66962Mfv) obj;
                if (!0qQ.A0K(this.A01, mfv.A01) || this.A03 != mfv.A03 || !0qQ.A0K(this.A02, mfv.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0K(this.A01)) + C51971G9r.A0E(this.A02);
    }
}
