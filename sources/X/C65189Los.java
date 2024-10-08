package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;

/* renamed from: X.Los  reason: case insensitive filesystem */
public final class C65189Los implements MVS {
    public IgLinearLayout A00;
    public C55872Hot A01;
    public final AnonymousClass80P A02 = AnonymousClass80P.TAG_CHANNELS;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C60304Jj3 A05;
    public final KOO A06;

    public final /* synthetic */ void ADm() {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.LinearLayout, android.view.View, com.instagram.common.ui.base.IgLinearLayout] */
    public final View ANH() {
        AnonymousClass4DH r6 = this.A03;
        ? linearLayout = new LinearLayout(r6.requireContext());
        linearLayout.setOrientation(1);
        JTS.A0x(linearLayout);
        this.A00 = linearLayout;
        LayoutInflater A0E = DbV.A0E(r6);
        IgLinearLayout igLinearLayout = this.A00;
        if (igLinearLayout != null) {
            View A0A = DbU.A0A(A0E, igLinearLayout, R.layout.add_channels_row, false);
            this.A01 = new C55872Hot(A0A);
            IgLinearLayout igLinearLayout2 = this.A00;
            if (igLinearLayout2 != null) {
                igLinearLayout2.addView(A0A);
                this.A05.A03(r6, (AddChannelsRowChannelInfo) null, false);
                IgLinearLayout igLinearLayout3 = this.A00;
                if (igLinearLayout3 != null) {
                    return igLinearLayout3;
                }
            }
        }
        0qQ.A0F("contentView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A02;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A03;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 12), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65189Los(AnonymousClass4DH r2, UserSession userSession, C60304Jj3 jj3, KOO koo) {
        C51974G9v.A1P(r2, userSession, jj3, koo);
        this.A03 = r2;
        this.A04 = userSession;
        this.A05 = jj3;
        this.A06 = koo;
    }
}
