package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpL  reason: case insensitive filesystem */
public final class C65215LpL implements MVS {
    public KHU A00;
    public final AnonymousClass4DH A01;
    public final C66576MXh A02;
    public final LMT A03;
    public final KOU A04;
    public final C61844KOi A05;
    public final C62674Kka A06 = C62674Kka.A0M;
    public final AnonymousClass80P A07 = AnonymousClass80P.TAG_PRODUCT;
    public final UserSession A08;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        Fragment fragment = this.A01;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A08;
        KHU khu = new KHU(requireContext, userSession, new C65709LyP(this), C63447KxC.A00(userSession));
        JTS.A0x(khu);
        khu.setController(C249713kF.A00.A0U(fragment.requireContext(), AnonymousClass07i.A00(fragment), userSession));
        khu.setShowIcon(true);
        this.A00 = khu;
        return khu;
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
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 41), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65215LpL(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, LMT lmt, KOU kou, C61844KOi kOi) {
        C51974G9v.A1P(r2, userSession, lmt, mXh);
        0qQ.A0B(kou, 6);
        this.A01 = r2;
        this.A08 = userSession;
        this.A03 = lmt;
        this.A02 = mXh;
        this.A05 = kOi;
        this.A04 = kou;
    }
}
