package X;

import android.telephony.PhoneNumberUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class SGU {
    public static final SGU A00 = new Object();

    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r9, AnonymousClass6a7 r10, String str, String str2) {
        boolean A1X = DbW.A1X(fragmentActivity);
        T7B t7b = new T7B(userSession, r9.C9L(), str2);
        t7b.A02(1DL.A07(fragmentActivity, "android.permission.CALL_PHONE"));
        if (r10 != null) {
            r10.A01();
        }
        C46498Dg1 dg1 = new C46498Dg1(fragmentActivity, userSession);
        String formatNumber = PhoneNumberUtils.formatNumber(00p.A0g(str, "tel:", "", A1X), AnonymousClass1Q2.A02().getCountry());
        0qQ.A07(formatNumber);
        dg1.A0C(DbY.A0c(fragmentActivity, formatNumber, 2131954433), new C11486Sb9(fragmentActivity, t7b, str, 4));
        dg1.A03 = new C12803T7q(t7b, r10);
        new C49945FFy(dg1).A03(fragmentActivity);
        T7B.A01(t7b, "ctc_confirmation_dialog_shown");
    }
}
