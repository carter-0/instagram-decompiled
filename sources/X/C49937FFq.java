package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FFq  reason: case insensitive filesystem */
public final class C49937FFq {
    public static final C49937FFq A00 = new Object();

    public static final String A00(Context context, UserSession userSession) {
        int i;
        0qQ.A0B(context, 0);
        boolean A06 = 182.A06(0Tu.A06, userSession, 36322920674437800L);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (A06) {
            A1A.append('[');
            i = 2131952876;
        } else {
            A1A.append('[');
            i = 2131954771;
        }
        A1A.append(context.getString(i));
        A1A.append(']');
        return A1A.toString();
    }

    public static final void A01(Context context, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3) {
        ES2 A002 = C48765Ejo.A00(userSession, str, str2, AnonymousClass7TG.A1Z(context, userSession), z, z2, z3);
        C331127Pr A0W = DbS.A0W(userSession);
        DbT.A1C(context.getResources(), A0W, 2131975512);
        C331157Pu A003 = A0W.A00();
        FragmentActivity fragmentActivity = null;
        FCT.A01((AnonymousClass0iw) null, userSession, AnonymousClass000.A00(198), AnonymousClass000.A00(56), (String) null);
        A003.A03(context, A002);
        AnonymousClass37E r1 = AnonymousClass37D.A00;
        if (fragment != null) {
            fragmentActivity = fragment.requireActivity();
        }
        AnonymousClass37D A01 = r1.A01(fragmentActivity);
        if (A01 != null) {
            ((AnonymousClass37F) A01).A0H = new FmI(onDismissListener, 3);
        }
    }

    public final void A02(Context context, UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        boolean z = false;
        if (AnonymousClass3WP.A05(userSession)) {
            C48763Ejm.A00(false);
        } else {
            C48762Ejl.A00(userSession2, str, (String) null, false, true, false, false, false);
        }
        if (AnonymousClass3WS.A04(userSession) || AnonymousClass3WS.A02(userSession)) {
            z = true;
        }
        C331127Pr A0W = DbS.A0W(userSession);
        Resources resources = context.getResources();
        int i = 2131954758;
        if (z) {
            i = 2131954760;
        }
        DbT.A1C(resources, A0W, i);
        A0W.A00();
        FCT.A01((AnonymousClass0iw) null, userSession, AnonymousClass000.A00(198), AnonymousClass000.A00(56), (String) null);
    }
}
