package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.P3h  reason: case insensitive filesystem */
public final class C72368P3h implements C74399PuF {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final O7W A03;
    public final AnonymousClass4AD A04;

    public C72368P3h(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, O7W o7w, AnonymousClass4AD r6) {
        0qQ.A0B(r6, 3);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = o7w;
    }

    public final void DUW(OIR oir) {
    }

    public final void DUZ(OIR oir) {
        0qQ.A0B(oir, 0);
        NKL nkl = new NKL();
        nkl.A0I = oir;
        nkl.A0J = this.A04;
        nkl.A0K = new C70556OBe(oir, this);
        FragmentActivity fragmentActivity = this.A00;
        C331127Pr A0W = DbS.A0W(this.A02);
        boolean z = oir.A0I;
        A0W.A1O = z;
        A0W.A1F = !z;
        A0W.A0U = nkl;
        C71110Ocp.A02(fragmentActivity, nkl, A0W);
    }
}
