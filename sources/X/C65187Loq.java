package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Loq  reason: case insensitive filesystem */
public final class C65187Loq implements MVS {
    public KHX A00;
    public final AnonymousClass4DH A01;
    public final C61848KOn A02;
    public final AnonymousClass80P A03 = AnonymousClass80P.SHARE_TO_FACEBOOK_ON;
    public final UserSession A04;
    public final C66576MXh A05;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A01;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 0), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final View ANH() {
        String str;
        C62623Kiu kiu;
        Drawable drawable;
        AnonymousClass4DH r6 = this.A01;
        Context requireContext = r6.requireContext();
        AnonymousClass0Ud r9 = this.A02.A07;
        MXB mxb = (MXB) ((C61080JwI) r9.getValue()).A00;
        String str2 = null;
        if (mxb != null) {
            str = mxb.getUsername();
        } else {
            str = null;
        }
        Context requireContext2 = r6.requireContext();
        String string = r6.requireContext().getString(2131975313);
        Context requireContext3 = r6.requireContext();
        MXB mxb2 = (MXB) ((C61080JwI) r9.getValue()).A00;
        if (mxb2 != null) {
            kiu = mxb2.AXt();
        } else {
            kiu = null;
        }
        String A0u = DbV.A0u(requireContext2, string, C59912Jbb.A03(requireContext3, kiu), 2131971783);
        MXB mxb3 = (MXB) ((C61080JwI) r9.getValue()).A00;
        if (mxb3 != null) {
            str2 = mxb3.getProfilePicUrl();
        }
        KHX khx = new KHX(requireContext);
        DbY.A0z(khx);
        khx.setOrientation(1);
        khx.setTitle(str);
        if (!(str2 == null || (drawable = requireContext.getDrawable(R.drawable.avatar_bottom_badge_threads)) == null)) {
            khx.setProfileImage(r6, str2, drawable);
        }
        if (A0u != null) {
            khx.setSubtitle(A0u);
        }
        this.A00 = khx;
        return khx;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A03;
    }

    public C65187Loq(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, C61848KOn kOn) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A01 = r2;
        this.A04 = userSession;
        this.A02 = kOn;
        this.A05 = mXh;
    }
}
