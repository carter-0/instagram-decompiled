package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpH  reason: case insensitive filesystem */
public final class C65211LpH implements MVS {
    public C60076JfA A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C63632L0u A03;
    public final C66576MXh A04;
    public final C61848KOn A05;
    public final C62674Kka A06 = C62674Kka.A0G;
    public final AnonymousClass80P A07 = AnonymousClass80P.RECOMMEND_ON_FB_ON;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        C60076JfA A002 = C64004LIk.A00(this.A01.requireContext(), (View.OnClickListener) null, Integer.valueOf(R.drawable.instagram_facebook_circle_pano_outline_24), 2131955643);
        this.A00 = A002;
        A002.A07.setFocusable(false);
        C60076JfA jfA = this.A00;
        if (jfA != null) {
            return jfA;
        }
        0qQ.A0F("recommendOnFbContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A06;
    }

    public final AnonymousClass80P BHl() {
        return this.A07;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A01;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 46), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65211LpH(AnonymousClass4DH r2, UserSession userSession, C63632L0u l0u, C66576MXh mXh, C61848KOn kOn) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A01 = r2;
        this.A02 = userSession;
        this.A05 = kOn;
        this.A04 = mXh;
        this.A03 = l0u;
    }
}
