package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpU  reason: case insensitive filesystem */
public final class C65224LpU implements MVS {
    public C60076JfA A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C63633L0v A03;
    public final C66576MXh A04;
    public final C61848KOn A05;
    public final C62674Kka A06 = C62674Kka.A0I;
    public final AnonymousClass80P A07 = AnonymousClass80P.SHARE_TO_FACEBOOK_ON;

    public final /* synthetic */ void ADm() {
    }

    public static final void A00(View.OnClickListener onClickListener, C65224LpU lpU, C60951Ju9 ju9, boolean z) {
        C60076JfA jfA = lpU.A00;
        if (z) {
            if (jfA != null) {
                AnonymousClass4DH r2 = lpU.A01;
                jfA.setInlineSubtitle(DbV.A05(r2).getString(2131968777));
                if (ju9 != null) {
                    C60076JfA jfA2 = lpU.A00;
                    if (jfA2 != null) {
                        jfA2.setDescription(LPW.A00(r2.requireContext(), ju9));
                    }
                }
            }
            0qQ.A0F("shareToFbContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        if (jfA != null) {
            jfA.setInlineSubtitle(DbV.A05(lpU.A01).getString(2131968751));
            C60076JfA jfA3 = lpU.A00;
            if (jfA3 != null) {
                jfA3.setDescription((CharSequence) null);
            }
        }
        0qQ.A0F("shareToFbContainer");
        throw AnonymousClass00P.createAndThrow();
        C60076JfA jfA4 = lpU.A00;
        if (jfA4 != null) {
            AnonymousClass0fU.A00(onClickListener, jfA4);
            return;
        }
        0qQ.A0F("shareToFbContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View ANH() {
        C60076JfA A002 = C64004LIk.A00(this.A01.requireContext(), (View.OnClickListener) null, Integer.valueOf(R.drawable.instagram_facebook_circle_pano_outline_24), 2131971821);
        this.A00 = A002;
        A002.A07.setFocusable(false);
        C60076JfA jfA = this.A00;
        if (jfA != null) {
            return jfA;
        }
        0qQ.A0F("shareToFbContainer");
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
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 49), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65224LpU(AnonymousClass4DH r2, UserSession userSession, C63633L0v l0v, C66576MXh mXh, C61848KOn kOn) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A01 = r2;
        this.A02 = userSession;
        this.A05 = kOn;
        this.A04 = mXh;
        this.A03 = l0v;
    }
}
