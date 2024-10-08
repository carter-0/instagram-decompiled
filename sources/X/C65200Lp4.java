package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lp4  reason: case insensitive filesystem */
public final class C65200Lp4 implements MVS {
    public KHY A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.FAN_CLUB_ON;
    public final UserSession A02;
    public final C66576MXh A03;
    public final KOT A04;
    public final C60288Jik A05;
    public final AnonymousClass4DH A06;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A06;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 3), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final View ANH() {
        KHY A012 = C64004LIk.A01(this.A06.requireContext(), (Boolean) null, (CharSequence) null, Integer.valueOf(R.drawable.instagram_crown_pano_outline_24), 2131961790);
        this.A00 = A012;
        LYD.A02(A012, 35, this);
        KHY khy = this.A00;
        if (khy == null) {
            0qQ.A0F("subscribersOnlyToggle");
            throw AnonymousClass00P.createAndThrow();
        }
        KHY.A02(khy, this, 21);
        return khy;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65200Lp4(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, KOT kot, C60288Jik jik) {
        C51974G9v.A1L(r2, userSession, jik);
        0qQ.A0B(mXh, 5);
        this.A06 = r2;
        this.A02 = userSession;
        this.A04 = kot;
        this.A05 = jik;
        this.A03 = mXh;
    }
}
