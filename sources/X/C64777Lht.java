package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lht  reason: case insensitive filesystem */
public final class C64777Lht implements C232262tL {
    public final UserSession A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "opal_row_view_model";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        boolean z;
        C64777Lht lht = (C64777Lht) obj;
        boolean z2 = this.A01;
        if (lht != null) {
            z = lht.A01;
        } else {
            z = false;
        }
        if (z2 == z) {
            return true;
        }
        return false;
    }

    public C64777Lht(boolean z, UserSession userSession) {
        this.A01 = z;
        this.A00 = userSession;
    }
}
