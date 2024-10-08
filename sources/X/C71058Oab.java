package X;

import android.content.Context;
import android.text.SpannableString;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oab  reason: case insensitive filesystem */
public final class C71058Oab {
    public static final C71058Oab A00 = new Object();

    public static final OGH A00(Context context, UserSession userSession, C255283ts r14, Integer num, String str, String str2, String str3, String str4) {
        SpannableString A0D;
        UserSession userSession2 = userSession;
        String str5 = str3;
        String str6 = str4;
        if (182.A06(0Tu.A05, userSession, 36314047272126847L)) {
            if (str4 == null || str6.length() == 0) {
                A0D = C66580MXl.A0D(str5);
            } else {
                A0D = C66580MXl.A0D(DbV.A0u(context, str6, str5, 2131960240));
            }
            int A04 = C51968G9o.A04(context);
            String A0w = C66582MXn.A0w(DbT.A10(A0D));
            String str7 = str;
            int A08 = 00l.A08(A0w, C66582MXn.A0w(str7), 0, false);
            if (A08 > -1) {
                A0D.setSpan(C66580MXl.A0E(A04), A08, C51966G9m.A05(str7, A08), 0);
            } else if (182.A06(0Tu.A06, userSession2, 36316194756104284L)) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                int length = str7.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str7.charAt(i);
                    if (Character.isLetterOrDigit(charAt) || charAt == ' ') {
                        A1A.append(charAt);
                    }
                }
                Iterator it = 00l.A0Q(DbT.A10(A1A), new char[]{' '}, 0).iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    int A082 = 00l.A08(A0w, C66582MXn.A0w(A18), 0, false);
                    if (A082 > -1) {
                        A0D.setSpan(C66580MXl.A0E(A04), A082, C51966G9m.A05(A18, A082), 0);
                    }
                }
            }
        } else if (str4 == null || str6.length() == 0) {
            A0D = C66580MXl.A0D(str5);
        } else {
            A0D = C66580MXl.A0D(DbV.A0u(context, str6, str5, 2131960240));
            0mq.A02(A0D, str6, C51968G9o.A04(context));
        }
        return new OGH(A0D, r14, num, str2, str5);
    }

    public static final ArrayList A01(Context context, UserSession userSession, String str, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C67569Mq3 mq3 = (C67569Mq3) it.next();
            C255273tr r6 = C255273tr.A08;
            String str2 = mq3.A02;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = mq3.A03;
            if (str3 == null) {
                str3 = "";
            }
            Integer num = mq3.A00;
            0qQ.A07(num);
            A1C.add(A00(context, userSession, r6, num, str, "sayt", str2, str3));
        }
        return A1C;
    }
}
