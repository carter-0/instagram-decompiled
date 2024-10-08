package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Iu  reason: invalid class name and case insensitive filesystem */
public final class C329417Iu implements C329357Io {
    public final UserSession A00;
    public final AnonymousClass0eM A01;

    public final View Ajg() {
        C252063oV r0 = (C252063oV) this.A01.getValue();
        if (r0 != null) {
            return r0.getView();
        }
        return null;
    }

    public C329417Iu(View view, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AnonymousClass1YB.A00(new C377479Lz(32, view, this));
    }
}
