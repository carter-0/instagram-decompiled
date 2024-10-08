package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LpI  reason: case insensitive filesystem */
public final class C65212LpI implements MVS {
    public C60076JfA A00;
    public final AnonymousClass4DH A01;
    public final C66576MXh A02;
    public final KOS A03;
    public final C62674Kka A04 = C62674Kka.A0L;
    public final AnonymousClass80P A05 = AnonymousClass80P.TAG_PERSON;
    public final UserSession A06;
    public final boolean A07;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A01;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 4), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A06, 36320794665624418L) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View ANH() {
        /*
            r4 = this;
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r3 = r4.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320794665624418(0x81099200012362, double:3.0327550264174345E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 2131955582(0x7f130f7e, float:1.9547696E38)
            if (r0 != 0) goto L_0x0019
        L_0x0016:
            r3 = 2131955584(0x7f130f80, float:1.95477E38)
        L_0x0019:
            X.4DH r0 = r4.A01
            android.content.Context r2 = r0.requireContext()
            r1 = 0
            r0 = 2131238874(0x7f081fda, float:1.809404E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.JfA r0 = X.C64004LIk.A00(r2, r1, r0, r3)
            r4.A00 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65212LpI.ANH():android.view.View");
    }

    public final C62674Kka B1s() {
        return this.A04;
    }

    public final AnonymousClass80P BHl() {
        return this.A05;
    }

    public C65212LpI(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, KOS kos, boolean z) {
        AnonymousClass7TG.A1O(r2, userSession);
        0qQ.A0B(mXh, 5);
        this.A01 = r2;
        this.A06 = userSession;
        this.A03 = kos;
        this.A07 = z;
        this.A02 = mXh;
    }
}
