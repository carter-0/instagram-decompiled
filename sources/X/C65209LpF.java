package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpF  reason: case insensitive filesystem */
public final class C65209LpF implements MVS {
    public C60076JfA A00;
    public final AnonymousClass4DH A01;
    public final C60119Jg0 A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C61842KOg A05;
    public final C62320sa A06;
    public final AnonymousClass80P A07 = AnonymousClass80P.LINKS_IN_REELS;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        String str;
        this.A00 = C64004LIk.A00(this.A01.requireContext(), LYD.A01(this, 21), Integer.valueOf(R.drawable.instagram_link_pano_outline_24), 2131955505);
        UserSession userSession = this.A04;
        27r A012 = 27p.A01(userSession);
        C59725JVj jVj = C59725JVj.SHARE_SHEET;
        String id = DbT.A0j(userSession).getId();
        C60076JfA jfA = this.A00;
        if (jfA != null) {
            String str2 = jfA.A00;
            if (str2 == null || str2.length() == 0) {
                str = "add_button";
            } else {
                str = "edit_button";
            }
            A012.A1T(jVj, (String) null, id, str, this.A03.getModuleName());
            C60076JfA jfA2 = this.A00;
            if (jfA2 != null) {
                return jfA2;
            }
        }
        0qQ.A0F("addLinkRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A07;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A01;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65209LpF(AnonymousClass4DH r2, C60119Jg0 jg0, AnonymousClass0iw r4, UserSession userSession, C61842KOg kOg, C62320sa r7) {
        C51974G9v.A1P(r2, userSession, kOg, jg0);
        0qQ.A0B(r4, 5);
        this.A01 = r2;
        this.A04 = userSession;
        this.A05 = kOg;
        this.A02 = jg0;
        this.A03 = r4;
        this.A06 = r7;
    }
}
