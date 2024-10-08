package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lp7  reason: case insensitive filesystem */
public final class C65202Lp7 implements MVS {
    public C60076JfA A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C66576MXh A03;
    public final KOQ A04;
    public final LO1 A05;
    public final C62674Kka A06 = C62674Kka.A05;
    public final AnonymousClass80P A07 = AnonymousClass80P.ADVANCED_SETTINGS;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        C60076JfA A002 = C64004LIk.A00(this.A01.requireContext(), LYD.A01(this, 8), Integer.valueOf(R.drawable.instagram_settings_pano_outline_24), 2131970965);
        this.A00 = A002;
        A002.setId(R.id.advanced_settings_view);
        C60076JfA jfA = this.A00;
        if (jfA != null) {
            return jfA;
        }
        0qQ.A0F("advancedSettingsRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A06;
    }

    public final AnonymousClass80P BHl() {
        return this.A07;
    }

    public final void CsQ() {
        Fragment fragment = this.A01;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 15), AnonymousClass07a.A00(viewLifecycleOwner));
        JTS.A10(fragment, new MGX(this, (AnonymousClass4D7) null, 26), this.A04.A06);
    }

    public C65202Lp7(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, KOQ koq, LO1 lo1) {
        C51974G9v.A1P(r2, userSession, mXh, koq);
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = mXh;
        this.A04 = koq;
        this.A05 = lo1;
    }
}
