package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lp8  reason: case insensitive filesystem */
public final class C65203Lp8 implements MVS {
    public C60076JfA A00;
    public final UserSession A01;
    public final C63630L0s A02;
    public final C66576MXh A03;
    public final C61846KOl A04;
    public final C62674Kka A05 = C62674Kka.A07;
    public final AnonymousClass80P A06 = AnonymousClass80P.AUDIENCE_CONTROL;
    public final AnonymousClass4DH A07;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        this.A00 = C64004LIk.A00(this.A07.requireContext(), LYD.A01(this, 11), Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), 2131955221);
        C61846KOl kOl = this.A04;
        UserSession userSession = kOl.A05;
        if (AnonymousClass7TE.A0q(userSession).getInt("clips_share_sheet_audience_control_row_new_badge_count", 0) < 3) {
            kOl.A02 = true;
            AnonymousClass7TG.A1M(AnonymousClass7TE.A0q(userSession), "clips_share_sheet_audience_control_row_new_badge_count", AnonymousClass7TE.A0q(userSession).getInt("clips_share_sheet_audience_control_row_new_badge_count", 0) + 1);
            05G r1 = kOl.A08;
            C61044Jvi jvi = (C61044Jvi) r1.getValue();
            r1.Epw(new C61044Jvi((AnonymousClass3QO) jvi.A01, jvi.A02, true, jvi.A04, jvi.A03));
        }
        1Av A002 = 1Au.A00(userSession);
        if (!AnonymousClass7TG.A1a(A002, A002.A7g, 1Av.A8a, 182)) {
            kOl.A03 = true;
            05G r12 = kOl.A08;
            C61044Jvi jvi2 = (C61044Jvi) r12.getValue();
            r12.Epw(new C61044Jvi((AnonymousClass3QO) jvi2.A01, jvi2.A02, jvi2.A05, true, jvi2.A03));
        }
        C60076JfA jfA = this.A00;
        if (jfA != null) {
            return jfA;
        }
        0qQ.A0F("audienceRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A05;
    }

    public final AnonymousClass80P BHl() {
        return this.A06;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A07;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 17), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65203Lp8(AnonymousClass4DH r2, UserSession userSession, C63630L0s l0s, C66576MXh mXh, C61846KOl kOl) {
        C51972G9s.A1B(r2, mXh);
        this.A07 = r2;
        this.A01 = userSession;
        this.A04 = kOl;
        this.A03 = mXh;
        this.A02 = l0s;
    }
}
