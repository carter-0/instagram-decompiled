package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EmF  reason: case insensitive filesystem */
public abstract class C48915EmF {
    public static final void A00(C307896Rx r9, boolean z) {
        UserSession userSession;
        String str;
        Bundle bundle;
        FragmentActivity A04 = C308206Td.A04(r9);
        try {
            userSession = DbT.A0Z(r9);
        } catch (ClassCastException unused) {
            Bundle A0a = AnonymousClass7TE.A0a();
            Bundle A06 = DbU.A06(A04);
            if (A06 == null || (str = A06.getString("last_logged_in_ig_access_token", (String) null)) == null) {
                Bundle A062 = DbU.A06(A04);
                if (A062 == null || (bundle = A062.getBundle("source_activity_arguments")) == null) {
                    str = null;
                } else {
                    str = bundle.getString("last_logged_in_ig_access_token", (String) null);
                }
            }
            DbS.A1A(A0a, str);
            userSession = 09i.A0A.A07(A0a);
        }
        if (userSession != null) {
            FFQ.A00().A01(A04, AnonymousClass0BO.A00(userSession).AEO(A04, (Uri) null, userSession, (String) null, z).A00, userSession, false);
        }
    }
}
