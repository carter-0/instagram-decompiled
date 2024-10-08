package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EiP  reason: case insensitive filesystem */
public abstract class C48678EiP {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        String str;
        List list = r12.A00;
        if (list.size() == 0) {
            str = "";
        } else {
            str = (String) AnonymousClass7TE.A13(list);
        }
        UserSession A0Z = DbT.A0Z(r11);
        FragmentActivity A04 = C308206Td.A04(r11);
        FragmentActivity A042 = C308206Td.A04(r11);
        if (str == null) {
            str = "unknown";
        }
        Dba.A0j(1, A042, A04);
        0qQ.A0B(A0Z, 2);
        AnonymousClass3FW r8 = new AnonymousClass3FW(A0Z);
        C51080FoA foA = new C51080FoA(A0Z, r8, str);
        C358248ab A0X = DbS.A0X(A042);
        DbU.A16(A04, A0X, R.drawable.ig_illustrations_qp_moon_refresh);
        DbT.A19(A04, A0X, 2131971187);
        A0X.A08(2131971185);
        A0X.A0c(new C71196OfI(A04, A042, A0Z, r8, foA, str, 2), AnonymousClass7TE.A16(A04, 2131971188));
        A0X.A0H(new C50018FJd((Object) r8, (Object) A0Z, str, 10), 2131971186);
        DbT.A1V(A0X);
        AnonymousClass0iw r0 = C46359DdX.A00;
        AnonymousClass7TG.A1N(A0Z, r0);
        DcM.A03(new DcM(r0, A0Z), Dba.A0Q(r8), "ig_quiet_mode_upsell_enable_flow_dialog_shown", str);
        return null;
    }
}
