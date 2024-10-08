package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.regex.Matcher;
import org.json.JSONObject;

public abstract class FH6 {
    public static final void A00(Activity activity, 0xF r9, 1P0 r10, UserSession userSession, 1Xj r12, AnonymousClass3W1 r13, User user) {
        Activity activity2 = activity;
        AnonymousClass7TG.A1T(activity2, userSession, user);
        A08(activity2, r9, r10, userSession, r12, r13, (UserDetailEntryInfo) null, (C243853aD) null, user, (String) null, (String) null, (String) null, (String) null, (JSONObject) null);
    }

    public static final void A01(Activity activity, 0xF r8, 1P0 r9, UserSession userSession, 1Xj r11, AnonymousClass3W1 r12, User user, String str) {
        AnonymousClass7TG.A1N(activity, userSession);
        A08(activity, r8, r9, userSession, r11, r12, (UserDetailEntryInfo) null, (C243853aD) null, user, str, (String) null, (String) null, (String) null, (JSONObject) null);
    }

    public static final void A02(Activity activity, UserSession userSession, FollowButtonBase followButtonBase, C243853aD r9, User user, String str) {
        UserSession userSession2 = userSession;
        String str2 = str;
        Context context = activity;
        AnonymousClass7TG.A1U(followButtonBase, userSession2, str);
        if (activity == null) {
            context = followButtonBase.getContext();
        }
        User user2 = user;
        FollowStatus B6o = user.B6o();
        if (r9 != null) {
            r9.DGP(user);
        }
        1Z4.A00.A00(context, (FragmentActivity) null, userSession2, user2, new C51049Fnf(followButtonBase, r9, B6o, user), str2, (String) null, user.getUsername());
    }

    public static final void A03(Activity activity, UserSession userSession, User user, String str) {
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1P(userSession2, str);
        A0A(activity, (1P0) null, userSession2, user, str, (String) null);
    }

    public static final void A04(Activity activity, UserSession userSession, User user, String str, String str2) {
        AnonymousClass7TG.A1O(userSession, user);
        0qQ.A0B(str2, 4);
        A0A(activity, (1P0) null, userSession, user, str, str2);
    }

    public static final void A05(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, AnonymousClass0iw r7, C243853aD r8, User user) {
        String A0b;
        int i;
        Integer B6m = user.A03.B6m();
        if (B6m != null) {
            int intValue = B6m.intValue();
            if (intValue == 1) {
                A0b = context.getString(2131962546);
                i = 2131962544;
            } else if (intValue == 2) {
                A0b = DbY.A0b(context, user, 2131962545);
                i = 2131962543;
            } else {
                return;
            }
            SpannableStringBuilder A08 = DbW.A08(context, i);
            if (A0b != null) {
                if (r8 != null) {
                    r8.DGP(user);
                }
                C358248ab A0Y = DbS.A0Y(context);
                A0Y.A0n(user.Bh3(), r7);
                A0Y.A05 = A0b;
                A0C(A08);
                A0Y.A0q(A08);
                A0Y.A0f(new C50030FJp(7, user, r8));
                A0Y.A0I(onClickListener, 2131962530);
                DbX.A16(onClickListener2, A0Y);
            }
        }
    }

    public static final void A06(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, AnonymousClass0iw r10, C243853aD r11, User user) {
        int i;
        AnonymousClass7TF.A1B(context, 0, user);
        if (user.A0N() == AnonymousClass05K.A01) {
            i = 2131975863;
        } else if (user.A0N() == AnonymousClass05K.A0C) {
            i = 2131975862;
        } else {
            return;
        }
        SpannableStringBuilder A0C = DbS.A0C(DbY.A0b(context, user, i));
        String username = user.getUsername();
        int A08 = 00l.A08(DbT.A10(A0C), username, 0, false);
        A0C.setSpan(new StyleSpan(1), A08, username.length() + A08, 33);
        if (r11 != null) {
            r11.DGP(user);
        }
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A0n(user.Bh3(), r10);
        A0Y.A05 = null;
        A0Y.A0q(A0C);
        A0Y.A0f(new C50030FJp(9, user, r11));
        A0Y.A0K(onClickListener, 2131975854);
        DbX.A16(onClickListener2, A0Y);
    }

    public static final void A08(Context context, 0xF r23, 1P0 r24, UserSession userSession, 1Xj r26, AnonymousClass3W1 r27, UserDetailEntryInfo userDetailEntryInfo, C243853aD r29, User user, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        A07(context, r23, r24, userSession, r26, r27, userDetailEntryInfo, (SearchContext) null, r29, (C243943aO) null, user, (Boolean) null, (Double) null, (Long) null, str, str2, str3, str4, (String) null, (String) null, (String) null, jSONObject);
    }

    public static final void A09(Context context, 1P0 r7, UserSession userSession, User user, String str) {
        AnonymousClass7TG.A1O(userSession, user);
        A0A(context, r7, userSession, user, str, (String) null);
    }

    public static final void A0A(Context context, 1P0 r17, UserSession userSession, User user, String str, String str2) {
        A07(context, (0xF) null, r17, userSession, (1Xj) null, (AnonymousClass3W1) null, (UserDetailEntryInfo) null, (SearchContext) null, (C243853aD) null, (C243943aO) null, user, (Boolean) null, (Double) null, (Long) null, str, (String) null, (String) null, str2, (String) null, (String) null, (String) null, (JSONObject) null);
    }

    public static final void A0B(SpannableStringBuilder spannableStringBuilder) {
        Matcher matcher = 0mp.A01.matcher(spannableStringBuilder.toString());
        0qQ.A07(matcher);
        while (matcher.find()) {
            Dbb.A0r(spannableStringBuilder, new StyleSpan(1), matcher);
        }
    }

    public static final void A0C(SpannableStringBuilder spannableStringBuilder) {
        Matcher A09 = 0mp.A09(spannableStringBuilder.toString());
        while (A09.find()) {
            Dbb.A0r(spannableStringBuilder, new StyleSpan(1), A09);
        }
    }

    public static final void A07(Context context, 0xF r29, 1P0 r30, UserSession userSession, 1Xj r32, AnonymousClass3W1 r33, UserDetailEntryInfo userDetailEntryInfo, SearchContext searchContext, C243853aD r36, C243943aO r37, User user, Boolean bool, Double d, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
        User user2 = user;
        FollowStatus B6o = user2.B6o();
        C243943aO r13 = r37;
        SearchContext searchContext2 = searchContext;
        UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
        AnonymousClass3W1 r10 = r33;
        String str8 = str6;
        String str9 = str5;
        String str10 = str4;
        1Xj r9 = r32;
        String str11 = str3;
        String str12 = str2;
        1P0 r8 = r30;
        String str13 = str;
        0xF r7 = r29;
        Context context2 = context;
        Long l2 = l;
        C294695ms.A00(userSession).A09(context2, r7, r8, r9, r10, userDetailEntryInfo2, searchContext2, r13, user2, bool, d, (Integer) null, l2, str13, str12, str11, str10, (String) null, str9, str8, str7, jSONObject);
        AnonymousClass1Nd.A00(userSession).A00(new AnonymousClass3KA(user2.B6o(), user2.getId()));
        C243853aD r0 = r36;
        if (r36 != null) {
            r0.D2Y(B6o, user2);
        }
    }
}
