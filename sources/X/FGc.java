package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.List;

public abstract class FGc {
    public static final C358248ab A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, List list, boolean z) {
        String str;
        AnonymousClass7TF.A1D(context, 0, userSession);
        User user = (User) 00k.A0O(list, 0);
        if (!z) {
            return A01(context, user, false);
        }
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131966155);
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "";
        }
        DbY.A0w(context, A0Y, str, 2131966150);
        C50025FJk.A02(A0Y, fragmentActivity, userSession, 62, 2131973388);
        return A0Y;
    }

    public static final void A02(Activity activity, Context context, UserSession userSession, User user, C336187eD r17, String str, C62320sa r19, C62320sa r20) {
        C358248ab A0Y;
        0wc A01;
        String str2;
        String str3;
        int i;
        UserSession userSession2 = userSession;
        1Av A00 = 1Au.A00(userSession);
        User user2 = user;
        String str4 = str;
        C336187eD r8 = r17;
        if (r17 == null || !user2.CPV() || !r8.Erh()) {
            0xa r6 = A00.A01;
            if (r6.getInt("cannot_mention_error_nux_shown_count", 0) < 1) {
                C358248ab A012 = A01(context, user2, true);
                A012.A06();
                C50036FJv.A00(A012, r20, 8);
                A012.A0g(new C50038FJx(r19, 4));
                if (r17 != null && r8.Eri()) {
                    A012.A0G(new AKK(r8, 13), 2131973389);
                }
                DbT.A1V(A012);
                AnonymousClass7TG.A1M(r6, "cannot_mention_error_nux_shown_count", r6.getInt("cannot_mention_error_nux_shown_count", 0) + 1);
                A01 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
                str2 = "impression";
                str3 = "cant_mention_alert_nux";
            } else {
                if (0qQ.A0K(str4, "notes")) {
                    i = 2131966156;
                } else if (182.A06(0Tu.A05, userSession, 36318793210796493L)) {
                    i = 2131966153;
                } else {
                    if (activity != null) {
                        A0Y = DbS.A0X(activity);
                    } else {
                        A0Y = DbS.A0Y(context);
                    }
                    A0Y.A05 = DbY.A0b(context, user2, 2131966157);
                    Dba.A1L(A0Y);
                    A01 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
                    str2 = "impression";
                    str3 = "cant_mention_alert";
                }
                String A0b = DbY.A0b(context, user2, i);
                0qQ.A07(A0b);
                1xC r3 = 1xC.A01;
                C310336ap A0a = DbS.A0a();
                A0a.A0D = A0b;
                A0a.A06();
                A0a.A02 = context.getResources().getDimensionPixelOffset(R.dimen.canvas_colour_wheel_offset_y);
                A0a.A0R = true;
                DbY.A1K(r3, A0a);
                return;
            }
        } else {
            C358248ab A0Y2 = DbS.A0Y(context);
            A0Y2.A09(2131966155);
            DbY.A0w(context, A0Y2, user2.getUsername(), 2131966150);
            A0Y2.A0G(new AKK(r8, 12), 2131973388);
            Dba.A1L(A0Y2);
            A01 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
            str2 = "impression";
            str3 = "cant_mention_alert_blocked";
        }
        C49241Erk.A00(A01, userSession2, user2, str4, str2, str3);
    }

    public static final void A03(Context context, UserSession userSession, User user, C336187eD r7, String str) {
        AnonymousClass7TG.A1N(context, userSession);
        A04(context, userSession, user, r7, str, (C62320sa) null, (C62320sa) null);
    }

    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession) {
        C46649DiU A04 = C46649DiU.A04("com.instagram.bullying.privacy.mentions_options", AnonymousClass7TE.A1E());
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(fragmentActivity, A0N, 2131966149);
        A0N.A0i = true;
        Dbb.A0i(fragmentActivity, C49891FBs.A00(A0N, A04), userSession, ModalActivity.class, "bloks");
    }

    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C49241Erk.A00(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), userSession, (User) null, str, "click", "cant_mention_alert_manage_blocked_accounts");
        C47438E2k Cqz = C46339Dch.A01().Cqz(userSession);
        if (fragmentActivity != null) {
            DbZ.A18(Cqz, fragmentActivity, userSession);
        }
    }

    public static final C358248ab A01(Context context, User user, boolean z) {
        String str;
        int i = 2131966153;
        if (z) {
            i = 2131966152;
        }
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        String A0c = DbY.A0c(context, str, i);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131966155);
        A0Y.A0q(A0c);
        return A0Y;
    }

    public static final void A04(Context context, UserSession userSession, User user, C336187eD r4, String str, C62320sa r6, C62320sa r7) {
        AnonymousClass7TG.A1O(userSession, user);
        A02((Activity) null, context, userSession, user, r4, str, r6, r7);
    }
}
