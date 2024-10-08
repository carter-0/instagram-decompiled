package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpN  reason: case insensitive filesystem */
public final class C65217LpN implements MVS {
    public LDQ A00;
    public C61676KHa A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C66576MXh A04;
    public final C61850KOp A05;
    public final boolean A06;
    public final C62674Kka A07 = C62674Kka.A03;
    public final AnonymousClass80P A08 = AnonymousClass80P.ADD_LOCATION;
    public final AnonymousClass4DH A09;

    public final /* synthetic */ void ADm() {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.KHa, android.widget.LinearLayout, android.view.View] */
    public final View ANH() {
        ? linearLayout = new LinearLayout(this.A09.requireContext());
        DbY.A0z(linearLayout);
        linearLayout.setOrientation(1);
        this.A01 = linearLayout;
        C61850KOp kOp = this.A05;
        linearLayout.A01 = kOp;
        linearLayout.A00 = kOp.A00;
        return linearLayout;
    }

    public final C62674Kka B1s() {
        return this.A07;
    }

    public final AnonymousClass80P BHl() {
        return this.A08;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A09;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 34), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65217LpN(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, C66576MXh mXh, C61850KOp kOp, boolean z) {
        C51974G9v.A1P(r2, userSession, mXh, kOp);
        0qQ.A0B(r3, 5);
        this.A09 = r2;
        this.A03 = userSession;
        this.A04 = mXh;
        this.A05 = kOp;
        this.A02 = r3;
        this.A06 = z;
    }
}
