package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lox  reason: case insensitive filesystem */
public final class C65194Lox implements MVS {
    public C60076JfA A00;
    public final UserSession A01;
    public final KOX A02;
    public final C66576MXh A03;
    public final C62674Kka A04 = C62674Kka.A07;
    public final AnonymousClass80P A05 = AnonymousClass80P.AUDIENCE_CONTROL;
    public final AnonymousClass4DH A06;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        C60076JfA A002 = C64004LIk.A00(this.A06.requireContext(), LYD.A01(this, 19), Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), 2131955221);
        this.A00 = A002;
        return A002;
    }

    public final C62674Kka B1s() {
        return this.A04;
    }

    public final AnonymousClass80P BHl() {
        return this.A05;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A06;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 24), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65194Lox(AnonymousClass4DH r2, UserSession userSession, KOX kox, C66576MXh mXh) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A06 = r2;
        this.A01 = userSession;
        this.A02 = kox;
        this.A03 = mXh;
    }
}
