package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.P3e  reason: case insensitive filesystem */
public final class C72365P3e implements C74399PuF {
    public final FragmentActivity A00;
    public final C279864zZ A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final void DUW(OIR oir) {
    }

    public final void DUZ(OIR oir) {
        AnonymousClass0iw r4 = this.A02;
        C71013OYl oYl = new C71013OYl(this.A00, this.A01, r4, this.A03);
        G9w.A1Y(oYl.A04);
        C71013OYl.A01(oYl, false);
    }

    public C72365P3e(FragmentActivity fragmentActivity, C279864zZ r2, AnonymousClass0iw r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A01 = r2;
    }
}
