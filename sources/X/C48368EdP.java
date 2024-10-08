package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.EdP  reason: case insensitive filesystem */
public abstract class C48368EdP {
    public static final void A00(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, C267624bv r17, UserSession userSession, String str, String str2, int i) {
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, activity);
        if (!activity.isFinishing()) {
            C56603I4c A00 = HSE.A00(userSession2);
            String str3 = str;
            String str4 = str2;
            if (A00.A04(str3, str4)) {
                A00.A03(activity, str3, str4);
            }
            C358248ab A0X = DbS.A0X(activity);
            A0X.A0j(C48369EdQ.A00(activity, userSession2));
            A0X.A09(2131956845);
            A0X.A08(i);
            A0X.A0I(new C50004FIp(activity2, onClickListener, r17, userSession2, str3, str4, 0), 2131956843);
            A0X.A0H((DialogInterface.OnClickListener) null, 2131956844);
            A0X.A0s(A1U);
            A0X.A0r(A1U);
            A0X.A0f(onDismissListener);
            DbT.A1V(A0X);
        }
    }
}
