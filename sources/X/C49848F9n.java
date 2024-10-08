package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.F9n  reason: case insensitive filesystem */
public abstract class C49848F9n {
    public static final AnonymousClass0iw A00 = DbS.A0O("quiet_mode");

    public static final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        String A02;
        String A022;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity, 0);
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1B(context, 1, userSession);
        F10 A0Q = Dba.A0Q(new AnonymousClass3FW(userSession));
        C358248ab A0X = DbS.A0X(fragmentActivity);
        DbU.A16(context, A0X, R.drawable.ig_illustrations_qp_moon_refresh);
        DbT.A19(context, A0X, 2131971230);
        AnonymousClass3FW r5 = new AnonymousClass3FW(userSession);
        String str2 = str;
        if (str.equals(AnonymousClass000.A00(1276))) {
            A02 = FGR.A02(context, r5.A01(), true);
            A022 = FGR.A02(context, r5.A00(), true);
        } else {
            0Tu r6 = 0Tu.A05;
            A02 = FGR.A02(context, 182.A01(r6, userSession, 36597476459023176L), false);
            A022 = FGR.A02(context, 182.A01(r6, userSession, 36597476458892103L), false);
        }
        String A0u = DbV.A0u(context, A02, A022, 2131971221);
        0qQ.A07(A0u);
        A0X.A0q(A0u);
        A0X.A0Q(new FIZ(fragmentActivity2, A0Q, userSession2, str2, 6), C358278ae.DEFAULT, 2131961425);
        A0X.A0H(new C50018FJd((Object) A0Q, (Object) userSession, str, 11), 2131968772);
        DbT.A1V(A0X);
        AnonymousClass0iw r0 = A00;
        0qQ.A0B(r0, 1);
        DcM.A01(AnonymousClass0kN.A01(r0, userSession), A0Q, "ig_quiet_mode_upsell_unified_dialog_shown", str);
    }
}
