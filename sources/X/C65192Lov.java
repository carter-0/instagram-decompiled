package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lov  reason: case insensitive filesystem */
public final class C65192Lov implements MVS {
    public C60076JfA A00;
    public final C62674Kka A01 = C62674Kka.A0E;
    public final AnonymousClass80P A02 = AnonymousClass80P.PARTNERSHIP_LABEL_AND_ADS;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C66576MXh A05;
    public final C66535MVp A06;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        this.A00 = C64004LIk.A00(this.A03.requireContext(), LYD.A01(this, 15), Integer.valueOf(R.drawable.instagram_user_following_pano_outline_24), 2131969192);
        this.A06.ChI();
        C60076JfA jfA = this.A00;
        if (jfA != null) {
            return jfA;
        }
        0qQ.A0F("brandedContentRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A01;
    }

    public final AnonymousClass80P BHl() {
        return this.A02;
    }

    public C65192Lov(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, C66535MVp mVp) {
        C51974G9v.A1P(r2, userSession, mXh, mVp);
        this.A03 = r2;
        this.A04 = userSession;
        this.A05 = mXh;
        this.A06 = mVp;
    }
}
