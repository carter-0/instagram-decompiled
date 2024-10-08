package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Lou  reason: case insensitive filesystem */
public final class C65191Lou implements MVS {
    public View A00;
    public IgdsSwitch A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C66576MXh A04;
    public final KOY A05;
    public final AnonymousClass80P A06 = AnonymousClass80P.SETTING_CLIPS_TO_FEED;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        View A08 = DbU.A08(DbV.A0E(this.A02), R.layout.layout_share_to_feed_toggle);
        this.A00 = A08;
        String str = "shareToFeedToggleRow";
        if (A08 != null) {
            this.A01 = (IgdsSwitch) A08.requireViewById(R.id.share_to_feed_switch);
            C65369LsA lsA = new C65369LsA(this, 7);
            View view = this.A00;
            if (view != null) {
                LYD.A02(view, 9, this);
                IgdsSwitch igdsSwitch = this.A01;
                if (igdsSwitch == null) {
                    str = "shareToFeedToggle";
                } else {
                    igdsSwitch.A07 = lsA;
                    View view2 = this.A00;
                    if (view2 != null) {
                        return view2;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A06;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A02;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 16), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65191Lou(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, KOY koy) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A02 = r2;
        this.A03 = userSession;
        this.A05 = koy;
        this.A04 = mXh;
    }
}
