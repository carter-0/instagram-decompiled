package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpS  reason: case insensitive filesystem */
public final class C65222LpS implements MVS {
    public C60058JeZ A00;
    public View A01;
    public ViewGroup A02;
    public final UserSession A03;
    public final C64833Liv A04;
    public final AnonymousClass80P A05 = AnonymousClass80P.TEMP_CAMERA_TOOL;
    public final AnonymousClass4DH A06;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        A00(this);
        AnonymousClass4DH r0 = this.A06;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 12), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C65222LpS r13) {
        /*
            com.instagram.common.session.UserSession r7 = r13.A03
            X.Liv r0 = X.C63270KuF.A00(r7)
            X.05G r0 = r0.A01
            java.util.Collection r0 = X.JTO.A13(r0)
            if (r0 == 0) goto L_0x0015
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r0 = r0 ^ 1
            java.lang.String r2 = "rowItemView"
            android.view.View r1 = r13.A01
            if (r0 == 0) goto L_0x0063
            if (r1 == 0) goto L_0x006d
            r0 = 0
        L_0x0021:
            r1.setVisibility(r0)
            X.JeZ r1 = r13.A00
            java.lang.String r2 = "otherIGShareTitleContainer"
            if (r1 == 0) goto L_0x0031
            android.view.ViewGroup r0 = r13.A02
            if (r0 == 0) goto L_0x006d
            r0.removeView(r1)
        L_0x0031:
            X.4DH r6 = r13.A06
            android.content.Context r4 = r6.requireContext()
            android.view.View r5 = r6.mView
            if (r5 == 0) goto L_0x0068
            r8 = 0
            X.Liv r0 = X.C63270KuF.A00(r7)
            X.05G r0 = r0.A01
            java.util.List r12 = X.JTO.A16(r0)
            X.Lzs r9 = new X.Lzs
            r9.<init>(r13)
            X.JeZ r3 = new X.JeZ
            r10 = r8
            r11 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r3
            android.view.ViewGroup r0 = r13.A02
            if (r0 == 0) goto L_0x006d
            r0.addView(r3)
            X.JeZ r0 = r13.A00
            if (r0 == 0) goto L_0x0062
            r0.A04()
        L_0x0062:
            return
        L_0x0063:
            if (r1 == 0) goto L_0x006d
            r0 = 8
            goto L_0x0021
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x006d:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65222LpS.A00(X.LpS):void");
    }

    public final View ANH() {
        View A08 = DbU.A08(DbV.A0E(this.A06), R.layout.share_other_ig_row);
        this.A01 = A08;
        if (A08 != null) {
            this.A02 = DbU.A0C(A08, R.id.other_ig_share_title_container);
            View view = this.A01;
            if (view != null) {
                return view;
            }
        }
        0qQ.A0F("rowItemView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A05;
    }

    public C65222LpS(AnonymousClass4DH r2, UserSession userSession, C64833Liv liv) {
        AnonymousClass7TG.A1P(userSession, liv);
        this.A03 = userSession;
        this.A06 = r2;
        this.A04 = liv;
    }
}
