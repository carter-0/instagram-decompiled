package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lp2  reason: case insensitive filesystem */
public final class C65198Lp2 implements MVS {
    public KHY A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C63631L0t A03;
    public final C61848KOn A04;
    public final C62674Kka A05 = C62674Kka.A0G;
    public final AnonymousClass80P A06 = AnonymousClass80P.RECOMMEND_ON_FB_ON;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        AnonymousClass4DH r1 = this.A01;
        KHY A012 = C64004LIk.A01(r1.requireContext(), (Boolean) null, JTQ.A0a(r1.requireContext(), 2131955684), Integer.valueOf(R.drawable.instagram_facebook_circle_pano_outline_24), 2131955643);
        this.A00 = A012;
        return A012;
    }

    public final C62674Kka B1s() {
        return this.A05;
    }

    public final AnonymousClass80P BHl() {
        return this.A06;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A01;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 45), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65198Lp2(AnonymousClass4DH r2, UserSession userSession, C63631L0t l0t, C61848KOn kOn) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A01 = r2;
        this.A02 = userSession;
        this.A04 = kOn;
        this.A03 = l0t;
    }
}
