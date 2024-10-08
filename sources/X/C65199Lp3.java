package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lp3  reason: case insensitive filesystem */
public final class C65199Lp3 implements MVS {
    public KHX A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C66576MXh A03;
    public final C61848KOn A04;
    public final C62674Kka A05 = C62674Kka.A0I;
    public final AnonymousClass80P A06 = AnonymousClass80P.SHARE_TO_FACEBOOK_ON;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        String str;
        String str2;
        String str3;
        Drawable drawable;
        AnonymousClass4DH r7 = this.A01;
        Context requireContext = r7.requireContext();
        C61848KOn kOn = this.A04;
        C60951Ju9 A0A = kOn.A0A();
        if (A0A != null) {
            str = A0A.A04;
        } else {
            str = null;
        }
        Context requireContext2 = r7.requireContext();
        String A0a = JTQ.A0a(r7.requireContext(), 2131961885);
        C60951Ju9 A0A2 = kOn.A0A();
        if (A0A2 != null) {
            str2 = A0A2.A02;
        } else {
            str2 = null;
        }
        String A0u = DbV.A0u(requireContext2, A0a, str2, 2131971783);
        C60951Ju9 A0A3 = kOn.A0A();
        if (A0A3 != null) {
            str3 = A0A3.A05;
        } else {
            str3 = null;
        }
        KHX khx = new KHX(requireContext);
        JTP.A14(khx, -1, -2);
        khx.setOrientation(1);
        khx.setTitle(str);
        if (!(str3 == null || (drawable = requireContext.getDrawable(R.drawable.avatar_bottom_badge_facebook)) == null)) {
            khx.setProfileImage(r7, str3, drawable);
        }
        if (A0u != null) {
            khx.setSubtitle(A0u);
        }
        KHX khx2 = khx;
        this.A00 = khx;
        if (182.A06(0Tu.A05, this.A02, 36330887838712643L)) {
            return khx;
        }
        View inflate = DbV.A0E(r7).inflate(R.layout.layout_share_sheet_share_to_title, (ViewGroup) null);
        0qQ.A0C(inflate, AnonymousClass000.A00(9));
        TextView textView = (TextView) inflate;
        textView.setText(2131955759);
        LinearLayout linearLayout = new LinearLayout(r7.requireContext());
        JTP.A14(linearLayout, -1, -2);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(khx2);
        return linearLayout;
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
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 48), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65199Lp3(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, C61848KOn kOn) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A01 = r2;
        this.A02 = userSession;
        this.A04 = kOn;
        this.A03 = mXh;
    }
}
