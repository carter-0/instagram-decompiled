package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OcX  reason: case insensitive filesystem */
public abstract class C71097OcX {
    public static final void A02(Context context, C74419PuZ puZ, Boolean bool, String str, int i) {
        int i2;
        int i3;
        Object[] objArr;
        String string;
        String quantityString = context.getResources().getQuantityString(R.plurals.twinbox_accept_request_dialog_title, i);
        0qQ.A07(quantityString);
        if (i > 1) {
            i3 = 2131975608;
            objArr = AnonymousClass7TF.A1b(i);
        } else {
            if (AnonymousClass7TF.A1Y(bool, true)) {
                i2 = 2131975604;
            } else if (str != null) {
                i3 = 2131975605;
                objArr = new Object[]{str};
            } else {
                i2 = 2131975606;
            }
            string = context.getString(i2);
            0qQ.A0A(string);
            String A16 = AnonymousClass7TE.A16(context, 2131975607);
            0qQ.A0B(string, 2);
            C358248ab A0g = DbX.A0g(context, string, quantityString);
            A0g.A0r(true);
            A0g.A0s(true);
            A0g.A0B(new C71173Oen(puZ, 0));
            A0g.A0Y(C71249OgE.A00(puZ, 68), C358278ae.BLUE, A16, true);
            DbT.A1V(A0g);
        }
        string = context.getString(i3, objArr);
        0qQ.A0A(string);
        String A162 = AnonymousClass7TE.A16(context, 2131975607);
        0qQ.A0B(string, 2);
        C358248ab A0g2 = DbX.A0g(context, string, quantityString);
        A0g2.A0r(true);
        A0g2.A0s(true);
        A0g2.A0B(new C71173Oen(puZ, 0));
        A0g2.A0Y(C71249OgE.A00(puZ, 68), C358278ae.BLUE, A162, true);
        DbT.A1V(A0g2);
    }

    public static final boolean A04(Activity activity, UserSession userSession, C74348PtO ptO, int i, boolean z) {
        0qQ.A0B(userSession, 0);
        if (z) {
            return false;
        }
        Resources resources = activity.getResources();
        String quantityString = resources.getQuantityString(R.plurals.direct_permissions_choice_delete_revamp_bottom_sheet_title, i);
        0qQ.A07(quantityString);
        String A0d = AnonymousClass7TF.A0d(resources, 2131957531);
        String quantityString2 = resources.getQuantityString(R.plurals.direct_permissions_choice_delete_revamp_bottom_sheet_body, i);
        0qQ.A07(quantityString2);
        String A0d2 = AnonymousClass7TF.A0d(resources, 2131959997);
        AnonymousClass4DH r4 = new AnonymousClass4DH();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putCharSequence("content_text_key", quantityString2);
        A0a.putString("switch_text_key", A0d2);
        C331127Pr A0V = DbV.A0V(A0a, r4, userSession);
        A0V.A0d = quantityString;
        A0V.A0g = A0d;
        A0V.A1J = true;
        A0V.A0K = new C71399Ojy(26, DbT.A0i(activity), ptO, r4);
        DbU.A0y(activity, r4, A0V);
        return true;
    }

    public static final AnonymousClass170 A00(C74516PwB pwB) {
        if (pwB.CUG()) {
            return pwB.BIs();
        }
        return (AnonymousClass170) AnonymousClass7TE.A13(pwB.BkC());
    }

    public static final void A01(Context context, UserSession userSession, DirectThreadKey directThreadKey) {
        boolean A1b = C51973G9u.A1b(context, userSession, directThreadKey);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131959623);
        A0Y.A08(2131959625);
        A0Y.A0K(new C71183Of1(25, directThreadKey, userSession), 2131959618);
        A0Y.A0C(C71242Og7.A00);
        AnonymousClass7TH.A0a(A0Y, A1b);
    }

    public static final void A03(AnonymousClass4DH r4, UserSession userSession, C74516PwB pwB, C74419PuZ puZ, int i) {
        String str;
        String A0v;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, r4);
        Context requireContext = r4.requireContext();
        AnonymousClass170 A00 = A00(pwB);
        if (A00 != null) {
            str = AnonymousClass50n.A05(A00);
        } else {
            str = null;
        }
        int size = pwB.BkC().size();
        if (i == A1Z) {
            i = size;
        }
        if (str != null && (A0v = DbV.A0v(requireContext.getResources(), str, R.plurals.inbox_folder_request_thread_move_dialog_title, i)) != null) {
            boolean A08 = 2El.A08(userSession);
            FragmentActivity requireActivity = r4.requireActivity();
            if (A08) {
                C70886OQd.A01(requireActivity, userSession, AnonymousClass43I.A00, puZ);
            } else {
                C70886OQd.A00(requireContext, requireActivity, userSession, puZ, A0v);
            }
        }
    }
}
