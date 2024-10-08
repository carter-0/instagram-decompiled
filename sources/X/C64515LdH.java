package X;

import android.content.Context;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.LdH  reason: case insensitive filesystem */
public final class C64515LdH implements C66423MRd {
    public final WGU A00;
    public final C61410K6h A01;
    public final C64516LdI A02;
    public final C65324LrN A03;
    public final C63603Kzq A04;
    public final UserSession A05;
    public final String A06;
    public final Context A07;

    public C64515LdH(Context context, C61410K6h k6h, C64516LdI ldI, C65324LrN lrN, C63603Kzq kzq, UserSession userSession, String str) {
        0qQ.A0B(userSession, 2);
        this.A07 = context;
        this.A05 = userSession;
        this.A06 = str;
        this.A01 = k6h;
        this.A04 = kzq;
        this.A02 = ldI;
        this.A03 = lrN;
        WGU A002 = WGU.A00(userSession);
        0qQ.A07(A002);
        this.A00 = A002;
        kzq.A00.setLoadingStatus(C255943uy.LOADING);
        ldI.A02 = this;
        lrN.A01 = this;
    }

    public final void A00() {
        this.A00.A0O(this.A05, "media_selection", this.A06, "media_fetch");
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.2tL, java.lang.Object] */
    public final void A01(String str, boolean z) {
        if (str == null) {
            SpinnerImageView spinnerImageView = this.A04.A00;
            if (spinnerImageView.getVisibility() == 0) {
                C63985LHd.A00(this.A05, this.A06, "No media available");
                JTO.A1X(spinnerImageView);
                this.A03.A05.A02.setVisibility(0);
                this.A02.A08.A01.setVisibility(0);
            }
        } else if (z) {
            UserSession userSession = this.A05;
            String str2 = this.A06;
            boolean A042 = this.A02.A04();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), AnonymousClass000.A00(1724));
            if (A0e.isSampled()) {
                0bb r2 = new 0bb();
                r2.A03(AnonymousClass000.A00(163), Boolean.valueOf(A042));
                r2.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(JTU.A1R(r2, userSession)));
                A0e.AAJ("component", "media_cell");
                DbS.A1N(A0e, str2);
                JTS.A18(A0e, 1Q9.A01("boost_posts"));
                A0e.AAK(r2, "configurations");
                DbS.A1H(A0e, "media_selection");
                A0e.Cgf();
            }
        }
        C65324LrN lrN = this.A03;
        if (str != null) {
            C63601Kzo kzo = lrN.A04;
            C46215DQt dQt = lrN.A06;
            0qQ.A0B(dQt, 1);
            kzo.A00.A00(dQt, str);
        } else {
            LE4 le4 = lrN.A05;
            AnonymousClass2t9 r22 = le4.A07;
            ViewModelListUpdate A0R = DbS.A0R();
            A0R.A00(new Object());
            r22.A05(A0R);
            r22.notifyDataSetChanged();
            AppBarLayout appBarLayout = le4.A05;
            appBarLayout.A03 = 13;
            appBarLayout.requestLayout();
        }
        C61410K6h k6h = this.A01;
        LOA loa = k6h.A01;
        if (loa != null) {
            loa.A01 = str;
            loa.A00();
            if (k6h.A01 != null) {
                k6h.A02 = str;
                return;
            }
        }
        0qQ.A0F("mediaPickerState");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void destroy() {
        this.A03.destroy();
    }
}
