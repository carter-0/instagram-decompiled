package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.8qH  reason: invalid class name and case insensitive filesystem */
public abstract class C367158qH {
    public static final String A00(Context context, UserSession userSession, C299935wF r7) {
        int i;
        0qQ.A0B(userSession, 1);
        if (context == null) {
            return null;
        }
        if (!C363388je.A02(r7)) {
            String str = C299955wH.A00(userSession).A00;
            boolean z = C299955wH.A00(userSession).A01;
            if (str == null) {
                return null;
            }
            int hashCode = str.hashCode();
            if (hashCode != -1924094359) {
                if (hashCode != 117888373) {
                    if (hashCode != 1999208305 || !str.equals("CUSTOM")) {
                        return null;
                    }
                    i = 2131957166;
                } else if (!str.equals("FRIENDS")) {
                    return null;
                } else {
                    i = 2131957167;
                    if (z) {
                        i = 2131957168;
                    }
                }
                return context.getString(i);
            } else if (!str.equals("PUBLIC")) {
                return null;
            }
        }
        i = 2131957169;
        return context.getString(i);
    }

    public static final boolean A01(Context context, CallerContext callerContext, UserSession userSession) {
        String A00;
        0qQ.A0B(userSession, 1);
        C299935wF A002 = C363388je.A00(userSession).A00(callerContext);
        if (!C363388je.A03(A002)) {
            return false;
        }
        if (A002.A04.length() == 0 || (A00 = A00(context, userSession, A002)) == null || A00.length() == 0) {
            return true;
        }
        return false;
    }
}
