package X;

import android.app.Dialog;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.F7y  reason: case insensitive filesystem */
public abstract class C49811F7y {
    public static Dialog A00(Context context, AnonymousClass0iw r8, UserSession userSession, User user, G7Q g7q, Integer num, String str, String str2) {
        boolean A1u;
        Context context2 = context;
        AnonymousClass0iw r2 = r8;
        C49664F0w f0w = new C49664F0w(context2, user, new C49655F0m(context2, r2, new C47696EDf(g7q, 45), userSession, user, g7q, str, str2), num);
        Context context3 = f0w.A00;
        C358248ab A0Y = DbS.A0Y(context3);
        User user2 = f0w.A03;
        A0Y.A05 = DbY.A0b(context3, user2, 2131967918);
        A0Y.A0q(002.A0g(context3.getString(2131967913), " ", DbW.A0h(context3, 0lz.A00(C60960kU.A00), 2131967912)));
        Integer num2 = f0w.A05;
        Integer num3 = AnonymousClass05K.A0C;
        int i = 2131967915;
        if (num2 == num3) {
            i = 2131967917;
        }
        A0Y.A0Y(f0w.A08, f0w.A02, context3.getString(i), true);
        A0Y.A0X(f0w.A06, C358278ae.DEFAULT, context3.getString(2131954722), true);
        A0Y.A0r(true);
        A0Y.A0s(true);
        int intValue = num2.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                A1u = user2.A1s();
            }
            Dialog A02 = A0Y.A02();
            AnonymousClass0fN.A00(A02);
            return A02;
        }
        A1u = user2.A1u();
        if (!A1u) {
            int i2 = 2131967914;
            if (num2 == num3) {
                i2 = 2131967916;
            }
            A0Y.A0W(f0w.A07, f0w.A01, context3.getString(i2), true);
        }
        Dialog A022 = A0Y.A02();
        AnonymousClass0fN.A00(A022);
        return A022;
    }

    public static void A01(Context context, Integer num, boolean z, boolean z2) {
        int i;
        if (!z) {
            i = 2131967906;
            if (z2) {
                i = 2131967907;
            }
        } else if (z2) {
            i = 2131967908;
            if (num == AnonymousClass05K.A0C) {
                i = 2131967910;
            }
        } else {
            i = 2131967909;
        }
        C59689JTv.A09(context, context.getResources().getString(i));
    }
}
