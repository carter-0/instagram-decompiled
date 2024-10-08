package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpK  reason: case insensitive filesystem */
public final class C65214LpK implements MVS {
    public View A00;
    public C64143LQf A01;
    public final UserSession A02;
    public final C66576MXh A03;
    public final C61839KOd A04;
    public final boolean A05;
    public final AnonymousClass80P A06 = AnonymousClass80P.ADD_UPCOMING_EVENT;
    public final AnonymousClass4DH A07;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A07;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 10), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final View ANH() {
        AnonymousClass4DH r4 = this.A07;
        UserSession userSession = this.A02;
        boolean z = this.A05;
        C66576MXh mXh = this.A03;
        C65214LpK lpK = this;
        if (z) {
            lpK = null;
        }
        this.A01 = new C64143LQf(r4, userSession, lpK, mXh, z);
        View A0C = DbT.A0C(DbV.A0E(r4), (ViewGroup) null, R.layout.add_event);
        JTS.A0x(A0C);
        this.A00 = A0C;
        return A0C;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A06;
    }

    public C65214LpK(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, C62462KgC kgC, C61839KOd kOd) {
        C51974G9v.A1P(r2, userSession, mXh, kOd);
        this.A07 = r2;
        this.A02 = userSession;
        this.A03 = mXh;
        this.A04 = kOd;
        this.A05 = AnonymousClass7TF.A1W(kgC, C62462KgC.FEED);
    }
}
