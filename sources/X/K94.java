package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

public final class K94 extends C47567E8f {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K94(04x r1, Integer num, Object obj, Object obj2, String str, int i, int i2) {
        super(r1, num, str, i);
        this.A00 = i2;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.instagram.monetization.impl.MonetizationFragmentFactoryImpl] */
    public final void onClick(View view) {
        String str;
        if (this.A00 != 0) {
            C295095nZ r1 = (C295095nZ) this.A01;
            String A10 = DbT.A10(r1.A02);
            C65229LpZ lpZ = (C65229LpZ) this.A02;
            if (r1.A00) {
                str = r1.A04;
            } else {
                lpZ.A0I.requireContext();
                AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                AnonymousClass5w9.A00(lpZ.A0J);
                str = null;
            }
            UserSession userSession = lpZ.A0J;
            C295105na.A02(userSession, "default_privacy_instruction_view_click", A10, str, "share_sheet", r1.A01.toString(), false, C363558jv.A00(userSession), r1.A05);
            lpZ.A0L.EuY(r1, str, "share_sheet", false);
            return;
        }
        Object obj = this.A01;
        Integer num = AnonymousClass05K.A00;
        C61394K5o k5o = (C61394K5o) this.A02;
        if (obj == num) {
            FragmentActivity requireActivity = k5o.requireActivity();
            AnonymousClass0eM r02 = k5o.A03;
            C309516Yo A0N = DbX.A0N(requireActivity, r02);
            F6R.A01();
            Dba.A12(new Object().A00(UserMonetizationProductType.INCENTIVE_PLATFORM, AnonymousClass7TE.A0l(r02), "not_eligible", false), A0N);
            return;
        }
        SUL A0J = Dba.A0J(k5o.requireActivity(), AnonymousClass7TE.A0l(k5o.A03), 2EG.A2k, C66579MXk.A00(873));
        A0J.A0S = C61394K5o.__redex_internal_original_name;
        A0J.A0A();
    }
}
