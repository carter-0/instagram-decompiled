package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.F3a  reason: case insensitive filesystem */
public final class C49715F3a {
    public final /* synthetic */ C47490E4u A00;

    public C49715F3a(C47490E4u e4u) {
        this.A00 = e4u;
    }

    public final void A00() {
        C47490E4u e4u = this.A00;
        FFL.A00(C48152EZu.A08, e4u.A02, "upsell_impressions");
        0wc A02 = AnonymousClass0kN.A02(e4u.A02);
        long currentTimeMillis = System.currentTimeMillis();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(A02, "register_avatar_clicked");
        DbY.A1D(A0e, (double) currentTimeMillis, A002);
        DbW.A11(A0e);
        A0e.AAJ("app_device_id", FH8.A00());
        DbW.A14(A0e, currentTimeMillis);
        FH8.A05(A0e);
        DbW.A10(A0e);
        A0e.A7p("is_standalone", Boolean.valueOf(e4u.A09));
        DbS.A1K(A0e, "register_flow_add_profile_photo");
        UserSession userSession = e4u.A02;
        0qQ.A0B(userSession, 0);
        DbY.A1I(A0e, "source", DbZ.A0m(userSession), A002);
        DbS.A1H(A0e, "profile_photo");
        A0e.Cgf();
        C50349FZg fZg = e4u.A01;
        Context requireContext = e4u.requireContext();
        boolean A1V = AnonymousClass7TF.A1V(e4u.A00);
        boolean A022 = FCK.A02(e4u.mArguments, e4u.A02);
        C49369EuX euX = new C49369EuX(this);
        C49968FHb fHb = new C49968FHb(this, 6);
        C47490E4u e4u2 = fZg.A02;
        if (e4u2 != null) {
            fZg.A05 = A1V;
            ArrayList A1C = AnonymousClass7TE.A1C();
            DbU.A19(requireContext, A1C, 2131964180);
            DbU.A19(requireContext, A1C, 2131975011);
            DbU.A19(requireContext, A1C, 2131955113);
            if (fZg.A05) {
                DbU.A19(requireContext, A1C, 2131972084);
            }
            CharSequence[] charSequenceArr = new CharSequence[A1C.size()];
            fZg.A06 = charSequenceArr;
            A1C.toArray(charSequenceArr);
            CharSequence[] charSequenceArr2 = fZg.A06;
            int i = 1;
            if (A022) {
                i = 0;
            }
            C50026FJl fJl = new C50026FJl(i, (Object) requireContext, (Object) fZg, (Object) euX);
            C358248ab A0H = Dba.A0H(e4u2);
            A0H.A09(2131954991);
            A0H.A0l(e4u2, fZg.A07);
            A0H.A0e(fJl, charSequenceArr2);
            A0H.A04();
            A0H.A0B(fHb);
            DbT.A1V(A0H);
        }
    }

    public final void A01() {
        C47490E4u e4u = this.A00;
        FEK.A00(e4u.A02, Boolean.valueOf(e4u.A09), "profile_photo");
        C47490E4u.A01(e4u, false);
    }

    public final void A02(boolean z) {
        C47490E4u e4u = this.A00;
        02V.A03(e4u.A04, "Complete action is null.");
        if (e4u.A03.A05) {
            e4u.A04.ABq(Boolean.valueOf(z));
        }
        C47490E4u.A01(e4u, true);
    }
}
