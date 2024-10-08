package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.OcU  reason: case insensitive filesystem */
public abstract class C71094OcU {
    public static final void A00(Context context, UserSession userSession, NKQ nkq, C330957Ox r18, N4P n4p, C68303N9q n9q) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        N4P n4p2 = n4p;
        int A06 = n4p2.A06();
        String A03 = N4P.A03(n4p2);
        String str = n4p2.A0Q;
        C358248ab A0Y = DbS.A0Y(context);
        C68303N9q n9q2 = n9q;
        User user = n9q2.A00;
        A0Y.A05 = DbW.A0h(context, user.B8Q(), 2131958687);
        DbY.A0w(context, A0Y, user.B8Q(), 2131958686);
        A0Y.A0K(new C71200OfM(context, userSession2, nkq, r18, n4p2, n9q2, A03, str, A06, 0), 2131971974);
        A0Y.A0C(new I8K(userSession2, A03, str, A06, 0));
        AnonymousClass7TH.A0a(A0Y, true);
    }

    public static final void A01(Context context, UserSession userSession, NKQ nkq, C330957Ox r17, N4P n4p, C68303N9q n9q) {
        0qQ.A0B(userSession, 1);
        N4P n4p2 = n4p;
        int A06 = n4p2.A06();
        String A03 = N4P.A03(n4p2);
        String str = n4p2.A0Q;
        C358248ab A0Y = DbS.A0Y(context);
        C68303N9q n9q2 = n9q;
        User user = n9q2.A00;
        A0Y.A05 = DbW.A0h(context, user.B8Q(), 2131958688);
        DbY.A0w(context, A0Y, user.B8Q(), 2131958686);
        A0Y.A0K(new C71200OfM(context, userSession, nkq, r17, n4p2, n9q2, A03, str, A06, 1), 2131971974);
        A0Y.A0C(new I8K(userSession, A03, str, A06, 1));
        AnonymousClass7TH.A0a(A0Y, true);
    }

    public static final void A02(Context context, UserSession userSession, NKQ nkq, C330957Ox r17, N4P n4p, C68303N9q n9q, int i) {
        int i2 = 2131958931;
        int i3 = i;
        if (i3 == 6) {
            i2 = 2131958927;
        }
        C313746gw.A00(userSession);
        C69867NtV.A00(userSession);
        N4P n4p2 = n4p;
        int A06 = n4p2.A06();
        String A03 = N4P.A03(n4p2);
        String str = n4p2.A0Q;
        C358248ab A0Y = DbS.A0Y(context);
        DbT.A19(context, A0Y, 2131958930);
        C68303N9q n9q2 = n9q;
        DbY.A0w(context, A0Y, n9q2.A00.B8Q(), i2);
        A0Y.A0K(new C71201OfN(context, userSession, nkq, r17, n4p2, n9q2, A03, str, i3, A06), 2131954722);
        A0Y.A0H(new C71191OfC(userSession, A03, str, i3, A06), 2131958929);
        AnonymousClass7TH.A0a(A0Y, true);
    }

    public static final void A03(UserSession userSession, String str, String str2, int i, int i2) {
        Integer num;
        Integer num2;
        C313756gx A00 = C313746gw.A00(userSession);
        C72180Oxp A002 = C69867NtV.A00(userSession);
        String str3 = str;
        String str4 = str2;
        if (i != 2) {
            if (i == 3) {
                num2 = AnonymousClass05K.A00;
            } else if (i == 6) {
                num = AnonymousClass05K.A01;
            } else if (i == 7) {
                num2 = AnonymousClass05K.A01;
            } else {
                throw AnonymousClass7TE.A0w("Unable to log unsupported action type");
            }
            C69871NtZ.A00(A002.A00, str3, str4, "remove_moderator_attempt", "tap", "remove_moderator_dialog", "thread_details_people", DbY.A0m("invite_status", C66584MXp.A0X(num2)), i2);
            return;
        }
        num = AnonymousClass05K.A00;
        1Ln A0J = DbT.A0J(A00);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A00);
            DbV.A1M(A0J, "remove_collaborator_attempt");
            A0J.A0p("remove_collaborator_dialog");
            A0J.A0i(DbZ.A0b(A0J, "thread_details_people", str, str2, i2));
            A0J.A0w(AnonymousClass7TF.A0w("invite_status", C66584MXp.A0X(num)));
            A0J.Cgf();
        }
    }

    public static final void A04(UserSession userSession, String str, String str2, int i, int i2) {
        Integer num;
        Integer num2;
        C313756gx A00 = C313746gw.A00(userSession);
        C72180Oxp A002 = C69867NtV.A00(userSession);
        String str3 = str;
        String str4 = str2;
        if (i != 2) {
            if (i == 3) {
                num2 = AnonymousClass05K.A00;
            } else if (i == 6) {
                num = AnonymousClass05K.A01;
            } else if (i == 7) {
                num2 = AnonymousClass05K.A01;
            } else {
                throw AnonymousClass7TE.A0w("Unable to log unsupported action type");
            }
            C69871NtZ.A00(A002.A00, str3, str4, "remove_moderator_cancel", "tap", "remove_moderator_dialog", "thread_details_people", DbY.A0m("invite_status", C66584MXp.A0X(num2)), i2);
            return;
        }
        num = AnonymousClass05K.A00;
        1Ln A0J = DbT.A0J(A00);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A00);
            DbV.A1M(A0J, "remove_collaborator_cancel");
            A0J.A0p("remove_collaborator_dialog");
            A0J.A0i(DbZ.A0b(A0J, "thread_details_people", str, str2, i2));
            A0J.A0w(AnonymousClass7TF.A0w("invite_status", C66584MXp.A0X(num)));
            A0J.Cgf();
        }
    }
}
