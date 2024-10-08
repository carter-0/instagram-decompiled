package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public abstract class FG5 {
    public static final void A03(Context context, FragmentActivity fragmentActivity, 0lg r15, UserSession userSession, String str, long j) {
        FIZ fiz;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity, 0);
        Context context2 = context;
        0lg r4 = r15;
        String str2 = str;
        AnonymousClass7TG.A1U(context, r15, str2);
        C358248ab A0X = DbS.A0X(fragmentActivity2);
        boolean equals = str2.equals("ig_ts_entry_point_direct_header");
        int i = R.drawable.ig_illustrations_qp_clock;
        if (equals) {
            i = R.drawable.ig_illustrations_qp_moon_refresh;
        }
        DbU.A16(context, A0X, i);
        A0X.A05 = context.getResources().getString(2131968817);
        UserSession userSession2 = userSession;
        String A0e = AnonymousClass7TF.A0e(context.getResources(), C49927FFd.A01(AnonymousClass7TF.A0A(context), (int) (j / 60), 182.A06(0Tu.A05, userSession2, 36313725149448399L), false), 2131968814);
        0qQ.A07(A0e);
        A0X.A0q(A0e);
        A0X.A0I(new C50022FJh(str2, (Object) userSession2, 20), 2131968816);
        if (equals) {
            fiz = new FIZ(context2, fragmentActivity2, userSession2, str2, 7);
        } else {
            fiz = new FIZ(fragmentActivity2, r4, userSession2, str2, 8);
        }
        A0X.A0H(fiz, 2131968815);
        DbT.A1V(A0X);
        2Ci.A03(userSession2, A01(str2), AnonymousClass05K.A0I, (Long) null, (Long) null, Long.valueOf(Dba.A01(userSession2)), "take_break", (Map) null, true);
    }

    public static final boolean A04(UserSession userSession) {
        long j;
        if (182.A06(0Tu.A05, userSession, 36313725149448399L)) {
            j = 1;
        } else {
            j = 60;
        }
        long A00 = new 2Cd(userSession).A00();
        return A00 >= 0 && A02(userSession).contains(String.valueOf(A00 / j));
    }

    public static final EWJ A01(String str) {
        Object obj;
        Iterator it = EWJ.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((EWJ) obj).name(), AnonymousClass7TF.A0k(str))) {
                break;
            }
        }
        return (EWJ) obj;
    }

    public static final C331157Pu A00(Context context, UserSession userSession, 1We r7, C49431EvX evX) {
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, context);
        1We.A00(r7);
        FmB fmB = new FmB(A1Z ? 1 : 0, context, userSession, evX);
        C331127Pr A0W = DbS.A0W(userSession);
        int i = 2131957371;
        if (A04(userSession)) {
            i = 2131957363;
        }
        DbZ.A0z(context, A0W, i);
        A0W.A0v = A1Z;
        A0W.A0U = fmB;
        if (A04(userSession)) {
            A0W.A0g = context.getString(2131957361);
        } else {
            A0W.A0g = context.getString(2131957369);
            A0W.A0h = context.getString(2131957370);
            A0W.A0w = A1Z;
        }
        return A0W.A00();
    }

    public static final ArrayList A02(UserSession userSession) {
        List list;
        List A0o = DbW.A0o(182.A04(AnonymousClass7TF.A0H(userSession), userSession, 36876675103064180L), ",");
        if (!A0o.isEmpty()) {
            ListIterator listIterator = A0o.listIterator(A0o.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (DbX.A06(listIterator) != 0) {
                        list = DbX.A0y(A0o, listIterator);
                        break;
                    }
                } else {
                    break;
                }
            }
            return AnonymousClass7TE.A1D(00k.A0a(list));
        }
        list = 0sn.A00;
        return AnonymousClass7TE.A1D(00k.A0a(list));
    }
}
