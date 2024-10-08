package X;

import com.instagram.common.session.UserSession;

public final class NPK extends AnonymousClass4AA {
    public final UserSession A00;
    public final C67303Mld A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NPK) {
                NPK npk = (NPK) obj;
                if (!0qQ.A0K(this.A00, npk.A00) || this.A02 != npk.A02 || !0qQ.A0K(this.A01, npk.A01) || this.A03 != npk.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00))));
    }

    public NPK(UserSession userSession, C67303Mld mld, boolean z, boolean z2) {
        this.A00 = userSession;
        this.A02 = z;
        this.A01 = mld;
        this.A03 = z2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
