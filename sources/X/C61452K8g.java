package X;

import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.K8g  reason: case insensitive filesystem */
public final class C61452K8g extends C63762L5u {
    public final BoostMediaPickerTabType A00;
    public final C61020JvK A01;
    public final UserSession A02;
    public final 1Xj A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61452K8g(BoostMediaPickerTabType boostMediaPickerTabType, C61020JvK jvK, UserSession userSession, 1Xj r5) {
        super(jvK, userSession, r5);
        0qQ.A0B(r5, 4);
        this.A02 = userSession;
        this.A00 = boostMediaPickerTabType;
        this.A01 = jvK;
        this.A03 = r5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61452K8g) {
                C61452K8g k8g = (C61452K8g) obj;
                if (!0qQ.A0K(this.A02, k8g.A02) || this.A00 != k8g.A00 || !0qQ.A0K(this.A01, k8g.A01) || !0qQ.A0K(this.A03, k8g.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        int ordinal = this.A00.ordinal();
        if (ordinal == 3 || (ordinal == 0 && this.A01.A04.size() >= 2 && C18803W2r.A02(this.A02))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A02))));
    }
}
