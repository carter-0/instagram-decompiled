package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Loo  reason: case insensitive filesystem */
public final class C65185Loo implements MVS {
    public KHY A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.PROMOTE_POST_ON;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C66576MXh A04;
    public final KON A05;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        KHY A012 = C64004LIk.A01(this.A02.requireContext(), (Boolean) null, (CharSequence) null, Integer.valueOf(R.drawable.instagram_promote_pano_outline_24), 2131970552);
        this.A00 = A012;
        LYD.A02(A012, 27, this);
        KHY khy = this.A00;
        if (khy == null) {
            0qQ.A0F("boostToggle");
            throw AnonymousClass00P.createAndThrow();
        }
        KHY.A02(khy, this, 18);
        return khy;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public final void CsQ() {
        AnonymousClass4DH r6 = this.A02;
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r6.getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHO A032 = MHO.A03(viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 43);
        19B r3 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(r6, r3, A032, A002);
        1Eo.A05(r3, MHO.A03(A0I, r5, this, (AnonymousClass4D7) null, 44), AnonymousClass07a.A00(A0I));
    }

    public C65185Loo(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, KON kon) {
        C51974G9v.A1P(r2, userSession, kon, mXh);
        this.A02 = r2;
        this.A03 = userSession;
        this.A05 = kon;
        this.A04 = mXh;
    }
}
