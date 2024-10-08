package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Locale;

public abstract class I6Q {
    public static final void A00(Fragment fragment, UserSession userSession, 1Xj r6) {
        0qQ.A0B(r6, 2);
        FragmentActivity activity = fragment.getActivity();
        if ((fragment instanceof AnonymousClass0iw) && activity != null) {
            C71342cb.A00(userSession).A09(activity, (AnonymousClass0iw) fragment, AnonymousClass000.A00(4209), r6.BpP());
        }
    }

    public static final void A03(UserSession userSession, 1Xj r6, AnonymousClass4DU r7, String str, boolean z) {
        String str2;
        0qQ.A0B(r6, 2);
        C254523sc A0c = C51967G9n.A0c(userSession, r6, r7, "hashtag");
        A0c.A5S = str;
        if (z) {
            str2 = "caption";
        } else {
            str2 = "user_comment";
        }
        A0c.A5K = str2;
        0jB A0k = C51965G9l.A0k();
        A0k.A04(C297705sC.A02, str);
        0j9 r1 = C297705sC.A06;
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        A0k.A04(r1, DbT.A12(locale, "HASHTAG"));
        A0c.A0E(A0k);
        int i = -1;
        if (r6.A5D()) {
            i = 0;
        }
        C233822wX.A0E(userSession, A0c, r6, r7, i);
    }

    public static final void A04(UserSession userSession, 1Xj r6, AnonymousClass4DU r7, String str, boolean z) {
        String str2;
        0qQ.A0B(r6, 2);
        C254523sc A0c = C51967G9n.A0c(userSession, r6, r7, "tag");
        A0c.A7B = str;
        if (z) {
            str2 = "caption";
        } else {
            str2 = "user_comment";
        }
        A0c.A5K = str2;
        0jB A0k = C51965G9l.A0k();
        A0k.A04(C297705sC.A02, str);
        0j9 r1 = C297705sC.A06;
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        A0k.A04(r1, DbT.A12(locale, "USER"));
        A0c.A0E(A0k);
        int i = -1;
        if (r6.A5D()) {
            i = 0;
        }
        C233822wX.A0E(userSession, A0c, r6, r7, i);
    }

    public static final void A05(1Xj r1, C231292rN r2, C301165yf r3, C228232l0 r4, C233162v9 r5) {
        0qQ.A0B(r1, 2);
        if (r2 != null && r4 != null) {
            r4.DUE(r3, r5, r1, r2.BQr(r1));
        }
    }

    public static final void A01(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, String str) {
        C254523sc A0c = C51967G9n.A0c(userSession, r4, r5, AnonymousClass000.A00(4082));
        A0c.A7B = str;
        int i = -1;
        if (r4.A5D()) {
            i = 0;
        }
        C233822wX.A0E(userSession, A0c, r4, r5, i);
    }

    public static final void A02(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, String str, String str2) {
        if (AnonymousClass3WX.A00(r4, r5)) {
            C254523sc A0c = C51967G9n.A0c(userSession, r4, r5, "number_of_comments");
            A0c.A7t = r4.A0d.A00(r4.A1V()).A00;
            A0c.A4j = str;
            A0c.A7C = str2;
            C233822wX.A0E(userSession, A0c, r4, r5, -1);
        }
        AnonymousClass59S.A02(userSession, C51973G9u.A0k(r4), "number_of_comments_tapped");
    }
}
